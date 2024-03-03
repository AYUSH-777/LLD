package org.lld;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class LMS {
    public static void main(String[] args) {
        Library library = new Library();

        library.addCopy(new Copy("1","100",true));
        library.addCopy(new Copy("2","100",true));

        library.addBook(new Book("100","My Experiments with Truth"));

        String borrowId = library.borrowBook("My Experiments with Truth","20");

        String fineId = library.isFine(borrowId,"20");

        System.out.println(borrowId+" : "+fineId);

    }
}