package com.example.backend.controller;

import com.example.backend.dto.GpuDTO;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.service.GpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GpuController {
    private final GpuService gpuService;

    @Autowired
    public GpuController(GpuService gpuService) {
        this.gpuService = gpuService;
    }

    //Endpoint for getting gpu by id
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getGpuById")
    public ResponseEntity<GpuDTO> getGpuById(@RequestParam Integer id){
        Optional<GpuDTO> gpuDTO = gpuService.getGpuById(id);

        if(gpuDTO.isPresent()){
            return new ResponseEntity<>(gpuDTO.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Endpoint for getting all GPUs
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getAllGPUs")
    public List<GpuDTO> getAllGPUs(){
        return gpuService.getAllGPUs();
    }

    //Endpoint for updating user's gpu pick
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @PutMapping("/pcPartPicker/updateGpu")
    public ResponseEntity<String> updateGpu(@RequestParam Integer id){
        Optional<UserPicksEntity> updatingGpu = gpuService.updateGpu(id);
        HttpStatus status = HttpStatus.CONFLICT;

        if(updatingGpu.isPresent()) status = HttpStatus.OK;

        return new ResponseEntity<>(status);
    }
}
