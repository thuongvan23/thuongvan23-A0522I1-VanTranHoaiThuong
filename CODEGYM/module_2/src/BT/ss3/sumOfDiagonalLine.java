package BT.ss3;

public class sumOfDiagonalLine {
    public static void main(String[] args) {
        int[][] array= {
                {1,2,3,4},
                {32,54,12,76},
                {123,456,761,145},
                {111,222,333,444}
        };
        System.out.println("Ma trận vuông: ");
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j]+", ");
            }
            System.out.print("\n");
        }
        int total=0;
        for (int i=0;i<array.length;i++) {
            total=total+array[i][i];
        }
        int a=array.length-1;
        for (int j =0;j<array.length;j++) {
            total=total+array[j][a-j];
        }
        System.out.println("Tổng đường chéo của ma trận là: "+total);
    }
}
