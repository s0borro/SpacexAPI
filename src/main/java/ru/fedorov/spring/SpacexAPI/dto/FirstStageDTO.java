package ru.fedorov.spring.SpacexAPI.dto;

public class FirstStageDTO {

    private boolean reusable;
    private int engines;
    private double fuel_amount_tons;
    private int burn_time_sec;
    private ThrustSeaLevelDTO thrust_sea_level;
    private ThrustVacuumDTO thrust_vacuum;

    public boolean isReusable() {
        return reusable;
    }

    public void setReusable(boolean reusable) {
        this.reusable = reusable;
    }

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

    public ThrustSeaLevelDTO getThrust_sea_level() {
        return thrust_sea_level;
    }

    public void setThrust_sea_level(ThrustSeaLevelDTO thrust_sea_level) {
        this.thrust_sea_level = thrust_sea_level;
    }

    public ThrustVacuumDTO getThrust_vacuum() {
        return thrust_vacuum;
    }

    public void setThrust_vacuum(ThrustVacuumDTO thrust_vacuum) {
        this.thrust_vacuum = thrust_vacuum;
    }
}
