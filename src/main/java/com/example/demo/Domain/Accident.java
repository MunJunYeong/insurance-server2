package com.example.demo.Domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
public class Accident {
    @Id
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE, //사용할 전략을 시퀀스로  선택
            generator="USER_SEQ_GEN" //식별자 생성기를 설정해놓은  USER_SEQ_GEN으로 설정
    )
    private Long accidentIdx;
    private String content;
    private Date date;
    private int damagePrice;
    private int measuredPrice;
    private int clientIdx;
    private int insuranceIdx;
    private int employeeIdx;
}
