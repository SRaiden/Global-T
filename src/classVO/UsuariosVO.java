package classVO;

public class UsuariosVO {
	private String Login;
	private String password;
	private Integer Cod_Directivo;
	private boolean confirmacion;
	
	private String resultado;

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getCod_Directivo() {
		return Cod_Directivo;
	}

	public void setCod_Directivo(Integer cod_Directivo) {
		Cod_Directivo = cod_Directivo;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public boolean getConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion(boolean confirmacion) {
		this.confirmacion = confirmacion;
	}

	@Override
	public String toString() {
		return "UsuariosVO [Login=" + Login + ", password=" + password + ", Cod_Directivo=" + Cod_Directivo
				+ ", confirmacion=" + confirmacion + ", resultado=" + resultado + "]";
	}

	
	
}
