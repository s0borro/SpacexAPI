package ru.fedorov.spring.SpacexAPI.dto;

public class EngineDTO {

    private int number;
    private String type;
    private String version;
    private String layout;
    private int engine_loss_max;
    private String propellant_1;
    private String propellant_2;
    private ThrustSeaLevelDTO thrust_sea_level;
    private ThrustVacuumDTO thrust_vacuum;
    private int thrust_to_weight;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public int getEngine_loss_max() {
        return engine_loss_max;
    }

    public void setEngine_loss_max(int engine_loss_max) {
        this.engine_loss_max = engine_loss_max;
    }

    public String getPropellant_1() {
        return propellant_1;
    }

    public void setPropellant_1(String propellant_1) {
        this.propellant_1 = propellant_1;
    }

    public String getPropellant_2() {
        return propellant_2;
    }

    public void setPropellant_2(String propellant_2) {
        this.propellant_2 = propellant_2;
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

    public int getThrust_to_weight() {
        return thrust_to_weight;
    }

    public void setThrust_to_weight(int thrust_to_weight) {
        this.thrust_to_weight = thrust_to_weight;
    }
}
