package classDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classVO.AlumnosVO;
import classVO.DirectivosVO;
import classVO.TutoresVO;
import conexion.ConectarBD;

public class DirectivosDAO {
		// INSERT
			public static String RegistrarDirectivo(DirectivosVO dir) throws SQLException{
			String result = null, last = null;
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "INSERT INTO TBL_Directivos values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	// LOS ? SON LA CANTIDAD DE TABLAS Y EL NULL ES SI DE TIPO IDENTITY
			try{
				pst = cn.prepareStatement(sql);
				
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setString(1, dir.getNombre_Directivo());
				pst.setString(2, dir.getApellido_Directivo());
				pst.setString(3, dir.getDomicilio_Directivo());
				pst.setString(4, dir.getNumero_Domicilio_Directivo());
				pst.setInt(5, dir.getPiso_Directivo());
				pst.setInt(6, dir.getDepartamento_Directivo());
				pst.setString(7, dir.getLocalidad_Directivo());
				pst.setInt(8, dir.getCP_Directivo());
				pst.setString(9, dir.getTelefono_Directivo());
				pst.setString(10, dir.getTipo_Documento_Directivo());
				pst.setString(11, dir.getNum_Documento_Directivo());
				pst.setString(12, dir.getNacimiento_Directivo());
				pst.setString(13, dir.getNacionalidad());
				pst.setString(14, dir.getTipo_Estado());

				// -------------------------------------------------- //
				
				pst.executeUpdate();
				pst = cn.prepareStatement("SELECT MAX(Cod_Directivo) AS CodigoDirectivo FROM TBL_Directivos"); // -> sirve para identificar el Maximo curso que esta en la BD
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					last = rs.getString(1);
				}
				//result = "Tutor Registrado";
				result = "Directivo Registrado con exito, Codigo: " + last; // -> en caso de que quiera identificar cual es el proximo ID !! 
				
			}catch(SQLException e){
				result = "Error en la Consulta >> " + e.getMessage();
			}
			finally{
				try{
					if(cn != null){
						cn.close();
						pst.close();
					}
				}catch(Exception e){
					result = "Error: " + e;
				}
			}
			return result;
		}
			

		// BUSCAR DIRECTIVO
		public static DirectivosVO BuscarUnDirectivo(Integer codd) throws SQLException{
		DirectivosVO dir = new DirectivosVO();
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "SELECT * FROM TBL_Directivos WHERE Cod_Directivo= ?";
		try{
		pst = cn.prepareStatement(sql);
		
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setInt(1, codd);
				// -------------------------------------------------- //
				
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					dir.setCod_Directivo(rs.getInt(1));
					dir.setNombre_Directivo(rs.getString(2));
					dir.setApellido_Directivo(rs.getString(3));
					dir.setDomicilio_Directivo(rs.getString(4));
					dir.setNumero_Domicilio_Directivo(rs.getString(5));
					dir.setPiso_Directivo(rs.getInt(6));
					dir.setDepartamento_Directivo(rs.getInt(7));
					dir.setLocalidad_Directivo(rs.getString(8));
					dir.setCP_Directivo(rs.getInt(9));
					dir.setTelefono_Directivo(rs.getString(10));
					dir.setTipo_Documento_Directivo(rs.getString(11));
					dir.setNum_Documento_Directivo(rs.getString(12));
					dir.setNacimiento_Directivo(rs.getString(13));
					dir.setNacionalidad(rs.getString(14));
					dir.setTipo_Estado(rs.getString(15));
				}
				dir.setResultado("Busqueda Exitosa");
			}catch(SQLException e){
				dir.setResultado("Error en la Consulta" + e.getMessage());
			}
			finally{
				try{
					if(cn != null){
						cn.close();
						pst.close();
					}
				}catch(Exception e){
					dir.setResultado("Error: " + e);
				}
			}
			return dir;
		}
		
		// BUSCAR DIRECTIVO X DNI
		public static DirectivosVO BuscarUnDirectivoXDNI(String dni) throws SQLException{
		DirectivosVO dir = new DirectivosVO();
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "SELECT * FROM TBL_Directivos WHERE Num_Documento_Directivo= ?";
		try{
		pst = cn.prepareStatement(sql);
		
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setString(1, dni);
				// -------------------------------------------------- //
				
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					dir.setCod_Directivo(rs.getInt(1));
					dir.setNombre_Directivo(rs.getString(2));
					dir.setApellido_Directivo(rs.getString(3));
					dir.setDomicilio_Directivo(rs.getString(4));
					dir.setNumero_Domicilio_Directivo(rs.getString(5));
					dir.setPiso_Directivo(rs.getInt(6));
					dir.setDepartamento_Directivo(rs.getInt(7));
					dir.setLocalidad_Directivo(rs.getString(8));
					dir.setCP_Directivo(rs.getInt(9));
					dir.setTelefono_Directivo(rs.getString(10));
					dir.setTipo_Documento_Directivo(rs.getString(11));
					dir.setNum_Documento_Directivo(rs.getString(12));
					dir.setNacimiento_Directivo(rs.getString(13));
					dir.setNacionalidad(rs.getString(14));
					dir.setTipo_Estado(rs.getString(15));
				}
				dir.setResultado("Busqueda Exitosa");
			}catch(SQLException e){
				dir.setResultado("Error en la Consulta" + e.getMessage());
			}
			finally{
				try{
					if(cn != null){
						cn.close();
						pst.close();
					}
				}catch(Exception e){
					dir.setResultado("Error: " + e);
				}
			}
			return dir;
		}
		
		// ACTUALIZAR ESTADO
		public static String CambiarEstadoDirectivo(DirectivosVO tut, Integer cod) throws SQLException{
			String result = null, last = null;
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "UPDATE TBL_Directivos SET Tipo_Estado = ? WHERE Cod_Directivo = ?";
			try{
				pst = cn.prepareStatement(sql);
				pst.setInt(2, cod);
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setString(1, tut.getTipo_Estado());
					
				// pst.setInt(1, al.getLegajo_alumno1()); // ESTOS DOS EN CASO QUE SEA IDENTITY, ALUMNOS NO XQ ELLOS INGRESAN EL LEGAJO NO AUTONUMERICO
				// pst.setInt(2, al.getLegajo_alumno2());
				// -------------------------------------------------- //
				
				pst.executeUpdate();
				result = "Tutor Actualizado con exito, Estado : " + tut.getTipo_Estado(); // -> Nos indica el Legajo Actualizado
				/*ResultSet rs = pst.executeQuery();
				if(rs.next()){
					last = rs.getString(1);
				}
				result = "Cambio de Estado con exito";*/
				// result = "Alumno Actualizado con exito, ID:" al.getLegajo_alumno; // -> en caso de que quiera identificar cual es el proximo ID !! 
				
			}catch(SQLException e){
				result = "Error en la Consulta" + e.getMessage();
			}
			finally{
				try{
					if(cn != null){
						cn.close();
						pst.close();
					}
				}catch(Exception e){
					result = "Error: " + e;
				}
			}
			return result;
		}
		
		// ACTUALIZAR
		public static String ActualizarDirectivo(DirectivosVO dir, Integer coddid) throws SQLException{
			String result = null, last = null;
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "UPDATE TBL_Directivos SET Nombre_Directivo = ?, Apellido_Directivo = ?, Domicilio_Directivo = ? , "
					+ "Numero_Domicilio_Directivo = ?, Piso_Directivo = ?, Departamento_Directivo = ?, Localidad_Directivo = ?, CP_Directivo = ?, Telefono_Directivo = ?, Tipo_Documento_Directivo = ?, "
					+ "Num_Documento_Directivo = ?, Nacimiento_Directivo = ?, Nacionalidad = ?, Tipo_Estado = ? WHERE Cod_Directivo = ?";
			try{
				pst = cn.prepareStatement(sql);
				
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setString(1, dir.getNombre_Directivo());
				pst.setString(2, dir.getApellido_Directivo());
				pst.setString(3, dir.getDomicilio_Directivo());
				pst.setString(4, dir.getNumero_Domicilio_Directivo());
				pst.setInt(5, dir.getPiso_Directivo());
				pst.setInt(6, dir.getDepartamento_Directivo());
				pst.setString(7, dir.getLocalidad_Directivo());
				pst.setInt(8, dir.getCP_Directivo());
				pst.setString(9, dir.getTelefono_Directivo());
				pst.setString(10, dir.getTipo_Documento_Directivo());
				pst.setString(11, dir.getNum_Documento_Directivo());
				pst.setString(12, dir.getNacimiento_Directivo());
				pst.setString(13, dir.getNacionalidad());
				pst.setString(14, dir.getTipo_Estado());
				pst.setInt(15, coddid);
				// pst.setInt(1, al.getLegajo_alumno1()); // ESTOS DOS EN CASO QUE SEA IDENTITY, ALUMNOS NO XQ ELLOS INGRESAN EL LEGAJO NO AUTONUMERICO
				// pst.setInt(2, al.getLegajo_alumno2());
				// -------------------------------------------------- //
					
				pst.executeUpdate();
		
			//ResultSet rs = pst.executeQuery();
			//if(rs.next()){
			//	last = rs.getString(1);
			//}
			//result = "Alumno Actualizado con exito";
			result = "Directivo Actualizado con exito, Codigo :" + dir.getCod_Directivo(); // -> Nos indica el Legajo Actualizado
			
			}catch(SQLException e){
				result = "Error en la Consulta" + e.getMessage();
			}
			finally{
				try{
					if(cn != null){
							cn.close();
							pst.close();
						}
					}catch(Exception e){
						result = "Error: " + e;
					}
					}
				return result;
			}
}
