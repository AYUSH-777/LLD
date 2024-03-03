package org.example;

public class UniqueKey {
    private String classId;
    private String rollNum;

    public UniqueKey(String classId, String rollNum) {
        this.classId = classId;
        this.rollNum = rollNum;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }
}
