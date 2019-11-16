package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ErpMgmtMinor.Dao.Faculty_DetailsDao;
import ErpMgmtMinor.Pojos.Faculty_details;

/**
 * Servlet implementation class RegisterFacultyController
 */
@WebServlet("/RegisterFacultyController")
public class RegisterFacultyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterFacultyController() {
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
		String username = request.getParameter("f_username");
		String fname = request.getParameter("f_name");
		String password = request.getParameter("password");
		String dept_name =request.getParameter("dept_name");
		String phone = request.getParameter("phoneno");
		String email = request.getParameter("email");
		String yearofjoining = request.getParameter("yearofjoining");
		String dob = request.getParameter("dob");
		String message;
		HttpSession session = request.getSession();
		if((username!=null&&username.trim().length()>0)&& (fname!=null&&fname.trim().length()>0) && (password!= null&&password.trim().length()>0) && (dept_name!= null&& dept_name.trim().length()>0) && (phone!= null&& phone.trim().length()>0) && (email!=null&&email.trim().length()>0) && (yearofjoining!=null&&yearofjoining.trim().length()>0) &&(dob!=null&&dob.trim().length()>0)) {
			Faculty_details faculty  = new Faculty_details(username, fname, password, dept_name,yearofjoining, email, phone,dob );
			Faculty_DetailsDao fac = new Faculty_DetailsDao();
	fac.create(faculty);
			session.setAttribute("msg", "Faculty Registered Successfully!!!!!!!!!");
			session.setAttribute("dispatcher", "RegisterFacultyController");
	}
		else
		{ 
			message="notfilled";
			request.setAttribute("register", message);
			RequestDispatcher rd = request.getRequestDispatcher("RegisterFaculty.jsp");
			rd.forward(request,response);
		}
	}

}
