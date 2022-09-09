package BT.ss2;

public class primesLessThan100 {
    public static void main(String[] args) {
        int n=2;
        while (n<=100){
            boolean check=true;
            for (int i=2; i<=n/2;i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
            if(check){
                System.out.println(" "+n);
            }
            n++;
        }
    }
}
