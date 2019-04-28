package cn.dao;

import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDao {

    public static void main (String[] args){
        ProductDao dao = new ProductDao();
        dao.update("华为",1999,"新款");
    }

   public void update (String name,double price,String remark){
        String sql = "update product set price=?,remark=? where name=?" ;
       Connection con= JdbcUtils.getConnection();
       try {
           PreparedStatement pre = con.prepareStatement(sql);
           pre.setDouble(1,price);
           pre.setString(2,remark);
           pre.setString(3,name);
           pre.executeUpdate();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }






}
