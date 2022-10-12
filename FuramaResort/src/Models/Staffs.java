package Models;

import java.io.Serializable;

public class Staffs extends Person implements Serializable {
    private int StaffId;
    private String level;
    private String position;
    private int salary;

    public Staffs() {
    }

    public Staffs(int staffId, String level, String position, int salary) {
        StaffId = staffId;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Staffs(String name, String birthday, String gender, String identifyId, String phoneNumber, String email, int staffId, String level, String position, int salary) {
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
}
