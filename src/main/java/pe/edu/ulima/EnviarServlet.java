package pe.edu.ulima;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnviarServlet
 */
public class EnviarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnviarServlet() {
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
		response.setContentType("text/html");
		String nombre= request.getParameter("nombre");
		String apellidos= request.getParameter("apellidos");
		PrintWriter page = response.getWriter();
		page.println(
				"<html>" + 
				"<head>" +
				    "<title>Mi Primera Vez con Servlets</title>" +
				"</head>" + 
				"<body>" +
				    "<h1> Sample 1</h1>" +
				    nombre + "<br>" + apellidos +
				"</body>" +
				"</html>"
			);
		page.flush();	
	}

}
