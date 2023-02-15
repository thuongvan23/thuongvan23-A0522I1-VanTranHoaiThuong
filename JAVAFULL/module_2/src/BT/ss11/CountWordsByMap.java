package BT.ss11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWordsByMap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter paragraph: ");
        String para= sc.nextLine();
        String[] array= para.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();
        for(String word: array){
            if(map.containsKey(word)){
                int count = map.get(word);
                count++;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}
