package ru.fedorov.spring.SpacexAPI.dto;

public class ThrustVacuumDTO {

    private int kN;
    private int lbf;

    public int getkN() {
        return kN;
    }

    public void setkN(int kN) {
        this.kN = kN;
    }

    public int getLbf() {
        return lbf;
    }

    public void setLbf(int lbf) {
        this.lbf = lbf;
    }
}
