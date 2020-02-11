package classVO;

public class TutoresVO {
	private Integer codigo_tutor;
	private Integer Legajo_Alumno1;
	private Integer Legajo_Alumno2;
	private String Legajo_Alumno;
	private String Nombre_Tutor;
	private String Apellido_Tutor;
	private String Domicilio_Tutor;
	private String Numero_Domicilio_Tutor;
	private Integer Piso_Tutor;
	private Integer Departamento_Tutor;
	private String Localidad_Tutor;
	private Integer CP_Tutor;
	private String Telefono_Tutor;
	private String Tipo_Documento_Tutor;
	private String Num_Documento_Tutor;
	private String Fecha_Nacimiento_Tutor;
	private String Tipo_Estado;
	
	private String resultado;
	
	public Integer getCodigo_tutor() {
		return codigo_tutor;
	}
	public void setCodigo_tutor(Integer codigo_tutor) {
		this.codigo_tutor = codigo_tutor;
	}
	public String getLegajo_Alumno() {
		return Legajo_Alumno;
	}
	public void setLegajo_Alumno(String legajo_Alumno) {
		Legajo_Alumno = legajo_Alumno;
	}
	public String getNombre_Tutor() {
		return Nombre_Tutor;
	}
	public void setNombre_Tutor(String nombre_Tutor) {
		Nombre_Tutor = nombre_Tutor;
	}
	public String getApellido_Tutor() {
		return Apellido_Tutor;
	}
	public void setApellido_Tutor(String apellido_Tutor) {
		Apellido_Tutor = apellido_Tutor;
	}
	public String getDomicilio_Tutor() {
		return Domicilio_Tutor;
	}
	public void setDomicilio_Tutor(String domicilio_Tutor) {
		Domicilio_Tutor = domicilio_Tutor;
	}
	public String getNumero_Domicilio_Tutor() {
		return Numero_Domicilio_Tutor;
	}
	public void setNumero_Domicilio_Tutor(String numero_Domicilio_Tutor) {
		Numero_Domicilio_Tutor = numero_Domicilio_Tutor;
	}
	public Integer getPiso_Tutor() {
		return Piso_Tutor;
	}
	public void setPiso_Tutor(Integer piso_Tutor) {
		Piso_Tutor = piso_Tutor;
	}
	public Integer getDepartamento_Tutor() {
		return Departamento_Tutor;
	}
	public void setDepartamento_Tutor(Integer departamento_Tutor) {
		Departamento_Tutor = departamento_Tutor;
	}
	public String getLocalidad_Tutor() {
		return Localidad_Tutor;
	}
	public void setLocalidad_Tutor(String localidad_Tutor) {
		Localidad_Tutor = localidad_Tutor;
	}
	public Integer getCP_Tutor() {
		return CP_Tutor;
	}
	public void setCP_Tutor(Integer cP_Tutor) {
		CP_Tutor = cP_Tutor;
	}
	public String getTelefono_Tutor() {
		return Telefono_Tutor;
	}
	public void setTelefono_Tutor(String telefono_Tutor) {
		Telefono_Tutor = telefono_Tutor;
	}
	public String getTipo_Documento_Tutor() {
		return Tipo_Documento_Tutor;
	}
	public void setTipo_Documento_Tutor(String tipo_Documento_Tutor) {
		Tipo_Documento_Tutor = tipo_Documento_Tutor;
	}
	public String getNum_Documento_Tutor() {
		return Num_Documento_Tutor;
	}
	public void setNum_Documento_Tutor(String num_Documento_Tutor) {
		Num_Documento_Tutor = num_Documento_Tutor;
	}
	public String getFecha_Nacimiento_Tutor() {
		return Fecha_Nacimiento_Tutor;
	}
	public void setFecha_Nacimiento_Tutor(String fecha_Nacimiento_Tutor) {
		Fecha_Nacimiento_Tutor = fecha_Nacimiento_Tutor;
	}
	public String getTipo_Estado() {
		return Tipo_Estado;
	}
	public void setTipo_Estado(String tipo_Estado) {
		Tipo_Estado = tipo_Estado;
	}
	public Integer getLegajo_Alumno2() {
		return Legajo_Alumno2;
	}
	public void setLegajo_Alumno2(Integer legajo_Alumno2) {
		Legajo_Alumno2 = legajo_Alumno2;
	}
	public Integer getLegajo_Alumno1() {
		return Legajo_Alumno1;
	}
	public void setLegajo_Alumno1(Integer legajo_Alumno1) {
		Legajo_Alumno1 = legajo_Alumno1;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	@Override
	public String toString() {
		return "TutoresVO [codigo_tutor=" + codigo_tutor + ", Legajo_Alumno1=" + Legajo_Alumno1 + ", Legajo_Alumno2="
				+ Legajo_Alumno2 + ", Legajo_Alumno=" + Legajo_Alumno + ", Nombre_Tutor=" + Nombre_Tutor
				+ ", Apellido_Tutor=" + Apellido_Tutor + ", Domicilio_Tutor=" + Domicilio_Tutor
				+ ", Numero_Domicilio_Tutor=" + Numero_Domicilio_Tutor + ", Piso_Tutor=" + Piso_Tutor
				+ ", Departamento_Tutor=" + Departamento_Tutor + ", Localidad_Tutor=" + Localidad_Tutor + ", CP_Tutor="
				+ CP_Tutor + ", Telefono_Tutor=" + Telefono_Tutor + ", Tipo_Documento_Tutor=" + Tipo_Documento_Tutor
				+ ", Num_Documento_Tutor=" + Num_Documento_Tutor + ", Fecha_Nacimiento_Tutor=" + Fecha_Nacimiento_Tutor
				+ ", Tipo_Estado=" + Tipo_Estado + ", resultado=" + resultado + "]";
	}
}
