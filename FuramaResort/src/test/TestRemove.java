package test;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestRemove {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "C"));
        studentList.add(new Student(5, "A"));
        studentList.add(new Student(4, "D"));
        studentList.add(new Student(2, "B"));
        studentList.add(new Student(3, "E"));
        Student student00 = new Student(2, "D");

        System.out.println(studentList);

        studentList.remove(student00);

//        for (Student student : studentList) {
//            if (student.getName().contains("A")) {
//                studentList.remove(student);
//                break;
//            }
//        }
        System.out.println("------------------");
        System.out.println(studentList);
    }
}

