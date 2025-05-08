package com.example.backend.controller;

import com.example.backend.dto.PcCaseDTO;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.service.PcCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PcCaseController {
    private final PcCaseService pcCaseService;

    @Autowired
    public PcCaseController(PcCaseService pcCaseService ){
        this.pcCaseService = pcCaseService;
    }

    //Endpoint to get all the pc cases from DB
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("pcPartPicker/getAllPcCases")
    public List<PcCaseDTO> getAllPcCases(){
        return pcCaseService.getAllPcCases();
    }

    //EndPoint to get pc case by ID
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("pcPartPicker/getPcCaseById")
    public ResponseEntity<PcCaseDTO> getPcCaseById(@RequestParam Integer id){
        Optional<PcCaseDTO> pcCaseDTO = pcCaseService.getPcCaseById(id);

        if(pcCaseDTO.isPresent()){
            return new ResponseEntity<>(pcCaseDTO.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Endpoint to update user's Pc Case
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @PutMapping("/pcPartPicker/updatePcCase")
    public ResponseEntity<String> updatePcCase(@RequestParam Integer id){
        Optional<UserPicksEntity> updatingPcCase = pcCaseService.updatePcCase(id);
        HttpStatus status = HttpStatus.CONFLICT;

        if(updatingPcCase.isPresent()) status = HttpStatus.OK;

        return new ResponseEntity<>(status);
    }

}
