package test;

import java.util.*;

public class TreeSet1 {
    public static Set<Staffs1> staffs1Set = new TreeSet<>(new Staff1Comparator());
    public static void main(String[] args) {
        staffs1Set.add(new Staffs1(5, "21", "2", 150));
        staffs1Set.add(new Staffs1(4, "45", "5", 254));
        staffs1Set.add(new Staffs1(6, "23", "1", 100));
        staffs1Set.add(new Staffs1(7, "50", "40", 10));
        staffs1Set.add(new Staffs1(10, "21", "30", 21));
        staffs1Set.add(new Staffs1(20, "54", "35", 50));
        for (Staffs1 staffs1 : staffs1Set){
            System.out.println(staffs1);
        }
    }
}
