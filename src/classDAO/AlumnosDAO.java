package classDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classVO.AlumnosVO;
import conexion.ConectarBD;

public class AlumnosDAO {
		// INSERT
		public static String RegistrarAlumnos(AlumnosVO al) throws SQLException{
			String result = null, last = null;
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "INSERT INTO tbl_Alumnos values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	// LOS ? SON LA CANTIDAD DE TABLAS Y EL NULL ES SI DE TIPO IDENTITY
			try{
				pst = cn.prepareStatement(sql);
				
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setInt(1, al.getLegajo_alumno1());
				pst.setInt(2, al.getLegajo_alumno2());
				pst.setString(3, al.getLegajo_alumno());
				pst.setString(4, al.getNombre_alumno());
				pst.setString(5, al.getApellido_alumno());
				pst.setString(6, al.getDomicilio_alumno());
				pst.setInt(7, al.getNumero_domicilio_alumno());
				pst.setInt(8, al.getPiso_Alumno());
				pst.setString(9, al.getDepartamento_alumno());
				pst.setString(10, al.getCalle_alumno_uno());
				pst.setString(11, al.getCalle_alumno_dos());
				pst.setString(12, al.getLocalidad_alumno());
				pst.setInt(13, al.getCp_alumno());
				pst.setString(14, al.getTelefono_alumno());
				pst.setString(15, al.getTipo_documento_alumno());
				pst.setString(16, al.getNumero_documento_alumno());
				pst.setString(17, al.getFecha_nacimiento_alumno());
				pst.setInt(18, al.getEdad_alumno());
				pst.setString(19, al.getNacionalidad_alumno());
				pst.setString(20, al.getMeses_cursada());
				pst.setBoolean(21, al.isEnfermedad_alumno());
				pst.setString(22, al.getDescripcion_enfermedad_alumno());
				pst.setBoolean(23, al.isMedicina_alumno());
				pst.setString(24, al.getDescripcion_medicina_alumno());
				pst.setString(25, al.getTelefono_emergencia());
				pst.setString(26, al.getPersona_emergencia());
				pst.setString(27, al.getFecha_inicio_alumno());
				pst.setString(28, al.getFecha_final_alumno());
				pst.setString(29, al.getEstado_alumno());
				// -------------------------------------------------- //
				
				pst.executeUpdate();
				//pst = cn.prepareStatement("SELECT MAX(Legajo_Alumno) AS legajo FROM tbl_alumnos"); // -> sirve para identificar el Maximo legajo que esta en la BD
				//ResultSet rs = pst.executeQuery();
				//if(rs.next()){
				//	last = rs.getString(3);
				//}
				result = "Alumno Registrado";
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
		
		
		// ACTUALIZAR
		public static String ActualizarAlumnos(AlumnosVO al) throws SQLException{
			String result = null, last = null;
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "UPDATE TBL_Alumnos SET Nombre_Alumno = ?, Apellido_Alumno = ?, Domicilio_Alumno = ?, Numero_Domicilio_Alumno = ? , "
						+ "Piso_Alumno = ?, Departamento_Alumno = ?, Calle_Alumno_Uno = ?, Calle_Alumno_dos = ?, Localidad_Alumno = ?, CP_Alumno = ?, Telefono_Alumno = ?, Tipo_Documento_Alumno = ?, Num_Documento_Alumno = ?,"
						+ "Fecha_Nacimiento_Alumno = ?, Edad_Alumno = ?, Nacionalidad_Alumno = ?, Enfermedad_Alumno = ?, Descripcion_Enfermedad_Alumno = ?, Medicina_Alumno = ?, Descripcion_Medicina_Alumno = ?, Telefono_Emergencia_Alumno = ?, "
						+ "Persona_Emergencia_Alumno = ?, Tipo_Estado = ?, Fecha_Inicio_Alumno = ?, Fecha_Final_Alumno = ?, Meses_Alumno = ? WHERE Legajo_Alumno1 = ? AND Legajo_Alumno2 = ?";
			try{
				pst = cn.prepareStatement(sql);
				
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setString(1, al.getNombre_alumno());
				pst.setString(2, al.getApellido_alumno());
				pst.setString(3, al.getDomicilio_alumno());
				pst.setInt(4, al.getNumero_domicilio_alumno());
				pst.setInt(5, al.getPiso_Alumno());
				pst.setString(6, al.getDepartamento_alumno());
				pst.setString(7, al.getCalle_alumno_uno());
				pst.setString(8, al.getCalle_alumno_dos());
				pst.setString(9, al.getLocalidad_alumno());
				pst.setInt(10, al.getCp_alumno());
				pst.setString(11, al.getTelefono_alumno());
				pst.setString(12, al.getTipo_documento_alumno());
				pst.setString(13, al.getNumero_documento_alumno());
				pst.setString(14, al.getFecha_nacimiento_alumno());
				pst.setInt(15, al.getEdad_alumno());
				pst.setString(16, al.getNacionalidad_alumno());
				pst.setBoolean(17, al.isEnfermedad_alumno());
				pst.setString(18, al.getDescripcion_enfermedad_alumno());
				pst.setBoolean(19, al.isMedicina_alumno());
				pst.setString(20, al.getDescripcion_medicina_alumno());
				pst.setString(21, al.getTelefono_emergencia());
				pst.setString(22, al.getPersona_emergencia());
				pst.setString(23, al.getEstado_alumno());
				pst.setString(24, al.getFecha_inicio_alumno());
				pst.setString(25, al.getFecha_final_alumno());
				pst.setString(26, al.getMeses_cursada());
				pst.setInt(27, al.getLegajo_alumno1());
				pst.setInt(28, al.getLegajo_alumno2());
				// pst.setInt(1, al.getLegajo_alumno1()); // ESTOS DOS EN CASO QUE SEA IDENTITY, ALUMNOS NO XQ ELLOS INGRESAN EL LEGAJO NO AUTONUMERICO
				// pst.setInt(2, al.getLegajo_alumno2());
				// -------------------------------------------------- //
				
				pst.executeUpdate();
				
				//ResultSet rs = pst.executeQuery();
				//if(rs.next()){
				//	last = rs.getString(1);
				//}
				//result = "Alumno Actualizado con exito";
				result = "Alumno Actualizado con exito, Legajo :" + al.getLegajo_alumno(); // -> Nos indica el Legajo Actualizado
				
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
		
		
		// BUSCAR X LEGAJO
		public static AlumnosVO BuscarUnAlumno(Integer parte1, Integer parte2) throws SQLException{
			AlumnosVO alu = new AlumnosVO();
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "SELECT * FROM tbl_alumnos WHERE Legajo_Alumno1= ? AND Legajo_Alumno2 = ?";
			try{
				pst = cn.prepareStatement(sql);
				
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setInt(1, parte1);
				pst.setInt(2, parte2);
				// -------------------------------------------------- //
				
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					alu.setLegajo_alumno1(Integer.parseInt(rs.getString(1)));
					alu.setLegajo_alumno2(Integer.parseInt(rs.getString(2)));
					alu.setNombre_alumno(rs.getString(4));
					alu.setApellido_alumno(rs.getString(5));
					alu.setDomicilio_alumno(rs.getString(6));
					alu.setNumero_domicilio_alumno(Integer.parseInt(rs.getString(7)));
					alu.setPiso_Alumno(Integer.parseInt(rs.getString(8)));
					alu.setDepartamento_alumno(rs.getString(9));
					alu.setCalle_alumno_uno(rs.getString(10));
					alu.setCalle_alumno_dos(rs.getString(11));
					alu.setLocalidad_alumno(rs.getString(12));
					alu.setCp_alumno(Integer.parseInt(rs.getString(13)));
					alu.setTelefono_alumno(rs.getString(14));
					alu.setTipo_documento_alumno(rs.getString(15));
					alu.setNumero_documento_alumno(rs.getString(16));
					alu.setFecha_nacimiento_alumno(rs.getString(17));
					alu.setEdad_alumno(Integer.parseInt(rs.getString(18)));
					alu.setNacionalidad_alumno(rs.getString(19));
					alu.setMeses_cursada(rs.getString(20));
					alu.setEnfermedad_alumno(rs.getBoolean(21));
					alu.setDescripcion_enfermedad_alumno(rs.getString(22));
					alu.setMedicina_alumno(rs.getBoolean(23));
					alu.setDescripcion_medicina_alumno(rs.getString(24));
					alu.setTelefono_emergencia(rs.getString(25));
					alu.setPersona_emergencia(rs.getString(26));
					alu.setFecha_inicio_alumno(rs.getString(27));
					alu.setFecha_final_alumno(rs.getString(28));
					alu.setEstado_alumno(rs.getString(29));
				}
				alu.setResultado("Busqueda Exitosa");
			}catch(SQLException e){
				alu.setResultado("Error en la Consulta" + e.getMessage());
			}
			finally{
				try{
					if(cn != null){
						cn.close();
						pst.close();
					}
				}catch(Exception e){
					alu.setResultado("Error: " + e);
				}
			}
			return alu;
		}
		
		
		// BUSCAR X DNI
		public static AlumnosVO BuscarUnAlumnoXDNI(String dni) throws SQLException{
		AlumnosVO alu = new AlumnosVO();
		ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "SELECT * FROM tbl_alumnos WHERE Num_Documento_Alumno = ?";
			try{
				pst = cn.prepareStatement(sql);
				
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setString(1,dni);
				// -------------------------------------------------- //
				
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					//alu.setLegajo_alumno1(Integer.parseInt(rs.getString(1)));
					//alu.setLegajo_alumno2(Integer.parseInt(rs.getString(2)));
					alu.setNombre_alumno(rs.getString(4));
					alu.setApellido_alumno(rs.getString(5));
					alu.setDomicilio_alumno(rs.getString(6));
					alu.setNumero_domicilio_alumno(Integer.parseInt(rs.getString(7)));
					alu.setPiso_Alumno(Integer.parseInt(rs.getString(8)));
					alu.setDepartamento_alumno(rs.getString(9));
					alu.setCalle_alumno_uno(rs.getString(10));
					alu.setCalle_alumno_dos(rs.getString(11));
					alu.setLocalidad_alumno(rs.getString(12));
					alu.setCp_alumno(Integer.parseInt(rs.getString(13)));
					alu.setTelefono_alumno(rs.getString(14));
					alu.setTipo_documento_alumno(rs.getString(15));
					alu.setNumero_documento_alumno(rs.getString(16));
					alu.setFecha_nacimiento_alumno(rs.getString(17));
					alu.setEdad_alumno(Integer.parseInt(rs.getString(18)));
					alu.setNacionalidad_alumno(rs.getString(19));
					alu.setMeses_cursada(rs.getString(20));
					alu.setEnfermedad_alumno(rs.getBoolean(21));
					alu.setDescripcion_enfermedad_alumno(rs.getString(22));
					alu.setMedicina_alumno(rs.getBoolean(23));
					alu.setDescripcion_medicina_alumno(rs.getString(24));
					alu.setTelefono_emergencia(rs.getString(25));
					alu.setPersona_emergencia(rs.getString(26));
					alu.setFecha_inicio_alumno(rs.getString(27));
					alu.setFecha_final_alumno(rs.getString(28));
					alu.setEstado_alumno(rs.getString(29));
				}
				alu.setResultado("Busqueda Exitosa");
			}catch(SQLException e){
				alu.setResultado("Error en la Consulta" + e.getMessage());
			}
			finally{
				try{
					if(cn != null){
						cn.close();
						pst.close();
					}
				}catch(Exception e){
					alu.setResultado("Error: " + e);
				}
			}
			return alu;
		}
				
		// BUSCAR TODOS
		public static AlumnosVO BuscarTodosAlumnos() throws SQLException{
			AlumnosVO alu = new AlumnosVO();
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "SELECT * FROM tbl_alumnos WHERE Tipo_Estado = APERTURA OR Tipo_Estado = INCORPORACION OR Tipo_Estado = REINCORPORACION ";
			try{
				pst = cn.prepareStatement(sql);
				
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				
				// -------------------------------------------------- //
				
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					alu.setLegajo_alumno1(Integer.parseInt(rs.getString(1)));
					alu.setLegajo_alumno2(Integer.parseInt(rs.getString(2)));
					alu.setLegajo_alumno(rs.getString(3));
					alu.setNombre_alumno(rs.getString(4));
					alu.setApellido_alumno(rs.getString(5));
					alu.setDomicilio_alumno(rs.getString(6));
					alu.setNumero_domicilio_alumno(Integer.parseInt(rs.getString(7)));
					alu.setPiso_Alumno(Integer.parseInt(rs.getString(8)));
					alu.setDepartamento_alumno(rs.getString(9));
					alu.setCalle_alumno_uno(rs.getString(10));
					alu.setCalle_alumno_dos(rs.getString(11));
					alu.setLocalidad_alumno(rs.getString(12));
					alu.setCp_alumno(Integer.parseInt(rs.getString(13)));
					alu.setTelefono_alumno(rs.getString(14));
					alu.setTipo_documento_alumno(rs.getString(15));
					alu.setNumero_documento_alumno(rs.getString(16));
					alu.setFecha_nacimiento_alumno(rs.getString(17));
					alu.setEdad_alumno(Integer.parseInt(rs.getString(18)));
					alu.setNacionalidad_alumno(rs.getString(19));
					alu.setEnfermedad_alumno(Boolean.parseBoolean(rs.getString(20)));
					alu.setDescripcion_enfermedad_alumno(rs.getString(21));
					alu.setMedicina_alumno(Boolean.parseBoolean(rs.getString(22)));
					alu.setDescripcion_medicina_alumno(rs.getString(23));
					alu.setTelefono_emergencia(rs.getString(24));
					alu.setPersona_emergencia(rs.getString(25));
					alu.setEstado_alumno(rs.getString(26));
					
				}
				alu.setResultado("Busqueda Exitosa");
			}catch(SQLException e){
				alu.setResultado("Error en la Consulta" + e.getMessage());
			}
			finally{
				try{
					if(cn != null){
						cn.close();
						pst.close();
					}
				}catch(Exception e){
					alu.setResultado("Error: " + e);
				}
			}
			return alu;
			}
		
		
			// ACTUALIZAR ESTADO
			public static String CambiarEstadoAlumno(AlumnosVO al, Integer cod1, Integer cod2) throws SQLException{
				String result = null, last = null;
				ConectarBD cc = new ConectarBD();
				Connection cn = cc.getConnection();
				PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
				String sql = "UPDATE tbl_alumnos SET Tipo_Estado = ? WHERE Legajo_Alumno1 = ? AND Legajo_Alumno2 = ?";
				try{
					pst = cn.prepareStatement(sql);
					pst.setInt(2, cod1);
					pst.setInt(3, cod2);
					// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
					pst.setString(1, al.getEstado_alumno());

					
					// pst.setInt(1, al.getLegajo_alumno1()); // ESTOS DOS EN CASO QUE SEA IDENTITY, ALUMNOS NO XQ ELLOS INGRESAN EL LEGAJO NO AUTONUMERICO
					// pst.setInt(2, al.getLegajo_alumno2());
					// -------------------------------------------------- //
					
					pst.executeUpdate();
					result = "Estado del Alumno Actualizado con exito, Estado : " + al.getEstado_alumno(); // -> Nos indica el Legajo Actualizado
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
			
			
			
			
			// ARRAYLIST
			public static ArrayList<AlumnosVO> getListAlumnos(){
				ArrayList<AlumnosVO> arrAlumnos = new ArrayList<AlumnosVO>();
				ConectarBD cc = new ConectarBD();
				Connection cn = cc.getConnection();
				PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
				AlumnosVO alu = null;
				String sql = "SELECT * FROM tbl_alumnos";
				try{
					pst = cn.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					while(rs.next()){
						alu = new AlumnosVO();
						
						alu.setLegajo_alumno1(Integer.parseInt(rs.getString(1)));
						alu.setLegajo_alumno2(Integer.parseInt(rs.getString(2)));
						alu.setLegajo_alumno(rs.getString(3));
						alu.setNombre_alumno(rs.getString(4));
						if(arrAlumnos.isEmpty()){
							arrAlumnos.add(0,alu);
						}else{
							arrAlumnos.add(alu);
						}
					}
				}catch(SQLException e){
					System.out.println("Error en la Consulta" + e.getMessage());
				}
				finally{
					try{
						if(cn != null){
							cn.close();
							pst.close();
						}
					}catch(Exception e){
						System.out.println("Error: " + e);
					}
				}
				return arrAlumnos;
			}
}
