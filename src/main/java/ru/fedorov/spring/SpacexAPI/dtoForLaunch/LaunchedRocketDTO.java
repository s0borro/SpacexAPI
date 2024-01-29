package ru.fedorov.spring.SpacexAPI.dtoForLaunch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaunchedRocketDTO {

    private String rocket_id;
    private String rocket_name;
    private String rocket_type;
    private LaunchFirstStageDTO first_stage;
    private LaunchSecondStageDTO second_stage;
    private FairingDTO fairings;
}
