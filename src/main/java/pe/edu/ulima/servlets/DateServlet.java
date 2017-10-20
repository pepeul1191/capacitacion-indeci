package pe.edu.ulima.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		
		response.setContentType("text/html");
		String usuario = null;
		usuario = request.getParameter("usuario");
		PrintWriter page = response.getWriter();
		page.println(
				"<html>" + 
				"<head>" +
				    "<title>Mi Primera Vez con Servlets</title>" +
				"</head>" + 
				"<body>" +
				    "<h1> Sample 1</h1>" +
				    "Hoy es : " + dtf.format(now) + "<br>" +
				    "Usuario : " + usuario + "<br><br><br><hr>" +
				    "<form action='/App/enviar' method='POST'>" + 
					    "Nombres : <input type[text] name='nombre'><br>" +
					    "Apellidos : <input type='text' name='apellidos'><br>" +
					    "Correo : <input type='text' name='correo'><br>" +
					    "Dni: <input type='text' name='dni'><br>" +
					    "<input type='submit' value='Enviar'>" +
				    "</form>"+
				"</body>" +
				"</html>"
			);
		page.flush();	
		//response.getWriter().append("Served at: " + dtf.format(now)).append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
