package edu.jdc.model;
import java.sql.Statement;
import edu.jdc.controller.*;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Deportista {
	public boolean addDeportista(String cedula, String nombre, String apellido, String programaacademico, String altura, String peso, String telefono, String direccion) {
		Conexion dao = new Conexion();
		try {
			dao.guardarDeportista(cedula, nombre, apellido, programaacademico,  altura,  peso, telefono,  direccion);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}



}
