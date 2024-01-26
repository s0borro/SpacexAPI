package ru.fedorov.spring.SpacexAPI.dtoMain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllRocketsDTO {

    private List<RocketDTO> rockets;
}