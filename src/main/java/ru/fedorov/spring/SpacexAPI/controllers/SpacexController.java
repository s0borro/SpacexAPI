package ru.fedorov.spring.SpacexAPI.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/spacex")
public class SpacexController {

    private final RestTemplate restTemplate;

    private final ModelMapper modelMapper;

    @Autowired
    public SpacexController(RestTemplate restTemplate, ModelMapper modelMapper) {
        this.restTemplate = restTemplate;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/rocketid")
    public String getRocketId() {
        String url = "https://api.spacexdata.com/v3/rockets";
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }
}
