package classDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classVO.AlumnosVO;
import classVO.CursosVO;
import conexion.ConectarBD;

public class CursosDAO {
			// INSERT
			public static String RegistrarCursos(CursosVO cur) throws SQLException{
				String result = null, last = null;
				ConectarBD cc = new ConectarBD();
				Connection cn = cc.getConnection();
				PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
				String sql = "INSERT INTO TBL_Cursos values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	// LOS ? SON LA CANTIDAD DE TABLAS Y EL NULL ES SI DE TIPO IDENTITY
				try{
					pst = cn.prepareStatement(sql);
					
					// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD (15 Campos)
					pst.setInt(1, cur.getCodigo_curso());
					pst.setString(2, cur.getNombre_curso());
					pst.setBoolean(3, cur.isComputadoras_curso());
					pst.setInt(4, cur.getCantidad_pc());
					pst.setString(5, cur.getModulo_uno());
					pst.setString(6, cur.getModulo_dos());
					pst.setString(7, cur.getModulo_tres());
					pst.setString(8, cur.getModulo_cuatro());
					pst.setString(9, cur.getModulo_cinco());
					pst.setString(10, cur.getModulo_seis());
					pst.setString(11, cur.getModulo_siete());
					pst.setString(12, cur.getModulo_ocho());
					pst.setString(13, cur.getModulo_nueve());
					pst.setString(14, cur.getModulo_diez());
					pst.setString(15, cur.getEstado_curso());
					// -------------------------------------------------- //
					
					pst.executeUpdate();
					//pst = cn.prepareStatement("SELECT MAX(Legajo_Alumno) AS legajo FROM tbl_alumnos"); // -> sirve para identificar el Maximo legajo que esta en la BD
					//ResultSet rs = pst.executeQuery();
					//if(rs.next()){
					//	last = rs.getString(3);
					//}
					result = "Curso Registrado";
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
			public static CursosVO BuscarUnCurso(Integer codcur) throws SQLException{
				CursosVO cod = new CursosVO();
				ConectarBD cc = new ConectarBD();
				Connection cn = cc.getConnection();
				PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
				String sql = "SELECT * FROM TBL_Cursos WHERE Cod_Curso= ?";
				try{
					pst = cn.prepareStatement(sql);
					
					// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
					pst.setInt(1, codcur);
					// -------------------------------------------------- //
					
					ResultSet rs = pst.executeQuery();
					if(rs.next()){
						cod.setNombre_curso(rs.getString(2));
						cod.setComputadoras_curso(rs.getBoolean(3));
						cod.setCantidad_pc(rs.getInt(4));
						cod.setModulo_uno(rs.getString(5));
						cod.setModulo_dos(rs.getString(6));
						cod.setModulo_tres(rs.getString(7));
						cod.setModulo_cuatro(rs.getString(8));
						cod.setModulo_cinco(rs.getString(9));
						cod.setModulo_seis(rs.getString(10));
						cod.setModulo_siete(rs.getString(11));
						cod.setModulo_ocho(rs.getString(12));
						cod.setModulo_nueve(rs.getString(13));
						cod.setModulo_diez(rs.getString(14));
						cod.setEstado_curso(rs.getString(15));
					}
					cod.setResultado("Busqueda Exitosa");
				}catch(SQLException e){
					cod.setResultado("Error en la Consulta" + e.getMessage());
				}
				finally{
					try{
						if(cn != null){
							cn.close();
							pst.close();
						}
					}catch(Exception e){
						cod.setResultado("Error: " + e);
					}
				}
				return cod;
			}

			// ACTUALIZAR ESTADO
			public static String ActualizarCursoEstado(CursosVO cur, Integer curso) throws SQLException{
				String result = null, last = null;
				ConectarBD cc = new ConectarBD();
				Connection cn = cc.getConnection();
				PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
				String sql = "UPDATE TBL_Cursos SET Tipo_Estado = ? WHERE Cod_Curso = ?";
				try{
					pst = cn.prepareStatement(sql);
					pst.setInt(2, curso);
					// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
					pst.setString(1, cur.getEstado_curso());
					// -------------------------------------------------- //
					
					pst.executeUpdate();
					
					result = "Estado del Curso Actualizado con exito, Estado : " + cur.getEstado_curso(); // -> Nos indica el Curso Actualizado
					
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
			public static String ActualizarCurso(CursosVO cur) throws SQLException{
				String result = null, last = null;
				ConectarBD cc = new ConectarBD();
				Connection cn = cc.getConnection();
				PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
				String sql = "UPDATE TBL_Cursos SET Nombre_Curso = ?, Computadoras = ?, Cantidad_PC = ?, Modulo_uno = ?, "
							+ "Modulo_dos = ?, Modulo_tres = ?, Modulo_cuatro = ?, Modulo_cinco = ?, Modulo_seis = ?, Modulo_siete = ?, Modulo_ocho = ?, Modulo_nueve = ?, Modulo_diez = ?"
							+ "WHERE Cod_Curso = ? ";
				try{
					pst = cn.prepareStatement(sql);
					
					// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
					pst.setString(1, cur.getNombre_curso());
					pst.setBoolean(2, cur.isComputadoras_curso());
					pst.setInt(3, cur.getCantidad_pc());
					pst.setString(4, cur.getModulo_uno());
					pst.setString(5, cur.getModulo_dos());
					pst.setString(6, cur.getModulo_tres());
					pst.setString(7, cur.getModulo_cuatro());
					pst.setString(8, cur.getModulo_cinco());
					pst.setString(9, cur.getModulo_seis());
					pst.setString(10, cur.getModulo_siete());
					pst.setString(11, cur.getModulo_ocho());
					pst.setString(12, cur.getModulo_nueve());
					pst.setString(13, cur.getModulo_diez());
					pst.setInt(14, cur.getCodigo_curso());
					
					// -------------------------------------------------- //
					
					pst.executeUpdate();
					
					result = "Curso Actualizado con exito, Codigo :" + cur.getCodigo_curso(); // -> Nos indica el Curso Actualizado
					
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
