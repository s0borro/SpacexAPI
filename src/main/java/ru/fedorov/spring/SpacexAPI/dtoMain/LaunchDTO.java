package ru.fedorov.spring.SpacexAPI.dtoMain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.fedorov.spring.SpacexAPI.dtoForLaunch.*;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaunchDTO launchDTO = (LaunchDTO) o;
        return flight_number == launchDTO.flight_number && launch_year == launchDTO.launch_year && launch_date_unix == launchDTO.launch_date_unix && launch_window == launchDTO.launch_window && static_fire_date_unix == launchDTO.static_fire_date_unix && Objects.equals(mission_name, launchDTO.mission_name) && Arrays.equals(mission_id, launchDTO.mission_id) && Objects.equals(upcoming, launchDTO.upcoming) && Objects.equals(launch_date_utc, launchDTO.launch_date_utc) && Objects.equals(launch_date_local, launchDTO.launch_date_local) && Objects.equals(is_tentative, launchDTO.is_tentative) && Objects.equals(tentative_max_precision, launchDTO.tentative_max_precision) && Objects.equals(tbd, launchDTO.tbd) && Objects.equals(rocket, launchDTO.rocket) && Arrays.equals(ships, launchDTO.ships) && Objects.equals(telemetry, launchDTO.telemetry) && Objects.equals(launch_site, launchDTO.launch_site) && Objects.equals(launch_success, launchDTO.launch_success) && Objects.equals(launch_failure_details, launchDTO.launch_failure_details) && Objects.equals(links, launchDTO.links) && Objects.equals(details, launchDTO.details) && Objects.equals(static_fire_date_utc, launchDTO.static_fire_date_utc) && Objects.equals(timeline, launchDTO.timeline);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(flight_number, mission_name, upcoming, launch_year, launch_date_unix, launch_date_utc, launch_date_local, is_tentative, tentative_max_precision, tbd, launch_window, rocket, telemetry, launch_site, launch_success, launch_failure_details, links, details, static_fire_date_utc, static_fire_date_unix, timeline);
        result = 31 * result + Arrays.hashCode(mission_id);
        result = 31 * result + Arrays.hashCode(ships);
        return result;
    }
}










