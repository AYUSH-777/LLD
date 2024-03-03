package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }

        Person p1 = new Person("Ayush Mishra",25);

//        Person p2 = (Person) p1.clone();

        Person p2 = (Person) p1.clone();

        System.out.println("Person 1 : "+p1.getName()+" "+p1.getAge());
        System.out.println("Person 2 : "+p2.getName()+" "+p2.getAge());
        System.out.println(p1==p2);
    }
}