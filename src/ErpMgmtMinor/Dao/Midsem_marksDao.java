package ErpMgmtMinor.Dao;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ErpMgmtMinor.Pojos.Midsem_marks;
import Utilities.ConnectionPool;


public class Midsem_marksDao {
	public void create(Midsem_marks marks){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		System.out.println(marks.getExam()+"hiiiiiiii");
		try {
			String sql = "insert into midsem_marks(dept_id,enrollno,sub_name,exam,marks) values(?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, marks.getDept_id());
			ps.setString(2, marks.getEnrollno());
			ps.setString(3, marks.getSub_name());
			ps.setString(4,marks.getExam());
			ps.setInt(5, marks.getMarks());
			ps.executeUpdate();
			
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public ArrayList<Midsem_marks> findmarks(int dept_id, String enrollno,String exam){
		ArrayList<Midsem_marks> markslist = new ArrayList<>();
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
		String sql = "select sub_name, marks from midsem_marks where dept_id=? and enrollno=? and exam =? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, dept_id);
		ps.setString(2, enrollno);
		ps.setString(3, exam);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Midsem_marks marks =new Midsem_marks();
			marks.setSub_name(rs.getString("sub_name"));
			marks.setMarks(rs.getInt("marks"));
			markslist.add(marks);
		}
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return markslist;
	}

	
	
}
