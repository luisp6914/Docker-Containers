package com.example.backend.service;

import com.example.backend.dto.MotherboardDTO;
import com.example.backend.persistence.MotherboardEntity;
import com.example.backend.persistence.MotherboardRepository;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.persistence.UserPicksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MotherboardService {
    private final MotherboardRepository motherboardRepository;
    private final UserPicksRepository userPicksRepository;

    @Autowired
    public MotherboardService(MotherboardRepository motherboardRepository, UserPicksRepository userPicksRepository) {
        this.userPicksRepository = userPicksRepository;
        this.motherboardRepository = motherboardRepository;
    }

    //Method to get motherboard by id
    public Optional<MotherboardDTO> getMotherboardById(@RequestParam Integer id){
        Optional<MotherboardEntity> motherboardEntity = motherboardRepository.findById(id);

        if (motherboardEntity.isPresent()){
            //Fetch the motherboard
            MotherboardEntity motherboard = motherboardEntity.get();

            //Mapping motherboard to DTO
            MotherboardDTO dto = new MotherboardDTO(
                    motherboard.getId(),
                    motherboard.getName(),
                    motherboard.getBrand(),
                    motherboard.getPartNumber(),
                    motherboard.getPrice(),
                    motherboard.getSocket(),
                    motherboard.getFormFactor(),
                    motherboard.getPins(),
                    motherboard.getStorageType(),
                    motherboard.getStock()
            );
            return Optional.of(dto);
        }
        return Optional.empty();
    }

    //Method to get all the motherboard in DB
    public List<MotherboardDTO> getAllMotherboard(){
        List<MotherboardEntity> motherboards = motherboardRepository.findAll();

        //Map all motherboards to motherboard DTO
        return motherboards.stream().map(motherboard -> {
            return new MotherboardDTO(
                    motherboard.getId(),
                    motherboard.getName(),
                    motherboard.getBrand(),
                    motherboard.getPartNumber(),
                    motherboard.getPrice(),
                    motherboard.getSocket(),
                    motherboard.getFormFactor(),
                    motherboard.getPins(),
                    motherboard.getStorageType(),
                    motherboard.getStock()
            );
        }).collect(Collectors.toList());
    }

    //Service that handles the update of user's motherboard
    public Optional<UserPicksEntity> updateMotherboard(Integer id) {
        Optional<UserPicksEntity> userOptional = Optional.ofNullable(userPicksRepository.getUserPicksEntityById(1));

        if(userOptional.isPresent()){
            UserPicksEntity user = userOptional.get();

            user.setMotherboardId(id);
            userPicksRepository.save(user);
        }

        return userOptional;
    }
}
