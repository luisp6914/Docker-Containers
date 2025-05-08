package com.example.backend.service;

import com.example.backend.dto.GpuDTO;
import com.example.backend.persistence.GpuEntity;
import com.example.backend.persistence.GpuRepository;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.persistence.UserPicksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GpuService {
    private final GpuRepository gpuRepository;
    private final UserPicksRepository userPicksRepository;

    @Autowired
    public GpuService(GpuRepository gpuRepository, UserPicksRepository userPicksRepository) {
        this.userPicksRepository = userPicksRepository;
        this.gpuRepository = gpuRepository;
    }

    //Method to get GPU by ID
    public Optional<GpuDTO> getGpuById(Integer id){
        Optional<GpuEntity> gpuEntity = gpuRepository.findById(id);

        if(gpuEntity.isPresent()){
            //Fetching the gpu data
            GpuEntity gpu = gpuEntity.get();

            //Mapping gpuEntity to DTO
            GpuDTO dto = new GpuDTO(
                    gpu.getId(),
                    gpu.getName(),
                    gpu.getBrand(),
                    gpu.getPartNumber(),
                    gpu.getPrice(),
                    gpu.getMemory(),
                    gpu.getCoreClock(),
                    gpu.getLength(),
                    gpu.getRequiredWattage(),
                    gpu.getStock()
            );

            return Optional.of(dto);
        }
        return Optional.empty();
    }

    //Method to get all the GPUs in the DB
    public List<GpuDTO> getAllGPUs(){
        //Fetch all the GPUs
        List<GpuEntity> gpuS = gpuRepository.findAll();

        //Map gpus to a list of GpuDTO
        return gpuS.stream().map(gpu -> {
            //Mapping gpuEntity to DTO
            return new GpuDTO(
                    gpu.getId(),
                    gpu.getName(),
                    gpu.getBrand(),
                    gpu.getPartNumber(),
                    gpu.getPrice(),
                    gpu.getMemory(),
                    gpu.getCoreClock(),
                    gpu.getLength(),
                    gpu.getRequiredWattage(),
                    gpu.getStock()
            );
        }).collect(Collectors.toList());
    }

    //Service for updating user's gpu
    public Optional<UserPicksEntity> updateGpu(Integer id){
        //Data in an optional in case it is Empty
        Optional<UserPicksEntity> userData = Optional.ofNullable(userPicksRepository.getUserPicksEntityById(1));

        if(userData.isPresent()){
            UserPicksEntity user = userData.get();

            user.setGpuId(id);
            userPicksRepository.save(user);
        }

        return userData;

    }
}
