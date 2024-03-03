package org.lld;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
//        Path directoryPath = Paths.get("C:\\Users\\ayush\\OneDrive\\Documents");
//
//        // Get the size of the directory in bytes
//        long directorySize = Files.size(directoryPath);
//
//        // Print the size of the directory
//        System.out.println("The size of the directory is " + directorySize + " bytes");

        File folder = new File("C:\\Users\\ayush\\\\OneDrive\\Documents");
        File[] files = folder.listFiles();

        int count = files.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int size ;
            if (files[i].isFile()) {
//                length += files[i].length();
                size = files.length;
            }
            else {
//                length += getFolderSize(files[i]);
                 size = (int) Files.walk(folder.toPath())
                        .filter(p -> p.toFile().isFile())
                        .mapToLong(p -> p.toFile().length())
                        .sum();            }
            list.add(size);
        }
        System.out.println(list);
//        return length;

    }
}