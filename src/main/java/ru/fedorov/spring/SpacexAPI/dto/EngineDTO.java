package ru.fedorov.spring.SpacexAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
}