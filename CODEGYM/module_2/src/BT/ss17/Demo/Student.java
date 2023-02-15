package BT.ss17.Demo;

import java.io.Serializable;

public class Student implements Serializable {
    public static final long serialVersionUID = 2L;

    private int id;
    private int age;

    public Student(){
    }

    public Student(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
