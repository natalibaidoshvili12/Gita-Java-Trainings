package january17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        Tour cityTour = new CityTour("Rome", -1, 120);
//        Tour beachTour = new BeachTour("Bali", 7, 200, 500);
//        System.out.println(cityTour.getDescription());
//        System.out.println(beachTour.getDescription());

//        int x = 0;
//        int y = 5;
//        System.out.println("Dividing");
//        try {
//            FileReader fileReader = new FileReader("input.txt");
//            System.out.println(y / x);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            e.getStackTrace();
//            System.out.println("Error occurred, File not found");
//        } finally {
//            System.out.println("The end");
//        }
//
//        try (FileReader fr = new FileReader("input.txt"); FileWriter fw = new FileWriter("output.txt")) {
            // try with resources
//        } catch (IOException e) {
//            System.out.println("Error occurred, File not found");
//        }

//        try {
//            FileReader fileReader = new FileReader("input.txt");
//            System.out.println(y/x);
//        } catch (FileNotFoundException e) {
//            System.out.println("Error occurred, File not found");
//        } catch (Exception e) {
//            System.out.println("Error occurred");
//        }
//        System.out.println("Finished"); // unchecked exception
//        System.out.println("Start");
//        FileReader fr = new FileReader("aaa.txt");
//        System.out.println("End");


        int[] arr = {1, 2, 3, 5, 7};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}
