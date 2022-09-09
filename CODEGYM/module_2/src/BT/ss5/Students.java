package BT.ss5;

import java.util.Scanner;

public class Students {
    private String name = "John";
    private String classes = "C02";
    Students(){};

    public void setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        name = scanner.nextLine();
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
}
