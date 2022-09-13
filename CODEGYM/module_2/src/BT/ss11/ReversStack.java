package BT.ss11;

import java.util.Scanner;
import java.util.Stack;

public class ReversStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> nums = new Stack<>();
        System.out.println("Enter numbers: ");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int a5 = scanner.nextInt();
        nums.push(a1);
        nums.push(a2);
        nums.push(a3);
        nums.push(a4);
        nums.push(a5);
        System.out.println("Reversed: ");
        int a = nums.size();
        for(int i=0; i<a; i++){
            System.out.print(nums.pop()+" ");
        }
        Stack<String> words = new Stack<>();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\nSay any words: ");
        String sentence = scanner1.nextLine();
        for (int i=0; i<sentence.length(); i++){
            words.push(sentence.charAt(i)+"");
        }
        System.out.println("Reversed: ");
        for (int i=0; i<sentence.length();i++){
            System.out.print(words.pop());
        }
    }
}
