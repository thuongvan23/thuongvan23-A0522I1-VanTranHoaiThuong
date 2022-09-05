package BT;

import TH.MyList;

import java.util.Date;
import java.util.Scanner;

public class coachAndStudents {
    private int id;
    private String name;
    private String birthday;
    private String gender;
    private int whatClass;
    private float score;
    private String strength;


    public coachAndStudents() {
        Scanner id = new Scanner(System.in);
        System.out.println("Student's ID: ");
        this.id = id.nextInt();
        Scanner name = new Scanner(System.in);
        System.out.println("Name: ");
        this.name = name.nextLine();
        Scanner birthday = new Scanner(System.in);
        System.out.println("Birthday: ");
        this.birthday = birthday.nextLine();
        Scanner gender = new Scanner(System.in);
        System.out.println("Gender: ");
        this.gender = gender.next();
        Scanner whatClass = new Scanner(System.in);
        System.out.println("Class: ");
        this.whatClass = whatClass.nextInt();
        Scanner score = new Scanner(System.in);
        System.out.println("Score: ");
        this.score = score.nextInt();
    }

//    public coachAndStudents(int id, String name, Date birthday, Boolean gender, String strength) {
//        this.id = id;
//        this.name = name;
//        this.birthday = birthday;
//        this.gender = gender;
//        this.strength = strength;
//    }

    public void chooseFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What you want to do (1-4)? ");
        byte oder = scanner.nextByte();
        manageCodeGym<Object> listPp = new manageCodeGym<Object>();
        switch (oder) {
            case 1:
                coachAndStudents student = new coachAndStudents();
                listPp.add(student);
            case 2:

        }
    }
}
