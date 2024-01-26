package ru.fedorov.spring.SpacexAPI.dtoMain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaunchDTO {

    private String mission_name;
    private int launch_year;
    private Map<String, String> links;
}
