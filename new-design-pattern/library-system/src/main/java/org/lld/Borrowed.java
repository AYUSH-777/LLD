package org.lld;

import java.util.Date;

public class Borrowed {
    private String borrowId;
    private String copyId;
    private String memberId;
    private Date borrowedDate;
    private Date returnDate;

    public Borrowed(String borrowId, String copyId, String memberId, Date borrowedDate, Date returnDate) {
        this.borrowId = borrowId;
        this.copyId = copyId;
        this.memberId = memberId;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
    }

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public String getCopyId() {
        return copyId;
    }

    public void setCopyId(String copyId) {
        this.copyId = copyId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
