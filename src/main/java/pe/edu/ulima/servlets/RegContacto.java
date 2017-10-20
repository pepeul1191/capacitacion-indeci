package pe.edu.ulima.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.ulima.model.Contacto;

public class RegContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegContacto() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Contacto c = new Contacto();
		
		c.setDni(Long.parseLong(request.getParameter("dni")));
		c.setNombre(request.getParameter("nombre"))	;
		c.setPaterno(request.getParameter("paterno"))	;
		c.setMaterno(request.getParameter("materno"));
		c.setEmail(request.getParameter("email"));
		
		System.out.println("1+++++++++++++++++++++++++++++++++++++++++");
		System.out.println(c);
		System.out.println("2+++++++++++++++++++++++++++++++++++++++++");
		
		String paterno= request.getParameter("paterno");
		PrintWriter page = response.getWriter();
		page.println(
				"<html>" + 
				"<head>" +
				    "<title>Mi Primera Vez con Servlets</title>" +
				"</head>" + 
				"<body>" +
				    "<h1> Felicitaciones</h1>" +
				    "<label>Se ha grabado el contacto con los siguientes datos</label><br>" +
				    "<table>" + 
				    	"<tr>" +
				    		"<td>DNI</td>" +
				    		"<td>" + c.getDni() + "</td>" +
				    "</tr>" + 
				    "<tr>" +
			    		"<td>Nombre</td>" +
			    		"<td>" + c.getNombre() + "</td>" +
			    	"</tr>" +	
			    	"<tr>" +
			    		"<td>Apellido Paterno</td>" +
			    		"<td>" + c.getPaterno() + "</td>" +
			    	"</tr>" +
			    	"<tr>" +
			    		"<td>Apellido Materno</td>" +
			    		"<td>" + c.getMaterno() + "</td>" +
			    	"</tr>" +	
			    	"<tr>" +
			    		"<td>EMail</td>" +
			    		"<td>" + c.getEmail() + "</td>" +
			    	"</tr>" +	
				    "</table>" + 
				"</body>" +
				"</html>"
			);
		page.flush();	
	}

}
