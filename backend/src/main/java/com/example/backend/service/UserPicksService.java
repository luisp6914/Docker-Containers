package com.example.backend.service;

import com.example.backend.dto.UserPicksDTO;
import com.example.backend.model.*;
import com.example.backend.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserPicksService {
    //Getting all the user picks method
    private final UserPicksRepository userPicksRepository;
    private final PcCaseRepository pcCaseRepository;
    private final MotherboardRepository motherboardRepository;
    private final CpuRepository cpuRepository;
    private final MemoryRamRepository memoryRamRepository;
    private final StorageDriveRepository storageDriveRepository;
    private final MonitorRepository monitorRepository;
    private final GpuRepository gpuRepository;
    private final PsuRepository psuRepository;

    @Autowired
    public UserPicksService(UserPicksRepository userPicksRepository, PcCaseRepository pcCaseRepository, MotherboardRepository motherboardRepository, CpuRepository cpuRepository, MemoryRamRepository memoryRamRepository, StorageDriveRepository storageDriveRepository, MonitorRepository monitorRepository, GpuRepository gpuRepository, PsuRepository psuRepository) {
        this.userPicksRepository = userPicksRepository;
        this.pcCaseRepository = pcCaseRepository;
        this.motherboardRepository = motherboardRepository;
        this.cpuRepository = cpuRepository;
        this.memoryRamRepository = memoryRamRepository;
        this.storageDriveRepository = storageDriveRepository;
        this.monitorRepository = monitorRepository;
        this.gpuRepository = gpuRepository;
        this.psuRepository = psuRepository;
    }

    public Optional<UserPicksDTO> getUserPicks(){
        Optional<UserPicksEntity> userPicks = userPicksRepository.findById(1);

        if(userPicks.isPresent()){
            UserPicksEntity userPicksEntity = userPicks.get();

            //Setting the IDs of the user picks
            Integer pcCaseId = userPicksEntity.getCaseId();
            if(pcCaseId == null) pcCaseId = 0;

            Integer motherboardId =  userPicksEntity.getMotherboardId();
            if (motherboardId == null) motherboardId = 0;

            Integer cpuId = userPicksEntity.getCpuId();
            if (cpuId == null) cpuId = 0;

            Integer memoryId = userPicksEntity.getMemoryId();
            if (memoryId == null) memoryId = 0;

            Integer storageId = userPicksEntity.getStorageId();
            if (storageId == null) storageId = 0;

            Integer monitorId = userPicksEntity.getMonitorId();
            if (monitorId == null) monitorId = 0;

            Integer gpuId = userPicksEntity.getGpuId();
            if (gpuId == null) gpuId = 0;

            Integer psuId = userPicksEntity.getPsuId();
            if (psuId == null) psuId = 0;

            Integer userPicksId = userPicksEntity.getId();

            //Fetching the parts data from their repos

            Optional<PcCaseEntity> pcCase = pcCaseRepository.findById(pcCaseId);
            Optional<MotherboardEntity> motherboard = motherboardRepository.findById(motherboardId);
            Optional<CpuEntity> cpu = cpuRepository.findById(cpuId);
            Optional<MemoryRamEntity> memoryRam = memoryRamRepository.findById(memoryId);
            Optional<StorageDriveEntity> storageDrive = storageDriveRepository.findById(storageId);
            Optional<MonitorEntity> monitor = monitorRepository.findById(monitorId);
            Optional<GpuEntity> gpu = gpuRepository.findById(gpuId);
            Optional<PsuEntity> psu = psuRepository.findById(psuId);

            //Creating models
            PcCase pcCaseModel;
            Motherboard motherboardModel;
            Cpu cpuModel;
            MemoryRam memoryRamModel;
            StorageDrive storageDriveModel;
            Monitor monitorModel;
            Gpu gpuModel;
            Psu psuModel;

            //Mapping case Entity to model
            if (pcCase.isEmpty()) pcCaseModel = new PcCase();
            else pcCaseModel = new PcCase(pcCase.get().getId(),pcCase.get().getName(), pcCase.get().getPartNumber(), pcCase.get().getCaseType(), pcCase.get().getColor(), pcCase.get().getPrice(), pcCase.get().getStock(), pcCase.get().getMaxGpuLength(), pcCase.get().getMaxCoolerHeight(), pcCase.get().getMaxPsuLength());

            if (motherboard.isEmpty()) motherboardModel = new Motherboard();
            else motherboardModel = new Motherboard(motherboard.get().getId(), motherboard.get().getName(), motherboard.get().getBrand(), motherboard.get().getPartNumber(), motherboard.get().getPrice(), motherboard.get().getSocket(), motherboard.get().getFormFactor(), motherboard.get().getPins(), motherboard.get().getStorageType(), motherboard.get().getStock());

            if (cpu.isEmpty()) cpuModel = new Cpu();
            else cpuModel = new Cpu(cpu.get().getId(), cpu.get().getName(), cpu.get().getBrand(), cpu.get().getPartNumber(), cpu.get().getPrice(), cpu.get().getCoreClock(), cpu.get().getCoreCount(), cpu.get().getRequiredWattage(), cpu.get().getSocket(), cpu.get().getStock());

            if (memoryRam.isEmpty()) memoryRamModel = new MemoryRam();
            else memoryRamModel = new MemoryRam(memoryRam.get().getId(), memoryRam.get().getName(), memoryRam.get().getBrand(), memoryRam.get().getPartNumber(), memoryRam.get().getPrice(), memoryRam.get().getFormFactor(), memoryRam.get().getModules(), memoryRam.get().getFrequency(), memoryRam.get().getCapacity(), memoryRam.get().getStock());

            if (storageDrive.isEmpty()) storageDriveModel = new StorageDrive();
            else storageDriveModel = new StorageDrive(storageDrive.get().getId(), storageDrive.get().getName(), storageDrive.get().getBrand(), storageDrive.get().getPartNumber(), storageDrive.get().getPrice(), storageDrive.get().getStorageType(), storageDrive.get().getCapacity(), storageDrive.get().getStock());

            if (monitor.isEmpty()) monitorModel = new Monitor();
            else monitorModel = new Monitor(monitor.get().getId(), monitor.get().getName(), monitor.get().getBrand(), monitor.get().getPartNumber(), monitor.get().getPrice(), monitor.get().getScreenSize(), monitor.get().getResolution(), monitor.get().getStock());

            if (gpu.isEmpty()) gpuModel = new Gpu();
            else gpuModel = new Gpu(gpu.get().getId(), gpu.get().getName(), gpu.get().getBrand(), gpu.get().getPartNumber(), gpu.get().getPrice(), gpu.get().getMemory(), gpu.get().getCoreClock(), gpu.get().getLength(), gpu.get().getRequiredWattage(), gpu.get().getStock());

            if (psu.isEmpty()) psuModel = new Psu();
            else psuModel = new Psu(psu.get().getId(), psu.get().getName(), psu.get().getBrand(), psu.get().getPartNumber(), psu.get().getPrice(), psu.get().getWattage(), psu.get().getLength(), psu.get().getStock());

            //Mapping the DTO
            UserPicksDTO dto = new UserPicksDTO(
                    userPicksId, pcCaseId, cpuModel, cpuId, gpuModel, gpuId,
                    memoryId, memoryRamModel, monitorModel, monitorId,
                    motherboardModel, motherboardId, pcCaseModel, psuModel,
                    psuId, storageDriveModel, storageId
            );

            return Optional.of(dto);

        }

        return Optional.empty();

    }
}
