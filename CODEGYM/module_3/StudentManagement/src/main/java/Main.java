public class Main {
    Person teacher = new Person();
    static Person student = new Person("Id1", "A");

    public static void main(String[] args) {
        System.out.print(student.getId()+"/"+student.name);
    }
}
