package mar5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        HelloPrinter helloPrinter = new HelloPrinter();
//        helloPrinter.print();
//
//        Printer printer = new Printer() {
//            @Override
//            public void print() {
//                System.out.println("Hello World");
//            }
//        };
//
//        Printer printer2 = () -> System.out.println("Hello World"); // lambda expression
//        printer2.print();
//        printer.print();
//
//        // (Type parameterName1, Type parameterName2) -> { statements; }
//        // parameterName -> statement
//        // (Type parameterName) -> { statements }
//
//        Calculator calculator = (a, b) -> a + b;
//        System.out.println(calculator.add(2,3));
//
//        Predicate<Integer> isEven = i -> i % 2 == 0; // always returns boolean expression
//        System.out.println(isEven.test(2));
//
//        BiPredicate<Integer, Integer> isLess = (i, j) -> i < j;
//        System.out.println(isLess.test(2, 3));
//
//        Function<String, Integer> length = s -> {
//            System.out.println("Calculating length of a string");
//            return s.length();
//        };
//        System.out.println(length.apply("123"));
//
//        BiFunction<String, String, Integer> maxLength = (s1, s2) -> Math.max(s1.length(), s2.length());
//        System.out.println(maxLength.apply("123", "4563"));
//
//        Consumer<String> print = s -> System.out.println(s);
//        print.accept("Hello World");
//
//        BiConsumer<String, String> concat = (s1, s2) -> System.out.println(s1.concat(s2));
//        concat.accept("Hello", "World");
//
//        Supplier<Double> randomizer = () -> Math.random();
//        System.out.println(randomizer.get());
//
//
        List<Integer> list = List.of(1, 2, 3, 4, 5);
//        List<Integer> evenNumberList = new ArrayList<>();
//        for (Integer i : list) {
//            if (i % 2 == 0) {
//                evenNumberList.add(i);
//            }
//        }
//
//        Stream<Integer> stream = list.stream(); // creates new stream every time it is called
//
//        List<Integer> evenNumberListStream = list.stream().filter(isEven).toList();
//        List<Integer> evenNumberListStream1 = list.stream().filter(isEven)
//                .map(i -> i * 2)
//                .toList();
//        List<Integer> evenNumberListStream2 = list.stream()
//                .map(i -> i * 2) // 2, 4, 6, 8, 10
//                .filter(isEven)
//                .toList();

        list.stream().forEach(i -> System.out.println("Current: " + i));
//        System.out.println(evenNumberList);
//        System.out.println(evenNumberListStream);
//        System.out.println(evenNumberListStream1);
//        System.out.println(evenNumberListStream2);

        // source [list] -> intermediate operations (filter, map) -> terminal operation (toList)

        boolean moreThan3 = list.stream().allMatch(i -> i > 3);
        System.out.println(moreThan3);
        boolean lessThan3 = list.stream().anyMatch(i -> i < 3);
        System.out.println(lessThan3);
        Integer i = list.stream().findAny().get();
        Integer i1 = list.stream().findFirst().get();
        System.out.println(i);
        System.out.println(i1);
        List<Integer> ll = list.stream().filter(k -> k != 3).collect(Collectors.toList());
        System.out.println(ll);
    }

}
