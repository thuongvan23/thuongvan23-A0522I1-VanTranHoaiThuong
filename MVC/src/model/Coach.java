package model;

public class Coach extends Person{
    private String Specialize;

    public Coach() {
    }

    public Coach(int code, String name, String dateOfBirth, String gender, String specialize) {
        super(code, name, dateOfBirth, gender);
        this.Specialize = specialize;
    }

    public String getSpecialize() {
        return Specialize;
    }

    public void setSpecialize(String specialize) {
        Specialize = specialize;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "Specialize='" + Specialize + '\'' +
                '}'+super.toString();
    }
}
