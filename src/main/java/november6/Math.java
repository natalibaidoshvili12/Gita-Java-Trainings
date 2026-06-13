package november6;

public class Math {
    // returnType - int
    // name - power
    // parameter list - int x, int y
    int power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    int sum(int length, int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }


}
