package ru.fedorov.spring.SpacexAPI.dtoForRocket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThrustDTO {

    private int kN;
    private int lbf;
}
