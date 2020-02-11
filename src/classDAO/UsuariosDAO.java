package classDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classVO.DirectivosVO;
import classVO.UsuariosVO;
import conexion.ConectarBD;

public class UsuariosDAO {
	// BUSCAR DIRECTIVO
		public static UsuariosVO BuscarUsuarioAdmin(String login, String pass) throws SQLException{
		UsuariosVO usu = new UsuariosVO();
		ConectarBD cc = new ConectarBD();
		Connection cn = cc.getConnection();
		PreparedStatement pst = null; // SIRVE PARA HACER LLAMADOS A LA BD
		String sql = "SELECT * FROM TBL_Usuarios WHERE Login = ? , password = ? AND Tipo = " + "ADMIN";
		try{
		pst = cn.prepareStatement(sql);
		
				// CREAR SETEO PARA QUE CADA VALOR SE GUARDE EN LA BD
				pst.setString(1, login);
				pst.setString(2, pass);
				
				// -------------------------------------------------- //
				
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					usu.setConfirmacion(true);
				}
				usu.setResultado("Busqueda Exitosa");
			}catch(SQLException e){
				usu.setResultado("Error en la Consulta" + e.getMessage());
			}
			finally{
				try{
					if(cn != null){
						cn.close();
						pst.close();
					}
				}catch(Exception e){
					usu.setResultado("Error: " + e);
				}
			}
				return usu;
		}
}
