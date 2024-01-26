package ru.fedorov.spring.SpacexAPI.dto;

public class LandingLegDTO {

    private int number;
    private String material;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
