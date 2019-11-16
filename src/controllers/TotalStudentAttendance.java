
 package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ErpMgmtMinor.Dao.AttendanceDao;
import ErpMgmtMinor.Dao.DeptDao;
import ErpMgmtMinor.Dao.Student_DetailsDao;
import ErpMgmtMinor.Pojos.Attendance;
import ErpMgmtMinor.Pojos.Student_details;

/**
 * Servlet implementation class TotalStudentAttendance
 */
@WebServlet("/TotalStudentAttendance")
public class TotalStudentAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TotalStudentAttendance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dept_name = request.getParameter("dept_name" ).toUpperCase();
		String sem = request.getParameter("sem").toLowerCase();
		String sec = request.getParameter("sec").toUpperCase();
	
		if((dept_name!=null&&dept_name.trim().length()>0) && (sem!=null&&sem.trim().length()>0) && (sec!=null&&sec.trim().length()>0)){
		DeptDao deptid = new DeptDao();
		int dept_id = deptid.findDepid(dept_name, sec, sem);
		int present=0,total=0;
		float percentage=0;
		ArrayList<Attendance> attenlist = new ArrayList<>();
		Student_DetailsDao stud = new Student_DetailsDao();
		AttendanceDao atten  = new AttendanceDao();
		ArrayList<Student_details>  studentlist = stud.findall(dept_id);
		for(int i=0;i<studentlist.size();i++){
			ArrayList<Float> subatten = new ArrayList<>();
			float avg=0;
			attenlist = atten.allStudentWise(dept_id, studentlist.get(i).getS_id());
			for(int j=0;j<attenlist.size();j++){
				present = attenlist.get(j).getSum();
				total = attenlist.get(j).getDaycount();
				percentage = (present/total)*100;
				subatten.add(percentage);
				}
			for(int k=0;k<subatten.size();k++){
				avg+=subatten.get(k);
			}
			percentage= avg/subatten.size();
		
			studentlist.get(i).setPercent(percentage);
		}
		request.setAttribute("studentlist", studentlist);
		request.setAttribute("dept", dept_name);
		request.setAttribute("sec", sec);
		request.setAttribute("sem", sem);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("ViewAllStudentAttendance.jsp");
		rd.forward(request, response);
	}

}
