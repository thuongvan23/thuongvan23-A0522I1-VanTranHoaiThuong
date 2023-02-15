package Service.Impl;

import Model.RentingService;
import Repository.Impl.RentingServiceRepositoryImpl;
import Repository.RentingServiceRepository;
import Service.RentingServiceService;

import java.util.List;

public class RentingServiceServiceImpl implements RentingServiceService {
    RentingServiceRepository rentingServiceRepository = new RentingServiceRepositoryImpl();
    @Override
    public void createOrUpdate(RentingService rentingService) {
        rentingServiceRepository.createOrUpdate(rentingService);
    }

    @Override
    public void deleteById(String id) {
        rentingServiceRepository.deleteById(id);
    }

    @Override
    public RentingService findById(String id) {
        return rentingServiceRepository.findById(id);
    }

    @Override
    public List<RentingService> findAll() {
        return rentingServiceRepository.findAll();
    }
}
