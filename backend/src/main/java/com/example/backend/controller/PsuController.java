package com.example.backend.controller;

import com.example.backend.dto.PsuDTO;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.service.PsuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PsuController {
    private final PsuService psuService;

    @Autowired
    public PsuController(PsuService psuService) {
        this.psuService = psuService;
    }

    @GetMapping("/pcPartPicker/getPsuById")
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    public ResponseEntity<PsuDTO> getPsuById(@RequestParam Integer id){
        Optional<PsuDTO> psuDTO = psuService.getPsuById(id);

        if(psuDTO.isPresent()){
            return new ResponseEntity<>(psuDTO.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getAllPSUs")
    public List<PsuDTO> getAllPSUs(){
        return psuService.getAllPSUs();
    }

    //End to update user's power supply option
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @PutMapping("/pcPartPicker/updatePsu")
    public ResponseEntity<String> updatePsu(@RequestParam Integer id){
        Optional<UserPicksEntity> updatePsu = psuService.updatePsu(id);
        HttpStatus status = HttpStatus.CONFLICT;

        if(updatePsu.isPresent()) status = HttpStatus.OK;

        return new ResponseEntity<>(status);
    }
}
