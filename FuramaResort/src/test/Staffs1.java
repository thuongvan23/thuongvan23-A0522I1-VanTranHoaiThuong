package test;

import Models.Person;
import Models.Staffs;

import java.util.Comparator;

public class Staffs1 extends Person implements Comparable<Staffs1>  {
    private int StaffId;
    private String level;
    private String position;
    private int salary;

    public Staffs1() {
    }

    public Staffs1(int staffId, String level, String position, int salary) {
        StaffId = staffId;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Staffs1(String name, String birthday, String gender, String identifyId, String phoneNumber, String email, int staffId, String level, String position, int salary) {
        super(name, birthday, gender, identifyId, phoneNumber, email);
        StaffId = staffId;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getStaffId() {
        return StaffId;
    }

    public void setStaffId(int staffId) {
        StaffId = staffId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staffs{" +
                "StaffId=" + StaffId +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}'+super.toString();
    }

//    @Override
//    public int compare(Staffs1 o1, Staffs1 o2) {
//        return o1.salary;
//    }

    @Override
    public int compareTo(Staffs1 o) {
        return salary - o.salary;
    }
}
