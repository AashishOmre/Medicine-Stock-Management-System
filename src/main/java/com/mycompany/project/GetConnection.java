/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;
import java.sql.*;
/**
 *
 * @author LENOVO
 */
public class GetConnection {
    
    private Connection conn=null;
    public Connection getConnection(){
      try{
       conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","aashu@123");
      
      }
      catch(SQLException e){
          System.out.println(e);
      }
      
      finally{
      return conn;
      }
    
    }
    
    
}
