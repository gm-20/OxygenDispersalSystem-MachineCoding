package services;

import models.Vendor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendorServiceImpl implements VendorService{


    Map<String,Vendor> vendorList = new HashMap<>();

    @Override
    public void registerVendor(String city, String state, int medicalO2, int industrialO2) {

        Vendor vendor = Vendor.builder()
                .city(city)
                .state(state)
                .medicalO2(medicalO2)
                .industrialO2(industrialO2)
                .build();

        vendorList.put(vendor.getCity(), vendor);
    }

    @Override
    public void showAllVendors(String state) {
        vendorList.values().stream().filter(v -> v.getState().equals(state)).forEach(vendor -> System.out.println(vendor.toString()));
    }
}
