package com.example.backend.persistence;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "gpu")
public class GpuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String brand;

    @Column(name = "part_number")
    private String partNumber;

    private BigDecimal price;
    private String memory;

    @Column(name = "core_clock")
    private String coreClock;

    private Integer length;

    @Column(name = "required_wattage")
    private Integer requiredWattage;

    private Integer stock;

    public GpuEntity() {
    }

    public GpuEntity(String name, String brand, String partNumber, BigDecimal price, String memory, String coreClock, Integer length, Integer requiredWattage, Integer stock) {
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
