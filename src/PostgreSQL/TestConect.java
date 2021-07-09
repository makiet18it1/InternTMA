package PostgreSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConect {
//    jdbc:postgresql://localhost:5432/testDB
    private static String url = "jdbc:postgresql://localhost:5432/testDB";
    private static String user = "postgres";
    private static String password = "anhkiet25@";

    Connection getConnection(){
        Connection cnt = null;
        try {
            cnt = DriverManager.getConnection(url,user,password);
            System.out.println("Conect Success !");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args){
        TestConect test = new TestConect();
        test.getConnection();
    }

}
