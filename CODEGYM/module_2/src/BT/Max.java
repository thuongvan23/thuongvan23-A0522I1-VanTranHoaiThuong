package BT;

public class Max {
    public static void main(String[] args) {
        int[] Arr = {1, 4, 43, 21, 12};
        int max = Arr[0];
        for (int i=0; i<Arr.length; i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println("");
        for (int i=1; i<Arr.length; i++){
            if (Arr[i]>max){
                max = Arr[i];
            }
        }
        System.out.println("Max is: "+max);
    }
}
