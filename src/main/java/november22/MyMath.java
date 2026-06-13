package november22;

public class MyMath {

    public static final int MIN_VALUE = Integer.MIN_VALUE;
    public static final int MAX_VALUE = Integer.MAX_VALUE;
    public static final double PI = 3.14159265358979323846;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    public static int square(int x) {
        return x * x;
    }

    public static int log(int a, int b) {
        int count = 0;
        while (b != 1) {
            b /= a;
            count++;
        }
        return count;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int abs(int a) {
        return a > 0 ? a : -a;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

}
