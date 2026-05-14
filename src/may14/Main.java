package may14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 1
//        List<Integer> list = new ArrayList<>();
//        Random random = new Random();
//        int n = Math.abs(random.nextInt(15)) + 1;
//        for (int i = 0; i < n; i++) {
//            list.add(random.nextInt(25));
//        }
//
//        int firstMin = Integer.MAX_VALUE;
//        int secondMin = Integer.MAX_VALUE;
//        int firstMax = Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//        for (int i = 0; i < list.size(); i++) {
//            if (secondMin > list.get(i)) {
//                if (firstMin > list.get(i)) {
//                    secondMin = firstMin;
//                    firstMin = list.get(i);
//                } else {
//                    secondMin = list.get(i);
//                }
//            }
//            if (secondMax < list.get(i)) {
//                if (firstMax < list.get(i)) {
//                    secondMax = firstMax;
//                    firstMax = list.get(i);
//                } else {
//                    secondMax = list.get(i);
//                }
//            }
//        }
//        System.out.println(list);
//        System.out.println("Second Min: " + secondMin);
//        System.out.println("Second Max: " + secondMax);

        int n = new Random().nextInt(10);
        int[][] matrix = new int[n][];
        matrix[0] = new int[1];
        matrix[0][0] = 1;
        matrix[1] = new int[2];
        matrix[1][0] = 1;
        matrix[1][1] = 1;
        for (int i = 2; i < n; i++) {
            matrix[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
