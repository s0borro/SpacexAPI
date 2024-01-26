package ru.fedorov.spring.SpacexAPI.dto;

public class CompositeFairingDTO {

    private HeightDTO height;
    private DiameterDTO diameter;

    public HeightDTO getHeight() {
        return height;
    }

    public void setHeight(HeightDTO height) {
        this.height = height;
    }

    public DiameterDTO getDiameter() {
        return diameter;
    }

    public void setDiameter(DiameterDTO diameter) {
        this.diameter = diameter;
    }
}
