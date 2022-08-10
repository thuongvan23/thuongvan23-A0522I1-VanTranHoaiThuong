package BT;

public class first20Primes {
    public static void main(String[] args) {
        boolean flag =true;
        for (int count=1; count<=20; count++){
            for (int num=2; num>0; num++){
                for (int divide=1; divide<num; divide++){
                    if (num%divide==0){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    System.out.println(num);
                }
            }
        }
    }
}
