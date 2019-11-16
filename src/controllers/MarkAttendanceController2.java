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
import ErpMgmtMinor.Pojos.Attendance;
import ErpMgmtMinor.Pojos.Student_details;
import Utilities.DateUtils;

/**
 * Servlet implementation class MarkAttendanceController2
 */
@WebServlet("/MarkAttendanceController2")
public class MarkAttendanceController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarkAttendanceController2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String subject = request.getParameter("subject");
		//System.out.println(subject);
		HttpSession session= request.getSession();
		String tDate=session.getAttribute("tDate").toString();
		//System.out.println(tDate);
		java.util.Date dt= DateUtils.convertDate(tDate);
		int dept_id=(Integer)session.getAttribute("category");
		ArrayList<Student_details> students;
		students=(ArrayList<Student_details>)session.getAttribute("studentList");
		int result=0;
        for(int i=1;i<=students.size();i++) {
        	String str = Integer.toString(i);
        	//System.out.println("oooooooooooooooo");
        	int log = Integer.parseInt(request.getParameter(str));
        	//System.out.println(log);
        	int s_id = Integer.parseInt(request.getParameter("enroll"+str));
        	//System.out.println(s_id);
        	Attendance atten = new Attendance(s_id,dept_id,subject,dt,log);
        	AttendanceDao attenDao = new AttendanceDao();
        	 result = attenDao.create(atten);
        	 
        	}
        System.out.println(result);
        if(result==1) {
        	session.setAttribute("msg", "Attendance marked successfully!!!!!!!!!");
        	session.setAttribute("dispatcher","MarkAttendanceController");
        	RequestDispatcher rd= request.getRequestDispatcher("SuccessMessage.jsp");
        	rd.forward(request, response);
        }
        else
        {
        	RequestDispatcher rd=request.getRequestDispatcher("MarkAttendance2.jsp");
        	rd.forward(request, response);
        }
		
		
		
	}

}
