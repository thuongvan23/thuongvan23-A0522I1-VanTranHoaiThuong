package com.example.case_study_module4.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @Size(max = 100)
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Tên không được chứa kí tự đặc biệt")
    @Column(name = "customer_name")
    private String customerName;
//    @NotNull
//    @Past(message = "Ngày sinh phải trước")
//    @Max(value = 1148323199L, message = "Ngày sinh phải trước {value}")
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "gender")
    private int gender;
    @Pattern(regexp = "^\\d{12}$", message = "ID card phải có đúng 10 chữ số")
    @Column(name = "id_card")
    private String idCard;
    @Pattern(regexp = "^(\\+84|0)\\d{9,10}$", message = "Số điện thoại không hợp lệ")
    @Column(name = "phone_number")
    private String phoneNumber;
    @NotNull
    @Email(message = "Invalid email address")
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private CustomerType customerType;

    public Customer() {
    }

    public Customer(String customerName, LocalDate birthday, int gender, String idCard, String phoneNumber, String email, String address, CustomerType customerType) {
        this.customerName = customerName;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
