package com.example.backend.dto;

import java.math.BigDecimal;

public class MonitorDTO {
    private Integer id;
    private String name;
    private String brand;
    private String partNumber;
    private BigDecimal price;
    private String screenSize;
    private String resolution;
    private Integer stock;

    public MonitorDTO() {
    }

    public MonitorDTO(Integer id, String name, String brand, String partNumber, BigDecimal price, String screenSize, String resolution, Integer stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.partNumber = partNumber;
        this.price = price;
        this.screenSize = screenSize;
        this.resolution = resolution;
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

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
