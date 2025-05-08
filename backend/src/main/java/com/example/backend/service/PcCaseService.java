package com.example.backend.service;

import com.example.backend.dto.PcCaseDTO;
import com.example.backend.persistence.PcCaseEntity;
import com.example.backend.persistence.PcCaseRepository;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.persistence.UserPicksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PcCaseService {
    private final PcCaseRepository pcCaseRepository;
    private final UserPicksRepository userPicksRepository;

    @Autowired
    public PcCaseService(PcCaseRepository pcCaseRepository, UserPicksRepository userPicksRepository){
        this.userPicksRepository = userPicksRepository;
        this.pcCaseRepository = pcCaseRepository;
    }

    public List<PcCaseDTO> getAllPcCases() {
        List<PcCaseEntity> pcCases = pcCaseRepository.findAll();

        return pcCases.stream().map(pcCase -> {
            return new PcCaseDTO(
                    pcCase.getId(),
                    pcCase.getName(),
                    pcCase.getBrand(),
                    pcCase.getPartNumber(),
                    pcCase.getCaseType(),
                    pcCase.getColor(),
                    pcCase.getPrice(),
                    pcCase.getStock(),
                    pcCase.getMaxGpuLength(),
                    pcCase.getMaxCoolerHeight(),
                    pcCase.getMaxPsuLength()
            );
        }).collect(Collectors.toList());

    }

    public Optional<PcCaseDTO> getPcCaseById(Integer id) {
        Optional<PcCaseEntity> pcCaseEntity = pcCaseRepository.findById(id);

        if (pcCaseEntity.isPresent()){
            //Fetching the pc case data
            PcCaseEntity pcCase = pcCaseEntity.get();

            PcCaseDTO dto = new PcCaseDTO(
                    pcCase.getId(),
                    pcCase.getName(),
                    pcCase.getBrand(),
                    pcCase.getPartNumber(),
                    pcCase.getCaseType(),
                    pcCase.getColor(),
                    pcCase.getPrice(),
                    pcCase.getStock(),
                    pcCase.getMaxGpuLength(),
                    pcCase.getMaxCoolerHeight(),
                    pcCase.getMaxPsuLength()
            );

            return Optional.of(dto);
        }
        return Optional.empty();
    }

    //Service for updating user's Pc Case
    public Optional<UserPicksEntity> updatePcCase(Integer id) {
        Optional<UserPicksEntity> userOptional = Optional.ofNullable(userPicksRepository.getUserPicksEntityById(1));

        if(userOptional.isPresent()){
            UserPicksEntity user = userOptional.get();

            user.setCaseId(id);
            userPicksRepository.save(user);
        }

        return userOptional;
    }
}
