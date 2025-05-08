package com.example.backend.controller;

import com.example.backend.dto.MotherboardDTO;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.service.MotherboardService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MotherboardController {
    private final MotherboardService motherboardService;

    @Autowired
    public MotherboardController(MotherboardService motherboardService) {
        this.motherboardService = motherboardService;
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getMotherboardById")
    public ResponseEntity<MotherboardDTO> getMotherboardById(@RequestParam Integer id){
        Optional<MotherboardDTO> motherboardDTO = motherboardService.getMotherboardById(id);


        if(motherboardDTO.isPresent()){
            return new ResponseEntity<>(motherboardDTO.get(), HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getAllMotherboards")
    public List<MotherboardDTO> getAllMotherboards(){
        return motherboardService.getAllMotherboard();
    }

    //End point to update user's motherboard
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @PutMapping("/pcPartPicker/updateMotherboard")
    public ResponseEntity<String> updateMotherboard(@RequestParam Integer id){
        Optional<UserPicksEntity> updatingMotherboard = motherboardService.updateMotherboard(id);
        HttpStatus status = HttpStatus.OK;

        if(updatingMotherboard.isPresent()){
            status = HttpStatus.OK;
        }

        return new ResponseEntity<>(status);

    }
}
