package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarBD {
Connection conectar = null;
	
	public ConectarBD(){
		try{
			// Crear Conexion -> Permite conectarnos con la base de datos creada
			Class.forName("com.mysql.jdbc.Driver");
			conectar = DriverManager.getConnection("jdbc:mysql://localhost/global","root","root");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public Connection getConnection(){
		return conectar;
	}
	
	public void desconectar(){
		conectar = null;
	}
}
