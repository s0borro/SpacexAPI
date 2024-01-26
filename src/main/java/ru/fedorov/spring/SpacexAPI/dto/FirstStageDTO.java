package ru.fedorov.spring.SpacexAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FirstStageDTO {

    private boolean reusable;
    private int engines;
    private double fuel_amount_tons;
    private int burn_time_sec;
    private ThrustSeaLevelDTO thrust_sea_level;
    private ThrustVacuumDTO thrust_vacuum;
}
