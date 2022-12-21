package Repository.Impl;

import Model.RentingService;
import Repository.RentingServiceRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentingServiceRepositoryImpl implements RentingServiceRepository {
    Map<String, RentingService> rentingServiceMap = new HashMap<>();
    @Override
    public void createOrUpdate(RentingService rentingService) {
        rentingServiceMap.put(rentingService.getServiceId(), rentingService);
    }

    @Override
    public void deleteById(String id) {
        rentingServiceMap.remove(id);
    }

    @Override
    public RentingService findById(String id) {
        return rentingServiceMap.get(id);
    }

    @Override
    public List<RentingService> findAll() {
        return new ArrayList<>(rentingServiceMap.values());
    }
}
