package ru.fedorov.spring.SpacexAPI.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ru.fedorov.spring.SpacexAPI.models.Rocket;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RocketDTO {

    private List<Rocket> rockets;

    public List<Rocket> getRockets() {
        return rockets;
    }

    public void setRockets(List<Rocket> rockets) {
        this.rockets = rockets;
    }

    @Override
    public String toString() {
        return "RocketIDs\n{" + rockets +
                '}';
    }
}
