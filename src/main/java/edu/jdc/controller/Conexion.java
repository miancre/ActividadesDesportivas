package edu.jdc.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;
public class Conexion {
	private String maquina = "localhost";
	private String usuario = "root";
	private String clave = "";
	private int puerto = 3306;
	private static Connection conexion = null;


	public void guardarDeportista(String cedula, String nombre, String apellido, String programaacademico, String altura, String peso, String telefono, String direccion) throws SQLException, ClassNotFoundException{
		Statement stmt= null;
		String query = "insert into deportista (Cedula, Nombre, Apellido, ProgramaAcademico, Altura, Peso, Telefono, Direccion)values('"+cedula+"','"+nombre+"','"+apellido+"','"+programaacademico+"','"+altura+"','"+peso+"','"+telefono+"','"+direccion+"');";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://"+this.maquina+":"+this.puerto+"/actividadesdeportivas",this.usuario,this.clave);
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			con.close();
		}catch(SQLException sqlex){throw sqlex;}
	}
}