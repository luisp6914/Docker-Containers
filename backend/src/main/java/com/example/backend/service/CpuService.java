package com.example.backend.service;

import com.example.backend.dto.CpuDTO;
import com.example.backend.persistence.CpuEntity;
import com.example.backend.persistence.CpuRepository;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.persistence.UserPicksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CpuService {
    private final CpuRepository cpuRepository;
    private final UserPicksRepository userPicksRepository;

    @Autowired
    public CpuService(CpuRepository cpuRepository, UserPicksRepository userPicksRepository){
        this.userPicksRepository = userPicksRepository;
        this.cpuRepository = cpuRepository;
    }

    //Method to get cpu by id
    public Optional<CpuDTO> getCpuById(Integer id){
        Optional<CpuEntity> cpuEntity = cpuRepository.findById(id);

        if(cpuEntity.isPresent()){
            CpuEntity cpu = cpuEntity.get();

            //Mapping entity to DTO
            CpuDTO dto = new CpuDTO(
                    cpu.getId(),
                    cpu.getName(),
                    cpu.getBrand(),
                    cpu.getPartNumber(),
                    cpu.getPrice(),
                    cpu.getCoreClock(),
                    cpu.getCoreCount(),
                    cpu.getRequiredWattage(),
                    cpu.getSocket(),
                    cpu.getStock()
            );
            return Optional.of(dto);
        }
        return Optional.empty();
    }

    public List<CpuDTO> getAllCPUs() {
        List<CpuEntity> CPUs = cpuRepository.findAll();

        //Map CPUs to DTO
        return CPUs.stream().map(cpu -> {
            //Create a DTO
            return new CpuDTO(
                    cpu.getId(),
                    cpu.getName(),
                    cpu.getBrand(),
                    cpu.getPartNumber(),
                    cpu.getPrice(),
                    cpu.getCoreClock(),
                    cpu.getCoreCount(),
                    cpu.getRequiredWattage(),
                    cpu.getSocket(),
                    cpu.getStock()
            );

        }).collect(Collectors.toList());
    }

    //Service for updating user's CPU option
    public Optional<UserPicksEntity> updateCpu(Integer id){

        //Data in an optional in case it is empty
        Optional<UserPicksEntity> userdata = Optional.ofNullable(userPicksRepository.getUserPicksEntityById(1));

        if(userdata.isPresent()){
            UserPicksEntity user = userdata.get();

            user.setCpuId(id);
            userPicksRepository.save(user);
        }

        return userdata;

    }
}
