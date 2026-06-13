package november6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // a ^ c = b;
        // loga(b)=c

        Scanner scanner = new Scanner(System.in);
        // 1
//        int a = scanner.nextInt(); // 2
//        int b = scanner.nextInt(); // 8
//        int c = 0;
//        while (b != 1) {
//            b /= a;
//            c++;
//        }
//        System.out.println("loga(b) = " + c);

//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int result = 1;
//        for (int i = 0; i < y; i++) {
//            result *= x;
//        }
//        System.out.println(result);

        // 2
//        int number = scanner.nextInt();
//        int reversed = 0;
//        int num = number;
//
//        while (num != 0) { // 123
//            reversed = reversed * 10 + num % 10;
//            num = num / 10;
//        }
//
//        System.out.println(reversed == number ? "IS PALINDROME" : "IS NOT PALINDROME");


        // 3
//        int[] arr = {1,2,5,1,2,5,3,2,2,4,3,5,1};
//        /* 1 1 1 2 2 2 2 3 3 4 5 5 5 */
//        int maxElement = arr[0];
//        int maxElementCount = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > maxElement) {
//                maxElement = arr[i];
//                maxElementCount = 0;
//            }
//            if (arr[i] == maxElement) {
//                maxElementCount++;
//            }
//        }
//        System.out.println(maxElementCount);

        // 4
        // 0 1 2 3 4
        /* int[] count = new int[5];
        int[] arr = {1,2,3,5,1,2,5,2,4,2,3,5,1,2,4,2};
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - 1]++;
        }

        int maxId = 0;
        int maxNumber = count[0];
        for (int i = 1; i < count.length; i++) {
            if (count[i] > maxNumber) {
                maxNumber = count[i];
                maxId = i;
            }
        }
        System.out.println("Frequently seen bird id: " + (maxId + 1));


         */
        // 5
//        int[] arr = {2,2,3,5,1,2,3,2,2,2,3,5,1,4,2,2};
//        for (int i = 1; i < arr.length - 1; i++) {
//            if (arr[i] == 2 && arr[i - 1] == 2 && arr[i + 1] == 2) {
//                System.out.println("true");
//                break;
//            }
//        }

        // 6

//        int[] arr = {2,2,3,5,1,2,3,2,2,2,3,5,1,4,2,2};
//        for (int i = 1; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i - 1] && arr[i] < arr[i + 1]) {
//                System.out.println("true");
//                break;
//            }
//        }

        // bonus
        boolean isEverywhere = true;
        int[] arr = {2,1,2,3,2,1,2,3,2,3,2,3,2,1,2,1};
        int num = scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (num != arr[i] && num != arr[i + 1]) {
                isEverywhere = false;
            }
        }
        System.out.println(isEverywhere);
    }

}
