package classDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classVO.AlumnosVO;
import classVO.CursosVO;
import classVO.TutoresVO;
import conexion.ConectarBD;

public class TutoresDAO {
	// INSERT
		public static String RegistrarTutor(TutoresVO tut) throws SQLException{
		String result = null, last = null;
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "INSERT INTO TBL_Tutores values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	// LOS ? SON LA CANTIDAD DE TABLAS Y EL NULL ES SI DE TIPO IDENTITY
		try{
			pst = cn.prepareStatement(sql);
			
			// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD (15 Campos)
			pst.setString(1, tut.getLegajo_Alumno());
			pst.setString(2, tut.getNombre_Tutor());
			pst.setString(3, tut.getApellido_Tutor());
			pst.setString(4, tut.getDomicilio_Tutor());
			pst.setString(5, tut.getNumero_Domicilio_Tutor());
			pst.setInt(6, tut.getPiso_Tutor());
			pst.setInt(7, tut.getDepartamento_Tutor());
			pst.setString(8, tut.getLocalidad_Tutor());
			pst.setInt(9, tut.getCP_Tutor());
			pst.setString(10, tut.getTelefono_Tutor());
			pst.setString(11, tut.getTipo_Documento_Tutor());
			pst.setString(12, tut.getNum_Documento_Tutor());
			pst.setString(13, tut.getFecha_Nacimiento_Tutor());
			pst.setString(14, tut.getTipo_Estado());

			// -------------------------------------------------- //
			
			pst.executeUpdate();
			pst = cn.prepareStatement("SELECT MAX(Cod_Tutor) AS CodigoTutor FROM TBL_Tutores"); // -> sirve para identificar el Maximo curso que esta en la BD
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				last = rs.getString(1);
			}
			//result = "Tutor Registrado";
			result = "Tutor Registrado con exito, Codigo: " + last; // -> en caso de que quiera identificar cual es el proximo ID !! 
			
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
		
		// BUSCAR TUTOR
		public static TutoresVO BuscarUnTutor(Integer codtut) throws SQLException{
		TutoresVO tut = new TutoresVO();
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "SELECT * FROM TBL_Tutores WHERE Cod_Tutor= ?";
		try{
		pst = cn.prepareStatement(sql);
		
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setInt(1, codtut);
				// -------------------------------------------------- //
				
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					tut.setCodigo_tutor(rs.getInt(1));
					tut.setLegajo_Alumno(rs.getString(2));
					tut.setNombre_Tutor(rs.getString(3));
					tut.setApellido_Tutor(rs.getString(4));
					tut.setDomicilio_Tutor(rs.getString(5));
					tut.setNumero_Domicilio_Tutor(rs.getString(6));
					tut.setPiso_Tutor(rs.getInt(7));
					tut.setDepartamento_Tutor(rs.getInt(8));
					tut.setLocalidad_Tutor(rs.getString(9));
					tut.setCP_Tutor(rs.getInt(10));
					tut.setTelefono_Tutor(rs.getString(11));
					tut.setTipo_Documento_Tutor(rs.getString(12));
					tut.setNum_Documento_Tutor(rs.getString(13));
					tut.setFecha_Nacimiento_Tutor(rs.getString(14));
					tut.setTipo_Estado(rs.getString(15));
				}
				tut.setResultado("Busqueda Exitosa");
			}catch(SQLException e){
				tut.setResultado("Error en la Consulta" + e.getMessage());
			}
			finally{
				try{
					if(cn != null){
						cn.close();
						pst.close();
					}
				}catch(Exception e){
					tut.setResultado("Error: " + e);
				}
			}
			return tut;
		}
		
