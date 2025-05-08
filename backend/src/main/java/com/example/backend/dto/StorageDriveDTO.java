package com.example.backend.dto;

import java.math.BigDecimal;

public class StorageDriveDTO {
    private Integer id;
    private String name;
    private String brand;
    private String partNumber;
    private BigDecimal price;
    private String storageType;
    private String capacity;
    private Integer stock;

    public StorageDriveDTO() {
    }

    public StorageDriveDTO(Integer id, String name, String brand, String partNumber, BigDecimal price, String storageType, String capacity, Integer stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.partNumber = partNumber;
        this.price = price;
        this.storageType = storageType;
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

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
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
