package com.example.backend.dto;

import com.example.backend.model.*;

public class UserPicksDTO {
    private Integer userPicksId;

    private Integer caseId;
    private PcCase pcCase;

    private Integer motherboardId;
    private Motherboard motherboard;

    private Integer cpuId;
    private Cpu cpu;

    private Integer memoryId;
    private MemoryRam memoryRam;

    private Integer storageId;
    private StorageDrive storageDrive;

    private Integer monitorId;
    private Monitor monitor;

    private Integer gpuId;
    private Gpu gpu;

    private Integer psuId;
    private Psu psu;

    public UserPicksDTO() {
    }

    public UserPicksDTO(Integer userPicksId, Integer caseId, Cpu cpu, Integer cpuId, Gpu gpu, Integer gpuId, Integer memoryId, MemoryRam memoryRam, Monitor monitor, Integer monitorId, Motherboard motherboard, Integer motherboardId, PcCase pcCase, Psu psu, Integer psuId, StorageDrive storageDrive, Integer storageId) {
        this.userPicksId = userPicksId;
        this.caseId = caseId;
        this.cpu = cpu;
        this.cpuId = cpuId;
        this.gpu = gpu;
        this.gpuId = gpuId;
        this.memoryId = memoryId;
        this.memoryRam = memoryRam;
        this.monitor = monitor;
        this.monitorId = monitorId;
        this.motherboard = motherboard;
        this.motherboardId = motherboardId;
        this.pcCase = pcCase;
        this.psu = psu;
        this.psuId = psuId;
        this.storageDrive = storageDrive;
        this.storageId = storageId;
    }

    public Integer getUserPicksId() {
        return userPicksId;
    }

    public void setUserPicksId(Integer userPicksId) {
        this.userPicksId = userPicksId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public PcCase getPcCase() {
        return pcCase;
    }

    public void setPcCase(PcCase pcCase) {
        this.pcCase = pcCase;
    }

    public Integer getMotherboardId() {
        return motherboardId;
    }

    public void setMotherboardId(Integer motherboardId) {
        this.motherboardId = motherboardId;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Integer getCpuId() {
        return cpuId;
    }

    public void setCpuId(Integer cpuId) {
        this.cpuId = cpuId;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Integer getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(Integer memoryId) {
        this.memoryId = memoryId;
    }

    public MemoryRam getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(MemoryRam memoryRam) {
        this.memoryRam = memoryRam;
    }

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public StorageDrive getStorageDrive() {
        return storageDrive;
    }

    public void setStorageDrive(StorageDrive storageDrive) {
        this.storageDrive = storageDrive;
    }

    public Integer getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(Integer monitorId) {
        this.monitorId = monitorId;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Integer getGpuId() {
        return gpuId;
    }

    public void setGpuId(Integer gpuId) {
        this.gpuId = gpuId;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Integer getPsuId() {
        return psuId;
    }

    public void setPsuId(Integer psuId) {
        this.psuId = psuId;
    }

    public Psu getPsu() {
        return psu;
    }

    public void setPsu(Psu psu) {
        this.psu = psu;
    }
}
