package ru.fedorov.spring.SpacexAPI.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.fedorov.spring.SpacexAPI.dtoMain.LaunchDTO;
import ru.fedorov.spring.SpacexAPI.dtoMain.LaunchDTOShort;
import ru.fedorov.spring.SpacexAPI.dtoMain.RocketDTO;
import ru.fedorov.spring.SpacexAPI.util.MapperUtil;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/spacex")
public class SpacexController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ModelMapper modelMapper;

    String urlForRockets = "https://api.spacexdata.com/v3/rockets";

    String urlForLaunches = "https://api.spacexdata.com/v3/launches";

    @GetMapping("/rocketid")
    public List<String> getRocketId() {
        ResponseEntity<List<RocketDTO>> response = restTemplate.exchange(urlForRockets, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<RocketDTO>>() {});

        return response.getBody().stream().map(RocketDTO::getRocket_id).collect(Collectors.toList());
    }

    @GetMapping("/launcheswithrocketid/{rocketid}")
    public List<LaunchDTOShort> getLaunches(@PathVariable ("rocketid") String rocketId) {
        ResponseEntity<List<LaunchDTO>> response = restTemplate.exchange(urlForLaunches, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<LaunchDTO>>() {});

        List<LaunchDTO> allLaunches = response.getBody();

        Iterator<LaunchDTO> iterator = allLaunches.iterator();
        while (iterator.hasNext()) {
            LaunchDTO launchDTO = iterator.next();
                if (!launchDTO.getRocket().getRocket_id().equals(rocketId)) {
                    iterator.remove();
                }
            }
        return MapperUtil.convertList(allLaunches, this::convertToLaunchDTOShort);
        ///
    }

    private LaunchDTOShort convertToLaunchDTOShort(LaunchDTO launchDTO) {
        return modelMapper.map(launchDTO, LaunchDTOShort.class);
    }
}