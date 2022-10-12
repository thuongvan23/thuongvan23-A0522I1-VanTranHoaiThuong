package BT.ss15;

public class TestMyException {
    public static void main(String[] args) {
        try {
            dive2Numbers(3, 0);
        } catch (MyException e) {
            System.out.println(e.getError());
        }
    }

    public static void dive2Numbers(int a, int b) throws MyException {
        try {
            int result = a / b;
            System.out.println(result);
        } catch (Exception e) {
            throw new MyException("Loi chia cho 0");
//            System.out.println("Loi chia ch o0");
        }
    }
}
