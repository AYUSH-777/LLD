package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Generic {
    public static void main(String[] args) {
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
//
//        Integer val = 5;
//        Print<Integer> obj = new Print<>(val);
//        obj.print();

//        String strVal = "Ayush Mishra";
//        Print<String> obj = new Print<>(strVal);
//        System.out.println(obj.getValue());

        GenericPair<String,Integer> genPair = new GenericPair<>("Ayush Mishra",26);

        genPair.print();

    }
}