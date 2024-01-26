package ru.fedorov.spring.SpacexAPI.dtoForRocket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LandingLegDTO {

    private int number;
    private String material;
}
