package com.example.backend.persistence;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "motherboard")
public class MotherboardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String brand;

    @Column(name = "part_number")
    private String partNumber;

    private BigDecimal price;
    private String socket;

    @Column(name = "form_factor")
    private String formFactor;
    private String pins;

    @Column(name = "storage_type")
    private String storageType;

    private Integer stock;

    public MotherboardEntity() {
    }

    public MotherboardEntity(String name, String brand, String partNumber, BigDecimal price, String socket, String formFactor, String pins, String storageType, Integer stock) {
        this.name = name;
        this.brand = brand;
        this.partNumber = partNumber;
        this.price = price;
        this.socket = socket;
        this.formFactor = formFactor;
        this.pins = pins;
        this.storageType = storageType;
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

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getPins() {
        return pins;
    }

    public void setPins(String pins) {
        this.pins = pins;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
