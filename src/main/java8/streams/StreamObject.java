package main.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        /** Different way of creating streams*/

        /** 1 - blank */
        Stream<Objects> emptyStream = Stream.empty();

        /** 2 - Array, Object, Collection using Stream.of  */
        String names[] = {"Amol", "Amit", "Rohit", "Shyam", "Ram"};

        Stream<String> namesSteam = Stream.of(names);
        namesSteam.forEach(e -> System.out.println(e));

        /** 3 -Builder pattern  */
        Stream<Object> builderStream = Stream.builder()
                //.add(Object o)
                .build();

        /** 4 -Arrays Stream for int, */
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7});
        intStream.forEach(System.out::print);

        /** 5 - Calling on object.. List, Set, Collection */
        List<Integer> list = List.of(12, 14, 18, 16, 22, 20);
        list.stream().forEach(p -> System.out.println(p));


    }
}
