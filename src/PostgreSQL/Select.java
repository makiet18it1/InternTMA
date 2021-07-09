package PostgreSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Select extends ConnectDatabase{

    private static List<String> listQuery;


    private static void getAllFirstName(){
        Connection cnt = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT first_name, last_name FROM actor WHERE first_name = 'Jayne'";
            cnt = ConnectDatabase.getConnection();
            stm = cnt.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()){

                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String fullName = firstName+ " "+ lastName;
                listQuery.add(fullName);
            }
        }catch (SQLException e){
            return;
        }finally{
            try {
                if (cnt != null){
                    cnt.close();
                }
                if (stm != null){
                    stm.close();
                }
                if (rs != null){
                    rs.close();
                }
            }catch (SQLException e2){
                e2.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        listQuery = new ArrayList<>();
        getAllFirstName();
        for (String firstName : listQuery){
            System.out.println(firstName);
        }
    }

}
