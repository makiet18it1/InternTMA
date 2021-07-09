package PostgreSQL;



import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

public class ConnectDatabase {
//    jdbc:postgresql://localhost:5432/testDB
    private static final String url = "jdbc:postgresql://localhost:5432/dvdrental";
    private static final String user = "postgres";
    private static final String password = "anhkiet25@";

    public static Connection getConnection(){
        Connection cnt = null;
        try {
            cnt = DriverManager.getConnection(url,user,password);
//            System.out.println("Conect Success !");
            return cnt;
        }catch (Exception e){
//            System.out.println(e.getMessage());
            return null;
        }
//        return null;
    }

//    public static void main(String[] args){
//        ConnectDatabase test = new ConnectDatabase();
//        test.getConnection();
//    }

}
