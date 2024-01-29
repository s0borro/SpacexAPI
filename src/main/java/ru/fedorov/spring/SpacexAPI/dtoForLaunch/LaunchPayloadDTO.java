package ru.fedorov.spring.SpacexAPI.dtoForLaunch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaunchPayloadDTO {

    private String payload_id;
    private String[] norad_id;
    private Boolean reused;
    private String[] customers;
    private String nationality;
    private String manufacturer;
    private String payload_type;
    private int payload_mass_kg;
    private int payload_mass_lbs;
    private String orbit;
    private OrbitParamDTO orbit_params;
}
