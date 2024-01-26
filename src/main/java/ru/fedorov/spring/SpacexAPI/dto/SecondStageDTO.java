package ru.fedorov.spring.SpacexAPI.dto;

public class SecondStageDTO {

    private int engines;
    private double fuel_amount_tons;
    private int burn_time_sec;
    private ThrustDTO thrust;
    private PayloadDTO payloads;

    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public double getFuel_amount_tons() {
        return fuel_amount_tons;
    }

    public void setFuel_amount_tons(double fuel_amount_tons) {
        this.fuel_amount_tons = fuel_amount_tons;
    }

    public int getBurn_time_sec() {
        return burn_time_sec;
    }

    public void setBurn_time_sec(int burn_time_sec) {
        this.burn_time_sec = burn_time_sec;
    }

    public ThrustDTO getThrust() {
        return thrust;
    }

    public void setThrust(ThrustDTO thrust) {
        this.thrust = thrust;
    }

    public PayloadDTO getPayloads() {
        return payloads;
    }

    public void setPayloads(PayloadDTO payloads) {
        this.payloads = payloads;
    }
}
