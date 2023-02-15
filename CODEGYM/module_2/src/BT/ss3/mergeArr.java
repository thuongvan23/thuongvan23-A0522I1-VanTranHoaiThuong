package BT.ss3;

public class mergeArr {
    public static void main(String[] args) {
        int[] Arr1 = {1, 2, 5, 12, 7, 9, 10};
        int[] Arr2 = {12, 4, 23, 5};
        int[] Arr3 = new int[11];
        for (int i=0; i<Arr1.length; i++){
            Arr3[i]=Arr1[i];
        }
        for (int i=Arr1.length; i<Arr3.length; i++){
            Arr3[i]=Arr2[i+Arr2.length-Arr3.length];
        }
        System.out.print("Arr3: ");
        for (int i = 0; i < Arr3.length; i++) {
            System.out.println(Arr3[i] + "\t");
        }
    }
}
