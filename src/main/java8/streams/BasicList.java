package main.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class BasicList {
    public static void main(String[] args) {
        /** Created immutable list */
        List<Integer> numbers = List.of(22, 23, 55, 98, 65, 78, 20, 99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 21);

        /** Even number list */
        List<Integer> evenList = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenList);

        /** Number greater than 20 */
        List<Integer> maxNumber = numbers.stream()
                .filter(i -> i > 20)
                .collect(Collectors.toList());

        System.out.println(maxNumber);

        /** Different way of print */
        numbers.stream()
                .filter(i -> i > 20)
                .forEach(System.out::print);

        numbers.stream()
                .filter(i -> i > 20)
                .forEach(p -> System.out.print(p));

        numbers.stream()
                .forEach(p -> System.out.print(p));


    }
}
