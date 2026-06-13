package november8;

public class Math {

    int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    int fibonacci(int n) {
        if (n == 0) return 0;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /* fibonacci 0 1 1 2 3 5 8 13 21 44 ... */


}
