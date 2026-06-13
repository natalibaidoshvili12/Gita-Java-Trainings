//package feb28.saklaso;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.gson.Gson;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper(); // jackson
//        Gson gson = new Gson(); // gson
//
//        // 1
//
////        Student st = new Student();
////        st.setAge(21);
////        st.setActiveStatus("active");
////        st.setGpa(3.94);
////        st.setName("John Doe");
////        String jacksonJson = objectMapper.writeValueAsString(st);
////        String gsonJson = gson.toJson(st);
////        System.out.println(gsonJson);
////        System.out.println(jacksonJson);
//
//
//        // 2
//
////        Address address = new Address();
////        address.setCity("Tbilisi");
////        address.setStreet("Shartava st.");
////        address.setZipCode("0160");
////        User user = new User();
////        user.setId(1);
////        user.setName("John Doe");
////        user.setAddress(address);
////        String json = gson.toJson(user);
////        String json2 = objectMapper.writeValueAsString(user);
////        System.out.println(json);
////        System.out.println(json2);
//
//        // 3
//
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("John Doe", 21, 3.94, "active"));
//        students.add(new Student("Jane Doe", 18, 2.94, "active"));
//        students.add(new Student("Jack Doe", 19, 3.34, "inactive"));
//        students.add(new Student("James Doe", 20, 3.24, "active"));
//        Course course = new Course();
//        course.setCourseName("Java");
//        course.setInstructor("Natali Baidoshvili");
//        course.setStudentList(students);
//        String json = gson.toJson(course);
//        String json2 = objectMapper.writeValueAsString(course);
//        System.out.println(json);
//        System.out.println(json2);
//
//    }
//
//}
