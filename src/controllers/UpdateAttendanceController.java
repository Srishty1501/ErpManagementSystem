package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ErpMgmtMinor.Dao.AttendanceDao;
import ErpMgmtMinor.Dao.DeptDao;
import ErpMgmtMinor.Dao.Student_DetailsDao;
import ErpMgmtMinor.Dao.TimeTableDao;
import ErpMgmtMinor.Pojos.Attendance;
import ErpMgmtMinor.Pojos.Dept;
import ErpMgmtMinor.Pojos.Faculty_details;
import ErpMgmtMinor.Pojos.Student_details;
import Utilities.DateUtils;

/**
 * Servlet implementation class UpdateAttendanceController
 */
@WebServlet("/UpdateAttendanceController")
public class UpdateAttendanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAttendanceController() {
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
		HttpSession session= request.getSession();
		String tDate=new String();
		
		String msg=new String();
		if(request.getParameter("msg")!=null && request.getParameter("msg").trim().length()>0) {
			msg=request.getParameter("msg");
		}
		if( request.getParameter("tDate")!=null &&  request.getParameter("tDate").trim().length() > 0 )
		{
			tDate=request.getParameter("tDate");
			session.setAttribute("tDate", tDate);
		}
		int deptId = 0;
		if (request.getParameter("category") != null && request.getParameter("category").trim().length() > 0) {
			 deptId = Integer.parseInt(request.getParameter("category"));
			 session.setAttribute("category", deptId);
			 Dept dept= new Dept();
			 DeptDao deptDao= new DeptDao();
			 dept=deptDao.find(deptId);
			 session.setAttribute("dept", dept);
			 }
		Faculty_details faculty=(Faculty_details)session.getAttribute("Faculty");
		int f_id = faculty.getF_id();
	
		TimeTableDao ttdao = new TimeTableDao();
		ArrayList<Integer> deptList = ttdao.findAllDeptList(f_id);
		ArrayList<Dept> deptlist = new ArrayList<>();
		for(int i=0;i<deptList.size();i++) {
			Dept dept;
			DeptDao deptDao= new DeptDao();
			dept=deptDao.find(deptList.get(i));
			deptlist.add(dept);
			}
		request.setAttribute("deptlist", deptlist);
	String sub=new String();
	if( request.getParameter("subject")!=null &&  request.getParameter("subject").trim().length() > 0 ) {
		sub=request.getParameter("subject").toUpperCase();
		session.setAttribute("sub", sub);
		}
	
	if(deptId!=0) {
		
		
		ArrayList<Attendance> atten=new ArrayList<>();
		AttendanceDao attenDao= new AttendanceDao();
		atten=attenDao.report(tDate, deptId, sub);
		//ArrayList<Student_details> studentList = new ArrayList<>();
		HashMap<Student_details, String> report=new HashMap<>();
		Student_DetailsDao student = new Student_DetailsDao();
			for(int i=0; i<atten.size(); i++) {
				Student_details stud;
				System.out.println(atten.get(i).getS_id());
				stud=student.find(atten.get(i).getS_id());
				int log=atten.get(i).getLog();
				if(log==1)
				report.put(stud,"P");
				else
					report.put(stud,"A");
					
		}
			
			
	//System.out.println(report.entrySet().toArray()[0]);
			
			  
			  
			  request.setAttribute("report", report);	
			  session.setAttribute("atten", atten);
			 
			  RequestDispatcher rd = request.getRequestDispatcher("UpdateAttendance.jsp");
				rd.forward(request, response);
				
			}
	String edit="edited";
		if(msg.equals(edit)) {
			String tDate1=session.getAttribute("tDate").toString();
			java.util.Date dt= DateUtils.convertDate(tDate1);
			int dept_id=(Integer)session.getAttribute("category");
			String subject=session.getAttribute("sub").toString();
			ArrayList<Attendance> atten1;
			atten1=(ArrayList<Attendance>)session.getAttribute("atten");
			for(int i=1;i<=atten1.size();i++) {
	        	String str = Integer.toString(i);
	        	int log=-1;
	        	String log1=request.getParameter(str);
	        	if(log1.startsWith("P")) {
	        		 log=1;
	        	}
	        	else {
	        		 log=0;
	        	}
	        	
	        	int s_id = Integer.parseInt(request.getParameter("enroll"+str));
	        	Attendance attendance = new Attendance(s_id,dept_id,subject,dt,log);
	        	AttendanceDao attenDao = new AttendanceDao();
	        	attenDao.update(attendance);
	        	}
			session.setAttribute("msg", "Attendance Updated Successfully!!!!!!");
			session.setAttribute("dispatcher","FacultyHomepage.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("SuccessMessage.jsp");
			rd.forward(request, response);
		}
		RequestDispatcher rd = request.getRequestDispatcher("UpdateAttendance.jsp");
		rd.forward(request, response);
		}	
		
	
	}


