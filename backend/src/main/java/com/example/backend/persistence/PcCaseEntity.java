package com.example.backend.persistence;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "pc_case")
public class PcCaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String brand;

    @Column(name = "part_number")
    private String partNumber;

    @Column(name = "case_type")
    private String caseType;

    private String color;
    private BigDecimal price;
    private Integer stock;

    @Column(name = "max_gpu_length")
    private Integer maxGpuLength;

    @Column(name = "max_cooler_height")
    private Integer maxCoolerHeight;

    @Column(name = "max_psu_length")
    private Integer maxPsuLength;

    public PcCaseEntity() {
    }

    public PcCaseEntity(String name, String brand, String partNumber, String caseType, String color, BigDecimal price, Integer stock, Integer maxGpuLength, Integer maxCoolerHeight, Integer maxPsuLength) {
        this.name = name;
        this.brand = brand;
        this.partNumber = partNumber;
        this.caseType = caseType;
        this.color = color;
        this.price = price;
        this.stock = stock;
        this.maxGpuLength = maxGpuLength;
        this.maxCoolerHeight = maxCoolerHeight;
        this.maxPsuLength = maxPsuLength;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getMaxGpuLength() {
        return maxGpuLength;
    }

    public void setMaxGpuLength(Integer maxGpuLength) {
        this.maxGpuLength = maxGpuLength;
    }

    public Integer getMaxCoolerHeight() {
        return maxCoolerHeight;
    }

    public void setMaxCoolerHeight(Integer maxCoolerHeight) {
        this.maxCoolerHeight = maxCoolerHeight;
    }

    public Integer getMaxPsuLength() {
        return maxPsuLength;
    }

    public void setMaxPsuLength(Integer maxPsuLength) {
        this.maxPsuLength = maxPsuLength;
    }
}
