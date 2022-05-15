package services;

import models.Consumer;
import models.ConsumerType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsumerServiceImpl implements ConsumerService{


    Map<Integer,Consumer> consumerList = new HashMap<>();

    @Override
    public void registerConsumer(int id, ConsumerType consumerType, String city, String state, int maxReq) {

        Consumer consumer = Consumer.builder()
                .id(id)
                .consumerType(consumerType)
                .city(city)
                .state(state)
                .maxReq(maxReq)
                .availableO2(maxReq)
                .build();

        consumerList.put(consumer.getId(),consumer);
    }

    @Override
    public void bookOxygen(String id, int quantity) {

    }

    @Override
    public void showAllHospitals(String city) {
        List<Consumer> consumerList1 = consumerList.values().stream()
                .filter(consumer -> consumer.getConsumerType().equals(ConsumerType.HOSPITAL) &&
                        consumer.getCity().equals(city))
                .sorted((f1,f2) -> Integer.compare(f2.getAvailableO2(),f1.getAvailableO2()))
                .collect(Collectors.toList());

        for(Consumer c : consumerList1) {
            System.out.println(c);
        }
    }

    @Override
    public void showAllIndustries() {

    }
}