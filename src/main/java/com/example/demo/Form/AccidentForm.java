package com.example.demo.Form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccidentForm {
    private int accidentIdx;
    private String content;
    private String date;
    private int damagePrice;
    private int clientIdx;
    private String insuranceType;
}
