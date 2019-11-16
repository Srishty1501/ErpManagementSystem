package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ErpMgmtMinor.Dao.DailyRoutineDao;
import ErpMgmtMinor.Dao.DeptDao;
import ErpMgmtMinor.Dao.Student_DetailsDao;
import ErpMgmtMinor.Dao.TimeTableDao;
import ErpMgmtMinor.Pojos.DailyRoutine;
import ErpMgmtMinor.Pojos.Dept;
import ErpMgmtMinor.Pojos.Faculty_details;
import ErpMgmtMinor.Pojos.Student_details;
import Utilities.DateUtils;

/**
 * Servlet implementation class MarkAttendanceController
 */
@WebServlet("/MarkAttendanceController")
public class MarkAttendanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarkAttendanceController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session= request.getSession();
		//Calendar cal=Calendar.getInstance();
		//Date date=cal.getTime();
		String tDate=new String();
		int deptId = 0;
		String message;
		if( (request.getParameter("tDate")!=null &&  request.getParameter("tDate").trim().length() > 0 )&&(request.getParameter("category") != null && request.getParameter("category").trim().length() > 0))
		{    System.out.println("mmmmmmm");
			tDate=request.getParameter("tDate");
			session.setAttribute("tDate", tDate);
			deptId = Integer.parseInt(request.getParameter("category"));
			 session.setAttribute("category", deptId);
			 Dept dept= new Dept();
			 DeptDao deptDao= new DeptDao();
			 dept=deptDao.find(deptId);
			 session.setAttribute("dept", dept);
		}
		
					
		Faculty_details faculty=(Faculty_details)session.getAttribute("Faculty");
		int f_id = faculty.getF_id();
		System.out.println("llll  "+f_id);
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
		
		String[] days={"monday","tuesday","wednesday","thursday","friday","saturday"};
	
		DailyRoutineDao routine = new DailyRoutineDao();
		ArrayList<ArrayList<DailyRoutine>> routinelist = new ArrayList<ArrayList<DailyRoutine>>();
		for(int i=0;i<days.length;i++){
			System.out.println("hahahahahaha"+days[i]);
			System.out.println(f_id);
	 ArrayList<DailyRoutine> dailyroutine = routine.FacultyRoutine(f_id, days[i]);
	
	 DeptDao dep = new DeptDao();
	 for(int k= 0;k<dailyroutine.size();k++){
		 System.out.println("phle  "+dailyroutine.get(k));
		 Dept department = dep.find(dailyroutine.get(k).getDept_id()); 
		 dailyroutine.get(k).setDept_name(department.getDept_name());
		 dailyroutine.get(k).setSemester(department.getSem());
		 dailyroutine.get(k).setSec(department.getSec());
		 System.out.println("bad me  "+dailyroutine.get(k));
	 }
	 routinelist.add(dailyroutine);
	 System.out.println("eeeeeeeeeeeeee"+routinelist.size());
		}
		for(int j=0;j<routinelist.size();j++){
			request.setAttribute(days[j]+"list", routinelist.get(j));
			System.out.println("ooooooooooo"+routinelist.get(j).size());
		}

		
		
		if(deptId!=0) {
			
	ArrayList<String> sublist = ttdao.findSubList(f_id, deptId);
	
	ArrayList<Student_details> studentList = new ArrayList<>();
	Student_DetailsDao student = new Student_DetailsDao();
		  studentList = student.findall(deptId);
		  
		  request.setAttribute("sublist", sublist);
		  request.setAttribute("studentList", studentList);	
		  session.setAttribute("studentList", studentList);	
		  RequestDispatcher rd = request.getRequestDispatcher("MarkAttendance2.jsp");
			rd.forward(request, response);
			
		}
		RequestDispatcher rd = request.getRequestDispatcher("MarkAttendance.jsp");
		rd.forward(request, response);
		
	}

}
