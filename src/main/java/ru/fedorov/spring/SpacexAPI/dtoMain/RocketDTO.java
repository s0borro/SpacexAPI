package ru.fedorov.spring.SpacexAPI.dtoMain;

import ru.fedorov.spring.SpacexAPI.dto.*;

import java.time.LocalDateTime;
import java.util.List;

public class RocketDTO {

    private int id;
    private boolean active;
    private int stages;
    private int boosters;
    private int cost_per_launch;
    private int success_rate_pct;
    private LocalDateTime first_flight;
    private String country;
    private String company;
    private HeightDTO height;
    private DiameterDTO diameter;
    private MassDTO mass;
    private List<PayloadWeightDTO> payload_weights;
    private FirstStageDTO first_stage;
    private SecondStageDTO second_stage;
    private EngineDTO engines;
    private LandingLegDTO landing_legs;
    private String wikipedia;
    private String description;
    private String rocket_id;
    private String rocket_name;
    private String rocket_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getStages() {
        return stages;
    }

    public void setStages(int stages) {
        this.stages = stages;
    }

    public int getBoosters() {
        return boosters;
    }

    public void setBoosters(int boosters) {
        this.boosters = boosters;
    }

    public int getCost_per_launch() {
        return cost_per_launch;
    }

    public void setCost_per_launch(int cost_per_launch) {
        this.cost_per_launch = cost_per_launch;
    }

    public int getSuccess_rate_pct() {
        return success_rate_pct;
    }

    public void setSuccess_rate_pct(int success_rate_pct) {
        this.success_rate_pct = success_rate_pct;
    }

    public LocalDateTime getFirst_flight() {
        return first_flight;
    }

    public void setFirst_flight(LocalDateTime first_flight) {
        this.first_flight = first_flight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

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

    public MassDTO getMass() {
        return mass;
    }

    public void setMass(MassDTO mass) {
        this.mass = mass;
    }

    public List<PayloadWeightDTO> getPayload_weights() {
        return payload_weights;
    }

    public void setPayload_weights(List<PayloadWeightDTO> payload_weights) {
        this.payload_weights = payload_weights;
    }

    public FirstStageDTO getFirst_stage() {
        return first_stage;
    }

    public void setFirst_stage(FirstStageDTO first_stage) {
        this.first_stage = first_stage;
    }

    public SecondStageDTO getSecond_stage() {
        return second_stage;
    }

    public void setSecond_stage(SecondStageDTO second_stage) {
        this.second_stage = second_stage;
    }

    public EngineDTO getEngines() {
        return engines;
    }

    public void setEngines(EngineDTO engines) {
        this.engines = engines;
    }

    public LandingLegDTO getLanding_legs() {
        return landing_legs;
    }

    public void setLanding_legs(LandingLegDTO landing_legs) {
        this.landing_legs = landing_legs;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRocket_id() {
        return rocket_id;
    }

    public void setRocket_id(String rocket_id) {
        this.rocket_id = rocket_id;
    }

    public String getRocket_name() {
        return rocket_name;
    }

    public void setRocket_name(String rocket_name) {
        this.rocket_name = rocket_name;
    }

    public String getRocket_type() {
        return rocket_type;
    }

    public void setRocket_type(String rocket_type) {
        this.rocket_type = rocket_type;
    }
}
