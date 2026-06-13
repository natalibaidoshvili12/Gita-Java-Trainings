package october30;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 4
//        for (int i = 0; i <= 15; i++) {
//            if (i % 2 != 0) {
//                if (i == 5 || i == 7 || i == 11) continue;
//                System.out.println(i);
//            }
//        }

        // 3
//        for (int i = 2; i <= 50 ; i++) {
//            if (i == 20) break;
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        // 2
//        for (double x = 1; x <= 10; x += 0.5) {
//            double y = x * x + 5;
//            System.out.println("x: " + x + ", y=" + y);
//        }

        // 1
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] powers = new int[10];
        int index = 0;
        int power = 1;

        while (n > 0) {
            if (n % 2 == 1) {
                powers[index++] = power;
            }
            n/= 2;
            power *= 2;
        }

        for (int i = 0; i < index; i++) {
            if (powers[i] != 0) System.out.print(powers[i] + " ");
        }


    }

}
