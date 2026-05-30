//package feb28;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.gson.Gson;
//
//public class JacksonExample {
//
//    public static void main(String[] args) throws JsonProcessingException {
//
//        User user = new User();
//        user.setUsername("John");
//        user.setPassword("password");
//        user.setAge(25);
//        user.putValuesToMap("key1", "value1");
//        user.putValuesToMap("key2", "value2");
//        user.setUserChildClass(new UserChildClass("John", 25));
//
////        ObjectMapper mapper = new ObjectMapper();
////
////        String json = mapper.writeValueAsString(user);
////        System.out.println(json);
////        User user2 = mapper.readValue(json, User.class);
////        System.out.println(user2);
//
//        Gson gson = new Gson();
//        String json = gson.toJson(user);
//        System.out.println(json);
//        User user2 = gson.fromJson(json, User.class);
//        System.out.println(user2);
//    }
//
//}
