package com.example.backend.service;

import com.example.backend.dto.PsuDTO;
import com.example.backend.persistence.PsuEntity;
import com.example.backend.persistence.PsuRepository;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.persistence.UserPicksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PsuService {
    private final PsuRepository psuRepository;
    private final UserPicksRepository userPicksRepository;

    @Autowired
    public PsuService(PsuRepository psuRepository, UserPicksRepository userPicksRepository) {
        this.userPicksRepository = userPicksRepository;
        this.psuRepository = psuRepository;
    }

    //Method to get psu by id
    public Optional<PsuDTO> getPsuById(Integer id){
        Optional<PsuEntity> psuEntity = psuRepository.findById(id);

        if(psuEntity.isPresent()){
            //getting data fro entity
            PsuEntity psu = psuEntity.get();

            //Mapping entity to DTO
            PsuDTO dto = new PsuDTO(
                    psu.getId(),
                    psu.getName(),
                    psu.getBrand(),
                    psu.getPartNumber(),
                    psu.getPrice(),
                    psu.getWattage(),
                    psu.getLength(),
                    psu.getStock()
            );
            return Optional.of(dto);
        }
        return Optional.empty();
    }

    //Method for getting all psu
    public List<PsuDTO> getAllPSUs(){
        List<PsuEntity> psuS = psuRepository.findAll();

        //Mapping entity to dto
        return psuS.stream().map(psu -> {
            return new PsuDTO(
                    psu.getId(),
                    psu.getName(),
                    psu.getBrand(),
                    psu.getPartNumber(),
                    psu.getPrice(),
                    psu.getWattage(),
                    psu.getLength(),
                    psu.getStock()
            );
        }).collect(Collectors.toList());
    }

    //Service for updating user's PSU option
    public Optional<UserPicksEntity> updatePsu(Integer id) {
        //Data in an optional in case it is empty
        Optional<UserPicksEntity> userOptional = Optional.ofNullable(userPicksRepository.getUserPicksEntityById(1));

        if(userOptional.isPresent()){
            UserPicksEntity user = userOptional.get();

            user.setPsuId(id);
            userPicksRepository.save(user);
        }

        return userOptional;
    }
}
