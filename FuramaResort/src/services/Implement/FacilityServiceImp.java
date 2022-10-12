package services.Implement;

import Models.Facility;
import Models.House;
import Models.Room;
import Models.Villa;
import Repository.FacilityRepositoryImp;
import Repository.IFacilityRepository;
import  services.FacilityService;

import java.util.Scanner;

public class FacilityServiceImp implements FacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static IFacilityRepository iFacilityRepository = new FacilityRepositoryImp();

    @Override
    public void displayFacilityMaintenance() {

    }

    @Override
    public void addingHouse() {
        House house = this.infoHouse();
        iFacilityRepository.addingHouse(house, 0);
        iFacilityRepository.addingFacility(house, 0);
    }

    @Override
    public void AddingVilla() {
        Villa villa = this.infoVilla();
        iFacilityRepository.addingVilla(villa, 0);
        iFacilityRepository.addingFacility(villa, 0);
    }

    @Override
    public void addingRoom() {
        Room room = this.infoRoom();
        iFacilityRepository.addingRoom(room, 0);
        iFacilityRepository.addingFacility(room, 0);
    }

    @Override
    public void add() {
    }

    @Override
    public void display() {
        for (Facility facility : iFacilityRepository.getHouseMap().keySet()) {
            String value = String.valueOf(iFacilityRepository.getHouseMap().get(facility));
            System.out.println(facility + "--" + value);
        }
        for (Facility facility : iFacilityRepository.getRoomMap().keySet()) {
            String value = String.valueOf(iFacilityRepository.getRoomMap().get(facility));
            System.out.println(facility + "--" + value);
        }
        for (Facility facility : iFacilityRepository.getVillaMap().keySet()) {
            String value = String.valueOf(iFacilityRepository.getVillaMap().get(facility));
            System.out.println(facility + "--" + value);
        }
    }

    @Override
    public void editInfo() {

    }

    private Facility infoService() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter area: ");
        int usingArea = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter people: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter howToRent: ");
        String howToRent = scanner.nextLine();
        Facility facility = new Facility(name, usingArea, price, people, howToRent) {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        };
        return facility;
    }

    private Villa infoVilla() {
        Facility facility = infoService();
        System.out.print("Enter levelRoom: ");
        int levelRoom = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter areaPool: ");
        int areaPool = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter floors: ");
        int floors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(facility.getServiceName(), facility.getUsingArea(), facility.getPrice(), facility.getPeople(), facility.getHowToRent(), levelRoom, areaPool, floors);
        return villa;
    }

    private House infoHouse() {
        Facility facility = infoService();
        System.out.print("Enter levelRoom: ");
        int levelRoom = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter floors: ");
        int floors = Integer.parseInt(scanner.nextLine());
        House house = new House(facility.getServiceName(), facility.getUsingArea(), facility.getPrice(), facility.getPeople(), facility.getHowToRent(), levelRoom, floors);
        return house;
    }
    private Room infoRoom(){
        Facility facility = infoService();
        System.out.print("Enter freeService: ");
        String freeService = scanner.nextLine();
        Room room = new Room(facility.getServiceName(), facility.getUsingArea(), facility.getPrice(), facility.getPeople(), facility.getHowToRent(), freeService);
        return room;
    }
}
