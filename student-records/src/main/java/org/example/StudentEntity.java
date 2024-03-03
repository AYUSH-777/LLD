package org.example;

public class StudentEntity {
    private String classId;
    private String studentName;
    private String rollNum;

    public StudentEntity(String classId, String studentName, String rollNum) {
        this.classId = classId;
        this.studentName = studentName;
        this.rollNum = rollNum;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }
}
