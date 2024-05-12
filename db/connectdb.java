/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
/**
 *
 * @author WOW
 */
public class connectdb {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://20.2.128.32:3306/HMS?useSSL=false","pdm","hcmiu123");
            return con;
        }
            catch (Exception e){
                    return null;
                    }
    }
}
  

