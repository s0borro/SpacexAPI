package ru.fedorov.spring.SpacexAPI.dto;

public class PayloadDTO {

     private String option_1;
     private CompositeFairingDTO composite_fairing;

    public String getOption_1() {
        return option_1;
    }

    public void setOption_1(String option_1) {
        this.option_1 = option_1;
    }

    public CompositeFairingDTO getComposite_fairing() {
        return composite_fairing;
    }

    public void setComposite_fairing(CompositeFairingDTO composite_fairing) {
        this.composite_fairing = composite_fairing;
    }
}
