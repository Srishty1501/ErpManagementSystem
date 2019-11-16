package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ErpMgmtMinor.Dao.Admin_detailDao;
import ErpMgmtMinor.Dao.DeptDao;
import ErpMgmtMinor.Dao.Faculty_DetailsDao;
import ErpMgmtMinor.Dao.Student_DetailsDao;
import ErpMgmtMinor.Pojos.Admin_detail;
import ErpMgmtMinor.Pojos.Dept;
import ErpMgmtMinor.Pojos.Faculty_details;
import ErpMgmtMinor.Pojos.Student_details;

/**
 * Servlet implementation class loginmember
 */
@WebServlet("/loginmember")
public class loginmember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginmember() {
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
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String category = request.getParameter("category");
		String str1=new String("faculty");
		String str2=new String("student");
		String str3=new String("admin");
		String message;
		if((login==null|| login.trim().length()==0)&&(password == null || password.trim().length()==0) && (category==null || category.trim().length()==0)){
		message="not filled";
		request.setAttribute("message",message);
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		rd.forward(request, response);
		} 
		else {
		if(category.equals(str1))
		{
			Faculty_details Faculty;
		 Faculty = Faculty_DetailsDao.authenticatefaculty(login, password);
		 System.out.println(Faculty.getEmail());
		if (Faculty.getF_id() != -1) {
			
			HttpSession session = request.getSession();
			session.setAttribute("Faculty", Faculty);
			session.setAttribute("type", str1);
			
			response.sendRedirect("FacultyHomepage.jsp");

		}
		 else {
				response.sendRedirect("Login.html");
			}

	}
		else if(category.equals(str2))
		{
			Student_details student;
		 student = Student_DetailsDao.authenticatestudent(login, password);
		if (student.getS_id()!= -1) {
			DeptDao dept=new DeptDao();
			Dept department;
			department=dept.find(student.getDept_id());
			HttpSession session = request.getSession();
			session.setAttribute("s_id", student.getS_id());
			session.setAttribute("Student",student);
		    session.setAttribute("DepartmentAdmin", department);
			session.setAttribute("type", str2);
			
			
			
			response.sendRedirect("StudentHomepage.jsp");

		}
		 else {
				response.sendRedirect("Login.html");
			}

	}
		else
		{
			Admin_detail admin;
			admin=Admin_detailDao.authenticateAdmin(login, password);
			if(admin.getA_id()!=-1) {
				HttpSession session = request.getSession();
				session.setAttribute("Admin", admin);
				session.setAttribute("type", str3);	
				response.sendRedirect("AdminHomepage.jsp");
			}
			 else {
					response.sendRedirect("Login.html");
				}
			
		}
		
		}

	}

	public static void main(String[] args) {
	}

	}


