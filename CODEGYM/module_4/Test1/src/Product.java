import java.util.Comparator;
import java.util.Date;

public class Product {
//    Thuộc tính của class Product
    private String id;
    private String name;
    private String exp;
    private int inputQuantity;
    private int sellQuantity;
//Phương thức của Product

//    Phương thức khởi tạo không tham số
    public Product() {
    }
//Phương thức khời tạo đầy đủ tham số
    public Product(String id, String name, String exp, int inputQuantity, int sellQuantity) {
        this.id = id;
        this.name = name;
        this.exp = exp;
        this.inputQuantity = inputQuantity;
        this.sellQuantity = sellQuantity;
    }

//    Getter, Setter

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

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public int getInputQuantity() {
        return inputQuantity;
    }

    public void setInputQuantity(int inputQuantity) {
        this.inputQuantity = inputQuantity;
    }

    public int getSellQuantity() {
        return sellQuantity;
    }

    public void setSellQuantity(int sellQuantity) {
        this.sellQuantity = sellQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", exp=" + exp +
                '}';
    }
}
