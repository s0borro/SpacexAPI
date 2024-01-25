package ru.fedorov.spring.SpacexAPI.dto;

import java.util.Map;

public class LaunchDTO {

    private String mission_name;

    private int launch_year;

    private Map<String, String> links;

    public String getMission_name() {
        return mission_name;
    }

    public void setMission_name(String mission_name) {
        this.mission_name = mission_name;
    }

    public int getLaunch_year() {
        return launch_year;
    }

    public void setLaunch_year(int launch_year) {
        this.launch_year = launch_year;
    }

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
}
