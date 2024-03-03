package org.lld;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Generics {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(42);
        System.out.println(intBox.getContent());

        Box<String> strBox = new Box<>("Generics!");
        System.out.println(strBox.getContent());
    }
}