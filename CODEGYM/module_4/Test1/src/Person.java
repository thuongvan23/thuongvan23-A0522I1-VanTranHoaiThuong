public class Person {
//    Phần thuộc tiính(tính chât)
// bienstatic do class Person quản lí, không cần tạo đối tượng
    public static int bienstatic;
    private String id = "123";
    public String name = "as";

//    Phần phương thức(Hoạt động của class(đặc điểm chung của các đối tượng))

//Phương thức khởi tạo đặt biệt, không tham số có sẵn
    public Person() {
    }
//   Hàm khởi tạo
     public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
//    phương thức

//Getter, Setter cũng nằm trong phần phương thức của class


    public String getId() {
        return id;
    }

    public void setId(String id1) {
        this.id = id1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
