package Models;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String name;
    private String birthday;
    private String gender;
    private String IdentifyId;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String birthday, String gender, String identifyId, String phoneNumber, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        IdentifyId = identifyId;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentifyId() {
        return IdentifyId;
    }

    public void setIdentifyId(String identifyId) {
        IdentifyId = identifyId;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", IdentifyId='" + IdentifyId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
