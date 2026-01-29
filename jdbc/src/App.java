import java.sql.*;
import java.util.ArrayList;

public class App {
    private static String currentDatabase = "my_java_database";
    public static void main(String[] args) {
        getDatabaseItem("Users", new String[]{"ID", "firstname", "lastname"}, "");
    }
    public static String getCurrentDatabase() {
        return currentDatabase;
    }

    public static void setCurrentDatabase(String newDatabase) {
        currentDatabase = newDatabase;
    }

    public static ArrayList<String> getDatabaseItem(String table, String[] coulums, String arguments) {
        ArrayList<String> results = new ArrayList<String>();
        
        try {
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + currentDatabase, "root", "78952");
            System.out.println("Connection established.");
            // Create a statement
            Statement stmt = con.createStatement();
            // Execute a query
            String query = "SELECT * FROM " + table + " " + arguments; 
            System.out.println("Executing query: " + query);
            ResultSet rs = stmt.executeQuery(query);
            // Process the result set
            while (rs.next()) {
                for (String currentCoulum : coulums) {
                    results.add(rs.getString(currentCoulum));
                }
                
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();
        } 
        catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Vendor Error: " + e.getErrorCode());
        } 
        catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }
    
    public static void setDatabaseItem(String table, String primaryKeyOfTable, String valueOfPrimaryKeyOfValueToChange, String coulum, String newItem) {
        try {
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + currentDatabase, "root", "78952");
            System.out.println("Connection established.");
            // Create a statement
            Statement stmt = con.createStatement();
            // Execute a query
            String query = "SELECT * FROM Users"; 
            System.out.println("Executing query: " + query);
            ResultSet rs = stmt.executeQuery(query);
            // Process the result set
            while (rs.next()) {
                System.out.println("ID: " + rs.getString("ID") +
                " firstname: " + rs.getString("firstname") + 
                " Lastname: " + rs.getString("lastname") + 
                " Email: " + rs.getString("email")
                );
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();
        } 
        catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Vendor Error: " + e.getErrorCode());
        } 
        catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void createTable(String name, String attributes) {
        try {
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + currentDatabase, "root", "78952");
            System.out.println("Connection established.");
            // Create a statement
            Statement stmt = con.createStatement();
            // Execute a query
            String query = "CREATE TABLE " + name + " (" + attributes + ")"; 
            System.out.println("Executing query: " + query);
            ResultSet rs = stmt.executeQuery(query);

            // Close resources
            rs.close();
            stmt.close();
            con.close();
        } 
        catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Vendor Error: " + e.getErrorCode());
        } 
        catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}