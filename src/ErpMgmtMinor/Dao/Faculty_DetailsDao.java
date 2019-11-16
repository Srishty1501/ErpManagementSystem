package ErpMgmtMinor.Dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ErpMgmtMinor.Pojos.Faculty_details;
import Utilities.ConnectionPool;




public class Faculty_DetailsDao {
	public void create(Faculty_details faculty) throws FileNotFoundException{
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		
		try {
		String sql = "insert into faculty_detail(f_id,f_name,password,dept_name,f_username)values(?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, faculty.getF_id());
		ps.setString(2, faculty.getF_name());
		ps.setString(3,faculty.getPassword());
		ps.setString(4, faculty.getDept_name());
		ps.setString(5, faculty.getF_username());
		
		ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
	}
	public void edit(Faculty_details faculty){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update faculty_deatil set f_name=?,password = ?, dept_name=? , f_username where f_id=?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, faculty.getF_name());
			ps.setString(2,faculty.getPassword());
			ps.setString(3, faculty.getDept_name());
			ps.setString(4, faculty.getF_username());
			ps.setInt(5, faculty.getF_id());
	} catch (SQLException sq) {
		System.out.println("Unable to update a  row." + sq);
	} finally {
		pool.putConnection(conn);
	}
}
	public void remove(int f_id){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
		String sql="delete from faculty_detail where s_id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, f_id);
		ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete a row" + sq);
		} finally {
			pool.putConnection(conn);
		}
	}
public Faculty_details find(int f_id){
	Faculty_details facdetail= new Faculty_details();
	ConnectionPool pool = ConnectionPool.getInstance();
	pool.initialize();
	Connection conn = pool.getConnection();
	try {
		String sql = "select * from faculty_detail where f_id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, f_id);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			facdetail.setF_id(rs.getInt("f_id"));
			facdetail.setF_name(rs.getString("f_name"));
			facdetail.setPassword(rs.getString("password"));
			facdetail.setDept_name(rs.getString("dept_name"));
			facdetail.setF_username(rs.getString("f_username"));
		}
	}
		catch (SQLException sq) {
			System.out.println("Unable find the department of the given faculty id" + sq);
		} finally {
			pool.putConnection(conn);
		}
		return facdetail;
	}
	
public static Faculty_details authenticatefaculty(String f_username, String password){
	Faculty_details Faculty = new Faculty_details();
	int f_id=-1;
	ConnectionPool pool = ConnectionPool.getInstance();
	pool.initialize();
	Connection conn = pool.getConnection();
	try{
		String sql = "select * from faculty_detail where f_username=? and password=?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,f_username);
		ps.setString(2,password);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			f_id=rs.getInt("f_id");
			Faculty.setF_id(f_id);
			Faculty.setF_name(rs.getString("f_name"));
			Faculty.setDept_name(rs.getString("dept_name"));
			Faculty.setF_username(f_username);
			Faculty.setPassword(password);
			Faculty.setYearOfJoining(rs.getString("yearofjoining"));
			Faculty.setEmail(rs.getString("email"));
			Faculty.setPhone(rs.getString("phoneno"));
			Faculty.setDob(rs.getString("dob"));
			
			
		}
	}
	catch(SQLException sq) {
		System.out.println("unable to find the records." + sq);
	} finally {
		pool.putConnection(conn);
	}
	return Faculty;	
	}
 
public static void main(String[] args) {
	/*Faculty_details faculty= new Faculty_details(2,"Prof Keya Arunakar","23451","CSE","keya01");*/
	/*Faculty_DetailsDao fac = new Faculty_DetailsDao();
	//fac.create(faculty);
	Faculty_details faculty;
	faculty=fac.authenticatefaculty("keya01", "23451");
	System.out.println(faculty.getF_name());*/
	
	
}


		}
