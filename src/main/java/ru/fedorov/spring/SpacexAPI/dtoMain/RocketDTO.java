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

        "second_stage": {
        "engines": 1,
                "fuel_amount_tons": 3.38,
                "burn_time_sec": 378,
                "thrust": {
            "kN": 31,
                    "lbf": 7000
        },
        "payloads": {
            "option_1": "composite fairing",
                    "composite_fairing": {
                "height": {
                    "meters": 3.5,
                            "feet": 11.5
                },
                "diameter": {
                    "meters": 1.5,
                            "feet": 4.9
                }
            }
        }
    },
        "engines": {
        "number": 1,
                "type": "merlin",
                "version": "1C",
                "layout": "single",
                "engine_loss_max": 0,
                "propellant_1": "liquid oxygen",
                "propellant_2": "RP-1 kerosene",
                "thrust_sea_level": {
            "kN": 420,
                    "lbf": 94000
        },
        "thrust_vacuum": {
            "kN": 480,
                    "lbf": 110000
        },
        "thrust_to_weight": 96
    },
        "landing_legs": {
        "number": 0,
                "material": null
    },
        "wikipedia": "https://en.wikipedia.org/wiki/Falcon_1",
            "description": "The Falcon 1 was an expendable launch system privately developed and manufactured by SpaceX during 2006-2009. On 28 September 2008, Falcon 1 became the first privately-developed liquid-fuel launch vehicle to go into orbit around the Earth.",
            "rocket_id": "falcon1",
            "rocket_name": "Falcon 1",
            "rocket_type": "rocket"
    },
}
