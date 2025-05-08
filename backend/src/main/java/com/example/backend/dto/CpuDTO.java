package com.example.backend.dto;

import java.math.BigDecimal;

public class CpuDTO {
    private Integer id;
    private String name;
    private String brand;
    private String partNumber;
    private BigDecimal price;
    private String coreClock;
    private Integer coreCount;
    private Integer requiredWattage;
    private String socket;
    private Integer stock;

    public CpuDTO() {
    }

    public CpuDTO(Integer id,String name, String brand, String partNumber, BigDecimal price, String coreClock, Integer coreCount, Integer requiredWattage, String socket, Integer stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.partNumber = partNumber;
        this.price = price;
        this.coreClock = coreClock;
        this.coreCount = coreCount;
        this.requiredWattage = requiredWattage;
        this.socket = socket;
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

    public String getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(String coreClock) {
        this.coreClock = coreClock;
    }

    public Integer getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
    }

    public Integer getRequiredWattage() {
        return requiredWattage;
    }

    public void setRequiredWattage(Integer requiredWattage) {
        this.requiredWattage = requiredWattage;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
