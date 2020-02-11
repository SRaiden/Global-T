package classVO;

public class ProfesoresVO {
	private Integer Codigo_Profesor;
	private String Nombre_Profesor;
	private String Apellido_Profesor;
	private String Domicilio_Profesor;
	private Integer Numero_Domicilio_Profesor;
	private Integer Piso_Profesor;
	private Integer Departamento_Profesor;
	private String Calle_Profesor_uno;
	private String Calle_Profesor_dos;
	private String Localidad_Profesor;
	private Integer CP_Profesor;
	private String Telefono_Profesor;
	private String Tipo_Documento_Profesor;
	private String Num_Documento_Profesor;
	private String Fecha_Nacimiento_Profesor;
	private String Nacionalidad_Profesor;
	private String Num_CUIT_Profesor;
	private String Fecha_Inicio_Profesor;
	private String Tipo_Estado;
	
	private String resultado;

	public Integer getCodigo_Profesor() {
		return Codigo_Profesor;
	}

	public void setCodigo_Profesor(Integer codigo_Profesor) {
		Codigo_Profesor = codigo_Profesor;
	}

	public String getNombre_Profesor() {
		return Nombre_Profesor;
	}

	public void setNombre_Profesor(String nombre_Profesor) {
		Nombre_Profesor = nombre_Profesor;
	}

	public String getApellido_Profesor() {
		return Apellido_Profesor;
	}

	public void setApellido_Profesor(String apellido_Profesor) {
		Apellido_Profesor = apellido_Profesor;
	}

	public String getDomicilio_Profesor() {
		return Domicilio_Profesor;
	}

	public void setDomicilio_Profesor(String domicilio_Profesor) {
		Domicilio_Profesor = domicilio_Profesor;
	}

	public Integer getNumero_Domicilio_Profesor() {
		return Numero_Domicilio_Profesor;
	}

	public void setNumero_Domicilio_Profesor(Integer numero_Domicilio_Profesor) {
		Numero_Domicilio_Profesor = numero_Domicilio_Profesor;
	}

	public Integer getPiso_Profesor() {
		return Piso_Profesor;
	}

	public void setPiso_Profesor(Integer piso_Profesor) {
		Piso_Profesor = piso_Profesor;
	}

	public Integer getDepartamento_Profesor() {
		return Departamento_Profesor;
	}

	public void setDepartamento_Profesor(Integer departamento_Profesor) {
		Departamento_Profesor = departamento_Profesor;
	}

	public String getCalle_Profesor_uno() {
		return Calle_Profesor_uno;
	}

	public void setCalle_Profesor_uno(String calle_Profesor_uno) {
		Calle_Profesor_uno = calle_Profesor_uno;
	}

	public String getCalle_Profesor_dos() {
		return Calle_Profesor_dos;
	}

	public void setCalle_Profesor_dos(String calle_Profesor_dos) {
		Calle_Profesor_dos = calle_Profesor_dos;
	}

	public String getLocalidad_Profesor() {
		return Localidad_Profesor;
	}

	public void setLocalidad_Profesor(String localidad_Profesor) {
		Localidad_Profesor = localidad_Profesor;
	}

	public Integer getCP_Profesor() {
		return CP_Profesor;
	}

	public void setCP_Profesor(Integer cP_Profesor) {
		CP_Profesor = cP_Profesor;
	}

	public String getTelefono_Profesor() {
		return Telefono_Profesor;
	}

	public void setTelefono_Profesor(String telefono_Profesor) {
		Telefono_Profesor = telefono_Profesor;
	}

	public String getTipo_Documento_Profesor() {
		return Tipo_Documento_Profesor;
	}

	public void setTipo_Documento_Profesor(String tipo_Documento_Profesor) {
		Tipo_Documento_Profesor = tipo_Documento_Profesor;
	}

	public String getNum_Documento_Profesor() {
		return Num_Documento_Profesor;
	}

	public void setNum_Documento_Profesor(String num_Documento_Profesor) {
		Num_Documento_Profesor = num_Documento_Profesor;
	}

	public String getFecha_Nacimiento_Profesor() {
		return Fecha_Nacimiento_Profesor;
	}

	public void setFecha_Nacimiento_Profesor(String fecha_Nacimiento_Profesor) {
		Fecha_Nacimiento_Profesor = fecha_Nacimiento_Profesor;
	}

	public String getNacionalidad_Profesor() {
		return Nacionalidad_Profesor;
	}

	public void setNacionalidad_Profesor(String nacionalidad_Profesor) {
		Nacionalidad_Profesor = nacionalidad_Profesor;
	}

	public String getNum_CUIT_Profesor() {
		return Num_CUIT_Profesor;
	}

	public void setNum_CUIT_Profesor(String num_CUIT_Profesor) {
		Num_CUIT_Profesor = num_CUIT_Profesor;
	}

	public String getFecha_Inicio_Profesor() {
		return Fecha_Inicio_Profesor;
	}

	public void setFecha_Inicio_Profesor(String fecha_Inicio_Profesor) {
		Fecha_Inicio_Profesor = fecha_Inicio_Profesor;
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
		return "ProfesoresVO [Codigo_Profesor=" + Codigo_Profesor + ", Nombre_Profesor=" + Nombre_Profesor
				+ ", Apellido_Profesor=" + Apellido_Profesor + ", Domicilio_Profesor=" + Domicilio_Profesor
				+ ", Numero_Domicilio_Profesor=" + Numero_Domicilio_Profesor + ", Piso_Profesor=" + Piso_Profesor
				+ ", Departamento_Profesor=" + Departamento_Profesor + ", Calle_Profesor_uno=" + Calle_Profesor_uno
				+ ", Calle_Profesor_dos=" + Calle_Profesor_dos + ", Localidad_Profesor=" + Localidad_Profesor
				+ ", CP_Profesor=" + CP_Profesor + ", Telefono_Profesor=" + Telefono_Profesor
				+ ", Tipo_Documento_Profesor=" + Tipo_Documento_Profesor + ", Num_Documento_Profesor="
				+ Num_Documento_Profesor + ", Fecha_Nacimiento_Profesor=" + Fecha_Nacimiento_Profesor
				+ ", Nacionalidad_Profesor=" + Nacionalidad_Profesor + ", Num_CUIT_Profesor=" + Num_CUIT_Profesor
				+ ", Fecha_Inicio_Profesor=" + Fecha_Inicio_Profesor + ", Tipo_Estado=" + Tipo_Estado + ", resultado="
				+ resultado + "]";
	}
	
	
}
