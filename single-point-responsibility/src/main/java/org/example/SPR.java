package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.model.Student;
import org.example.service.StudentDetailsPrinter;
import org.example.service.StudentPctCalculator;

import java.util.logging.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@Slf4j
public class SPR {
    public static final Logger LOGGER = Logger.getLogger(SPR.class.getName());
    public static void main(String[] args) {
        Student student = new Student("Ayush Mishra","2017UEC2002",450.0);

        StudentDetailsPrinter studentDetailsPrinter = new StudentDetailsPrinter();
        studentDetailsPrinter.printDetails(student);
        LOGGER.info("\n");
        StudentPctCalculator studentPctCalculator = new StudentPctCalculator();
        studentPctCalculator.displayPct(student);

    }
}