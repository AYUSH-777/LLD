package org.example;

import netscape.javascript.JSObject;

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StudentRecord {
    public static void main(String[] args) {
          UniqueKey uniqueKey1 = new UniqueKey("1","20");
          UniqueKey uniqueKey2 = new UniqueKey("2","20");
          StudentEntity student1 = new StudentEntity("1","Ayush","20");
          StudentEntity student2 = new StudentEntity("2","Vidhi","20");

//          Map<UniqueKey,StudentEntity> map = new HashMap<>();
//          map.put(uniqueKey1,student1);
//          map.put(uniqueKey2,student2);
//
//        System.out.println(map);
    }
}