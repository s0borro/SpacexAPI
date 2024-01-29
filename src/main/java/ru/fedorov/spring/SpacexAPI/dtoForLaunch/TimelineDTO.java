package ru.fedorov.spring.SpacexAPI.dtoForLaunch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimelineDTO {

    private int webcast_liftoff;
    private int go_for_prop_loading;
    private int rp1_loading;
    private int stage1_lox_loading;
    private int stage2_lox_loading;
    private int engine_chill;
    private int prelaunch_checks;
    private int propellant_pressurization;
    private int go_for_launch;
    private int ignition;
    private int liftoff;
    private int maxq;
    private int meco;
    private int stage_sep;
    private int second_stage_ignition;
    private int fairing_deploy;
    private int first_stage_entry_burn;
    private int first_stage_landing;
    private int seco_1;
    private int second_stage_restart;
    private int seco_2;
    private int payload_deploy;
}
