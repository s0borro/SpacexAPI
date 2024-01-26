package ru.fedorov.spring.SpacexAPI.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/spacex")
public class SpacexController {

    private final RestTemplate restTemplate;

    @Autowired
    public SpacexController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/rocketid")
    public String getRocketId() {
        String url = "https://api.spacexdata.com/v3/rockets";
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }
}
