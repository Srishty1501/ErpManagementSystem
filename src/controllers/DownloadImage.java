package controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ErpMgmtMinor.Dao.RetriveImage;
import ErpMgmtMinor.Pojos.Faculty_details;
import Utilities.ConnectionPool;

/**
 * Servlet implementation class DownloadImage
 */
@WebServlet("/DownloadImage")
public class DownloadImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException{
		HttpSession session= request.getSession();
	ServletOutputStream sos = null;
	String type=session.getAttribute("type").toString();
	System.out.println(type);
	String str1=new String("faculty");
	String str2=new String("student");
	String str3=new String("admin");
	if(type.equals(str1)) {
	Faculty_details faculty=(Faculty_details)session.getAttribute("Faculty");
	int f_id=faculty.getF_id();
	System.out.println(f_id);
	RetriveImage image= new RetriveImage();
	byte[] img=image.retrive_FImage(f_id);
	sos= response.getOutputStream();
	sos.write(img);
	}
	else if(type.equals(str2)) {
		int s_id=(Integer)session.getAttribute("s_id");
		System.out.println(s_id);
		RetriveImage image= new RetriveImage();
		byte[] img=image.retrive_SImage(s_id);
		sos= response.getOutputStream();
		sos.write(img);
		}
	else {
int a_id=(Integer)session.getAttribute("a_id");
		
		RetriveImage image= new RetriveImage();
		//byte[] img=image.retrive_SImage(a_id);
		//sos= response.getOutputStream();
		//sos.write(img);
		
	}
		
	
	
	
	
	
	
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
