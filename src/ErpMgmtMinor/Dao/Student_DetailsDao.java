package ErpMgmtMinor.Dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ErpMgmtMinor.Pojos.Student_details;
import Utilities.ConnectionPool;

public class Student_DetailsDao {
	public int create(Student_details student){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		int t=-1;
		try {
			t=0;
			 File image = new File(student.getImg());
	            FileInputStream inputStream = new FileInputStream(image);
	            InputStream ins = (InputStream) inputStream;
	            
			String sql = "insert into stud_detail (s_name, password,dept_id,sem,email,phoneno , dob, enrollno,image,10CGPA,12PER,fathername,fathersphoneno ,peraddress, localaddress,  category) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, student.getS_name());
			ps.setString(2,student.getPassword());
			ps.setInt(3, student.getDept_id());
			
			ps.setString(4, student.getSem());
			ps.setString(5, student.getEmail());
			ps.setString(6, student.getPhoneno());
			ps.setString(7, student.getDob());
			ps.setString(8, student.getEnrollno());
			ps.setBinaryStream(9, ins , (int)(image.length()));
			ps.setString(10, student.getMarks10());
			ps.setString(11, student.getMarks12());
			ps.setString(12,student.getFathername());
			ps.setString(13, student.getFatherphoneno());
			ps.setString(14, student.getPeraddress());
			ps.setString(15, student.getLocaddress());
			ps.setString(16, student.getCategory());
			ps.executeUpdate();
		} catch (SQLException sq) {
			t=1;
			System.out.println("Unable to create a new row" + sq);
		} catch (FileNotFoundException ex) {
			System.out.println("file not found" + ex);
		}
		
		finally {
			pool.putConnection(conn);
		}
		return t;
	}


	public void edit(Student_details student){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update student_deatil set s_name=?,password = ?, dept_id=?, sem=?, email=?,phoneno=?,dob=?,enrollno=? where s_id=?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, student.getS_name());
			ps.setString(2,student.getPassword());
			ps.setInt(3, student.getDept_id());
			ps.setString(4, student.getSem());
			ps.setString(5, student.getEmail());
			
