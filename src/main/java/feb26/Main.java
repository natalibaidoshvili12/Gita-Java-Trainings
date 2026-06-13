package feb26;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try ( // try-with-resources
              Scanner scanner = new Scanner(new File("input_1.txt"));
              PrintWriter greatWriter = new PrintWriter(new FileWriter("great.txt"));
              PrintWriter smallWriter = new PrintWriter(new FileWriter("smalls.txt"))
        ) {

            int n = scanner.nextInt();

            List<Integer> sides = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                sides.add(scanner.nextInt());
            }

            int m = scanner.nextInt();

            for (int side : sides) {
                int area = side * side;
                if (area > m) {
                    greatWriter.println(side);
                } else {
                    smallWriter.println(side);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
