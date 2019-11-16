package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ErpMgmtMinor.Dao.DeptDao;
import ErpMgmtMinor.Dao.Student_DetailsDao;
import ErpMgmtMinor.Pojos.Dept;
import ErpMgmtMinor.Pojos.Student_details;

/**
 * Servlet implementation class StudentDetail
 */
@WebServlet("/StudentDetail")
public class StudentDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDetail() {
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
	
		int sId=Integer.parseInt(request.getParameter("student"));
		Student_DetailsDao studDao = new Student_DetailsDao();
		Student_details student;
		student=studDao.find(sId);
		int deptId=student.getDept_id();
		DeptDao deptdao= new DeptDao();
		Dept dept;
		dept=deptdao.find(deptId);
		request.setAttribute("department", dept);
		request.setAttribute("student", student);
		RequestDispatcher rd= request.getRequestDispatcher("StudentInfo.jsp");
		rd.forward(request,response);
		
	}

}
