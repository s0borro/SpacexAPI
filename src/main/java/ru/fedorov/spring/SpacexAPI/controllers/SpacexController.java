package ru.fedorov.spring.SpacexAPI.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.fedorov.spring.SpacexAPI.dtoMain.LaunchDTO;
import ru.fedorov.spring.SpacexAPI.dtoMain.RocketDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/spacex")
public class SpacexController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    String urlForRockets = "https://api.spacexdata.com/v3/rockets";

    String urlForLaunches = "https://api.spacexdata.com/v3/launches";

    @GetMapping("/rocketid")
    public List<?> getRocketId() {
        ResponseEntity<List<RocketDTO>> response = restTemplate.exchange(urlForRockets, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<RocketDTO>>() {});
        List<RocketDTO> rockets = response.getBody();
        return rockets.stream().map(RocketDTO::getRocket_id).collect(Collectors.toList());
    }


    /*@GetMapping("/launches")
    public ResponseEntity<LaunchDTO[]> getLaunches() {
    }*/
}