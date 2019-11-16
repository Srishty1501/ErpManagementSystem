package ErpMgmtMinor.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ErpMgmtMinor.Pojos.TimeTable;
import Utilities.ConnectionPool;

public class TimeTableDao {
	public void create(TimeTable ttable){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql="insert into timetable(uid,f_id,sub_id,dept_id) values(?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1, ttable.getU_id());
			ps.setInt(2, ttable.getF_id());
			ps.setString(3,ttable.getSub_name());
			ps.setInt(4,ttable.getDept_id());
			ps.executeUpdate();
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}

		}
public void update(TimeTable ttable){
	ConnectionPool pool = ConnectionPool.getInstance();
	pool.initialize();
	Connection conn = pool.getConnection();
	try {
		String sql = "update timetable set f_id=?, sub_id=?, dept_id=? where u_id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, ttable.getF_id());
		ps.setString(2,ttable.getSub_name());
		ps.setInt(3,ttable.getDept_id());
		ps.setInt(4, ttable.getU_id());
		ps.executeUpdate();
}
catch (SQLException sq) {
	System.out.println("Unable to create a new row." + sq);
} finally {
	pool.putConnection(conn);
}
}
public void remove(int u_id){
	ConnectionPool pool = ConnectionPool.getInstance();
	pool.initialize();
	Connection conn = pool.getConnection();
	try {
		String sql="delete from timetable where u_id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, u_id);
		ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete a row" + sq);
		} finally {
			pool.putConnection(conn);
		}
}
/*public ArrayList<TimeTable> findAllById(int f_id){
	ArrayList<TimeTable> ttablelist = new ArrayList<>();
	ConnectionPool pool = ConnectionPool.getInstance();
	pool.initialize();
	Connection conn = pool.getConnection();
	try {
		String sql = "select * from timetable where f_id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, f_id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
		TimeTable ttable = new TimeTable();
		ttable.setU_id(rs.getInt("u_id"));
		ttable.setF_id(rs.getInt("f_id"));
		ttable.setSub_name(rs.getString("sub_name"));
		ttable.setDept_id(rs.getInt("dept_id"));
		ttablelist.add(ttable);
		}
	}
	 catch (SQLException sq) {
			System.out.println("unable to find the record." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return ttablelist;

	}*/
 public static ArrayList<TimeTable> findAllbyDept(int dept_id){
	 ArrayList<TimeTable> ttablelist = new ArrayList<>();
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select * from timetable where dept_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, dept_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
			TimeTable ttable = new TimeTable();
			ttable.setU_id(rs.getInt("u_id"));
			ttable.setF_id(rs.getInt("f_id"));
			ttable.setSub_name(rs.getString("sub_name"));
			ttable.setDept_id(rs.getInt("dept_id"));
			ttablelist.add(ttable);
			}
		}
		 catch (SQLException sq) {
				System.out.println("unable to find the record." + sq);
			} finally {
				pool.putConnection(conn);
			}
			return ttablelist;

		}
 public ArrayList<Integer> findAllDeptList(int f_id){
	 
     ArrayList<Integer> deptList= new ArrayList<>();
	 ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select distinct dept_id from timetable where f_id=?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, f_id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			deptList.add(rs.getInt("dept_id"));
		} 
 }
		 catch (SQLException sq) {
				System.out.println("unable to find the record." + sq);
			} finally {
				pool.putConnection(conn);
			}
			return deptList;

 }
 public ArrayList<String> findSubList(int f_id , int dept_id){
	 ArrayList<String> subList= new ArrayList<>();
	 ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select sub_name from timetable where f_id=? and dept_id=?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, f_id);
		ps.setInt(2,dept_id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			subList.add(rs.getString("sub_name"));
		} 
}
		catch (SQLException sq) {
			System.out.println("unable to find the record." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return subList;

	 
	 
	 
	 
 }
 /*public static void main(String[] args) {
	 /*ArrayList<String> sublist;
	 TimeTableDao ttdao = new TimeTableDao();
	 sublist = ttdao.findSubList(11,1);
	 for(int i=0 ; i <sublist.size();i++) {
		 System.out.println(sublist.get(i));
		 
	 
	 } 
 }*/
}
