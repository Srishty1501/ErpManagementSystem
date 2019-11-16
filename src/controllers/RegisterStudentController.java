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
import ErpMgmtMinor.Pojos.Student_details;

/**
 * Servlet implementation class RegisterStudentController
 */
@WebServlet("/RegisterStudentController")
public class RegisterStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterStudentController() {
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
		System.out.println("hiiiii");
		String enrollno = request.getParameter("enroll");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String deptName = request.getParameter("dept_name" );
		String phone = request.getParameter("phoneno");
		String email = request.getParameter("email");
		String sem = request.getParameter("sem" );
		String sec = request.getParameter("sec" );
		String dob = request.getParameter("dob" );
		String marks10 = request.getParameter("marks10");
		String marks12 = request.getParameter("marks12");
		String fathername = request.getParameter("fathername");
		String fatherphoneno = request.getParameter("fatherphoneno");
		String peraddress=request.getParameter("peraddress");
		String locaddress = request.getParameter("locaddress");
		String category = request.getParameter("category");
		String image=request.getParameter("image");
		String image1="E:\\"+image;
		
		HttpSession session = request.getSession();
		String message;
		if((enrollno!= null&& enrollno.trim().length()>0) && (name!=null && name.trim().length()>0) &&( password!= null && password.trim().length()>0) && (deptName!= null && deptName.trim().length()>0) && (phone!= null&&phone.trim().length()>0) && (email!=null && email.trim().length()>0) && (sem!=null && sem.trim().length()>0) &&(dob!=null && dob.trim().length()>0)) {
		 System.out.println("helooooooo");
			DeptDao dept = new DeptDao();
			String deptName2=deptName.toUpperCase();
			String sec2=sec.toUpperCase();
		
			int dept_id=dept.findDepid(deptName2, sec2, sem);
			System.out.println(name);
			System.out.println(password);
			System.out.println(dept_id);
			System.out.println(sem);
			System.out.println(email);
			System.out.println(phone);
			System.out.println(dob);
			System.out.println(enrollno);
			System.out.println(marks10);
			System.out.println(marks12);
			System.out.println(fathername);
			System.out.println(fatherphoneno);
			System.out.println(peraddress);
			System.out.println(locaddress);
			System.out.println(category);
			System.out.println(image1);
			
			Student_details student  = new Student_details(name, password, dept_id,sem, email, phone,dob,enrollno,marks10,marks12,fathername,fatherphoneno,peraddress,locaddress,category,image1);
			Student_DetailsDao stud = new Student_DetailsDao();
			int t= stud.create(student);
			if(t==0){
				message="successful";
			request.setAttribute("register",message);
			session.setAttribute("msg", "Student Registered Successfully");
			session.setAttribute("dispatcher", "RegisterStudentController");
			RequestDispatcher rd = request.getRequestDispatcher("SuccessMessageAdmin.jsp");
			rd.forward(request,response);
		
			
			}
			else{
				message="unsuccessful";
				request.setAttribute("register",message);
				RequestDispatcher rd = request.getRequestDispatcher("RegisterStudent.jsp");
				rd.forward(request,response);
			
			}
			}
		else
		{ 
			message="notfilled";
			request.setAttribute("register", message);
			RequestDispatcher rd = request.getRequestDispatcher("RegisterStudent.jsp");
			rd.forward(request,response);
		}
			
		
	}



	

}
