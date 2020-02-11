package classDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classVO.AlumnosVO;
import classVO.DiplomasVO;
import classVO.TutoresVO;
import conexion.ConectarBD;

public class DiplomasDAO {
	// INSERT
		public static String RegistrarDiploma(DiplomasVO dip) throws SQLException{
			String result = null, last = null;
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "INSERT INTO TBL_Diplomas values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	// LOS ? SON LA CANTIDAD DE TABLAS Y EL NULL ES SI DE TIPO IDENTITY
			try{
				pst = cn.prepareStatement(sql);
				
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD (23 Campos)
				pst.setString(1, dip.getLegajo_Alumno());
				pst.setInt(2, dip.getCod_Curso());
				pst.setDouble(3, dip.getNota_uno());
				pst.setDouble(4, dip.getNota_dos());
				pst.setDouble(5, dip.getNota_tres());
				pst.setDouble(6, dip.getNota_cuatro());
				pst.setDouble(7, dip.getNota_cinco());
				pst.setDouble(8, dip.getNota_seis());
				pst.setDouble(9, dip.getNota_siete());
				pst.setDouble(10, dip.getNota_ocho());
				pst.setDouble(11, dip.getNota_nueve());
				pst.setDouble(12, dip.getNota_diez());
				pst.setString(13, dip.getModulo_uno());
				pst.setString(14, dip.getModulo_dos());
				pst.setString(15, dip.getModulo_tres());
				pst.setString(16, dip.getModulo_cuatro());
				pst.setString(17, dip.getModulo_cinco());
				pst.setString(18, dip.getModulo_seis());
				pst.setString(19, dip.getModulo_siete());
				pst.setString(20, dip.getModulo_ocho());
				pst.setString(21, dip.getModulo_nueve());
				pst.setString(22, dip.getModulo_diez());
				pst.setString(23, dip.getPromedio());

				// -------------------------------------------------- //
				
				pst.executeUpdate();
				pst = cn.prepareStatement("SELECT MAX(Cod_Diploma) AS CodigoDiploma FROM TBL_Diplomas"); // -> sirve para identificar el Maximo curso que esta en la BD
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					last = rs.getString(1);
				}
				//result = "Tutor Registrado";
				result = "Diploma Registrado con exito, Codigo: " + last; // -> en caso de que quiera identificar cual es el proximo Codigo !! 
				
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
		
		// BUSCAR DIPLOMA
			public static DiplomasVO BuscarUnDiploma(String legajo) throws SQLException{
			DiplomasVO dip = new DiplomasVO();
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "SELECT * FROM TBL_Diplomas WHERE Legajo_Alumno= ?";
			try{
			pst = cn.prepareStatement(sql);
			
					// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
					pst.setString(1, legajo);
					// -------------------------------------------------- //
					
					ResultSet rs = pst.executeQuery();
					if(rs.next()){
						
						dip.setNota_uno(rs.getDouble(4));
						dip.setNota_dos(rs.getDouble(5));
						dip.setNota_tres(rs.getDouble(6));
						dip.setNota_cuatro(rs.getDouble(7));
						dip.setNota_cinco(rs.getDouble(8));
						dip.setNota_seis(rs.getDouble(9));
						dip.setNota_siete(rs.getDouble(10));
						dip.setNota_ocho(rs.getDouble(11));
						dip.setNota_nueve(rs.getDouble(12));
						dip.setNota_diez(rs.getDouble(13));
						dip.setModulo_uno(rs.getString(14));
						dip.setModulo_dos(rs.getString(15));
						dip.setModulo_tres(rs.getString(16));
						dip.setModulo_cuatro(rs.getString(17));
						dip.setModulo_cinco(rs.getString(18));
						dip.setModulo_seis(rs.getString(19));
						dip.setModulo_siete(rs.getString(20));
						dip.setModulo_ocho(rs.getString(21));
						dip.setModulo_nueve(rs.getString(22));
						dip.setModulo_diez(rs.getString(23));
						dip.setPromedio(rs.getString(24));
						
					}
					dip.setResultado("Busqueda Exitosa");
				}catch(SQLException e){
					dip.setResultado("Error en la Consulta" + e.getMessage());
				}
				finally{
					try{
						if(cn != null){
							cn.close();
							pst.close();
						}
					}catch(Exception e){
						dip.setResultado("Error: " + e);
					}
				}
				return dip;
			}
}