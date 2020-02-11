package classDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classVO.AlumnosVO;
import classVO.HorariosVO;
import classVO.ProfesoresVO;
import conexion.ConectarBD;

public class HorariosDAO {
		// INSERT
		public static String RegistrarHorario(HorariosVO hor) throws SQLException{
			String result = null, last = null;
			ConectarBD cc = new ConectarBD();
			Connection cn = cc.getConnection();
			PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
			String sql = "INSERT INTO TBL_Horarios values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	// LOS ? SON LA CANTIDAD DE TABLAS Y EL NULL ES SI DE TIPO IDENTITY
			try{
				pst = cn.prepareStatement(sql);
				
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD (15 Campos)
				pst.setInt(1, hor.getCod_Curso());
				pst.setString(2, hor.getHorario_uno());
				pst.setString(3, hor.getHorario_dos());
				pst.setString(4, hor.getHorario_tres());
				pst.setString(5, hor.getHorario_cuatro());
				pst.setString(6, hor.getHorario_cinco());
				pst.setString(7, hor.getHorario_seis());
				pst.setString(8, hor.getHorario_siete());
				pst.setString(9, hor.getHorario_ocho());
				pst.setString(10, hor.getHorario_nueve());
				pst.setString(11, hor.getHorario_diez());
				pst.setString(12, hor.getDia_uno());
				pst.setString(13, hor.getDia_dos());
				pst.setString(14, hor.getDia_tres());
				pst.setString(15, hor.getDia_cuatro());
				pst.setString(16, hor.getDia_cinco());
				pst.setString(17, hor.getDia_seis());
				pst.setString(18, hor.getDia_siete());
				pst.setString(19, hor.getDia_ocho());
				pst.setString(20, hor.getDia_nueve());
				pst.setString(21, hor.getDia_diez());
				pst.setString(22, hor.getDescripcion_Uno());
				pst.setString(23, hor.getDescripcion_dos());
				pst.setString(24, hor.getDescripcion_tres());
				pst.setString(25, hor.getDescripcion_cuatro());
				pst.setString(26, hor.getDescripcion_cinco());
				pst.setString(27, hor.getDescripcion_seis());
				pst.setString(28, hor.getDescripcion_siete());
				pst.setString(29, hor.getDescripcion_ocho());
				pst.setString(30, hor.getDescripcion_nueve());
				pst.setString(31, hor.getDescripcion_diez());

				// -------------------------------------------------- //
				
				pst.executeUpdate();
				pst = cn.prepareStatement("SELECT MAX(Cod_Horario) AS CodigoHorario FROM TBL_Horarios"); // -> sirve para identificar el Maximo curso que esta en la BD
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					last = rs.getString(1);
				}
				//result = "Tutor Registrado";
				result = "Horario Registrado con exito, Codigo: " + last; // -> en caso de que quiera identificar cual es el proximo ID !! 
				
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
		public static HorariosVO BuscarUnHorario(Integer codcur) throws SQLException{
		HorariosVO hor = new HorariosVO();
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "SELECT * FROM TBL_Horarios WHERE Cod_Curso= ?";
		try{
			pst = cn.prepareStatement(sql);
			
			// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
			pst.setInt(1, codcur);
			// -------------------------------------------------- //
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
			hor.setCod_Curso(rs.getInt(2));
			hor.setHorario_uno(rs.getString(3));
			hor.setHorario_dos(rs.getString(4));
			hor.setHorario_tres(rs.getString(5));
			hor.setHorario_cuatro(rs.getString(6));
			hor.setHorario_cinco(rs.getString(7));
			hor.setHorario_seis(rs.getString(8));
			hor.setHorario_siete(rs.getString(9));
			hor.setHorario_ocho(rs.getString(10));
			hor.setHorario_nueve(rs.getString(11));
			hor.setHorario_diez(rs.getString(12));
			hor.setDia_uno(rs.getString(13));
			hor.setDia_dos(rs.getString(14));
			hor.setDia_tres(rs.getString(15));
			hor.setDia_cuatro(rs.getString(16));
			hor.setDia_cinco(rs.getString(17));
			hor.setDia_seis(rs.getString(18));
			hor.setDia_siete(rs.getString(19));
			hor.setDia_ocho(rs.getString(20));
			hor.setDia_nueve(rs.getString(21));
			hor.setDia_diez(rs.getString(22));
			hor.setDescripcion_Uno(rs.getString(23));
			hor.setDescripcion_dos(rs.getString(24));
			hor.setDescripcion_tres(rs.getString(25));
			hor.setDescripcion_cuatro(rs.getString(26));
			hor.setDescripcion_cinco(rs.getString(27));
			hor.setDescripcion_seis(rs.getString(28));
			hor.setDescripcion_siete(rs.getString(29));
			hor.setDescripcion_ocho(rs.getString(30));
			hor.setDescripcion_nueve(rs.getString(31));
			hor.setDescripcion_diez(rs.getString(32));

			}
			hor.setResultado("Busqueda Exitosa");
			}catch(SQLException e){
				hor.setResultado("Error en la Consulta" + e.getMessage());
			}
			finally{
				try{
					if(cn != null){
						cn.close();
						pst.close();
					}
				}catch(Exception e){
					hor.setResultado("Error: " + e);
				}
			}
			return hor;
		}
}
