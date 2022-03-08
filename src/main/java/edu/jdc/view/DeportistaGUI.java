package edu.jdc.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.jdc.model.Deportista;
import java.io.*;
/**
 * Servlet implementation class conexion
 */
@WebServlet("/Conexion")
public class DeportistaGUI extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public DeportistaGUI() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cedula = request.getParameter("cedula");
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("lastname");
		String programaacademico = request.getParameter("academicprogram");
		String altura = request.getParameter("height");
		String peso = request.getParameter("weightr");
		String telefono = request.getParameter("phone");
		String direccion = request.getParameter("address");
		Deportista vm = new Deportista();
		boolean res = vm.addDeportista(cedula,nombre, apellido,programaacademico,  altura, peso, telefono, direccion);
		if (res){
			PrintWriter out;
			out = response.getWriter();
			response.setContentType("text/html");
			out.println("<html>");
			out.println("<head><title>EXITOSO!!! </title>");
			out.println("<title>GUIA INDEPENDIENTE 2</title>");
			out.println("<style><%@include file=\"/css/vehStyle.css\"%></style></head>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>El Deportista ha sido adicionado exitosamente!</h1>");
			out.println("<h2><a href=\"addDeportista.jsp\"> Atras</h2>");
			out.println("</body></html>");
			out.println("<h2><a href=\"index.jsp\"> Menu Principal </h2>");
			out.println("<button onclick=\"window.close();\">Cerrar</button> ");
			out.println("</body></html>");
		}else{
			PrintWriter out;
			out = response.getWriter();
			response.setContentType("text/html");
			out.println("<html>");
			out.println("<head><title>ERROR!!!</title>");
			out.println("<title>GUIA INDEPENDIENTE 2 </title>");
			out.println("<style><%@include file=\"/css/vehStyle.css\"%></style></head>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Error en la adición del Deportista !</h1>");
			out.println("<h2><a href=\"addDeportista.jsp\"> Atras</h2>");
			out.println("</body></html>");
			out.println("<h2><a href=\"index.jsp\">Menu Principal </h2>");
			out.println("<button onclick=\"window.close();\">Cerrar</button> ");
			out.println("</body></html>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

