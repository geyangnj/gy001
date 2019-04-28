package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {

    public static void main(String[] args){
       Connection conn = JdbcUtils.getConnection();
        System.out.println(conn);
    }



    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://127.0.01:3306/demo","root","root");

        } catch (Exception e) {
            throw new  RuntimeException(e);
        }
    }




}
