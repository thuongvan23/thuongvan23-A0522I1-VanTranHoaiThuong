package Model;

import java.util.Date;

public class Student {
    private String id;
    private String name;
    private int age;
    private Date birthday;
    private int gender;
    private StudentType studentType;

    public Student() {
    }

    public Student(String id, String name, int age, Date birthday, int gender, StudentType studentType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
        this.studentType = studentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public StudentType getStudentType() {
        return studentType;
    }
    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }
}
