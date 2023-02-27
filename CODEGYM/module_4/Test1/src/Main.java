import java.util.Scanner;

public class Main {
    Person teacher = new Person();
    static Person student = new Person("a", "a");
    private static final Product product1 = new Product("1","a","2020-12-12", 3, 5);

    public static void main(String[] args) {
//        student.setId("Id2");
        int bienstatic = Person.bienstatic;
//        String id1 = student.getId();
//        String name = student.name;
//        System.out.print(student.name+"/"+student.getId());
//        int trave = print("asd");
        System.out.print(product1);
//        f();
        //        System.out.print(f());
    }
//f(x)=x^2 tính f(x) lúc x=2
    public static void f(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = scanner.nextInt();
//        Integer y =
//        Boolean bloo = scanner.
//        int ketqua= x*x;
//        System.out.print(ketqua);
    }
    public static int print(String chuoi){
        System.out.print(chuoi);
        System.out.print("a");
        System.out.print("b");
        System.out.print("c");
        return 1;
    }
}
