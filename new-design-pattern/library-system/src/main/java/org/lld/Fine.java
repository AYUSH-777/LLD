package org.lld;

public class Fine {
    private String fineId;
    private String memberId;
    private Integer paymentAmt;
    private String borrowedId;

    public Fine(String fineId, String memberId, Integer paymentAmt, String borrowedId) {
        this.fineId = fineId;
        this.memberId = memberId;
        this.paymentAmt = paymentAmt;
        this.borrowedId = borrowedId;
    }

    public String getFineId() {
        return fineId;
    }

    public void setFineId(String fineId) {
        this.fineId = fineId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Integer getPaymentAmt() {
        return paymentAmt;
    }

    public void setPaymentAmt(Integer paymentAmt) {
        this.paymentAmt = paymentAmt;
    }

    public String getBorrowedId() {
        return borrowedId;
    }

    public void setBorrowedId(String borrowedId) {
        this.borrowedId = borrowedId;
    }
}
