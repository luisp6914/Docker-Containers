package com.example.backend.persistence;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "storage_drive")
public class StorageDriveEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String brand;

    @Column(name = "part_number")
    private String partNumber;

    private BigDecimal price;

    @Column(name = "storage_type")
    private String storageType;

    private String capacity;
    private Integer stock;

    public StorageDriveEntity() {
    }

    public StorageDriveEntity(String name, String brand, String partNumber, BigDecimal price, String storageType, String capacity, Integer stock) {
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
