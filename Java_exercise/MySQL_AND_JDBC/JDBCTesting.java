package Java_exercise.MySQL_AND_JDBC;

import java.util.ArrayList;

public class JDBCTesting {
    App App = new App();
    public static void main(String[] args) {
        for (ArrayList<String> i : App.getDatabaseItem("Users", "firstname", "")) {
            System.out.println(i);   
        }
    }
}