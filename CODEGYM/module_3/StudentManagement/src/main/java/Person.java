public class Person {
//    Phần thuộc tiính(tính chât)
    private String tenbien;
    private String id = "ádd";
    public String name;

//    Phần phương thức(Hoạt động của class(đặc điểm chung của các đối tượng))

//Phương thức khởi tạo đặt biệt, không tham số có sẵn
    public Person() {
    }
//   Hàm khởi tạo
     public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Person teacher = new Person();
}
