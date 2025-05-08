package com.example.backend.model;

import java.math.BigDecimal;

public class MemoryRam {
    private Integer id;
    private String name;
    private String brand;
    private String partNumber;
    private BigDecimal price;
    private String formFactor;
    private String modules;
    private String frequency;
    private String capacity;
    private Integer stock;

    public MemoryRam() {
    }

    public MemoryRam(Integer id, String name, String brand, String partNumber, BigDecimal price, String formFactor, String modules, String frequency, String capacity, Integer stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.partNumber = partNumber;
        this.price = price;
        this.formFactor = formFactor;
        this.modules = modules;
        this.frequency = frequency;
        this.capacity = capacity;
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

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getModules() {
        return modules;
    }

    public void setModules(String modules) {
        this.modules = modules;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
