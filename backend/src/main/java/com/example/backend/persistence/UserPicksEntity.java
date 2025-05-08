package com.example.backend.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "user_picks")
public class UserPicksEntity {
    @Id
    private Integer id;

    @Column(name = "case_id")
    private Integer caseId;

    @Column(name = "motherboard_id")
    private Integer motherboardId;

    @Column(name = "cpu_id")
    private Integer cpuId;

    @Column(name = "memory_id")
    private Integer memoryId;

    @Column(name = "storage_id")
    private Integer storageId;

    @Column(name = "monitor_id")
    private Integer monitorId;

    @Column(name = "gpu_id")
    private Integer gpuId;

    @Column(name = "psu_id")
    private Integer psuId;

    public UserPicksEntity() {
    }

    public UserPicksEntity(Integer caseId, Integer motherboardId, Integer cpuId, Integer memoryId, Integer storageId, Integer monitorId, Integer gpuId, Integer psuId) {
        this.caseId = caseId;
        this.motherboardId = motherboardId;
        this.cpuId = cpuId;
        this.memoryId = memoryId;
        this.storageId = storageId;
        this.monitorId = monitorId;
        this.gpuId = gpuId;
        this.psuId = psuId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getMotherboardId() {
        return motherboardId;
    }

    public void setMotherboardId(Integer motherboardId) {
        this.motherboardId = motherboardId;
    }

    public Integer getCpuId() {
        return cpuId;
    }

    public void setCpuId(Integer cpuId) {
        this.cpuId = cpuId;
    }

    public Integer getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(Integer memoryId) {
        this.memoryId = memoryId;
    }

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public Integer getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(Integer monitorId) {
        this.monitorId = monitorId;
    }

    public Integer getGpuId() {
        return gpuId;
    }

    public void setGpuId(Integer gpuId) {
        this.gpuId = gpuId;
    }

    public Integer getPsuId() {
        return psuId;
    }

    public void setPsuId(Integer psuId) {
        this.psuId = psuId;
    }
}
