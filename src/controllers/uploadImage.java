package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ErpMgmtMinor.Dao.InsertImageDao;

/**
 * Servlet implementation class uploadImage
 */
@WebServlet("/uploadImage")
public class uploadImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public uploadImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
	     int id=Integer.parseInt(request.getParameter("id"));
	     System.out.println(id);
	     String image=request.getParameter("image");
	     System.out.println(image);
	     String image1="E:\\"+image;
	     InsertImageDao insert= new InsertImageDao();
	     insert.insert_FImage(id,image1);
	     session.setAttribute("msg","insert uploaded successfully");
	     RequestDispatcher rd= request.getRequestDispatcher("SuccessMessage.jsp");
	     rd.forward(request, response);
	     
	}

}
