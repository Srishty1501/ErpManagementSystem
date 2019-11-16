package ErpMgmtMinor.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ErpMgmtMinor.Pojos.Dept;
import Utilities.ConnectionPool;

public class DeptDao {
	public Dept find(int dept_id){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Dept dep = new Dept();
		try{
			String sql = "select * from dept where dept_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, dept_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				dep.setDept_id(dept_id);
				dep.setDept_name(rs.getString("dept_name"));
				dep.setSec(rs.getString("sec"));
				dep.setSem(rs.getString("sem"));
			}
	} catch (SQLException sq) {
		System.out.println("Unable to create a new row." + sq);
	} finally {
		pool.putConnection(conn);
	}
	return dep;
	}
	public int findDepid(String dep_name, String sec , String sem){
		int dep_id=-1;
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try{
			String sql = "select dept_id from dept where dept_name=? and sec=? and sem=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dep_name);
			ps.setString(2, sec);
			ps.setString(3, sem);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				dep_id = rs.getInt("dept_id");
			}
		}
		catch(SQLException sq) {
			System.out.println("unable to find the records." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return dep_id;	
		}
}
