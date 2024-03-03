package org.example.service;

import org.example.model.Student;

import java.util.logging.Logger;

public class StudentDetailsPrinter {
    public static final Logger LOGGER = Logger.getLogger(StudentDetailsPrinter.class.getName());;

    public void printDetails(Student student)
    {
        LOGGER.info("Student with name : "+student.getName()+" has a roll number : "+student.getRollNumber());
    }
}
