package ru.fedorov.spring.SpacexAPI.dtoMain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.fedorov.spring.SpacexAPI.dtoForLaunch.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaunchDTO {

    private int flight_number;
    private String mission_name;
    private String[] mission_id;
    private Boolean upcoming;
    private int launch_year;
    private long launch_date_unix;
    private String launch_date_utc;
    private String launch_date_local;
    private Boolean is_tentative;
    private String tentative_max_precision;
    private Boolean tbd;
    private int launch_window;
    private LaunchedRocketDTO rocket;
    private String[] ships;
    private TelemetryDTO telemetry;
    private LaunchSiteDTO launch_site;
    private Boolean launch_success;
    private LaunchFailureDetailsDTO launch_failure_details;
    private LinkDTO links;
    private String details;
    private String static_fire_date_utc;
    private long static_fire_date_unix;
    private TimelineDTO timeline;
}










