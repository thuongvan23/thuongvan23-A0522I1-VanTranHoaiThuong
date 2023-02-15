package BT.ss16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTextFile {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        int count = 0;

        try {
            inputStream = new FileInputStream("SourceFile.txt");
            outputStream = new FileOutputStream("TargetFile.txt");

            int c;
            while ((c = inputStream.read()) != -1){
                outputStream.write(c);
                count++;
            }
        } finally {
//            if (inputStream != null) {
                inputStream.close();
//            }
//            if (outputStream != null){
                outputStream.close();
//            }
        }
        System.out.println("Letters: "+count);
    }
}
