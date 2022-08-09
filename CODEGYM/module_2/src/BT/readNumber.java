package BT;

import java.util.Scanner;

import java.util.Arrays;

public class readNumber {
    public static void main(String[] args) {
        while (1>0){
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.print("nhập số cần đọc (0-999): ");
            input = sc.nextInt();
        int hundredsOf = input/100;
        int donzensOf = (input/10)%10;
        int units = input%10;
        switch (hundredsOf) {
            case 1:{
                System.out.print("one hundred ");
                break;
            }
            case 2:{
                System.out.print("two hundred ");
                break;
            }

            case 3:{
                System.out.print("three hundred ");
                break;
            }

            case 4:{
                System.out.print("four hundred ");
                break;
            }

            case 5:{
                System.out.print("five hundred ");
                break;
            }
            case 6:{
                System.out.println("six hundred ");
                break;
            }
            case 7:{
                System.out.println("seven hundred ");
                break;
            }
            case 8:{
                System.out.println("eight hundred ");
                break;
            }
            case 9:{
                System.out.println("nine hundred ");
                break;
            }
            default:
                System.out.println(" ");
        }
        switch (donzensOf){
                case 1:{
                    switch (units){
                        case 0:
                            System.out.print("ten");
                            break;
                        case 1:
                            System.out.print("eleven");
                            break;
                        case 2:
                            System.out.print("twelve");
                            break;
                        case 3:
                            System.out.print("thirteen");
                            break;
                        case 4:
                            System.out.print("fourteen");
                            break;
                        case 5:
                            System.out.print("fifteen");
                            break;
                        case 6:
                            System.out.print("sixteen");
                            break;
                        case 7:
                            System.out.print("seventeen");
                            break;
                        case 8:
                            System.out.print("eighteen");
                            break;
                        case 9:
                            System.out.print("nineteen");
                            break;
                    }
                    break;
                }
                case 2:{

                    System.out.print("and twenty ");
                    break;
                }
                case 3:{
                    System.out.print("and thirty ");
                    break;
                }
                case 4:{
                    System.out.print("and forty ");
                    break;
                }
                case 5:{
                    System.out.print("and fifty ");
                    break;
                }
                case 6:{
                    System.out.println("and sixty ");
                    break;
                }
                case 7:{
                    System.out.println("and seventy ");
                    break;
                }
                case 8:{
                    System.out.println("and eighty ");
                    break;
                }
                case 9:{
                    System.out.println("and ninety ");
                    break;
                }
                default:
                    System.out.println(" ");
            }
            switch (units){
                case 1:{
                    if(donzensOf==1){
                        System.out.println("");
                        break;
                    }else{
                        System.out.println("one");
                        break;
                    }
                }
                case 2:{
                    if(donzensOf==1){
                        System.out.println("");
                        break;
                    }else {
                        System.out.println("two");
                        break;
                    }
                }
                case 3:{
                    if(donzensOf==1){
                        System.out.println("");
                        break;
                    }else {
                        System.out.println("three");
                        break;
                    }
                }
                case 4:{
                    if(donzensOf==1){
                        System.out.println("");
                        break;
                    }else {
                        System.out.println("four");
                        break;
                    }
                }
                case 5:{
                    if(donzensOf==1){
                        System.out.println("");
                        break;
                    }else {
                        System.out.println("five");
                        break;
                    }
                }
                case 6:{
                    if(donzensOf==1){
                        System.out.println("");
                        break;
                    }else {
                        System.out.println("six");
                        break;
                    }
                }
                case 7:{
                    if(donzensOf==1){
                        System.out.println("");
                        break;
                    }else {
                        System.out.println("seven");
                        break;
                    }
                }
                case 8:{
                    if(donzensOf==1){
                        System.out.println("");
                        break;
                    }else {
                        System.out.println("eight");
                        break;
                    }
                }
                case 9:{
                    if(donzensOf==1){
                        System.out.println("");
                        break;
                    }else {
                        System.out.println("nine");
                        break;
                    }
                }
                default:
                    System.out.println(" ");
            }
        }
    }
}