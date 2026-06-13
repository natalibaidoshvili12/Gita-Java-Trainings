package october18;

public class Main {

    public static void main(String[] args) {
        int i1 = 0;
//        int i2 = 2;
//        int i3 = 3;
//        int i4 = 4;
//        int i5 = 5;
//        int i6 = 6;
//        int i7 = 7;
//        int i8 = 8;
//        int i9 = 9;
//        int i10 = 10;
//        System.out.println(i1);
//        System.out.println(i2);
//        System.out.println(i3);
//        System.out.println(i4);
//        System.out.println(i5);
//        System.out.println(i6);
//        System.out.println(i7);
//        System.out.println(i8);
//        System.out.println(i9);
//        System.out.println(i10);

//        while (i1 <= 40) {
//            System.out.println(i1);
//            i1++;
//        }

//        do {
//            System.out.println(i1);
//            i1++;
//        } while (i1 <= 10);
        // for (initialization; boolean condition; inc/dec) { }
//        for (int i = 1; ; i++) {
//            System.out.println(i);
//            if (i == 15) {
//                break;
//            }
//        }

        /*
        * i = 1 continue
        * i = 2 sout
        * i = 3 continue
        * i = 4 sout ...
        * */
//        for (int i = 1; i <= 20 ; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        while (i1 < 20) {
//            i1++;
//            if (i1 % 2 == 0) {
//                continue;
//            }
//            System.out.println(i1);
//        }

        /* i = 0 -> j = 0,1,2,3,4,5,6,7,8,9
        * i = 1 -> j = 0,1,2,3,4,5,6,7,8,9
        * i = 2 -> j = 0,1,2,3,4,5,6,7,8,9
        * ...
        *
        * */

        OUTER_FOR: for (int i = 0; i < 10; i++) {
            INNER_FOR: for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    continue OUTER_FOR;
                }
                System.out.println("i: " + i + ", j: " + j);

            }
        }

    }

}
