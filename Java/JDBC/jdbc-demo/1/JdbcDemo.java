import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {
        String driverClassName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String username = "devpremoli";
        String password = "Devprem0li!";
        String query = "INSERT INTO students (id, age, name) VALUES (1, 109, 'bhatt')";

        try {
            Class.forName(driverClassName);

            // Load the JDBC driver class
            Class.forName(driverClassName);

            // Obtain a connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Here you would execute your query using the connection (omitted for brevity)
            System.out.println("Connection established successfully.");

            Statement stat = con.createStatement();
            int count = stat.executeUpdate(query);
            System.out.println("number of rows affected by this query= " + count);

            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occured: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQLExecption occurred: " + e.getMessage());
        }

    }
}


/*
 compiling

 */