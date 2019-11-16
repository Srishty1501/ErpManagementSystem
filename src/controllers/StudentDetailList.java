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
import ErpMgmtMinor.Dao.Student_DetailsDao;
import ErpMgmtMinor.Pojos.Student_details;

/**
 * Servlet implementation class StudentDetailList
 */
@WebServlet("/StudentDetailList")
public class StudentDetailList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDetailList() {
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
	String dept=request.getParameter("dept");
	String sem=request.getParameter("sem");
	String sec=request.getParameter("sec");
	
	int deptId;
	if((dept!=null)&&(sem!=null)&&(sec!=null)) {
		String dept1=dept.toUpperCase();
		String sem1=sem.toUpperCase();
		String sec1=sec.toUpperCase();
		DeptDao deptDao=new DeptDao();
		deptId=deptDao.findDepid(dept, sec, sem);
		ArrayList<Student_details> studentList= new ArrayList<>();
		Student_DetailsDao studentDao = new Student_DetailsDao();
		studentList=studentDao.findall(deptId);
		session.setAttribute("dept2", dept1);
		session.setAttribute("sec2", sec1);
		session.setAttribute("sem2", sem1);
		
		session.setAttribute("studentDetailList1",studentList);
		RequestDispatcher rd= request.getRequestDispatcher("StudentDetailList.jsp");
		rd.forward(request, response);
		
	}
	RequestDispatcher rd= request.getRequestDispatcher("StudentDetailList.jsp");
	rd.forward(request, response);
	}

}