			ps.setString(6, student.getPhoneno());
			ps.setString(7, student.getDob());
			ps.setString(8, student.getEnrollno());
			ps.setInt(9, student.getS_id());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to update a  row." + sq);
		} finally {
			pool.putConnection(conn);
		}
	}
		public void remove(int s_id){
			ConnectionPool pool = ConnectionPool.getInstance();
			pool.initialize();
			Connection conn = pool.getConnection();
			try {
			String sql="delete from student_detail where s_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, s_id);
			ps.executeUpdate();
			} catch (SQLException sq) {
				System.out.println("Unable to delete a row" + sq);
			} finally {
				pool.putConnection(conn);
			}
		}
		public  Student_details find(int s_id){
			ConnectionPool pool = ConnectionPool.getInstance();
			pool.initialize();
			Connection conn = pool.getConnection();
			Student_details student = new Student_details();
			try {
			String sql="select * from stud_detail where s_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, s_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
			student.setS_id(s_id);
			student.setS_name(rs.getString("s_name"));
		    student.setPassword(rs.getString("password"));
		    student.setDept_id(rs.getInt("dept_id"));
		    student.setSem(rs.getString("sem"));
		    student.setEmail(rs.getString("email"));
		    student.setPhoneno(rs.getString("phoneno"));
		    student.setDob(rs.getString("dob"));
		    student.setEnrollno(rs.getString("enrollno"));
		    student.setMarks10(rs.getString("10CGPA"));
		    student.setMarks12(rs.getString("12PER"));
		    student.setFathername(rs.getString("fathername"));
		    student.setFatherphoneno(rs.getString("fathersphoneno"));
		    student.setLocaddress(rs.getString("localaddress"));
		    student.setPeraddress(rs.getString("peraddress"));
		    student.setCategory(rs.getString("category"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return student;
		
		}
		public ArrayList<Student_details> findall(int dept_id){
			ConnectionPool pool = ConnectionPool.getInstance();
			pool.initialize();
			Connection conn = pool.getConnection();
			ArrayList<Student_details> studentlist = new ArrayList<>();
			try{
				String sql = "select * from stud_detail where dept_id=? ";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, dept_id);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					Student_details student = new Student_details();
					student.setS_id(rs.getInt("s_id"));
					student.setS_name(rs.getString("s_name"));
				    student.setPassword(rs.getString("password"));
				    student.setDept_id(rs.getInt("dept_id"));
				    student.setSem(rs.getString("sem"));
				    student.setEmail(rs.getString("email"));
				    student.setPhoneno(rs.getString("phoneno"));
				    student.setDob(rs.getString("dob"));
				    student.setEnrollno(rs.getString("enrollno"));
				    student.setMarks10(rs.getString("10CGPA"));
				    student.setMarks12(rs.getString("12PER"));
				    student.setFathername(rs.getString("fathername"));
				    student.setFatherphoneno(rs.getString("fathersphoneno"));
				    student.setLocaddress(rs.getString("localaddress"));
				    student.setPeraddress(rs.getString("peraddress"));
				    student.setCategory(rs.getString("category"));
				    studentlist.add(student);
				}
			} catch (SQLException sq) {
				System.out.println("unable to find the records." + sq);
			} finally {
				pool.putConnection(conn);
			}
			return studentlist;
		}
	public static Student_details authenticatestudent(String enrollno, String password){
		Student_details student = new Student_details();
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try{
			String sql = "select * from stud_detail where enrollno=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, enrollno);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				student.setS_id(rs.getInt("s_id"));
				student.setS_name(rs.getString("s_name"));
			    student.setPassword("password");
			    student.setDept_id(rs.getInt("dept_id"));
			    student.setSem(rs.getString("sem"));
			    student.setEmail(rs.getString("email"));
			    student.setPhoneno(rs.getString("phoneno"));
			    student.setDob(rs.getString("dob"));
			    student.setPassword("enrollno");
			}
		}
		catch(SQLException sq) {
			System.out.println("unable to find the records." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return student;	
		}
	public void sendSms(ArrayList<Student_details> studentlist) {
		try {
			// Construct data
			for(int i=0;i<studentlist.size();i++){
			String apiKey = "apikey=" + "FwhjjmtZIs8-PJMxuSZu3oinZNLEET5w3dpHF9V7pM";
			String message = "&message=" + studentlist.get(i).getS_name()+",your total attendance is"+studentlist.get(i).getPercent();
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + studentlist.get(i).getPhoneno();
			System.out.print(message);
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			System.out.print(data);
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			System.out.print(stringBuffer.toString());
			}
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
		}
	}
	public ArrayList<Student_details> StudentPhoneno(int dept_id){
		ArrayList<Student_details> studentlist = new ArrayList<>();
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try{
			String sql = "select distinct s_id, s_name,enrollno,phoneno from stud_detail where dept_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, dept_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Student_details student = new Student_details();
				student.setS_id(rs.getInt("s_id"));
				student.setS_name(rs.getString("s_name"));
				student.setEnrollno(rs.getString("enrollno"));
				student.setPhoneno(rs.getString("phoneno"));
				studentlist.add(student);
			}
		}
		catch (SQLException sq) {
			System.out.println("unable to find the records." + sq);
		}
		finally {
			pool.putConnection(conn);
		}
		return studentlist;
	}
	public static void main(String args[]) {
	/*System.out.print("hello");	
	stud_details student = new stud_details(1,"srishty", "hgg",2,"cefe","fc",23434,"erefe");
	Student_detailDao stud = new Student_detailDao();
	stud.create(student);*/
		/*Student_details student = new Student_details();
		Student_DetailsDao stud = new Student_DetailsDao();
		student=stud.authenticatestudent(1, "hgg");
		System.out.println(student.getS_name());*/
	}


}