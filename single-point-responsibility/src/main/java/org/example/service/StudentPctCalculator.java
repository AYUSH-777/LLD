package org.example.service;

import org.example.model.Student;

import java.util.logging.Logger;

public class StudentPctCalculator {
    public static final Logger LOGGER = Logger.getLogger(StudentPctCalculator.class.getName());
    public void displayPct(Student student){
        double pct = student.getMarks()/500;
        pct = pct * 100;
        LOGGER.info("Student name : "+student.getName()+" with roll number : "+student.getRollNumber()+" has secured : "+pct);
    }
}
