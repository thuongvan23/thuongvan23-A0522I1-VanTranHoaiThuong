package Repository;

import Models.Facility;
import Models.House;
import Models.Room;
import Models.Villa;

import java.util.Map;

public interface IFacilityRepository {
//    void addingFacility(Facility facility, int times);
    void addingHouse(House house, int times);
    void addingRoom(Room room, int times);
    void addingVilla(Villa villa, int times);
    void addingFacility(Facility facility, int times);


    Map<Facility, Integer> getFacilityIntegerMap();
    Map<House, Integer> getHouseMap();
    Map<Room, Integer> getRoomMap();
    Map<Villa, Integer> getVillaMap();
}
