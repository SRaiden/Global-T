package classDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classVO.AlumnosVO;
import classVO.CursosVO;
import classVO.ProfesoresVO;
import conexion.ConectarBD;

public class ProfesoresDAO {
		// INSERT
		public static String RegistrarProfesor(ProfesoresVO prof) throws SQLException{
		String result = null, last = null;
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "INSERT INTO TBL_Profesores values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	// LOS ? SON LA CANTIDAD DE TABLAS Y EL NULL ES SI DE TIPO IDENTITY
		try{
			pst = cn.prepareStatement(sql);
			
			// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
			pst.setInt(1, prof.getCodigo_Profesor());
			pst.setString(2, prof.getNombre_Profesor());
			pst.setString(3, prof.getApellido_Profesor());
			pst.setString(4, prof.getDomicilio_Profesor());
			pst.setInt(5, prof.getNumero_Domicilio_Profesor());
			pst.setInt(6, prof.getPiso_Profesor());
			pst.setInt(7, prof.getDepartamento_Profesor());
			pst.setString(8, prof.getCalle_Profesor_uno());
			pst.setString(9, prof.getCalle_Profesor_dos());
			pst.setString(10, prof.getLocalidad_Profesor());
			pst.setInt(11, prof.getCP_Profesor());
			pst.setString(12, prof.getTelefono_Profesor());
			pst.setString(13, prof.getTipo_Documento_Profesor());
			pst.setString(14, prof.getNum_Documento_Profesor());
			pst.setString(15, prof.getFecha_Nacimiento_Profesor());
			pst.setString(16, prof.getNacionalidad_Profesor());
			pst.setString(17, prof.getNum_CUIT_Profesor());
			pst.setString(18, prof.getFecha_Inicio_Profesor());
			pst.setString(19, prof.getTipo_Estado());
			// -------------------------------------------------- //
				
			pst.executeUpdate();
			//pst = cn.prepareStatement("SELECT MAX(Legajo_Alumno) AS legajo FROM tbl_alumnos"); // -> sirve para identificar el Maximo legajo que esta en la BD
			//ResultSet rs = pst.executeQuery();
			//if(rs.next()){
			//	last = rs.getString(3);
			//}
			result = "Profesor Registrado";
			//result = "Alumno Registrado con exito, Legajo:" + last; // -> en caso de que quiera identificar cual es el proximo ID !! 
				
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
		
		// BUSCAR
		public static ProfesoresVO BuscarUnProfesor(Integer codprof) throws SQLException{
			ProfesoresVO prof = new ProfesoresVO();
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "SELECT * FROM TBL_Profesores WHERE Codigo_Profesor= ?";
			try{
				pst = cn.prepareStatement(sql);
				
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setInt(1, codprof);
				// -------------------------------------------------- //
				
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					prof.setCodigo_Profesor(rs.getInt(1));
					prof.setNombre_Profesor(rs.getString(2));
					prof.setApellido_Profesor(rs.getString(3));
					prof.setDomicilio_Profesor(rs.getString(4));
					prof.setNumero_Domicilio_Profesor(rs.getInt(5));
					prof.setPiso_Profesor(rs.getInt(6));
					prof.setDepartamento_Profesor(rs.getInt(7));
					prof.setCalle_Profesor_uno(rs.getString(8));
					prof.setCalle_Profesor_dos(rs.getString(9));
					prof.setLocalidad_Profesor(rs.getString(10));
					prof.setCP_Profesor(rs.getInt(11));
					prof.setTelefono_Profesor(rs.getString(12));
					prof.setTipo_Documento_Profesor(rs.getString(13));
					prof.setNum_Documento_Profesor(rs.getString(14));
					prof.setFecha_Nacimiento_Profesor(rs.getString(15));
					prof.setNacionalidad_Profesor(rs.getString(16));
					prof.setNum_CUIT_Profesor(rs.getString(17));
					prof.setFecha_Inicio_Profesor(rs.getString(18));
					prof.setTipo_Estado(rs.getString(19));
				}
				prof.setResultado("Busqueda Exitosa");
			}catch(SQLException e){
				prof.setResultado("Error en la Consulta" + e.getMessage());
			}
			finally{
				try{
					if(cn != null){
						cn.close();
						pst.close();
					}
				}catch(Exception e){
					prof.setResultado("Error: " + e);
				}
			}
				return prof;
		}
		
		// BUSCAR X DNI
		public static ProfesoresVO BuscarUnProfesorXDNI(String dni) throws SQLException{
		ProfesoresVO prof = new ProfesoresVO();
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "SELECT * FROM TBL_Profesores WHERE Num_Documento_Profesor = ?";
		try{
			pst = cn.prepareStatement(sql);
			
			// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
			pst.setString(1,dni);
			// -------------------------------------------------- //
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				prof.setCodigo_Profesor(rs.getInt(1));
				prof.setNombre_Profesor(rs.getString(2));
				prof.setApellido_Profesor(rs.getString(3));
				prof.setDomicilio_Profesor(rs.getString(4));
				prof.setNumero_Domicilio_Profesor(rs.getInt(5));
				prof.setPiso_Profesor(rs.getInt(6));
				prof.setDepartamento_Profesor(rs.getInt(7));
				prof.setCalle_Profesor_uno(rs.getString(8));
				prof.setCalle_Profesor_dos(rs.getString(9));
				prof.setLocalidad_Profesor(rs.getString(10));
				prof.setCP_Profesor(rs.getInt(11));
				prof.setTelefono_Profesor(rs.getString(12));
				prof.setTipo_Documento_Profesor(rs.getString(13));
				prof.setNum_Documento_Profesor(rs.getString(14));
				prof.setFecha_Nacimiento_Profesor(rs.getString(15));
				prof.setNacionalidad_Profesor(rs.getString(16));
				prof.setNum_CUIT_Profesor(rs.getString(17));
				prof.setFecha_Inicio_Profesor(rs.getString(18));
				prof.setTipo_Estado(rs.getString(19));
			}
			prof.setResultado("Busqueda Exitosa");
		}catch(SQLException e){
			prof.setResultado("Error en la Consulta" + e.getMessage());
		}
		finally{
			try{
				if(cn != null){
					cn.close();
					pst.close();
				}
			}catch(Exception e){
				prof.setResultado("Error: " + e);
			}
		}
		return prof;
		}
		
