package Model;

import java.util.Date;

public class Employee {
    private String employeeId;
    private String employeeAddress;
    private String employeeName;
    private Date employeeBirthday;
    private int employeeIdCard;
    private int employeePhone;
    private String employeeEmail;
    private Position positionId;
    private EducationDegree educationDegreeId;
    private double employeeSalary;
    private Division divisionId;

    public Employee() {
    }

    public Employee(String employeeId, String employeeAddress, String employeeName, Date employeeBirthday, int employeeIdCard, int employeePhone, String employeeEmail, Position positionId, EducationDegree educationDegreeId, double employeeSalary, Division employeeDivision) {
        this.employeeId = employeeId;
        this.employeeAddress = employeeAddress;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.positionId = positionId;
        this.educationDegreeId = educationDegreeId;
        this.employeeSalary = employeeSalary;
        this.divisionId = employeeDivision;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(Date employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public int getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(int employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public int getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(int employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public EducationDegree getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(EducationDegree educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Division getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Division divisionId) {
        this.divisionId = divisionId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }
}
