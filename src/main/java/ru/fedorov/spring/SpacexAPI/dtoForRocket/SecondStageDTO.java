package ru.fedorov.spring.SpacexAPI.dtoForRocket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondStageDTO {

    private int engines;
    private double fuel_amount_tons;
    private int burn_time_sec;
    private ThrustDTO thrust;
    private PayloadDTO payloads;
}
