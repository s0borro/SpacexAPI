package ru.fedorov.spring.SpacexAPI.dtoMain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.fedorov.spring.SpacexAPI.dtoForLaunch.LinkDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaunchDTOShort {

    private String mission_name;
    private int launch_year;
    private LinkDTO links;
}
