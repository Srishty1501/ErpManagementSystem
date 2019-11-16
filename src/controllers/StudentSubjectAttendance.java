package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ErpMgmtMinor.Dao.AttendanceDao;
import ErpMgmtMinor.Dao.TimeTableDao;
import ErpMgmtMinor.Pojos.Attendance;
import ErpMgmtMinor.Pojos.Student_details;
import ErpMgmtMinor.Pojos.TimeTable;

/**
 * Servlet implementation class StudentSubjectAttendance
 */
@WebServlet("/StudentSubjectAttendance")
public class StudentSubjectAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentSubjectAttendance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String sub = request.getParameter("sub");
		System.out.print(sub);
		Student_details student=new Student_details();
		student=(Student_details)session.getAttribute("Student");
		int s_id=student.getS_id();
		int dept_id=student.getDept_id();
		String fdate = request.getParameter("fDate");
		String tdate = request.getParameter("tDate");
		String p;
		System.out.print(fdate);
		if(sub==null){
			ArrayList<TimeTable> sublist = TimeTableDao.findAllbyDept(dept_id);
			System.out.print(sublist.get(0).getSub_name());
			request.setAttribute("sublist", sublist);
		
			RequestDispatcher rd = request.getRequestDispatcher("ViewStudentSubjectwiseAttendance.jsp");
			rd.forward(request, response);
		}
		else{
		AttendanceDao atten = new AttendanceDao();
		ArrayList<Attendance> attenlist = atten.findAllDateWise(fdate, tdate, s_id, sub);
		for(int i =0;i<attenlist.size();i++){
			if(attenlist.get(i).getLog()==1){
			p = "P";
			attenlist.get(i).setAp(p);
			}
			else
			{
				p="A";
				attenlist.get(i).setAp(p);
			}
			request.setAttribute("attenlist", attenlist);
			request.setAttribute("sub", sub);
			request.setAttribute("fdate", fdate);
			request.setAttribute("tdate", tdate);
			RequestDispatcher rd = request.getRequestDispatcher("ViewSubjectAttendance.jsp");
			rd.forward(request, response);
		}
		}
	}

}