		// BUSCAR X DNI
		public static TutoresVO BuscarUnTutorXDNI(String dni) throws SQLException{
		TutoresVO tut = new TutoresVO();
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "SELECT * FROM TBL_Tutores WHERE Num_Documento_Tutor = ?";
		try{
			pst = cn.prepareStatement(sql);
			
			// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
			pst.setString(1,dni);
			// -------------------------------------------------- //
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				//alu.setLegajo_alumno1(Integer.parseInt(rs.getString(1)));
				//alu.setLegajo_alumno2(Integer.parseInt(rs.getString(2)));
				tut.setCodigo_tutor(rs.getInt(1));
				tut.setLegajo_Alumno(rs.getString(2));
				tut.setNombre_Tutor(rs.getString(3));
				tut.setApellido_Tutor(rs.getString(4));
				tut.setDomicilio_Tutor(rs.getString(5));
				tut.setNumero_Domicilio_Tutor(rs.getString(6));
				tut.setPiso_Tutor(Integer.parseInt(rs.getString(7)));
				tut.setDepartamento_Tutor(Integer.parseInt(rs.getString(8)));
				tut.setLocalidad_Tutor(rs.getString(9));
				tut.setCP_Tutor(Integer.parseInt(rs.getString(10)));
				tut.setTelefono_Tutor(rs.getString(11));
				tut.setTipo_Documento_Tutor(rs.getString(12));
				tut.setNum_Documento_Tutor(rs.getString(13));
				tut.setFecha_Nacimiento_Tutor(rs.getString(14));
				tut.setTipo_Estado(rs.getString(15));
			}
			tut.setResultado("Busqueda Exitosa");
		}catch(SQLException e){
			tut.setResultado("Error en la Consulta" + e.getMessage());
		}
		finally{
			try{
				if(cn != null){
					cn.close();
					pst.close();
				}
			}catch(Exception e){
				tut.setResultado("Error: " + e);
			}
		}
		return tut;
		}
		
		// ACTUALIZAR ESTADO
		public static String CambiarEstadoTutor(TutoresVO tut, Integer codtutor) throws SQLException{
		String result = null, last = null;
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "UPDATE TBL_Tutores SET Tipo_Estado = ? WHERE Cod_Tutor = ?";
		try{
			pst = cn.prepareStatement(sql);
			pst.setInt(2, codtutor);
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
		public static String ActualizarTutor(TutoresVO tut, Integer codtut) throws SQLException{
			String result = null, last = null;
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "UPDATE TBL_Tutores SET Nombre_Tutor = ?, Apellido_Tutor = ?, Domicilio_Tutor = ? , "
					+ "Numero_Domicilio_Tutor = ?, Piso_Tutor = ?, Departamento_Tutor = ?, Localidad_Tutor = ?, CP_Tutor = ?, Telefono_Tutor = ?, Tipo_Documento_Tutor = ?, Num_Documento_Tutor = ?, "
					+ "Fecha_Nacimiento_Tutor = ?, Tipo_Estado = ? WHERE Cod_Tutor = ?";
			try{
				pst = cn.prepareStatement(sql);
				
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setString(1, tut.getNombre_Tutor());
				pst.setString(2, tut.getApellido_Tutor());
				pst.setString(3, tut.getDomicilio_Tutor());
				pst.setString(4, tut.getNumero_Domicilio_Tutor());
				pst.setInt(5, tut.getPiso_Tutor());
				pst.setInt(6, tut.getDepartamento_Tutor());
				pst.setString(7, tut.getLocalidad_Tutor());
				pst.setInt(8, tut.getCP_Tutor());
				pst.setString(9, tut.getTelefono_Tutor());
				pst.setString(10, tut.getTipo_Documento_Tutor());
				pst.setString(11, tut.getNum_Documento_Tutor());
				pst.setString(12, tut.getFecha_Nacimiento_Tutor());
				pst.setString(13, tut.getTipo_Estado());
				pst.setInt(14, codtut);
				// pst.setInt(1, al.getLegajo_alumno1()); // ESTOS DOS EN CASO QUE SEA IDENTITY, ALUMNOS NO XQ ELLOS INGRESAN EL LEGAJO NO AUTONUMERICO
				// pst.setInt(2, al.getLegajo_alumno2());
				// -------------------------------------------------- //
				
				pst.executeUpdate();
		
			//ResultSet rs = pst.executeQuery();
			//if(rs.next()){
			//	last = rs.getString(1);
			//}
			//result = "Alumno Actualizado con exito";
			result = "Tutor Actualizado con exito, Codigo :" + tut.getCodigo_tutor(); // -> Nos indica el Legajo Actualizado
			
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