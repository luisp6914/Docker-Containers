package com.example.backend.model;

public class Vaccine {
    //Data fields
    private Integer id;
    private String name;
    private Integer dosesRequired;
    private Integer doseIntervals;
    private Integer dosesReceived;
    private Integer dosesRemaining;

    //Constructor
    public Vaccine(Integer id, String name, Integer dosesRequired, Integer doseIntervals, Integer dosesReceived){
        this.id = id;
        this.name = name;
        this.dosesRequired = dosesRequired;
        this.doseIntervals = doseIntervals;
        this.dosesReceived = dosesReceived;
        this.dosesRemaining = dosesReceived;
    }

    public Vaccine(){
    }

    //Getters and setters


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

    public Integer getDosesRequired() {
        return dosesRequired;
    }

    public void setDosesRequired(Integer dosesRequired) {
        this.dosesRequired = dosesRequired;
    }

    public Integer getDoseIntervals() {
        return doseIntervals;
    }

    public void setDoseIntervals(Integer doseIntervals) {
        this.doseIntervals = doseIntervals;
    }

    public Integer getDosesReceived() {
        return dosesReceived;
    }

    public void setDosesReceived(Integer dosesReceived) {
        this.dosesReceived = dosesReceived;
    }

    public Integer getDosesRemaining() {
        return dosesRemaining;
    }

    public void setDosesRemaining(Integer dosesRemaining) {
        this.dosesRemaining = dosesRemaining;
    }
}
