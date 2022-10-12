

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class test {

    public static void main(String[] args) {

        File f = new File("student.dat");
        FileOutputStream fo;
        ObjectOutputStream oStream = null;

        // ghi file lan 1
        try {
            fo = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fo);

            oStream.writeObject(new MyStudent("pham ha", 22));
            oStream.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ghi file lan 2
        try {
            fo = new FileOutputStream(f, true);
            oStream = new ObjectOutputStream(fo) {
                protected void writeStreamHeader() throws IOException {
                    reset();
                }
            };
            oStream.writeObject(new MyStudent("nguyenvanquan7826", 22));
            oStream.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // doc file
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream inStream = new ObjectInputStream(fis);

            System.out.println(inStream.readObject());
            System.out.println(inStream.readObject());

            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error Read file");
            e.printStackTrace();
        }
    }
}

class MyStudent implements Serializable {
    String name;
    int age;

    public MyStudent(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "MyStudent [name=" + name + ", age=" + age + "]";
    }
}
