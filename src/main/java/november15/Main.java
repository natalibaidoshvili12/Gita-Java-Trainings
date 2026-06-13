package november15;

import november20.Person;

public class Main {

    public static void main(String[] args) {
        // 1
//        Rectangle rectangle = new Rectangle();
//        rectangle.length = 3;
//        rectangle.width = 2;
//        System.out.println("Rectangle 1 area: " + rectangle.area());
//        System.out.println("Rectangle 1 perimeter: " + rectangle.perimeter());
//        Rectangle rectangle2 = new Rectangle(5, 3);
//        System.out.println("Rectangle 2 area: " + rectangle2.area());
//        System.out.println("Rectangle 2 perimeter: " + rectangle2.perimeter());
        // 2
//        Car car1 = new Car();
//        car1.brand = "Mercedes";
//        car1.manufacturerDate = 2019;
//        car1.carNumber = "AA123BB";
//        car1.model = "E";
//        System.out.println("Car 1");
//        car1.printInfo();
//        System.out.println("Car 2");
//        Car car2 = new Car("BMW", "M5", 2022, "AA122BB");
//        car2.printInfo();

        //3
//        int[][] arr = new int[3][6];
//        Random rand = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = rand.nextInt(100);
//            }
//        }
//
//
//        for (int i = 0; i < arr.length; i++) {
//            int rowSum = 0;
//            for (int j = 0; j < arr[i].length; j++) {
//                rowSum += arr[i][j];
//            }
//            System.out.println(rowSum);
//        }

        // saklaso 1
//        String s = "ygiergiigiug4e923gbidbqkhd92h92hdnl";
//        int numVowel = 0;
//        int numConsonant = 0;
//        int numDigits = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                numVowel++;
//            } else if (c >= '0' && c <= '9') {
//                numDigits++;
//            } else {
//                numConsonant++;
//            }
//        }
//
//        System.out.println("Vowels: " + numVowel);
//        System.out.println("Consonants: " + numConsonant);
//        System.out.println("Digits: " + numDigits);

        // saklaso 2
        String s1 = "School is a good place";
//        String s2 = "oo";
//        System.out.println(s1.lastIndexOf(s2));
        // saklaso 3
//        char[] arr = s1.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        //saklaso 4
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1);
        // saklaso 5
//        String palindrome = "";
//        for (int i = 0; i < s1.length(); i++) {
//            for (int j = i + 1; j < s1.length(); j++) {
//                String substr = s1.substring(i, j);
//                StringBuilder sb = new StringBuilder(substr);
//                if (substr.equals(sb.reverse().toString().trim()) && substr.length() > palindrome.length()) {
//                    palindrome = substr;
//                }
//            }
//        }
//        System.out.println(palindrome);

        // davaleba 6
//        int[] arr = {1, 4, 5, 6, 7, 8, 9};
//        int even = 0, odd = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//        }
//
//        System.out.println("Odd: " + odd);
//        System.out.println("Even: " + even);

        // davaleba 5
//        int[] arr = {1, 3, 5, 2, 7, 2, -1, 6, 2, 9, 11, 8, 3};
//        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
//        for (int num : arr) {
//            if (num < min) {
//                secondMin = min;
//                min = num;
//            }
//            if (num > max) {
//                secondMax = max;
//                max = num;
//            }
//        }
//
//        System.out.println("Second Min: " + secondMin);
//        System.out.println("Second Max: " + secondMax);

        // davaleba 4

//        int[] arr1 = {1, 3, 5, 2, 7, 2, -1, 6, 2, 9, 11, 8, 3};
//        int[] arr2 = {1, 4, 5, 6, 7, 8, 9};
//        int[] common = new int[Math.min(arr1.length, arr2.length)];
//        int count = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    common[count++] = arr1[i];
//                    break;
//                }
//            }
//        }
//
//        for (int i = 0; i < count; i++) {
//            System.out.print(common[i] + " ");
//        }

        // davaleba 3
//        int[] arr = {1, 3, 5, 2, 7, 2, -1, 6, 7, 3, 5, 2, 9, 11, 8, 8, 3};
//        Arrays.sort(arr);
//        int[] newArr = new int[arr.length];
//        int count = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] != arr[i + 1]) {
//                newArr[count++] = arr[i];
//            }
//        }
//        if (arr[arr.length - 1] != arr[arr.length - 2]) {
//            newArr[count++] = arr[arr.length - 1];
//        }
//        int[] result = Arrays.copyOf(newArr, count);
//        System.out.println(Arrays.toString(result));

        String s = "Reverse words in a given string";
        String[] split = s.split(" ");

        // davaleba 2
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < split.length; i++) {
//            StringBuilder sb = new StringBuilder(split[i]);
//            builder.append(sb.reverse().toString() + " ");
//        }
//        System.out.println(builder.toString().trim());

        // davaleba 1
        StringBuilder result = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            result.append(split[i] + " ");
        }
        System.out.println(result.toString().trim());

        Person p = new Person("name", "lastname", 10);
        System.out.println(p.lastName);

    }

}
