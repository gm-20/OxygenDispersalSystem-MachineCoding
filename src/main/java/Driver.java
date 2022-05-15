import models.ConsumerType;
import services.ConsumerService;
import services.ConsumerServiceImpl;
import services.VendorService;
import services.VendorServiceImpl;

public class Driver {

    public static void main(String[] args) {

        VendorService vendorService = new VendorServiceImpl();

        vendorService.registerVendor("durg","cg",10,100);
        vendorService.registerVendor("bhilai","cg",20,200);
        vendorService.registerVendor("bengaluru","kar",20,200);


        ConsumerService consumerService = new ConsumerServiceImpl();

        consumerService.registerConsumer(1, ConsumerType.HOSPITAL,"durg","cg",5);
        consumerService.registerConsumer(2,ConsumerType.HOSPITAL,"durg","cg",10);

        //vendorService.showAllVendors("kar");
        //consumerService.showAllHospitals("durg");
        



    }
}
