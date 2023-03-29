package main.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class BasicMethods {
    public static void main(String[] args) {

        /** filter (Predicate)  : works on "boolean value function"
         * Lambda ( e -> e > 10)
         * OR, some function cab be predicate
         * */

        List<String> names = List.of("Aman", "Ankit", "Abhinav", "Dugesh", "Amol", "Yamuna", "Barun", "Mahipal", "Bhima", "Dolly");
        names.stream().filter(e -> e.startsWith("B")).forEach(System.out::println);


        /** map (Function) : each element operation
         * Returns some value to work on
         * E.g. retrun square of number
         * */

        List<Integer> numbers = List.of(11, 22, 33, 3, 2, 4, 5, 6, 9, 10);
        List<Integer> squareNum = numbers.stream().map(num -> num * num).collect(Collectors.toList());
        squareNum.stream().forEach(p -> System.out.println(p));

        List<Integer> numbers2 = List.of(4, 9, 16, 25, 36);
        List<Integer> sqrtNums = numbers2.stream().map(num -> (int) Math.sqrt(num)).collect(Collectors.toList());
        sqrtNums.forEach(System.out::println);


        /** Sorted method*/
        numbers.stream().sorted().forEach(System.out::println);

        /** Min method*/
        Integer minNum = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min num : " + minNum);

        /** Max method*/
        Integer maxNum = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Max num : " + maxNum);
    }
}
