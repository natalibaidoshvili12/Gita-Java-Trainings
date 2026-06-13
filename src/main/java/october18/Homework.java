package october18;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        // 1
//        for (int i = 1; i < 40; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

        // 2

//        Scanner scanner = new Scanner(System.in);
//        int k = scanner.nextInt();
//        int fact = 1;
//        for (int i = 1; i <= k; i++) {
//            fact *= i;
//        }
//        System.out.println(fact);

        // 3
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) { // 4567 // sum = 22; num = 0
            sum += num % 10; // sum = sum + num % 10
            num /= 10;
        }
        System.out.println(sum);

        // 4
//        int sum = 0;
//        int product = 1;
//        int average = 0;
//
//        for (int i = 1; i <= 15; i++) {
//            sum = sum + i;
//            product = product * i;
//        }
//        average = sum / 15;
//        System.out.println("Average: " + average);
//        System.out.println("Product: " + product);
//        System.out.println("Sum: " + sum);

        // 5

//        int ticketSum = 0;
//
//        for (int i = 1; i <= 120; i++) {
//            if (i % 10 == 0) {
//                ticketSum += 45;
//            } else if (i % 6 == 0) {
//                ticketSum += 30;
//            } else {
//                ticketSum += 20;
//            }
//        }
//
//        System.out.println(ticketSum);

    }

}
