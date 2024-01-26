package ru.fedorov.spring.SpacexAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompositeFairingDTO {

    private HeightDTO height;
    private DiameterDTO diameter;
}
