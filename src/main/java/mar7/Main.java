package mar7;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 1
//        int[] numbers = {5, 10, 15, 20, 25};
//        int sum = Arrays.stream(numbers).sum();
//        System.out.println(sum);

        // 2
//        int[] randomArray = {4, 9, 2, 15, 8, 6, 13, 7};
//        int max = Arrays.stream(randomArray).max().getAsInt();
//        int min = Arrays.stream(randomArray).min().getAsInt();
//        // Optional<Integer> optional;
//        System.out.println("Min: " + min);
//        System.out.println("Max: " + max);

        // 3
//        List<String> list = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
//        List<Integer> integerList = list.stream().map(s -> Integer.parseInt(s)).toList();
//        int sum = integerList.stream().mapToInt(s -> s).sum();
//        System.out.println(integerList);
//        System.out.println(sum);

        // 4
//        int[] numbers = {9, 3, 2, 5, 1, 6, 11, 7};
//        int[] asc = Arrays.stream(numbers).sorted().toArray();
//        Integer[] desc = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
//        System.out.println(Arrays.toString(asc));
//        System.out.println(Arrays.toString(desc));

        // 5
        List<User> users = new ArrayList<>();
        users.add(new User(1L, 23, Status.ACTIVE));
        users.add(new User(2L, 33, Status.INACTIVE));
        users.add(new User(3L, 24, Status.ACTIVE));
        users.add(new User(4L, 27, Status.DEACTIVATED));
        users.add(new User(5L, 21, Status.INACTIVE));
//
//        Map<Status, List<User>> grouped = users.stream().collect(Collectors.groupingBy(user -> user.getStatus()));
//        System.out.println(grouped);

        // 6
//        List<User> sortedAsc = users.stream().sorted(Comparator.comparing(p -> p.getAge())).toList();
//        System.out.println(sortedAsc);
//        List<User> sortedDesc = users.stream().sorted(Comparator.comparing(p -> p.getAge())).toList().reversed();
//        System.out.println(sortedDesc);

        // 2.1
//        int[] arr = {1, 3, 5, 2, 6, 7, 4, 6};
//        int sum = Arrays.stream(arr).filter(e -> e % 2 == 0).sum();
//        System.out.println(sum);

        // 2.2
//        int[] arr = {1, 11, 2, 5, 15, 1, 3, 16};
//        long count = Arrays.stream(arr).filter(e -> e > 10).count();
//        System.out.println(count);
//
        // 2.3
//        String[] strings = {"java", "stream", "api"};
//        String result = Arrays.stream(strings).collect(Collectors.joining("-"));
//        System.out.println(result);

        // 2.4
//        List<Person> persons = new ArrayList<>();
//        persons.add(new Person("firstName1", "lastName1", 23));
//        persons.add(new Person("firstName2", "lastName2", 24));
//        persons.add(new Person("firstName3", "lastName3", 27));
//        persons.add(new Person("firstName4", "lastName4", 24));
//        persons.add(new Person("firstName5", "lastName5", 37));
//        persons.add(new Person("firstName6", "lastName6", 17));
//        persons.add(new Person("firstName7", "lastName7", 19));
//        Person oldest = persons.stream().max(Comparator.comparing(p -> p.getAge())).get();
//        System.out.println(oldest);
//        Optional<Person> optional = Optional.of(new Person());
//        if (optional.isPresent()) {
//            Person person = optional.get();
//        }

        // 2.5
        int[] numbers = {1, 2, 3, 1, 1, 2, 3, 1, 2, 4, 3, 3, 4}; // -> 1, 2, 3, 4
        long count = Arrays.stream(numbers).distinct().count();
        System.out.println(count);


    }

}
