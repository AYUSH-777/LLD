package org.example;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getRollNo()==s2.getRollNo())
        {
            return s2.getName().compareTo(s1.getName());
        }
        else
        {
            return Integer.compare(s1.getRollNo(), s2.getRollNo());
        }
    }
}
