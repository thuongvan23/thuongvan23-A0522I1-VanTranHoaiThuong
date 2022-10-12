package test;

import java.io.PrintWriter;

public class ViDuGhiText {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("D:\\thuongvan23-A0522I1-VanTranHoaiThuong\\FuramaResort\\src\\test\\Vidughitext", "UTF-8");
            pw.println("Hello");
            pw.print("Dữ liệu: ");
            pw.print(3.14);
            pw.print(' ');
            pw.print(" là số PI");
            pw.println();
            Student st = new Student(100, "Nguyen Van A");
            pw.println(st);
            pw.println();
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
