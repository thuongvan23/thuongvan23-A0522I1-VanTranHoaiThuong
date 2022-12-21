package Service;

import Model.RentingService;

import java.util.List;

public interface RentingServiceService {
    void createOrUpdate(RentingService rentingService);
    void deleteById(String id);
    RentingService findById(String id);
    List<RentingService> findAll();
}
