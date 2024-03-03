package org.lld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>(Arrays.asList("Reflection","Collection","Stream"));
//        List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//        System.out.println(result);

         List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
         List<Integer> res = list.stream().filter(l->l>3).collect(Collectors.toList());
         System.out.println(res);
    }
}