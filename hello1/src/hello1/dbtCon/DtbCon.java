package hello1.dbtCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DtbCon{
 
    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private final static String user = "postgres";
    private final static String password = "210492";
 
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return connection;
    }
 
    public static void closeConnection(Connection connection){
        try{
              connection.close();
        }catch(Exception e){
              e.getMessage();
        }
  }
    
    
    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        DtbCon app = new DtbCon();
        app.getConnection();
    }*/
}