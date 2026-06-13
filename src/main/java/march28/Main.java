package march28;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Natali1234.b12");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from students");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " +
//                        resultSet.getString(3) + " " + resultSet.getString(4) + " " + resultSet.getString(5)
//                        + " " + resultSet.getString(6));
//            }
//        } catch (SQLException e) {
//            System.out.println("Could not create table animals");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Class not found");
//        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Natali1234.b12");
            PreparedStatement statement = connection.prepareStatement("insert into animals (id, name) values (?, ?)");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            while (line != null && !line.isEmpty()) {
                String[] split = line.split(" ");
                statement.setInt(1, Integer.parseInt(split[0]));
                statement.setString(2, split[1]);
                line = scanner.nextLine();
                statement.executeUpdate();
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println("Could not create table animals");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }

}
