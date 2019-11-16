package ErpMgmtMinor.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ErpMgmtMinor.Pojos.DailyRoutine;
import Utilities.ConnectionPool;

public class DailyRoutineDao {
	public void create(DailyRoutine routine){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql="insert into daily_routine(dept_id,day,f_id,lecture,sub_name) values(?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1, routine.getDept_id());
			ps.setString(2, routine.getDay());
			ps.setInt(3,routine.getF_id());
			ps.setInt(4,routine.getLecture());
			ps.setString(5,routine.getSub_name());
			ps.executeUpdate();
		}
		catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}

		}
	public ArrayList<DailyRoutine> FacultyRoutine(int f_id, String day){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<DailyRoutine> routine = new ArrayList<>();
		try {
			String sql = "select dept_id,lecture, sub_name from daily_routine where f_id=? and day=?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1, f_id);
			ps.setString(2, day);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				DailyRoutine daily = new DailyRoutine();
				daily.setDept_id(rs.getInt("dept_id"));
				daily.setLecture(rs.getInt("lecture"));
				daily.setSub_name(rs.getString("sub_name"));
				daily.setDay(day);
				daily.setF_id(f_id);
				routine.add(daily);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return routine;
		
	}
	public static void main(String args[]){
		/*String[] days={"mon"};
		int f_id = 1;
		DailyRoutineDao routine = new DailyRoutineDao();
		ArrayList<ArrayList<DailyRoutine>> routinelist = new ArrayList<ArrayList<DailyRoutine>>();
		for(int i=0;i<days.length;i++){
	 ArrayList<DailyRoutine> dailyroutine = routine.FacultyRoutine(f_id, days[i]);
	 routinelist.add(dailyroutine);
		}
		for(int j =0;j<routinelist.size();j++){
			System.out.print(days[j]+"list");
			System.out.print(routinelist.get(j).get(j).getLecture());
			System.out.print(routinelist.get(j).get(j).getSub_name());
		}*/
	}
}
