package com.example.backend.controller;

import com.example.backend.dto.UserPicksDTO;
import com.example.backend.service.UserPicksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserPicksController {
    private final UserPicksService userPicksService;

    @Autowired
    public UserPicksController(UserPicksService userPicksService) {
        this.userPicksService = userPicksService;
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://luisp6914.github.io"
    })
    @GetMapping("/pcPartPicker/getUserPicks")
    public ResponseEntity<UserPicksDTO> getUserPicks(){
        Optional<UserPicksDTO> userPicksDTO = userPicksService.getUserPicks();

        if (userPicksDTO.isPresent()){
            return new ResponseEntity<>(userPicksDTO.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
