package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        List<Student> list = new ArrayList<>();

        list.add(new Student(1,"Ayush"));
        list.add(new Student(2,"Vidhi"));
        list.add(new Student(3,"Shanu"));
        list.add(new Student(3,"Sourav"));

//        Collections.sort(list,new StudentComparator());

//        for(Student student:list)
//        {
//            System.out.println(student.getRollNo()+" : "+student.getName());
//        }

//        PriorityQueue<Student> pq = new PriorityQueue<>(5,new StudentComparator());
//        pq.add(new Student(1,"Ayush"));
//        pq.add(new Student(2,"Vidhi"));
//        pq.add(new Student(3,"Shanu"));
//        pq.add(new Student(3,"Sourav"));
//
//        while(!pq.isEmpty())
//        {
//            Student student = pq.peek();
//            pq.poll();
//            System.out.println(student.getRollNo()+" : "+student.getName());
//        }


//       Comparator<Student> studentComparator = new Comparator<Student>(){
//           @Override
//           public int compare(Student s1, Student s2)
//           {
//               return Integer.compare(s1.getRollNo(), s2.getRollNo());
//           }
//       };

       PriorityQueue<Student> pq = new PriorityQueue<>(100, new StudentComparator());
//       PriorityQueue<Student> pq = new PriorityQueue<>(5,new StudentComparator());
        pq.add(new Student(1,"Ayush"));
        pq.add(new Student(2,"Vidhi"));
        pq.add(new Student(3,"Shanu"));
        pq.add(new Student(3,"Sourav"));

//        while(!pq.isEmpty())
//        {
//            Student student = pq.peek();
//            pq.poll();
//            System.out.println(student.getRollNo()+" : "+student.getName());
//        }

        list.stream().forEach(student -> System.out.print(student.getRollNo()+" : "+student.getName()+" "));
    }
}