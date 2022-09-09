package BT.ss2;

public class first20Primes {
    public static void main(String[] args) {
        int count=1;
        int n=2;
        while (count<=20){
            boolean check=true;
            for (int i=2; i<=n/2;i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
            if(check){
                System.out.println(" "+n);
                count++;
            }
            n++;
        }
    }
}
