package com.jdbc_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Batchprocessing {
 
	private static final String url="jdbc:mysql://localhost:3306/db1";
	private static final String name="root";
	private static final String pass="preethi@2025";
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn=DriverManager.getConnection(url, name, pass);
		
		conn.setAutoCommit(false);
		
		//insert
		String sql="insert into doctor values(?,?,?)";
		PreparedStatement psmt= conn.prepareStatement(sql);
		psmt.setInt(1, 101);
		psmt.setString(2, "preethi");
		psmt.setInt(3, 20000);
		psmt.addBatch();
		
		psmt.setInt(1, 102);
		psmt.setString(2, "ramya");
		psmt.setInt(3, 30000);
		psmt.addBatch();
		
		psmt.setInt(1, 103);
		psmt.setString(2, "raasi");
		psmt.setInt(3, 40000);
		psmt.addBatch();
		
		//int[] result=psmt.executeBatch();
		//System.out.println("Data Inserted: "+result.length);
		
		//update
		String Upda="update doctor set doc_salary=doc_salary+120000 where doc_id=?";
		PreparedStatement pmt=conn.prepareStatement(Upda);
		pmt.setInt(1, 102);
		pmt.addBatch();
		pmt.setInt(1, 103);
		pmt.addBatch();
		
//		int[] result=pmt.executeBatch();
//		System.out.println("Data updated: "+result.length);
		
		//delete
		String del="delete from doctor where doc_id=?";
		PreparedStatement pt=conn.prepareStatement(del);
		pt.setInt(1, 103);
		pt.addBatch();
		
//		int[] result=pt.executeBatch();
//		System.out.println("Data deleted: "+result.length);
		
		//fetching
		
		String fet="select * from doctor";
		PreparedStatement p = conn.prepareStatement(fet);
		ResultSet res =p.executeQuery();
		
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
		}
		
		
		
		conn.commit();
		conn.close();
	}
}