		// ACTUALIZAR ESTADO
		public static String CambiarEstadoProfesor(ProfesoresVO prof, String cod) throws SQLException{
		String result = null, last = null;
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "UPDATE TBL_Profesores SET Tipo_Estado = ? WHERE Codigo_Profesor = ?";
		try{
			pst = cn.prepareStatement(sql);
			pst.setString(2, cod);
			// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
			pst.setString(1, prof.getTipo_Estado());
				
			// pst.setInt(1, al.getLegajo_alumno1()); // ESTOS DOS EN CASO QUE SEA IDENTITY, ALUMNOS NO XQ ELLOS INGRESAN EL LEGAJO NO AUTONUMERICO
			// pst.setInt(2, al.getLegajo_alumno2());
			// -------------------------------------------------- //
			
			pst.executeUpdate();
			result = "Estado del Alumno Actualizado con exito, Estado : " + prof.getTipo_Estado(); // -> Nos indica el Legajo Actualizado
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
		public static String ActualizarProfesor(ProfesoresVO prof) throws SQLException{
		String result = null, last = null;
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "UPDATE TBL_Profesores SET Nombre_Profesor = ?, Apellido_Profesor = ?, Domicilio_Profesor = ?, Numero_Domicilio_Profesor = ? , "
					+ "Piso_Profesor = ?, Departamento_Profesor = ?, Calle_Profesor_uno = ?, Calle_Profesor_dos = ?, Localidad_Profesor = ?, CP_Profesor = ?, Telefono_Profesor = ?, Tipo_Documento_Profesor = ?, "
					+ "Num_Documento_Profesor = ?, Fecha_Nacimiento_Profesor = ?, Nacionalidad_Profesor = ?, Num_CUIT_Profesor = ?, Fecha_Inicio_Profesor = ?, Tipo_Estado = ? WHERE Codigo_Profesor = ?";
		try{
			pst = cn.prepareStatement(sql);
			
			// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
			pst.setString(1, prof.getNombre_Profesor());
			pst.setString(2, prof.getApellido_Profesor());
			pst.setString(3, prof.getDomicilio_Profesor());
			pst.setInt(4, prof.getNumero_Domicilio_Profesor());
			pst.setInt(5, prof.getPiso_Profesor());
			pst.setInt(6, prof.getDepartamento_Profesor());
			pst.setString(7, prof.getCalle_Profesor_uno());
			pst.setString(8, prof.getCalle_Profesor_dos());
			pst.setString(9, prof.getLocalidad_Profesor());
			pst.setInt(10, prof.getCP_Profesor());
			pst.setString(11, prof.getTelefono_Profesor());
			pst.setString(12, prof.getTipo_Documento_Profesor());
			pst.setString(13, prof.getNum_Documento_Profesor());
			pst.setString(14, prof.getFecha_Nacimiento_Profesor());
			pst.setString(15, prof.getNacionalidad_Profesor());
			pst.setString(16, prof.getNum_CUIT_Profesor());
			pst.setString(17, prof.getFecha_Inicio_Profesor());
			pst.setString(18, prof.getTipo_Estado());
			pst.setInt(19, prof.getCodigo_Profesor());
			// pst.setInt(1, al.getLegajo_alumno1()); // ESTOS DOS EN CASO QUE SEA IDENTITY, ALUMNOS NO XQ ELLOS INGRESAN EL LEGAJO NO AUTONUMERICO
			// pst.setInt(2, al.getLegajo_alumno2());
			// -------------------------------------------------- //
			
			pst.executeUpdate();
			
			//ResultSet rs = pst.executeQuery();
			//if(rs.next()){
			//	last = rs.getString(1);
			//}
			//result = "Alumno Actualizado con exito";
			result = "Profesor Actualizado con exito, Codigo :" + prof.getCodigo_Profesor(); // -> Nos indica el Legajo Actualizado
			
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