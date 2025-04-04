package com.jdbc_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the username:");
	   String uname =sc.next();
	   System.out.println("Enter the password:");
	   String pwd =sc.next();
	   
	   String url="jdbc:mysql://localhost:3306/db1";
	   String name="root";
	   String pass="preethi@2025";
	   String sql="select * from login where username=? and password=?";
	   
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection conn= DriverManager.getConnection(url, name, pass);
	   PreparedStatement psmt =conn.prepareStatement(sql);
	   psmt.setString(1,uname);
	   psmt.setString(2, pwd);
	   
	   ResultSet rs=psmt.executeQuery();
	   
	   if(rs.next()) {
		   System.out.println("Login successfull...");
	   }
	   else {
		   System.out.println("login Denied....");
	   }
	   
	   conn.close();
	}
}
