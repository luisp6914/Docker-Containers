package com.example.backend.service;

import com.example.backend.dto.StorageDriveDTO;
import com.example.backend.persistence.StorageDriveEntity;
import com.example.backend.persistence.StorageDriveRepository;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.persistence.UserPicksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StorageDriveService {
    private final StorageDriveRepository storageDriveRepository;
    private final UserPicksRepository userPicksRepository;

    @Autowired
    public StorageDriveService(StorageDriveRepository storageDriveRepository, UserPicksRepository userPicksRepository){
        this.userPicksRepository = userPicksRepository;
        this.storageDriveRepository = storageDriveRepository;
    }

    //Method to get storage drive by id
    public Optional<StorageDriveDTO> getStorageDriveById(Integer id) {
        Optional<StorageDriveEntity> storageDriveEntity = storageDriveRepository.findById(id);

        if (storageDriveEntity.isPresent()){
            //Fetching the data from DB
            StorageDriveEntity storageDrive = storageDriveEntity.get();

            //Mapping storage drive to DTO
            StorageDriveDTO dto = new StorageDriveDTO(
                    storageDrive.getId(),
                    storageDrive.getName(),
                    storageDrive.getBrand(),
                    storageDrive.getPartNumber(),
                    storageDrive.getPrice(),
                    storageDrive.getStorageType(),
                    storageDrive.getCapacity(),
                    storageDrive.getStock()
            );
            return Optional.of(dto);
        }
        return Optional.empty();
    }

    //Method to get all storage drives
    public List<StorageDriveDTO> getAllStorageDrives(){
        List<StorageDriveEntity> storageDrives = storageDriveRepository.findAll();

        //Map all Storage drive entities to DTO
        return storageDrives.stream().map(storageDrive -> {
            return new StorageDriveDTO(
                    storageDrive.getId(),
                    storageDrive.getName(),
                    storageDrive.getBrand(),
                    storageDrive.getPartNumber(),
                    storageDrive.getPrice(),
                    storageDrive.getStorageType(),
                    storageDrive.getCapacity(),
                    storageDrive.getStock()
            );
        }).collect(Collectors.toList());
    }

    //Service for updating user's storage drive option
    public Optional<UserPicksEntity> updateStorage(Integer id) {
        //Data in an optional in case it is empty
        Optional<UserPicksEntity> userdata = Optional.ofNullable(userPicksRepository.getUserPicksEntityById(1));

        if(userdata.isPresent()){
            UserPicksEntity user = userdata.get();

            user.setStorageId(id);
            userPicksRepository.save(user);
        }

        return userdata;
    }
}
