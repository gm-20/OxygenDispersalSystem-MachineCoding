package services;

import models.Vendor;

public interface VendorService {

    void registerVendor(String city,String state,int medicalO2,int industrialO2);

    void showAllVendors(String state);

}
