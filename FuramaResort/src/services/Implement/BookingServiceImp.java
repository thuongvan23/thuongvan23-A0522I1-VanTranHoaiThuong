package services.Implement;

import Models.Booking;
import Models.Customer;
import Models.Facility;
import Repository.BookingRepositoryImp;
import Repository.FacilityRepositoryImp;
import Repository.IBookingRepository;
import Repository.IFacilityRepository;
import services.BookingService;
import services.CustomerService;

import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class BookingServiceImp implements BookingService {
    public static Pattern pattern = Pattern.compile("\\d{2}[-|/]\\d{2}[-|/]\\d{4}");
    public static CustomerService iCustomerService = new CustomerServiceImp();
    public static Scanner scanner = new Scanner(System.in);
    public static IBookingRepository iBookingRepository = new BookingRepositoryImp();
    public static IFacilityRepository iFacilityRepository = new FacilityRepositoryImp();

    @Override
    public void displayListContract() {

    }

    @Override
    public void editContract() {

    }

    @Override
    public void add() {
        iCustomerService.display();
        Booking booking = this.infoBooking();
        System.out.println(booking.getNameService());
        iBookingRepository.getBookingList().add(booking);
    }

    @Override
    public void display() {
        for (Booking booking : iBookingRepository.getBookingList()) {
            System.out.println(booking);
        }
    }

    @Override
    public void editInfo() {
    }

    public Booking infoBooking() {
        System.out.print("Enter bookingId: ");
        int bookingId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter dayStart: ");
        String dayStart = this.makeDayStart();
        System.out.print("Enter dayEnd: ");
        String dayEnd = this.makeDayEnd();
//        System.out.print("Enter customerId: ");
        Customer customer = this.makeCustomer();
        System.out.print("Enter nameService: ");
        String nameService = scanner.nextLine();
        System.out.print("Enter typeService: ");
        String typeService = scanner.nextLine();
        Booking booking = new Booking(bookingId, dayStart, dayEnd, customer.getCustomerId(), nameService, typeService);
        return booking;
    }

    private String makeDayStart() {
        String dayStart = scanner.nextLine();
        if (pattern.matcher(dayStart).matches()) {
            int day = Integer.parseInt(dayStart.substring(0, 2));
            int month = Integer.parseInt(dayStart.substring(3, 5));
            int year = Integer.parseInt(dayStart.substring(6, 10));
            return dayStart;
        } else {
            System.out.print("Enter again dayStart: ");
            return makeDayStart();
        }
    }

    private String makeDayEnd() {
        String dayEnd = scanner.nextLine();
        if (pattern.matcher(dayEnd).matches()) {
            int day = Integer.parseInt(dayEnd.substring(0, 2));
            int month = Integer.parseInt(dayEnd.substring(3, 5));
            int year = Integer.parseInt(dayEnd.substring(6, 10));
            return dayEnd;
        } else {
            System.out.print("Enter again dayEnd: ");
            return makeDayEnd();
        }
    }

    public Customer makeCustomer() {
        System.out.print("Enter customerId: ");
        int customerId = Integer.parseInt(scanner.nextLine());
        for (Customer customer : iCustomerService.getAll()) {
            if (customer.getCustomerId() == customerId) {
                return iCustomerService.getAll().get(iCustomerService.getAll().indexOf(customer));
            }
        }
        System.out.print("1. ReEnter customerId. \n" +
                "2. Add new Customer.\n" +
                "Choose: ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 2) {
            iCustomerService.add();
        }
        return makeCustomer();
    }

    public void checkFacility() {
//        int times;
        Set<Facility> keySet = iFacilityRepository.getFacilityIntegerMap().keySet();
//
        for (Facility facility1 : keySet){
            System.out.println(facility1.getServiceName().equals(facility1));
            System.out.println(facility1);
            System.out.println(iFacilityRepository.getFacilityIntegerMap().get(facility1));
        }


//        for (Facility facility : keySet) {
//            if (facility.getServiceName().equals(nameService)) {
//                times = iFacilityRepository.getFacilityIntegerMap().get(facility);
//                times += 1;
//                iFacilityRepository.getFacilityIntegerMap().replace(facility, times);
//                break;
//            }
//        }

    }
}


//Truy cập các phần tử của map
//Map<Integer, String> map = new HashMap<Integer, String>();
//        // add elements to map
//        map.put(1, "Java");
//        map.put(3, "C++");
//        map.put(2, "PHP");
//        map.put(4, "Python");
//        // show map
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
