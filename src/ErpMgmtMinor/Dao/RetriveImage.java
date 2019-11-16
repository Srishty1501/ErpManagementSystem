package ErpMgmtMinor.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Utilities.ConnectionPool;

public class RetriveImage {
public byte[] retrive_FImage(int f_id) {
	byte[] img= null;
	ConnectionPool pool = ConnectionPool.getInstance();
	pool.initialize();
	Connection conn = pool.getConnection();
	try {
		String str="select f_image from facultyimage where f_id=?";
		PreparedStatement ps=conn.prepareStatement(str);
		ps.setInt(1, f_id);
		System.out.println(f_id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			img=rs.getBytes(1);
			System.out.println("yessssss");
		}
		else {
			System.out.println("sorry");
		}
		}
catch(Exception e) {
		
		e.printStackTrace();
	}
	finally {
		pool.putConnection(conn);
	}
	return img;
}


public byte[] retrive_SImage(int s_id) {
	byte[] img= null;
	ConnectionPool pool = ConnectionPool.getInstance();
	pool.initialize();
	Connection conn = pool.getConnection();
	try {
		String str="select image from stud_detail where s_id=?";
		PreparedStatement ps=conn.prepareStatement(str);
		ps.setInt(1, s_id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			img=rs.getBytes(1);
		}
		else {
			System.out.println("sorry");
		}
		}
catch(Exception e) {
		
		e.printStackTrace();
	}
	finally {
		pool.putConnection(conn);
	}
	return img;
}
}
