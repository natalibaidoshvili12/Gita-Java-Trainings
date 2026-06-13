package jan24;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 1
//        ArrayList<Integer> list = new ArrayList<>();
//        Random random = new Random();
//        while (!list.contains(40)) {
//            list.add(random.nextInt(50));
//        }
//        System.out.println(list);
//        System.out.println(list.size());
//        for (Integer i : list) {
//            if (i % 2 == 0) System.out.print(i + " ");
//        }
        // 2
//        int[] arr = new int[5];
//        Random random = new Random();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(50);
//            list.add(arr[i]);
//        }
//        Arrays.sort(arr);
//        System.out.println("Min: " + arr[0]);
//        System.out.println("Max: " + arr[arr.length - 1]);
//        System.out.println("Max: " + Collections.max(list));
//        System.out.println("Min: " + Collections.min(list));
//        Student s1 = new Student("name1", "lastname1", "0001", 98.5);
//        Student s2 = new Student("name2", "lastname2", "0002", 88.5);
//        Student s3 = new Student("name3", "lastname3", "0003", 92.5);
//        Student s4 = new Student("name4", "lastname4", "0004", 99.5);
//        Student s5 = new Student("name5", "lastname5", "0005", 96.5);
//        List<Student> list = new ArrayList<>();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        list.add(s5);
//        Collections.sort(list, new StudentComparator());
//        System.out.println(list);

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[] words = text.split(" ");
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);

    }

}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getAverageGrade() - o2.getAverageGrade());
    }
}
