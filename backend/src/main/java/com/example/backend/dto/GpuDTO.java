package com.example.backend.dto;

import java.math.BigDecimal;

public class GpuDTO {
    private Integer id;
    private String name;
    private String brand;
    private String partNumber;
    private BigDecimal price;
    private String memory;
    private String coreClock;
    private Integer length;
    private Integer requiredWattage;
    private Integer stock;

    public GpuDTO() {
    }

    public GpuDTO(Integer id, String name, String brand, String partNumber, BigDecimal price, String memory, String coreClock, Integer length, Integer requiredWattage, Integer stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.partNumber = partNumber;
        this.price = price;
        this.memory = memory;
        this.coreClock = coreClock;
        this.length = length;
        this.requiredWattage = requiredWattage;
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(String coreClock) {
        this.coreClock = coreClock;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getRequiredWattage() {
        return requiredWattage;
    }

    public void setRequiredWattage(Integer requiredWattage) {
        this.requiredWattage = requiredWattage;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
