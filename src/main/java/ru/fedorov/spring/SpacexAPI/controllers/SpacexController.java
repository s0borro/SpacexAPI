package ru.fedorov.spring.SpacexAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.fedorov.spring.SpacexAPI.dtoMain.RocketDTO;

@RestController
@RequestMapping("/spacex")
public class SpacexController {

    @Autowired
    private RestTemplate restTemplate;
    String urlForRocketId = "https://api.spacexdata.com/v3/rockets";

    @GetMapping("/rockets")
    public ResponseEntity <RocketDTO[]> getRockets() {
        return restTemplate.getForEntity(urlForRocketId, RocketDTO[].class);
    }
}