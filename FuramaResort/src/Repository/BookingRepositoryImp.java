package Repository;

import Models.Booking;
import Models.BookingComparator;
import Models.Contract;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepositoryImp implements IBookingRepository{
    Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    Queue<Contract> contractQueue = new LinkedList<>();

    @Override
    public void addNewBooking(Booking booking) {
        bookingSet.add(booking);
    }

    @Override
    public void creatNewContract() {

    }

    @Override
    public Set<Booking> getBookingList() {
        return bookingSet;
    }

    @Override
    public Queue<Contract> getContractList() {
        return contractQueue;
    }
}
