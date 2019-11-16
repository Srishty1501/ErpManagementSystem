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

import ErpMgmtMinor.Dao.DeptDao;
import ErpMgmtMinor.Dao.Midsem_marksDao;
import ErpMgmtMinor.Dao.Student_DetailsDao;
import ErpMgmtMinor.Dao.TimeTableDao;
import ErpMgmtMinor.Pojos.Dept;
import ErpMgmtMinor.Pojos.Faculty_details;
import ErpMgmtMinor.Pojos.Midsem_marks;
import ErpMgmtMinor.Pojos.Student_details;

/**
 * Servlet implementation class UpdateMarksController
 */
@WebServlet("/UpdateMarksController")
public class UpdateMarksController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMarksController() {
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
		// TODO Auto-generated method stub
		HttpSession session= request.getSession();
		int deptId = 0;
		if (request.getParameter("category") != null && request.getParameter("category").trim().length() > 0) {
			 deptId = Integer.parseInt(request.getParameter("category"));
			 session.setAttribute("category", deptId);
			 Dept dept= new Dept();
			 DeptDao deptDao= new DeptDao();
			 dept=deptDao.find(deptId);
			 request.setAttribute("dept", dept);
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
		request.setAttribute("sub", sub);
		}
	String exam=new String();
	if( request.getParameter("exam")!=null &&  request.getParameter("exam").trim().length() > 0 ) {
		exam=request.getParameter("exam");
		
		request.setAttribute("exam",exam);
		}
	String msg=new String();
	String st="updated";
	if(request.getParameter("msg1")!=null && request.getParameter("msg1").trim().length()>0) {
	msg=request.getParameter("msg1");
	System.out.println(msg);
	}
	
	if(deptId!=0) {
	ArrayList<Student_details> studentList = new ArrayList<>();
	Student_DetailsDao student = new Student_DetailsDao();
		  studentList = student.findall(deptId);
		  
		 
		  request.setAttribute("studentList", studentList);	
		  session.setAttribute("studentList", studentList);	
		  RequestDispatcher rd = request.getRequestDispatcher("UpdateMarks.jsp");
			rd.forward(request, response);
			
		}
	if(msg.equals(st)) {
		System.out.println("eeeeeeeeeeeeeee");
		String subject=(request.getParameter("sub")).toString();
		System.out.println(subject);
		String examType=(request.getParameter("examtype")).toString();
		System.out.println(examType);
		int dept_id=(Integer)session.getAttribute("category");
		System.out.println(dept_id);
		ArrayList<Student_details> students;
		students=(ArrayList<Student_details>)session.getAttribute("studentList");
		Midsem_marksDao marksDao=new Midsem_marksDao();
		for(int i=1;i<=students.size();i++) {
        	String str = Integer.toString(i);
        	
        	int marks = Integer.parseInt(request.getParameter(str));
        	System.out.println(marks);
        	String enrollno = request.getParameter("enroll"+str).toString();
        	System.out.println(enrollno);
        	Midsem_marks markscopy = new Midsem_marks(dept_id,enrollno,subject,examType,marks);
        
        	marksDao.create(markscopy);
        	
        	}
		session.setAttribute("msg", "Marks Updated Successfully!!!!!!");
		session.setAttribute("dispatcher","FacultyHomepage.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("SuccessMessage.jsp");
		rd.forward(request, response);
	}
	
	
	
		RequestDispatcher rd = request.getRequestDispatcher("UpdateMarks.jsp");
		rd.forward(request, response);
		
	}
	
	}


