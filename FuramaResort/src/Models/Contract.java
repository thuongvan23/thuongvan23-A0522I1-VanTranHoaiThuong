package Models;

public class Contract {
    private int contractId;
    private int bookingId;
    private int paidMoney;
    private int haveToPay;
    private int customerId;

    public Contract() {
    }

    public Contract(int contractId, int bookingId, int paidMoney, int haveToPay, int customerId) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.paidMoney = paidMoney;
        this.haveToPay = haveToPay;
        this.customerId = customerId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getPaidMoney() {
        return paidMoney;
    }

    public void setPaidMoney(int paidMoney) {
        this.paidMoney = paidMoney;
    }

    public int getHaveToPay() {
        return haveToPay;
    }

    public void setHaveToPay(int haveToPay) {
        this.haveToPay = haveToPay;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId=" + contractId +
                ", bookingId=" + bookingId +
                ", paidMoney=" + paidMoney +
                ", haveToPay=" + haveToPay +
                ", customerId=" + customerId +
                '}';
    }
}
