package models;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Vendor {

    private String city;
    private String state;
    private int medicalO2;
    private int industrialO2;

}
