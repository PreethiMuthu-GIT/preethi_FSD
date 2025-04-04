package com.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	  
	  //1.loading Driver class
	  Class.forName("com.mysql.jdbc.Driver");
	  
	  //2.get the connection
	  Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "preethi@2025");
	  
	  //3.create the statement
	  Statement stmt =conn.createStatement();
	  
	  //4.execute the statement
	  //boolean result =stmt.execute("create table employee(empid int, empname varchar(20))");
//	  int res=stmt.executeUpdate("insert into employee values(201,'preethi')");
//	  int res1=stmt.executeUpdate("insert into employee values(202,'muthu')");
	 //stmt.executeUpdate("delete from employee where empid=100");
	  ResultSet result =stmt.executeQuery("select * from employee");
	  while(result.next()) {
		  System.out.println(result.getInt(1)+" "+result.getString(2));
	  }
	  
	  //5.close the connection
	  conn.close();
	  //System.out.println("table created: "+result);
	  //System.out.println("data inserted: "+res);

	  
	  
}
}
