package com.example.backend.controller;

import com.example.backend.dto.StorageDriveDTO;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.service.StorageDriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StorageDriveController {
    private final StorageDriveService storageDriveService;

    @Autowired
    public StorageDriveController(StorageDriveService storageDriveService){
        this.storageDriveService = storageDriveService;
    }

    //Endpoint to get storage drive by id
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getStorageDriveById")
    public ResponseEntity<StorageDriveDTO> getStorageDriveById(@RequestParam Integer id){
        Optional<StorageDriveDTO> storageDriveDTO = storageDriveService.getStorageDriveById(id);

        if(storageDriveDTO.isPresent()){
            return new ResponseEntity<>(storageDriveDTO.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Endpoint to get all storage drives
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getAllStorageDrives")
    public List<StorageDriveDTO> getAllStorageDrives(){
        return storageDriveService.getAllStorageDrives();
    }

    //Updating the storage drive pick of user
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @PutMapping("/pcPartPicker/updateStorage")
    public ResponseEntity<String> updateStorage(@RequestParam Integer id){
        Optional<UserPicksEntity> updatingStorage = storageDriveService.updateStorage(id);
        HttpStatus status = HttpStatus.CONFLICT;

        if(updatingStorage.isPresent()){
            status = HttpStatus.OK;
        }

        return new ResponseEntity<>(status);
    }

}
