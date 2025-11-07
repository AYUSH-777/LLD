package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static class Person{
        String name;
        int age;

        public Person(String n, int a)
        {
            this.name = n;
            this.age = a;
        }
    }

    public static class Transaction{
        String date;
        int value;

        public Transaction(String d, int v)
        {
            this.date = d;
            this.value = v;
        }

        public String getDate()
        {
            return date;
        }

        public int getValue()
        {
            return value;
        }
    }

    public static void main(String[] args) {
        // List < Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        // System.out.println("List of numbers: " + nums);

        // double avg = nums.stream()
        //              .mapToDouble(Integer::doubleValue)
        //              .average()
        //              .orElse(0.0);

        // double avg = nums.stream()
        //              .mapToDouble(Integer::doubleValue)
        //              .average()
        //              .orElse(0.0);


        // System.out.println("Avg : "+ avg);

        // List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

        // List<String> ans = colors.stream()
        //                   .map(String::toUpperCase)
        //                   .collect(Collectors.toList());

        // List<String> ans = colors.stream()
        //                   .map(String::toUpperCase)
        //                   .collect(Collectors.toList());


        // System.out.println("Ans : "+ans);

        // List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // int even = numbers.stream()
        //           .filter(n -> n%2==0)
        //           .mapToInt(Integer::intValue)
        //           .sum();

        // int even = numbers.stream()
        //           .filter(n -> n%2==0)
        //           .mapToInt(Integer::intValue)
        //           .sum();

        // System.out.println(even);


        // List < Integer > nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);


        // List<Integer> ans = nums.stream()
        //                     .distinct()
        //                     .collect(Collectors.toList());


        // System.out.println(ans);

        // List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        // System.out.println("Original list of strings (colors): " + colors);
        // char startingLetter = 'B';

        // int cnt = colors.stream()
        //           .filter(s->s.startsWith(String.valueOf(startingLetter)))
        //           .count();
        // long cnt = colors.stream()
        //           .filter(s->s.startsWith(String.valueOf(startingLetter)))
        //           .count();

        // System.out.println(cnt);

        //  List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        // System.out.println("Original List of strings(colors): " + colors);

        // List<String> ans = colors.stream()
        //                   .sorted(Comparator.reverseOrder())
        //                   .collect(Collectors.toList());

        // List<String> ans = colors.stream()
        //                   .sorted(Comparator.reverseOrder())
        //                   .collect(Collectors.toList());

        // System.out.println(ans);

        //     List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        // System.out.println("Original list of numbers: " + nums);
        // Integer max_val = nums.stream()
        //   .max(Integer::compare)
        //   .orElse(null);

        // Integer max_val = nums.stream()
        //                   .mapToInt(Integer::intValue)
        //                   .max()
        //                   .orElse(0);

        //   System.out.println(max_val);

        //  List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        // System.out.println("List of numbers: " + nums);

        // Integer sec_max = nums.stream()
        //                   .distinct()
        //                   .sorted(Comparator.reverseOrder())
        //                   .skip(1)
        //                   .findFirst()
        //                   .orElse(-1);

        // System.out.println(sec_max);


        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // List<Integer> ans = numbers.stream()
        //                     .map(n -> n*n)
        //                     .collect(Collectors.toList());

        // System.out.println(ans);

        // List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

        // int max_val = names.stream()
        //               .mapToInt(s -> s.length())
        //               .max()
        //               .orElse(0);

        // System.out.println(max_val);

        // String s = "Java";

        //   s.chars()
        //   .mapToObj(c -> (char) c)
        //   .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        //   .entrySet().stream()
        //   .filter(ele -> ele.getValue()==1)
        //   .forEach(ele -> System.out.println(ele.getKey()));

        // s.chars()
        // .mapToObj(c -> (char)c)
        // .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        // .entrySet().stream()
        // .filter(e -> e.getValue()==1)
        // .forEach(e -> System.out.println(e.getKey()));


        // List<String> sentences = Arrays.asList(
        //         "Java Stream API provides a fluent interface for processing sequences of elements.",
        //         "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
        //         "In this exercise, you need to count the total number of words in all sentences."
        // );

        // long count = sentences.stream()
        //         .flatMap(e -> Arrays.stream(e.split(" ")))
        //         .distinct()
        //         .count();

        // long count = sentences.stream()
        //              .flatMap(e -> Arrays.stream(e.split(" ")))
        //              .distinct()
        //              .count();

        // System.out.println(count);

        //       List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        //     String res = words.stream()
        //                  .filter(w -> w.length()%2 == 0)
        //                  .limit(2)
        //                  .collect(Collectors.joining());


        //   System.out.println(res);

        //   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //   Integer sum = numbers.stream()
        //              .filter(n -> n%2 == 0)
        //              .mapToInt(n -> (int)n*n)
        //              .sum();


        //   System.out.println(sum);

        // ----


        // List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");

        // int maxLen = strings.stream()
        //              .mapToInt(s -> (int)s.length())
        //              .max()
        //              .orElse(0);
        // System.out.println(maxLen);

        // String str = strings.stream()
        //              .max(Comparator.comparingInt(s -> s.length()))
        //              .orElse("");

        // System.out.println(str);

        // String str = strings.stream()
        //              .filter(s -> s.length()==maxLen)
        //              .findFirst()
        //              .orElse("");

        // System.out.println(str);

        // Person p1 = new Person("Alice", 25);

//     List<Person> persons = Arrays.asList(
//     new Person("Alice", 25),
//     new Person("Bob", 30),
//     new Person("Charlie", 35)
// );

//     double avg = persons.stream()
//               .mapToDouble(p -> (double) p.age)
//               .average()
//               .orElse(0.0);

//      System.out.println(avg);

        // List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        // List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        // List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
        //                             .sorted()
        //                             .collect(Collectors.toList());

        // System.out.println(mergedList)   ;

//     List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
// List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

//   List<Integer> ans = list1.stream()
//                       .filter(n -> list2.contains(n))
//                       .collect(Collectors.toList());

//     System.out.println(ans);

///. -----

        // List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);

        // List<Integer> uniqueNumbers = numbersWithDuplicates.stream()
        //                               .distinct()
        //                               .collect(Collectors.toList());


        // System.out.println(uniqueNumbers);


//        List<Transaction> transactions = Arrays.asList(
//                new Transaction("2022-01-01", 100),
//                new Transaction("2022-01-01", 200),
//                new Transaction("2022-01-02", 300),
//                new Transaction("2022-01-02", 400),
//                new Transaction("2022-01-03", 500)
//        );
//
//
//         Map<String,Integer> ans = transactions.stream()
//                                   .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingInt(Transaction::getValue)));
//
//        System.out.println(ans);


        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String, Long> wordFrequency = words
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordFrequency);
    }
}
