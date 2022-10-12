package Repository;

import Models.Facility;
import Models.House;
import Models.Room;
import Models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepositoryImp implements IFacilityRepository{
    Map<House, Integer> houseIntegerLinkedHashMap = new LinkedHashMap<>();
    Map<Room, Integer> roomIntegerLinkedHashMap = new LinkedHashMap<>();
    Map<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<>();
    Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    @Override
    public void addingHouse(House house, int times) {
        houseIntegerLinkedHashMap.put(house, times);
    }
    @Override
    public void addingRoom(Room room, int times) {
        roomIntegerLinkedHashMap.put(room, times);
    }
    @Override
    public void addingVilla(Villa villa, int times) {
        villaIntegerLinkedHashMap.put(villa, times);
    }
    @Override
    public void addingFacility(Facility facility, int times) {
        facilityIntegerMap.put(facility, times);
    }


    @Override
    public Map<House, Integer> getHouseMap() {
        return houseIntegerLinkedHashMap;
    }
    @Override
    public Map<Room, Integer> getRoomMap() {
        return roomIntegerLinkedHashMap;
    }

    @Override
    public Map<Villa, Integer> getVillaMap() {
        return villaIntegerLinkedHashMap;
    }
    @Override
    public Map<Facility, Integer> getFacilityIntegerMap() {
        return facilityIntegerMap;
    }
}
