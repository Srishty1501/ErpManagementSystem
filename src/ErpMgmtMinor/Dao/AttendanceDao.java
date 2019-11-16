 package ErpMgmtMinor.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ErpMgmtMinor.Pojos.Attendance;
import Utilities.ConnectionPool;
import Utilities.DateUtils;

public class AttendanceDao {
	public int create(Attendance atten){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into attendance(s_id,dept_id,sub_name,date,log) values(?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,atten.getS_id());
			ps.setInt(2, atten.getDept_id());
			ps.setString(3,atten.getSub_name());
			java.sql.Date dt = new java.sql.Date(atten.getDate().getTime());
			ps.setDate(4, dt);
			ps.setInt(5,atten.getLog());
			ps.executeUpdate();
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
			return -1;
		} finally {
			pool.putConnection(conn);
		}
		return 1;
	}
	public void update(Attendance atten){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql="update attendance set log=? where s_id=? and dept_id=? and sub_name=? and date=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,atten.getLog());
			ps.setInt(2, atten.getS_id());
			ps.setInt(3, atten.getDept_id());
			ps.setString(4, atten.getSub_name());
			java.sql.Date dt = new java.sql.Date(atten.getDate().getTime());
			ps.setDate(5, dt);
			ps.executeUpdate();	
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
	}
	public ArrayList<Attendance> findAllDateWise(String sdate,String edate, int s_id, String sub_name){
		ArrayList<Attendance> attenlist = new ArrayList<>();
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
		String sql = "select * from attendance where s_id=? and sub_name=? and date between ? and ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, s_id);
		ps.setString(2,sub_name);
		java.util.Date dt = DateUtils.convertDate(sdate);
		ps.setDate(3, new java.sql.Date(dt.getTime()));
		java.util.Date dt1 = DateUtils.convertDate(edate);
		ps.setDate(4, new java.sql.Date(dt1.getTime()));
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Attendance atten  = new Attendance();
			atten.setS_id(rs.getInt("s_id"));
			atten.setDept_id(rs.getInt("dept_id"));
			atten.setSub_name(rs.getString("sub_name"));
			java.sql.Date dt2 = rs.getDate("date");
			atten.setDate(new java.util.Date(dt2.getTime()));
			atten.setLog(rs.getInt("log"));
			attenlist.add(atten);
		}
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return attenlist;
	}
	public ArrayList<Attendance> findTotal(int s_id,String sdate,String edate){
		ArrayList<Attendance> attenlist = new ArrayList<>();
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try{
			String sql = "select * from attendance where s_id=?  and date between ? and ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, s_id);
		
			java.util.Date dt = DateUtils.convertDate(sdate);
			ps.setDate(3, new java.sql.Date(dt.getTime()));
			java.util.Date dt1 = DateUtils.convertDate(edate);
			ps.setDate(4, new java.sql.Date(dt1.getTime())); 
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Attendance atten  = new Attendance();
				atten.setS_id(rs.getInt("s_id"));
				atten.setDept_id(rs.getInt("dept_id"));
				atten.setSub_name(rs.getString("sub_name"));
				java.sql.Date dt2 = rs.getDate("date");
				java.util.Date dt3 = new java.util.Date(dt2.getTime());
				atten.setDate(dt3);
				atten.setLog(rs.getInt("log"));
				attenlist.add(atten);
			}
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return attenlist;
	}
	public ArrayList<Attendance> report(String date,int dept_id, String sub ){
		ArrayList<Attendance> attenlist = new ArrayList<>();
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try{
			String sql = "select * from attendance where dept_id=? and sub_name=? and date=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, dept_id);
		   ps.setString(2,sub);
			java.util.Date dt = DateUtils.convertDate(date);
			ps.setDate(3, new java.sql.Date(dt.getTime()));
			 
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Attendance atten  = new Attendance();
				atten.setS_id(rs.getInt("s_id"));
				atten.setDept_id(rs.getInt("dept_id"));
				atten.setSub_name(rs.getString("sub_name"));
				java.sql.Date dt2 = rs.getDate("date");
				java.util.Date dt3 = new java.util.Date(dt2.getTime());
				atten.setDate(dt3);
				atten.setLog(rs.getInt("log"));
				attenlist.add(atten);
			}
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return attenlist;
		
		
	}
	public ArrayList<Attendance> allStudentWise( int dept_id, int s_id){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Attendance> attenlist = new ArrayList<>();
		try {
		String sql = "select count(log), sum(log)  from attendance where dept_id=? and s_id=? group by sub_name";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, dept_id); 
		ps.setInt(2, s_id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
		Attendance atten = new Attendance();
		atten.setDaycount(rs.getInt(1));
		atten.setSum(rs.getInt(2));
		attenlist.add(atten);
		}
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return attenlist;
	}
	public ArrayList<Attendance> findTotal(int s_id){
		ArrayList<Attendance> sublist = new ArrayList<>();
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try{
			String sql = "select distinct sub_name from attendance where s_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, s_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Attendance atten = new Attendance();
	            atten.setSub_name(rs.getString("sub_name"));
	            sublist.add(atten);
			}
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);            
		}
		return sublist;
	}
	
	public Attendance sumAllDateWise(String sdate,String edate, int dept_id, int s_id, String sub_name){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Attendance atten = new Attendance();
		try {
		String sql = "select count(log), sum(log) from attendance where dept_id=? and s_id=? and sub_name=? and date between ? and ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, dept_id); 
		ps.setInt(2, s_id);
		ps.setString(3,sub_name);
		java.util.Date dt = DateUtils.convertDate(sdate);
		ps.setDate(4, new java.sql.Date(dt.getTime()));
		java.util.Date dt1 = DateUtils.convertDate(edate);
		ps.setDate(5, new java.sql.Date(dt1.getTime()));
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
		atten.setDaycount(rs.getInt(1));
		atten.setSum(rs.getInt(2));
		
		}
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return atten;
	}

}
