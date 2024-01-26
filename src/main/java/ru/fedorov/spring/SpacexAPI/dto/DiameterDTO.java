package ru.fedorov.spring.SpacexAPI.dto;

public class DiameterDTO {

    private double meters;
    private double feet;

    public double getMeters() {
        return meters;
    }

    public void setMeters(double meters) {
        this.meters = meters;
    }

    public double getFeet() {
        return feet;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }
}
