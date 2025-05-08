package com.example.backend.controller;

import com.example.backend.dto.MemoryRamDTO;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.service.MemoryRamService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MemoryRamController {
    private final MemoryRamService memoryRamService;

    @Autowired
    public MemoryRamController(MemoryRamService memoryRamService) {
        this.memoryRamService = memoryRamService;
    }

    //Endpoint for getting memory by ID
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getMemoryRamById")
    public ResponseEntity<MemoryRamDTO> getMemoryRamById(@RequestParam Integer id){
        Optional<MemoryRamDTO> memoryRamDTO = memoryRamService.getMemoryRamById(id);

        if(memoryRamDTO.isPresent()){
            return new ResponseEntity<>(memoryRamDTO.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Endpoint for getting all memory rams
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getAllMemoryRams")
    public List<MemoryRamDTO> getAllMemoryRam(){
        return memoryRamService.getAllMemoryRam();
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @PutMapping("/pcPartPicker/updateMemoryRams")
    public ResponseEntity<String> updateMemory(@RequestParam Integer id){
        Optional<UserPicksEntity> updatingMemory = memoryRamService.updateMemory(id);
        HttpStatus status = HttpStatus.CONFLICT;

        if(updatingMemory.isPresent()){
            status = HttpStatus.OK;
        }

        return new ResponseEntity<>(status);
    }

}
