package com.jdbc_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preparestmt {
   public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  //loading driver class
	  Class.forName("com.mysql.jdbc.Driver");
	  //get the connection
	  Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","preethi@2025");
	  
	  //create statement to insert
	  PreparedStatement psmt=conn.prepareStatement("insert into employee values(?,?)");
	  psmt.setInt(1,250);
	  psmt.setString(2,"ashvik");
	  
	  //execute
	//int result=psmt.executeUpdate();  
	
	// to update
	PreparedStatement pmt=conn.prepareStatement("update employee set empid=? where empname=?");
	pmt.setInt(1,203);
	pmt.setString(2,"ashvik");
	
	//int result=pmt.executeUpdate();
	
	//to delete 
	PreparedStatement pt=conn.prepareStatement("delete from employee where empid=?");
	pt.setInt(1,200);
	
	int result=pt.executeUpdate();
	
		conn.close();
	
	System.out.println("data inserted:"+result);
}
}
