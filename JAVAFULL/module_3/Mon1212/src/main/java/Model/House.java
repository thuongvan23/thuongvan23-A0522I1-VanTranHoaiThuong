package Model;

import java.util.Date;

public class House {
    private int id;
    private String userName;
    private int phoneNumber;
    private Date dateStart;

    private String note;
    private Payment payment;

    public House() {
    }

    public House(String userName, int phoneNumber, Date dateStart, String note, Payment payment) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.dateStart = dateStart;
        this.note = note;
        this.payment = payment;
    }

    public House(int id, String userName, int phoneNumber, Date dateStart, String note, Payment payment) {
        this.id = id;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.dateStart = dateStart;
        this.note = note;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
