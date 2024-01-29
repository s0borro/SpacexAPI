package ru.fedorov.spring.SpacexAPI.dtoForLaunch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FairingDTO {

    private Boolean reused;
    private Boolean recovery_attempt;
    private Boolean recovered;
    private String ship;
}
