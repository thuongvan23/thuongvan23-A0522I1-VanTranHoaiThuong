package Service.Impl;

import Model.House;
import Repository.HouseRepository;
import Repository.Impl.HouseRepositoryImpl;
import Service.HouseService;

import java.util.List;

public class HouseServiceImpl implements HouseService {

    private final HouseRepository houseRepository = new HouseRepositoryImpl();

    @Override
    public void save(House house) {
        houseRepository.save(house);
    }

    @Override
    public void deleteById(int houseId) {
        houseRepository.deleteById(houseId);
    }

    @Override
    public House findById(int houseId) {
        return houseRepository.findById(houseId);
    }

    @Override
    public List<House> findAll() {
        return houseRepository.findAll();
    }
}
