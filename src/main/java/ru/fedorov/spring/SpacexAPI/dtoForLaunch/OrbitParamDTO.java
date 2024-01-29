package ru.fedorov.spring.SpacexAPI.dtoForLaunch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrbitParamDTO {

    private String reference_system;
    private String regime;
    private double longitude;
    private double semi_major_axis_km;
    private double eccentricity;
    private int periapsis_km;
    private int apoapsis_km;
    private int inclination_deg;
    private double period_min;
    private int lifespan_years;
    private String epoch;
    private double mean_motion;
    private double raan;
    private double arg_of_pericenter;
    private double mean_anomaly;
}
