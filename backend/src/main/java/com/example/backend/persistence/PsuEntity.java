package com.example.backend.persistence;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "psu")
public class PsuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String brand;

    @Column(name = "part_number")
    private String partNumber;

    private BigDecimal price;
    private Integer wattage;
    private Integer length;
    private Integer stock;

    public PsuEntity() {
    }

    public PsuEntity(String name, String brand, String partNumber, BigDecimal price, Integer wattage, Integer length, Integer stock) {
        this.name = name;
        this.brand = brand;
        this.partNumber = partNumber;
        this.price = price;
        this.wattage = wattage;
        this.length = length;
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

    public Integer getWattage() {
        return wattage;
    }

    public void setWattage(Integer wattage) {
        this.wattage = wattage;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
