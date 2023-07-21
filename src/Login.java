

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter p	=resp.getWriter();	
		p.print("<h1>WELCOME </h1>  " );

		String un=req.getParameter("username");
		String pass=req.getParameter("password");
		
		if(un.equals("admin")&& pass.equals("abc123"))
		{
			
			resp.sendRedirect("index.html");
			p.print("login");
			
			
			
		}
		else{
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			p.print("not login");

		}
		
		
		
		
		
		
	}

}
