package com.example.backend.service;

import com.example.backend.dto.MonitorDTO;
import com.example.backend.persistence.MonitorEntity;
import com.example.backend.persistence.MonitorRepository;
import com.example.backend.persistence.UserPicksEntity;
import com.example.backend.persistence.UserPicksRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MonitorService {
    private final MonitorRepository monitorRepository;
    private final UserPicksRepository userPicksRepository;

    @Autowired
    public MonitorService(MonitorRepository monitorRepository, UserPicksRepository userPicksRepository) {
        this.userPicksRepository = userPicksRepository;
        this.monitorRepository = monitorRepository;
    }

    //Method to get Monitor by ID
    public Optional<MonitorDTO> getMonitorById(Integer id){
        Optional<MonitorEntity> monitorEntity = monitorRepository.findById(id);

        if(monitorEntity.isPresent()){
            //Fetching the monitor
            MonitorEntity monitor = monitorEntity.get();

            //Mapping Monitor entity to DTO
            MonitorDTO dto = new MonitorDTO(
                    monitor.getId(),
                    monitor.getName(),
                    monitor.getBrand(),
                    monitor.getPartNumber(),
                    monitor.getPrice(),
                    monitor.getScreenSize(),
                    monitor.getResolution(),
                    monitor.getStock()
            );

            return Optional.of(dto);
        }
        return Optional.empty();
    }

    //Method to get all Monitors
    public List<MonitorDTO> getAllMonitors(){
        List<MonitorEntity> monitors = monitorRepository.findAll();

        //Map all monitors to DTO
        return monitors.stream().map(monitor -> {
            return new MonitorDTO(
                    monitor.getId(),
                    monitor.getName(),
                    monitor.getBrand(),
                    monitor.getPartNumber(),
                    monitor.getPrice(),
                    monitor.getScreenSize(),
                    monitor.getResolution(),
                    monitor.getStock()
            );
        }).collect(Collectors.toList());
    }

    //Service to update user's monitor option
    public Optional<UserPicksEntity> updateMonitor(Integer id) {
        Optional<UserPicksEntity> userOptional = Optional.ofNullable(userPicksRepository.getUserPicksEntityById(1));

        if(userOptional.isPresent()){
            UserPicksEntity userData = userOptional.get();

            userData.setMonitorId(id);
            userPicksRepository.save(userData);
        }

        return userOptional;
    }
}
