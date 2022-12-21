package com.example.Model;

public class HomeAddress {
    private String detailAddress;
    private String phoneNumber;
    private String email;

    public HomeAddress() {
    }

    public HomeAddress(String detailAddress, String phoneNumber, String email) {
        this.detailAddress = detailAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
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
}
