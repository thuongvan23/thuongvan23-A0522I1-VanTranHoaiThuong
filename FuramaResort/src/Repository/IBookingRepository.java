package Repository;

import Models.Booking;
import Models.Contract;

import java.util.Queue;
import java.util.Set;

public interface IBookingRepository {
    void addNewBooking(Booking booking);
    void creatNewContract();
    Set<Booking> getBookingList();
    Queue<Contract> getContractList();
}
