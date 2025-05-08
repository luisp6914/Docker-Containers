package com.example.backend.controller;

import com.example.backend.dto.MonitorDTO;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MonitorController {
    private final MonitorService monitorService;

    @Autowired
    public MonitorController(MonitorService monitorService) {
        this.monitorService = monitorService;
    }

    //Endpoint for getting monitor by id
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getMonitorById")
    public ResponseEntity<MonitorDTO> getMonitorById(@RequestParam Integer id){
        Optional<MonitorDTO> monitorDTO = monitorService.getMonitorById(id);

        if (monitorDTO.isPresent()){
            return new ResponseEntity<>(monitorDTO.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Endpoint for getting all monitors
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getAllMonitors")
    public List<MonitorDTO> getAllMonitors(){
        return monitorService.getAllMonitors();
    }


    //Endpoint to update user's monitor
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @PutMapping("/pcPartPicker/updateMonitor")
    public ResponseEntity<String> updateMonitor(@RequestParam Integer id){
        Optional<UserPicksEntity> updatingMonitor = monitorService.updateMonitor(id);
        HttpStatus status = HttpStatus.CONFLICT;

        if(updatingMonitor.isPresent()){
            status = HttpStatus.OK;
        }

        return new ResponseEntity<>(status);
    }
}
