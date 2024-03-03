package org.lld;

public class Copy {
    private String copyId;
    private String bookId;
    private Boolean isAvailable;

    public Copy(String copyId, String bookId, Boolean isAvailable) {
        this.copyId = copyId;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
    }

    public String getCopyId() {
        return copyId;
    }

    public void setCopyId(String copyId) {
        this.copyId = copyId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
