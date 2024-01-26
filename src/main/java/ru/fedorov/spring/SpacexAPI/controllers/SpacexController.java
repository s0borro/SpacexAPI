package ru.fedorov.spring.SpacexAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.fedorov.spring.SpacexAPI.dtoMain.RocketDTO;

import java.util.List;


@RestController
@RequestMapping("/spacex")
public class SpacexController {

    private final RestTemplate restTemplate;

    @Autowired
    public SpacexController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/rocketid")
    public RocketDTO getRocketId() {
        String url = "https://api.spacexdata.com/v3/rockets";
        RocketDTO response = restTemplate.getForObject(url, RocketDTO.class);
        return response;
    }
}
