package com.example.backend.controller;

import com.example.backend.persistence.VaccineEntity;
import com.example.backend.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class VaccineController {

    private final VaccineService vaccineService;

    @Autowired
    public VaccineController(VaccineService vaccineService) {
        this.vaccineService = vaccineService;
    }

    /**
     * Get method for vaccines based on ID
     * @param id the id of the vaccine
     * @return The vaccine details
     */
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/getVaccineById")
    public VaccineEntity getVaccineById(@RequestParam Integer id){
        return vaccineService.getVaccineById(id);
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/getAllVaccines")
    public List<VaccineEntity> getAllVaccines(){
        return vaccineService.getAllVaccines();
    }

    /**
     * This method is to add a vaccine to the DB. It will create an optional insertionSuccess
     * of VaccineEntity type. Use a vaccineService method that will return the optional. If the change was
     * successful, then it will be checked with isPresent method.
     * @param httpEntity the json data in string type
     * @return the vaccine id and  status.
     */
    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @PostMapping("/addVaccine")
    public ResponseEntity<Integer> addVaccine(HttpEntity<String> httpEntity){
        Optional<VaccineEntity> insertionSuccess = vaccineService.insertNewVaccine(httpEntity);
        Integer vaccineId = null;
        HttpStatus status = HttpStatus.CONFLICT;
        if(insertionSuccess.isPresent()){
            vaccineId = insertionSuccess.get().getId();
            status = HttpStatus.OK;
        }

        return new ResponseEntity<>(vaccineId, status);
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @PutMapping("editVaccine")
    public ResponseEntity<Integer> editVaccine(@RequestParam Integer id, HttpEntity<String> httpEntity){
        Optional<VaccineEntity> insertionSuccess = vaccineService.editVaccine(id, httpEntity);
        Integer vaccineId = null;
        HttpStatus status = HttpStatus.CONFLICT;
        if(insertionSuccess.isPresent()){
            vaccineId = insertionSuccess.get().getId();
            status = HttpStatus.OK;
        }

        return new ResponseEntity<>(vaccineId, status);
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @PostMapping("/addDoses")
    public ResponseEntity<String> addDoses(@RequestParam Integer id, @RequestBody Map<String, Integer> doses){
        int dosesToAdd = doses.get("doses");
        boolean sucess = vaccineService.addDoses(id, dosesToAdd);

        if(sucess){
            return new ResponseEntity<>("Doses added successfully", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Failed to add doses", HttpStatus.CONFLICT);
        }
    }
}
