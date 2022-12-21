package Repository;

import Model.House;

import java.util.List;

public interface HouseRepository {
    void save(House house);
    void deleteById(int houseId);
    House findById(int houseId);
    List<House> findAll();
}
