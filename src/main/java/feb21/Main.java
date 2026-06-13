package feb21;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("string.txt");
//        BufferedReader br = new BufferedReader(fr);
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
//
//        FileWriter fw = new FileWriter("string.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write("Hello World");
//        bw.close();
//        fw.close();

//        Map<String, Integer> map = new HashMap<>();
//        BufferedReader reader = new BufferedReader(new FileReader("mdinareebi.txt"));
//        String line = reader.readLine();
//        int n = Integer.parseInt(line);
//        while ((line = reader.readLine()) != null) {
//            String[] split = line.split(" ");
//            map.put(split[0], Integer.parseInt(split[1]));
//        }
//
//        int maxLength = Integer.MIN_VALUE;
//        String mdinare = "";
//        for (String key : map.keySet()) {
//            if (map.get(key) > maxLength) {
//                maxLength = map.get(key);
//                mdinare = key;
//            }
//        }
//        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//        writer.write(mdinare + " " + maxLength + "\n");
//        writer.close();

        // 2
        BufferedReader br = new BufferedReader(new FileReader("samkutxedi.txt"));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            String[] split = line.split(" ");
            int perimeter = Integer.parseInt(split[0]) + Integer.parseInt(split[1]) + Integer.parseInt(split[2]);
            list.add(perimeter);
        }
        int maxIndex = -1;
        int maxPerimeter = -1;
        for (int i = 0; i < list.size(); i++) {
            int perimeter = list.get(i);
            if (perimeter > maxPerimeter) {
                maxPerimeter = perimeter;
                maxIndex = i;
            }
        }
        System.out.println("Max Index: " + maxIndex);
        System.out.println("Max Perimeter: " + maxPerimeter);

    }

}
