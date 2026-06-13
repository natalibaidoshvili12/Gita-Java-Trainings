package january22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(1);
//        System.out.println(set);

        HashSet<Person> persons = new HashSet<>();
        persons.add(new Person("Natali", "Baidoshvili", 25));
        persons.add(new Person("Natali", "Baidoshvili", 25));
        persons.add(new Person("Natali", "Baidoshvili", 25));
        System.out.println(persons);

        ArrayList<Integer> list = new ArrayList<>();
        // int - Integer
        // double - Double; long - Long, short - Short ...
        // char - Character

        HashMap<String, String> map = new HashMap<>();
        map.put("Natali", "Baidoshvili");
        System.out.println(map.get("Natali"));
        map.put("Natali", "Baidoshvili1");
        System.out.println(map.get("Natali"));
        System.out.println(map.containsKey("Natali"));
        System.out.println(map.containsValue("Baidoshvili"));
        System.out.println(map.containsValue("Baidoshvili1"));
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }
    }

}
