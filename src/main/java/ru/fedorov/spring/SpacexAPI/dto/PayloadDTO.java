package ru.fedorov.spring.SpacexAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayloadDTO {

     private String option_1;
     private CompositeFairingDTO composite_fairing;
}
