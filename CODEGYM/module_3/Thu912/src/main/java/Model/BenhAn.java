package Model;

public class BenhAn {
    private String ma_benh_an;
    private String ten_benh_an;

    public BenhAn() {
    }

    public BenhAn(String ma_benh_an, String ten_benh_an) {
        this.ma_benh_an = ma_benh_an;
        this.ten_benh_an = ten_benh_an;
    }

    public String getMa_benh_an() {
        return ma_benh_an;
    }

    public void setMa_benh_an(String ma_benh_an) {
        this.ma_benh_an = ma_benh_an;
    }

    public String getTen_benh_an() {
        return ten_benh_an;
    }

    public void setTen_benh_an(String ten_benh_an) {
        this.ten_benh_an = ten_benh_an;
    }
}
