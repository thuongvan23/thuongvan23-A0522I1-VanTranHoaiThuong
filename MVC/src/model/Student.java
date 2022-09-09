package model;

public class Student extends Person{
    private String nameClass;
    private double point;

    public Student() {
    }

    public Student(int code, String name, String dateOfBirth, String gender, String nameClass, double point) {
        super(code, name, dateOfBirth, gender);
        this.nameClass = nameClass;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameClass='" + nameClass + '\'' +
                ", point=" + point +
                "} " + super.toString();
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
