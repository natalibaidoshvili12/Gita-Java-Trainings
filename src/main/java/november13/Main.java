package november13;

public class Main {
    public static void main(String[] args) {
//        String s = "Natali";
//        String s1 = new String("Natali");
//        char c = 'N';
//        char[] arr = new char[6];
//        // N a t a l i
//
//        Integer k = 0;
//
//        String str = "test";
//        String str1 = "test";
//        System.out.println(str == str1);
//        String str2 = new String("test");
//        System.out.println(str == str2);
//        System.out.println(str1 == str2);
//        System.out.println(str.equals(str2));
//        System.out.println(str1.equals(str2));

//        String str = "Natali Baidoshvili !";
//        System.out.println(str.length());
//        System.out.println(str.toUpperCase());
//        System.out.println(str);
//        System.out.println(str.toLowerCase());
//        System.out.println(str.equalsIgnoreCase("natali baidoshvili"));
//        System.out.println(str.equals("natali baidoshvili"));
//        System.out.println(str.charAt(10)); // chars[10]
//        System.out.println(str.replace('a', '!'));
//        System.out.println(str);
//        System.out.println(str.substring(3));
//        System.out.println(str.substring(3, 6));
//        System.out.println(str.toCharArray());
//        System.out.println(str.indexOf('a'));
//        System.out.println(str.lastIndexOf('a'));
//        System.out.println(str.concat(" is a trainer"));
//        System.out.println("Hello world " + "!");
//        System.out.println(str.startsWith("natali")); // case sensitive
//        System.out.println(str.endsWith("Li")); // case sensitive
//        System.out.println(str.contains("aid")); // case sensitive
//        System.out.println(str.trim());
//        String[] strs = str.split(" ");
//        for (int i = 0; i < strs.length; i++) {
//            System.out.println(strs[i]);
//        }

        StringBuilder sb = new StringBuilder("Natali");
        String s = ""; // empty
        String s2; // null
        System.out.println(sb);
        sb.append(" Natali");
        System.out.println(sb);
        sb.replace(3, 7, "mmmm");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.isEmpty();


    }
}
