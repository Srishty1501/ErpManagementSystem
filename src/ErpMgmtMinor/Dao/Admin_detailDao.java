package ErpMgmtMinor.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ErpMgmtMinor.Pojos.Admin_detail;
import Utilities.ConnectionPool;

public class Admin_detailDao {
  
	public static Admin_detail authenticateAdmin(String username, String password) {
	Admin_detail admin= new Admin_detail();
	int a_id=-1;
	ConnectionPool pool = ConnectionPool.getInstance();
	pool.initialize();
	Connection conn = pool.getConnection();
	try{
		String sql = "select * from admin_detail where username=? and password=?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,username);
		ps.setString(2,password);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			a_id=rs.getInt("a_id");
			admin.setA_id(a_id);
			admin.setAdmin_name(rs.getString("Admin_name"));
			admin.setEmail(rs.getString("email"));
			admin.setMobile(rs.getString("mobile"));
			}
		}catch(SQLException sq) {
			System.out.println("unable to find the records." + sq);
	}
	finally {
		pool.putConnection(conn);
	}
	return admin;
	}
}


