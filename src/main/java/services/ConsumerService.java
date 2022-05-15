package services;

import models.Consumer;
import models.ConsumerType;

public interface ConsumerService {

    void registerConsumer(int id,ConsumerType consumerType,String city,String state,int maxReq);

    void bookOxygen(String id,int quantity);

    void showAllHospitals(String city);

    void showAllIndustries();


}
