package ru.fedorov.spring.SpacexAPI.dtoForLaunch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoreDTO {

    private String core_serial;
    private int flight;
    private int block;
    private Boolean gridfins;
    private Boolean legs;
    private Boolean reused;
    private Boolean land_success;
    private Boolean landing_intent;
    private String landing_type;
    private String landing_vehicle;
}
