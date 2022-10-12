package test;

import java.util.Comparator;

public class Staff1Comparator implements Comparator<Staffs1> {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compare(Staffs1 o1, Staffs1 o2) {
        return o1.getStaffId()-o2.getStaffId();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
