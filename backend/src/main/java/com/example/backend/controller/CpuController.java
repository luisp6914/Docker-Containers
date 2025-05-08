package com.example.backend.controller;

import com.example.backend.dto.CpuDTO;
import com.example.backend.persistence.CpuEntity;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.service.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CpuController {
    private final CpuService cpuService;

    @Autowired
    public CpuController(CpuService cpuService){
        this.cpuService = cpuService;
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getCpuById")
    public ResponseEntity<CpuDTO> getCpuById(@RequestParam Integer id){
        Optional<CpuDTO> cpuDTO = cpuService.getCpuById(id);

        if(cpuDTO.isPresent()){
            return new ResponseEntity<>(cpuDTO.get(), HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getAllCPUs")
    public List<CpuDTO> getAllCPUs(){
        return cpuService.getAllCPUs();
    }


    //Updating the pick of user
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @PutMapping("/pcPartPicker/updateCpu")
    public ResponseEntity<String> updateCpu(@RequestParam Integer id){
        Optional<UserPicksEntity> updatingCpu = cpuService.updateCpu(id);
        HttpStatus status = HttpStatus.CONFLICT;

        if(updatingCpu.isPresent()){
            status = HttpStatus.OK;
        }

        return new ResponseEntity<>(status);
    }

}
