package models;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Consumer {

    private int id;
    private ConsumerType consumerType;
    private String city;
    private String state;
    private int maxReq;
    private int availableO2;

}
