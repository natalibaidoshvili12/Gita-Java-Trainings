package may21;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("\\b+ka");
//        String s = """
//                chven vswavlobt javas.
//                kargia java
//                """;
//        Matcher matcher = pattern.matcher(s);
//        while (matcher.find()) {
//            System.out.println("იწყება " + matcher.start() + "; მთავრდება " + matcher.end());
//        }
        // 1
//        String text = "abcd123efgh4567";
//        Pattern pattern = Pattern.compile("\\d+");
//        Matcher matcher = pattern.matcher(text);
//        List<String> list = new ArrayList<>();
//        while (matcher.find()) {
//            list.add(text.substring(matcher.start(), matcher.end()));
//        }
//        System.out.println(list);
        // 2
//        String text = "abcd123efgh4567";
//        Pattern pattern = Pattern.compile("efgh");
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

        // 3
//        String ip = "192.168.1.1";
//        String regex = "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
//                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
//                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
//                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
//        Matcher matcher = Pattern.compile(regex).matcher(ip);
//        if (matcher.find()) {
//            System.out.println("Valid ip");
//        } else {
//            System.out.println("Invalid ip");
//        }
        // 4
//        String url = "https://example.com/?id=2";
//        String regex = "^(https?://|www\\.)[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}(/.*)?$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(url);
//        if (matcher.find()) {
//            System.out.println("Valid url");
//        } else {
//            System.out.println("Invalid url");
//        }
        // 5
//        String email = "saxeli1.gvari@mziuri.ge";
//        String regex = "^[a-zA-Z]+\\.[a-zA-Z]+@mziuri\\.ge$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(email);
//        if (matcher.find()) {
//            System.out.println("Valid email");
//        } else {
//            System.out.println("Invalid email");
//        }
//        String dateTime = "12-12-2000";
//        String dateTimeRegex = "\\b(0?[1-9]|[12][0-9]|3[01])[-\\/](0?[1-9]|1[0-2])[-\\/](\\d{4})\\b";
//        Pattern pattern = Pattern.compile(dateTimeRegex);
//        Matcher matcher = pattern.matcher(dateTime);
//        if (matcher.find()) {
//            System.out.println(matcher.group());
//        }

        String passwordPattern = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d@$!%*?.&]{8,16}$";
        String password = "NNbb1234.b12";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

}
