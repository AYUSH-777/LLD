package org.example;

public class Payment {
    private String paymentId;
    private String bookingId;
    private int amountPayed;

    public Payment(String paymentId, String bookingId, int amount) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amountPayed = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getAmountPayed() {
        return amountPayed;
    }

    public void setAmountPayed(int amountPayed) {
        this.amountPayed = amountPayed;
    }
}
