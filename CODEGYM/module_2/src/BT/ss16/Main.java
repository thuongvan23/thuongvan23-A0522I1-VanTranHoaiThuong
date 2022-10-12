package BT.ss16;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String file = "src\\BT\\ss16\\Book1.csv";
        BufferedReader reader = null;
        String line;
        try{
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null){
                String[] row = line.split(",");
                for (String word: row){
                    System.out.printf("%-10s", word);
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();

        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
