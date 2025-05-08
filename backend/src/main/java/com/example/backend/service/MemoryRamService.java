package com.example.backend.service;

import com.example.backend.dto.MemoryRamDTO;
import com.example.backend.persistence.MemoryRamEntity;
import com.example.backend.persistence.MemoryRamRepository;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.persistence.UserPicksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MemoryRamService {
    private final MemoryRamRepository memoryRamRepository;
    private final UserPicksRepository userPicksRepository;

    @Autowired
    public MemoryRamService(MemoryRamRepository memoryRamRepository, UserPicksRepository userPicksRepository){
        this.userPicksRepository = userPicksRepository;
        this.memoryRamRepository = memoryRamRepository;
    }

    //Method to get memory ram by id
    public Optional<MemoryRamDTO> getMemoryRamById(Integer id){
        Optional<MemoryRamEntity> memoryRamEntity = memoryRamRepository.findById(id);

        if(memoryRamEntity.isPresent()){
            //Fetching the memory ram data
            MemoryRamEntity memoryRam = memoryRamEntity.get();

            //Mapping memoryRamEntity to DTO
            MemoryRamDTO dto = new MemoryRamDTO(
                    memoryRam.getId(),
                    memoryRam.getName(),
                    memoryRam.getBrand(),
                    memoryRam.getPartNumber(),
                    memoryRam.getPrice(),
                    memoryRam.getFormFactor(),
                    memoryRam.getModules(),
                    memoryRam.getFrequency(),
                    memoryRam.getCapacity(),
                    memoryRam.getStock()
            );
            return Optional.of(dto);
        }
        return Optional.empty();
    }

    //Method to get all the memory rams
    public List<MemoryRamDTO> getAllMemoryRam(){
        List<MemoryRamEntity> memoryRams = memoryRamRepository.findAll();

        //Map memoryRamEntity to memoryRamDTO
        return memoryRams.stream().map(memoryRam -> {
            return new MemoryRamDTO(
                    memoryRam.getId(),
                    memoryRam.getName(),
                    memoryRam.getBrand(),
                    memoryRam.getPartNumber(),
                    memoryRam.getPrice(),
                    memoryRam.getFormFactor(),
                    memoryRam.getModules(),
                    memoryRam.getFrequency(),
                    memoryRam.getCapacity(),
                    memoryRam.getStock()
            );
        }).collect(Collectors.toList());
    }

    //Service to update user's memory option
    public Optional<UserPicksEntity> updateMemory(Integer id) {
        //Data wrapped in Optional to make sure it exist in data base
        Optional<UserPicksEntity> userOptional = Optional.ofNullable(userPicksRepository.getUserPicksEntityById(1));

        if(userOptional.isPresent()){
            UserPicksEntity userData = userOptional.get();

            userData.setMemoryId(id);
            userPicksRepository.save(userData);
        }

        return userOptional;
    }

}
