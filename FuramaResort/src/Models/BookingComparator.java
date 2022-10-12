package Models;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compare(Booking o1, Booking o2) {
        int day = Integer.parseInt(o1.getDayStart().substring(0, 2));
        int month = Integer.parseInt(o1.getDayStart().substring(3, 5));
        int year = Integer.parseInt(o1.getDayStart().substring(6, 10));
        int dayO = Integer.parseInt(o2.getDayStart().substring(0, 2));
        int monthO = Integer.parseInt(o2.getDayStart().substring(3, 5));
        int yearO = Integer.parseInt(o2.getDayStart().substring(6, 10));
        if (year > yearO) {
            return 1;
        } else if (year < yearO) {
            return -1;
        } else {
            if (month > monthO) {
                return 1;
            } else if (month < monthO) {
                return -1;
            } else {
                if (day > dayO) {
                    return 1;
                } else if (day < dayO) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
