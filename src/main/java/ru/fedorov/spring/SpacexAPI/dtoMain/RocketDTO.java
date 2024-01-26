package ru.fedorov.spring.SpacexAPI.dtoMain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.fedorov.spring.SpacexAPI.dto.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RocketDTO {

    private int id;
    private Boolean active;
    private int stages;
    private int boosters;
    private long cost_per_launch;
    private int success_rate_pct;
    private String first_flight;
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
}
