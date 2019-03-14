import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NameCheck")
public class NameCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset utf-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("onoma");
		String name2 = request.getParameter("onoma2");
		
		if (name == null || name.trim().isEmpty() || name2 == null || name2.trim().isEmpty()) 
		{
			out.print("<h4 class=\"text-warning\"> Δεν έδωσες σωστά το όνομα σου!</h4>");
			out.print("Συμπλήρωσε Όνομα και Επώνυμο.");
			RequestDispatcher rd = request.getRequestDispatcher("giveyourname.jsp");
			rd.include(request, response);

		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("helloname.jsp");
			rd.forward(request, response);

		}

	}
}