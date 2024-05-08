package elexnova.com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import elexnova.com.dao.UserDao;
import elexnova.com.dao.UserDaoImpl;

/**
 * Servlet implementation class loginservlet
 */

public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userdao=new UserDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("username");
		System.out.println(name);
		String no=request.getParameter("Phone_no");
		String email=request.getParameter("Email");
				if(userdao.isValidUser(name,no,email)) {
					HttpSession session =request.getSession();
					session.setAttribute("username", name);
					session.setAttribute("Phone_no", no);
					session.setAttribute("Email", email);
					response.sendRedirect("dashboard.jsp");
					
				}else {
					response.sendRedirect("login.jsp?error=1");
					
				}
	}

}
