import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcDemoDriverManager {
    Connection con = null;
    String url = "jdbc:mysql://localhost:3606/jdbc_demo_drivermanager";
    String userName = "devpremoli";
    String password = "Devprem0li!"

    try {
        con = DriverManager.getConnection(url, userName, password);
        

    }


}