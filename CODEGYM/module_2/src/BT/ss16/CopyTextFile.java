package BT.ss16;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTextFile {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("SourceFile.txt");
            outputStream = new FileOutputStream("TargetFile.txt");

            int c;
            while ((c = inputStream.read()) != -1){
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null){
                outputStream.close();
            }
        }
    }
}
