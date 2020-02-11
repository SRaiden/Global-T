package classVO;

public class DirectivosVO {
	private Integer Cod_Directivo;
	private String Nombre_Directivo;
	private String Apellido_Directivo;
	private String Domicilio_Directivo;
	private String Numero_Domicilio_Directivo;
	private Integer Piso_Directivo;
	private Integer Departamento_Directivo;
	private String Localidad_Directivo;
	private Integer CP_Directivo;
	private String Telefono_Directivo;
	private String Tipo_Documento_Directivo;
	private String Num_Documento_Directivo;
	private String Nacimiento_Directivo;
	private String Nacionalidad;
	private String Tipo_Estado;
	
	private String resultado;

	public Integer getCod_Directivo() {
		return Cod_Directivo;
	}

	public void setCod_Directivo(Integer cod_Directivo) {
		Cod_Directivo = cod_Directivo;
	}

	public String getNombre_Directivo() {
		return Nombre_Directivo;
	}

	public void setNombre_Directivo(String nombre_Directivo) {
		Nombre_Directivo = nombre_Directivo;
	}

	public String getApellido_Directivo() {
		return Apellido_Directivo;
	}

	public void setApellido_Directivo(String apellido_Directivo) {
		Apellido_Directivo = apellido_Directivo;
	}

	public String Domicilio_Directivo() {
		return Domicilio_Directivo;
	}

	public String getDomicilio_Directivo() {
		return Domicilio_Directivo;
	}
	
	public void setDomicilio_Directivo(String domicio_Directivo) {
		Domicilio_Directivo = domicio_Directivo;
	}

	public String getNumero_Domicilio_Directivo() {
		return Numero_Domicilio_Directivo;
	}

	public void setNumero_Domicilio_Directivo(String numero_Domicilio_Directivo) {
		Numero_Domicilio_Directivo = numero_Domicilio_Directivo;
	}

	public Integer getPiso_Directivo() {
		return Piso_Directivo;
	}

	public void setPiso_Directivo(Integer piso_Directivo) {
		Piso_Directivo = piso_Directivo;
	}

	public Integer getDepartamento_Directivo() {
		return Departamento_Directivo;
	}

	public void setDepartamento_Directivo(Integer departamento_Directivo) {
		Departamento_Directivo = departamento_Directivo;
	}

	public String getLocalidad_Directivo() {
		return Localidad_Directivo;
	}

	public void setLocalidad_Directivo(String localidad_Directivo) {
		Localidad_Directivo = localidad_Directivo;
	}

	public Integer getCP_Directivo() {
		return CP_Directivo;
	}

	public void setCP_Directivo(Integer cP_Directivo) {
		CP_Directivo = cP_Directivo;
	}

	public String getTelefono_Directivo() {
		return Telefono_Directivo;
	}

	public void setTelefono_Directivo(String telefono_Directivo) {
		Telefono_Directivo = telefono_Directivo;
	}

	public String getTipo_Documento_Directivo() {
		return Tipo_Documento_Directivo;
	}

	public void setTipo_Documento_Directivo(String tipo_Documento_Directivo) {
		Tipo_Documento_Directivo = tipo_Documento_Directivo;
	}

	public String getNum_Documento_Directivo() {
		return Num_Documento_Directivo;
	}

	public void setNum_Documento_Directivo(String num_Documento_Directivo) {
		Num_Documento_Directivo = num_Documento_Directivo;
	}

	public String getNacimiento_Directivo() {
		return Nacimiento_Directivo;
	}

	public void setNacimiento_Directivo(String nacimiento_Directivo) {
		Nacimiento_Directivo = nacimiento_Directivo;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public String getTipo_Estado() {
		return Tipo_Estado;
	}

	public void setTipo_Estado(String tipo_Estado) {
		Tipo_Estado = tipo_Estado;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "DirectivosVO [Cod_Directivo=" + Cod_Directivo + ", Nombre_Directivo=" + Nombre_Directivo
				+ ", Apellido_Directivo=" + Apellido_Directivo + ", Domicio_Directivo=" + Domicilio_Directivo
				+ ", Numero_Domicilio_Directivo=" + Numero_Domicilio_Directivo + ", Piso_Directivo=" + Piso_Directivo
				+ ", Departamento_Directivo=" + Departamento_Directivo + ", Localidad_Directivo=" + Localidad_Directivo
				+ ", CP_Directivo=" + CP_Directivo + ", Telefono_Directivo=" + Telefono_Directivo
				+ ", Tipo_Documento_Directivo=" + Tipo_Documento_Directivo + ", Num_Documento_Directivo="
				+ Num_Documento_Directivo + ", Nacimiento_Directivo=" + Nacimiento_Directivo + ", Nacionalidad="
				+ Nacionalidad + ", Tipo_Estado=" + Tipo_Estado + ", resultado=" + resultado + "]";
	}
}
