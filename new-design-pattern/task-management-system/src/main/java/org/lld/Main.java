package org.lld;

import java.util.List;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         Random random = new Random();
         User u1 = new User("1","Ayush");
         User u2 = new User("2","Vidhi");
         Task t1 = new Task(String.valueOf(random.nextInt(100)),"Autonomous",u1);
         Task t2 = new Task(String.valueOf(random.nextInt(100)),"Speech Processing",u1);
         TaskManager tm = new TaskManager();
         tm.addTask(t1);
         tm.addTask(t2);

         List<Task> userTask = tm.getTasksOfUser(u1);

         for(int i=0;i<userTask.size();i++)
         {
             System.out.println(userTask.get(i).getTaskName());
         }
    }
}