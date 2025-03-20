package org.example.starterexamples;




import java.sql.*;

public class StarterExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String jdbcDriver = "com.mysql.cj.jdbc.Driver"; // "com.mysql.jdbc.Driver" -> Deprecated
        String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc_db";
        String user = "root";
        String password = "Devprem0li!";

        Class.forName(jdbcDriver);

        Connection con = DriverManager.getConnection(jdbcUrl, user, password);

        Statement stmt = con.createStatement();

        //String query = "select name from student where student_id=2";
        //String query = "select * from student";
        String query = "insert into student values(3, 'Saran')";

//        ResultSet rs = stmt.executeQuery(query);
        int rs = stmt.executeUpdate(query);

//        rs.next();
//        String userData;
//        userData = rs.getInt(1) + " : " + rs.getString(2);
//        System.out.println(userData);
//
//        rs.next();
//        userData = rs.getString(1) + " : " + rs.getString(2);
//        System.out.println(userData);

//        rs.next();
//        userData = rs.getString(1) + " : " + rs.getString(2);
//        System.out.println(userData);

//        while (rs.next()) {
//            System.out.println(rs.getString(1) + " : " + rs.getString(2));
//        }


        stmt.close();
        con.close();

    }

}
