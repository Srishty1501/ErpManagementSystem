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

/**
 * Servlet implementation class StudentTotalAttendance
 */
@WebServlet("/StudentTotalAttendance")
public class StudentTotalAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentTotalAttendance() {
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
		String sdate = request.getParameter("fDate");
		System.out.print(sdate);
		String edate = request.getParameter("tDate");
		HttpSession session=request.getSession();
		Student_details student=(Student_details)session.getAttribute("Student");
		int s_id=student.getS_id();
		int deptId=student.getDept_id();
		System.out.print(edate);
		long total=0,present=0;
		float percentage=0,avg=0;
		if(sdate!=null && edate!=null){
	   AttendanceDao atten  = new AttendanceDao();
	   Attendance at = new Attendance();
		ArrayList<Attendance> sublist = atten.findTotal(s_id);
		System.out.print(sublist.get(0).getSub_name());
		for(int i=0;i<sublist.size();i++){ 
			System.out.print(sublist.get(i).getSub_name());
		at= atten.sumAllDateWise(sdate,edate,deptId ,s_id ,sublist.get(i).getSub_name());
		System.out.print(at.getSum());
		present= at.getSum();
		System.out.println(present);
		total = at.getDaycount();
		System.out.print(total);
		percentage = (present/total)*100;
		System.out.print(percentage);
		sublist.get(i).setTotatten(percentage);
			}
		System.out.print(sublist.get(0).getTotatten());
		for(int j=0;j<sublist.size();j++){
		avg+=sublist.get(j).getTotatten();	}
		percentage= avg/sublist.size();
	     request.setAttribute("sublist", sublist);
	     request.setAttribute("totpercentage", percentage);
	     request.setAttribute("fdate", sdate);
	     request.setAttribute("tdate", edate);
		}	
		RequestDispatcher rd = request.getRequestDispatcher("ViewTotalAttendanceStudent.jsp");
		rd.forward(request,response);
		}
	}


