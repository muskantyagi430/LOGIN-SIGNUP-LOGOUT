package elexnova.com.servlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.catalina.User;

import elexnova.com.dao.User1;
import elexnova.com.dao.UserDao;
import elexnova.com.dao.UserDaoImpl;


/**
 * Servlet implementation class signupservlet
 */
public class signupservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDaoImpl userdao=new UserDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String phone=request.getParameter("Phone_no");
		String email=request.getParameter("Email");
		User1 user=new User1();
		user.setUsername(username);
		user.setPhone(phone);
		user.setEmail(email);
		if(userdao.addUser(user)) {
			response.sendRedirect("login.jsp?signup=success");
			
		}else {
			response.sendRedirect("register.jsp?error=1");
		}
	}

}
