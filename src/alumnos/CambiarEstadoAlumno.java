package alumnos;


import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import classDAO.AlumnosDAO;
import classDAO.CursosDAO;
import classVO.AlumnosVO;
import classVO.CursosVO;

import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CambiarEstadoAlumno extends JPanel {

	private JTextField txtLegajo;
	private JTextField txtNacionalidad;
	private JTextField txtTelefonoEmergencia;
	private JTextField txtPersonaEmergencia;
	private JTextField txtDescripMedicina;
	private JTextField txtDescripEnfermedad;
	private JTextField txtEdad;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAnio;
	private JTextField txtNumDNI;
	private JTextField txtTelefono;
	private JTextField txtCP;
	private JTextField txtLocalidad;
	private JTextField txtTipoDocumento;
	private JTextField txtCalleUno;
	private JTextField txtCalleDos;
	private JTextField txtDepartamento;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtDomicilio;
	private JTextField txtNumDomicilio;
	private JTextField txtPiso;
	private JTextField txtBuscarDNI;
	private JTextField txtInicioDia;
	private JTextField txtInicioMes;
	private JTextField txtInicioAnio;
	private JTextField txtFinalDia;
	private JTextField txtFinalMes;
	private JTextField txtFinalAnio;
	private JTextField txtMeses;
	
	public CambiarEstadoAlumno() {
		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cambiar Estado del Alumno",

						TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JLabel label_1 = new JLabel("Legajo del Alumno");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JComboBox cmbLegajo = new JComboBox();
		cmbLegajo.addItem("01");
		cmbLegajo.addItem("02");
		cmbLegajo.addItem("03");
		cmbLegajo.addItem("04");
		cmbLegajo.addItem("05");
		cmbLegajo.addItem("06");
		cmbLegajo.addItem("07");
		cmbLegajo.addItem("08");
		cmbLegajo.addItem("09");
		cmbLegajo.addItem("10");
		cmbLegajo.addItem("11");
		cmbLegajo.addItem("12");
		cmbLegajo.addItem("13");
		cmbLegajo.addItem("14");
		cmbLegajo.addItem("15");
		cmbLegajo.addItem("16");
		cmbLegajo.addItem("17");
		cmbLegajo.addItem("18");
		cmbLegajo.addItem("19");
		cmbLegajo.addItem("20");
		cmbLegajo.addItem("21");
		cmbLegajo.addItem("22");
		cmbLegajo.addItem("23");
		cmbLegajo.addItem("24");
		cmbLegajo.addItem("25");
		cmbLegajo.addItem("26");
		cmbLegajo.addItem("27");
		cmbLegajo.addItem("28");
		cmbLegajo.addItem("29");
		cmbLegajo.addItem("30");
		
		txtLegajo = new JTextField();
		txtLegajo.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBackground(SystemColor.inactiveCaption);
		
		JLabel label_2 = new JLabel("\u00BFPosee Alguna Enfermedad?");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JCheckBox check1 = new JCheckBox("");
		check1.setEnabled(false);
		
		JLabel label_3 = new JLabel("\u00BFToma Alguna Medicacion?");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JCheckBox check2 = new JCheckBox("");
		check2.setEnabled(false);
		
		JLabel label_4 = new JLabel("Telefono de Emergencia");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtTelefonoEmergencia = new JTextField();
		txtTelefonoEmergencia.setEditable(false);
		txtTelefonoEmergencia.setColumns(10);
		
		JLabel label_5 = new JLabel("Sr/a de Emergencia");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtPersonaEmergencia = new JTextField();
		txtPersonaEmergencia.setEditable(false);
		txtPersonaEmergencia.setColumns(10);
		
		JLabel label_6 = new JLabel("Descrip.");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtDescripMedicina = new JTextField();
		txtDescripMedicina.setEditable(false);
		txtDescripMedicina.setColumns(10);
		
		txtDescripEnfermedad = new JTextField();
		txtDescripEnfermedad.setEditable(false);
		txtDescripEnfermedad.setColumns(10);
		
		JLabel label_7 = new JLabel("Descrip.");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label_2)
							.addGap(7)
							.addComponent(check1)
							.addGap(17)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(56)
									.addComponent(txtDescripEnfermedad, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)))
							.addGap(25)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(txtTelefonoEmergencia, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(check2)
							.addGap(17)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(56)
									.addComponent(txtDescripMedicina, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
							.addGap(25)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(txtPersonaEmergencia, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(2)
							.addComponent(label_2))
						.addComponent(check1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(3)
									.addComponent(label_7))
								.addComponent(txtDescripEnfermedad, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(4)
							.addComponent(label_4))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(2)
							.addComponent(txtTelefonoEmergencia, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(2)
							.addComponent(label_3))
						.addComponent(check2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDescripMedicina, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(3)
									.addComponent(label_6))))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(2)
							.addComponent(label_5))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(1)
							.addComponent(txtPersonaEmergencia, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel label_8 = new JLabel("Estado");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel label_9 = new JLabel("Edad Actual");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtEdad = new JTextField();
		txtEdad.setEditable(false);
		txtEdad.setColumns(10);
		
		JLabel label_10 = new JLabel("Fecha Nacimiento");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtDia = new JTextField();
		txtDia.setEditable(false);
		txtDia.setColumns(10);
		
		JLabel label_11 = new JLabel("/");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtMes = new JTextField();
		txtMes.setEditable(false);
		txtMes.setColumns(10);
		
		JLabel label_12 = new JLabel("/");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtAnio = new JTextField();
		txtAnio.setEditable(false);
		txtAnio.setColumns(10);
		
		txtNumDNI = new JTextField();
		txtNumDNI.setEditable(false);
		txtNumDNI.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setEditable(false);
		txtTelefono.setColumns(10);
		
		txtCP = new JTextField();
		txtCP.setEditable(false);
		txtCP.setColumns(10);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setEditable(false);
		txtLocalidad.setColumns(10);
		
		JLabel label_13 = new JLabel("Numero DNI");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel label_14 = new JLabel("Tipo Documento");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel label_15 = new JLabel("Telefono");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel label_16 = new JLabel("Codigo Postal");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel label_17 = new JLabel("Localidad");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setEditable(false);
		txtTipoDocumento.setColumns(10);
		
		JComboBox cmbEstado = new JComboBox();
		cmbEstado.addItem("APERTURA");
		cmbEstado.addItem("FINALIZADO");
		cmbEstado.addItem("INCORPORACION");
		cmbEstado.addItem("REINCORPORACION");
		cmbEstado.addItem("SUSPENDIDO");
		cmbEstado.addItem("ABANDONO");
		
		JLabel label_18 = new JLabel("Entre");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtCalleUno = new JTextField();
		txtCalleUno.setEditable(false);
		txtCalleUno.setColumns(10);
		
		JLabel label_19 = new JLabel("Y ");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtCalleDos = new JTextField();
		txtCalleDos.setEditable(false);
		txtCalleDos.setColumns(10);
		
		JLabel label_20 = new JLabel("Nacionalidad");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel label_21 = new JLabel("Departamento");
		label_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtDepartamento = new JTextField();
		txtDepartamento.setEditable(false);
		txtDepartamento.setColumns(10);
		
		txtBuscarDNI = new JTextField();
		txtBuscarDNI.setColumns(10);
		
		JLabel lblDniDelAlumno = new JLabel("DNI del Alumno");
		lblDniDelAlumno.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		
		JLabel label_22 = new JLabel("Apellido");
		label_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		
		JLabel label_23 = new JLabel("Nombre");
		label_23.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setEditable(false);
		txtDomicilio.setColumns(10);
		
		JLabel label_24 = new JLabel("Domicilio");
		label_24.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel label_25 = new JLabel("Numero Domicilio");
		label_25.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtNumDomicilio = new JTextField();
		txtNumDomicilio.setEditable(false);
		txtNumDomicilio.setColumns(10);
		
		JLabel label_26 = new JLabel("Piso");
		label_26.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtPiso = new JTextField();
		txtPiso.setEditable(false);
		txtPiso.setColumns(10);
		
		JLabel label_27 = new JLabel("Fecha Inicio");
		label_27.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtInicioDia = new JTextField();
		txtInicioDia.setEditable(false);
		txtInicioDia.setColumns(10);
		
		JLabel label_28 = new JLabel("/");
		label_28.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtInicioMes = new JTextField();
		txtInicioMes.setEditable(false);
		txtInicioMes.setColumns(10);
		
		JLabel label_29 = new JLabel("/");
		label_29.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtInicioAnio = new JTextField();
		txtInicioAnio.setEditable(false);
		txtInicioAnio.setColumns(10);
		
		JLabel label_30 = new JLabel("Fecha Finalizacion");
		label_30.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtFinalDia = new JTextField();
		txtFinalDia.setEditable(false);
		txtFinalDia.setColumns(10);
		
		JLabel label_31 = new JLabel("/");
		label_31.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtFinalMes = new JTextField();
		txtFinalMes.setEditable(false);
		txtFinalMes.setColumns(10);
		
		JLabel label_32 = new JLabel("/");
		label_32.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtFinalAnio = new JTextField();
		txtFinalAnio.setEditable(false);
		txtFinalAnio.setColumns(10);
		
		JLabel label_33 = new JLabel("Meses");
		label_33.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtMeses = new JTextField();
		txtMeses.setEditable(false);
		txtMeses.setColumns(10);
		
		JButton btnBuscarXLegajo = new JButton("Buscar");
		btnBuscarXLegajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String legajo1 = (String) cmbLegajo.getSelectedItem();
					int num = Integer.parseInt(legajo1);
					
					String legajo2 = (String) txtLegajo.getText();
					int num2 = Integer.parseInt(legajo2);
					
					AlumnosVO alum = AlumnosDAO.BuscarUnAlumno(num,num2);
					txtNombre.setText(alum.getNombre_alumno() + "");
					txtApellido.setText(alum.getApellido_alumno() + "");
					txtDomicilio.setText(alum.getDomicilio_alumno() + "");
					txtNumDomicilio.setText(alum.getNumero_domicilio_alumno() + "");
					txtPiso.setText(alum.getPiso_Alumno() + "");
					txtDepartamento.setText(alum.getDepartamento_alumno() + "");
					txtCalleUno.setText(alum.getCalle_alumno_uno() + "");
					txtCalleDos.setText(alum.getCalle_alumno_dos() + "");
					txtLocalidad.setText(alum.getLocalidad_alumno() + "");
					txtCP.setText(alum.getCp_alumno() + "");
					txtTelefono.setText(alum.getTelefono_alumno() + "");
					txtTipoDocumento.setText(alum.getTipo_documento_alumno() + "");
					txtNumDNI.setText(alum.getNumero_documento_alumno() + "");
					
					String string = alum.getFecha_nacimiento_alumno();
					String[] partir = string.split("/");
					String dia = partir[0];
					String mes = partir[1];
					String anio = partir[2];
					txtDia.setText(dia + "");
					txtMes.setText(mes + "");
					txtAnio.setText(anio + "");
					
					txtEdad.setText(alum.getEdad_alumno() + "");
					txtNacionalidad.setText(alum.getNacionalidad_alumno() + "");
					txtMeses.setText(alum.getMeses_cursada() + "");
					check1.setSelected(alum.isEnfermedad_alumno());
					txtDescripEnfermedad.setText(alum.getDescripcion_enfermedad_alumno() + "");
					check2.setSelected(alum.isMedicina_alumno());
					txtDescripMedicina.setText(alum.getDescripcion_medicina_alumno() + "");
					txtTelefonoEmergencia.setText(alum.getTelefono_emergencia() + "");
					txtPersonaEmergencia.setText(alum.getPersona_emergencia() + "");
					
					String inicio = alum.getFecha_inicio_alumno();
					String[] partir2 = inicio.split("/");
					String diainicio = partir2[0];
					String mesinicio = partir2[1];
					String anioinicio = partir2[2];
					txtInicioDia.setText(diainicio + "");
					txtInicioMes.setText(mesinicio + "");
					txtInicioAnio.setText(anioinicio + "");
					
					String finals = alum.getFecha_final_alumno();
					String[] partir3 = finals.split("/");
					String diafinal = partir3[0];
					String mesfinal = partir3[1];
					String aniofinal = partir3[2];
					txtFinalDia.setText(diafinal + "");
					txtFinalMes.setText(mesfinal + "");
					txtFinalAnio.setText(aniofinal + "");
					
					cmbEstado.setSelectedItem(alum.getEstado_alumno());
					
					//String estado = (String) cmbEstado.getSelectedItem();
					//alum.setEstado_alumno(estado);
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscarXLegajo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnCambiarEstado = new JButton("Cambiar Estado");
		btnCambiarEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlumnosVO alum = new AlumnosVO();
				
				String legajo1 = (String) cmbLegajo.getSelectedItem();
				int num = Integer.parseInt(legajo1);
				alum.setLegajo_alumno1(num);
				String legajo2 = (String) txtLegajo.getText();
				int num2 = Integer.parseInt(legajo2);
				alum.setLegajo_alumno2(num2);
				
				String estado = (String) cmbEstado.getSelectedItem();
				alum.setEstado_alumno(estado);
				try {
					String resp = AlumnosDAO.CambiarEstadoAlumno(alum,num,num2);
					JOptionPane.showMessageDialog(null, resp, "Modificar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					txtLegajo.setText("");
					txtNombre.setText("");
					txtApellido.setText("");
					txtDomicilio.setText("");
					txtNumDomicilio.setText("");
					txtPiso.setText("");
					txtDepartamento.setText("");
					txtCalleUno.setText("");
					txtCalleDos.setText("");
					txtLocalidad.setText("");
					txtCP.setText("");
					txtTelefono.setText("");
					txtNumDNI.setText("");
					txtDia.setText("");
					txtMes.setText("");
					txtAnio.setText("");
					txtEdad.setText("");
					txtNacionalidad.setText("");
					txtDescripEnfermedad.setText("");
					txtDescripMedicina.setText("");
					txtTelefonoEmergencia.setText("");
					txtPersonaEmergencia.setText("");
					txtInicioDia.setText("");
					txtInicioMes.setText("");
					txtInicioAnio.setText("");
					txtFinalDia.setText("");
					txtFinalMes.setText("");
					txtFinalAnio.setText("");
					txtMeses.setText("");
					check1.setSelected(false);
					check2.setSelected(false);
					
					// cargarAlumnos(0);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCambiarEstado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnBuscarXDNI = new JButton("Buscar");
		btnBuscarXDNI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
					
					String dni = txtBuscarDNI.getText();
					
					AlumnosVO alum = AlumnosDAO.BuscarUnAlumnoXDNI(dni);
					txtNombre.setText(alum.getNombre_alumno() + "");
					txtApellido.setText(alum.getApellido_alumno() + "");
					txtDomicilio.setText(alum.getDomicilio_alumno() + "");
					txtNumDomicilio.setText(alum.getNumero_domicilio_alumno() + "");
					txtPiso.setText(alum.getPiso_Alumno() + "");
					txtDepartamento.setText(alum.getDepartamento_alumno() + "");
					txtCalleUno.setText(alum.getCalle_alumno_uno() + "");
					txtCalleDos.setText(alum.getCalle_alumno_dos() + "");
					txtLocalidad.setText(alum.getLocalidad_alumno() + "");
					txtCP.setText(alum.getCp_alumno() + "");
					txtTelefono.setText(alum.getTelefono_alumno() + "");
					txtTipoDocumento.setText(alum.getTipo_documento_alumno());
					txtNumDNI.setText(alum.getNumero_documento_alumno() + "");
					
					String s = alum.getFecha_nacimiento_alumno();
					String[] p = s.split("/");
					String dia = p[0];
					String mes = p[1];
					String anio = p[2];
					txtDia.setText(dia + "");
					txtMes.setText(mes + "");
					txtAnio.setText(anio + "");
					
					txtEdad.setText(alum.getEdad_alumno() + "");
					txtNacionalidad.setText(alum.getNacionalidad_alumno() + "");
					txtMeses.setText(alum.getMeses_cursada() + "");
					check1.setSelected(alum.isEnfermedad_alumno());
					txtDescripEnfermedad.setText(alum.getDescripcion_enfermedad_alumno() + "");
					check2.setSelected(alum.isMedicina_alumno());
					txtDescripMedicina.setText(alum.getDescripcion_medicina_alumno() + "");
					txtTelefonoEmergencia.setText(alum.getTelefono_emergencia() + "");
					txtPersonaEmergencia.setText(alum.getPersona_emergencia() + "");
					
					String inicio = alum.getFecha_inicio_alumno();
					String[] partir2 = inicio.split("/");
					String diainicio = partir2[0];
					String mesinicio = partir2[1];
					String anioinicio = partir2[2];
					txtInicioDia.setText(diainicio + "");
					txtInicioMes.setText(mesinicio + "");
					txtInicioAnio.setText(anioinicio + "");
					
					String finals = alum.getFecha_final_alumno();
					String[] partir3 = finals.split("/");
					String diafinal = partir2[0];
					String mesfinal = partir2[1];
					String aniofinal = partir2[2];
					txtFinalDia.setText(diafinal);
					txtFinalMes.setText(mesfinal);
					txtFinalAnio.setText(aniofinal);
					
					cmbEstado.setSelectedItem(alum.getEstado_alumno());
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno por DNI", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno por DNI", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscarXDNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(515, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(519))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(80)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(38))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(16)
							.addComponent(label_1)
							.addGap(10)
							.addComponent(cmbLegajo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtLegajo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBuscarXLegajo, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
							.addComponent(lblDniDelAlumno, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtBuscarDNI, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBuscarXDNI, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 991, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(label_1))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(cmbLegajo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtLegajo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscarXLegajo)
								.addComponent(lblDniDelAlumno, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtBuscarDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscarXDNI, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(19)
							.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(78)
							.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(110)
							.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(57)
							.addComponent(txtLocalidad, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(19)
							.addComponent(label_23)
							.addGap(92)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(110)
							.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(txtCP, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(19)
							.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(78)
							.addComponent(txtDomicilio, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(110)
							.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(19)
							.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(txtNumDomicilio, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(110)
							.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(txtTipoDocumento, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(19)
							.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(78)
							.addComponent(txtPiso, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(110)
							.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(txtNumDNI, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(19)
							.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(txtDepartamento, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(110)
							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(txtDia, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
							.addGap(3)
							.addComponent(txtMes, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_12)
							.addGap(6)
							.addComponent(txtAnio, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(85)
									.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(80)
									.addComponent(txtInicioDia, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
							.addGap(3)
							.addComponent(txtInicioMes, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(txtInicioAnio, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(txtFinalDia, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(txtFinalMes, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(txtFinalAnio, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbEstado, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCambiarEstado, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(9)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGap(15)
								.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtCalleUno, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addGap(22)
								.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addGap(8)
								.addComponent(txtCalleDos, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtMeses, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGap(398)
								.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addGap(4)
								.addComponent(txtNacionalidad, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(8)
							.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(txtLocalidad, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(7)
							.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(9)
							.addComponent(txtCP, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(txtDomicilio, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(5)
							.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(7)
							.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(5)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(txtNumDomicilio, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(txtTipoDocumento, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(7)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(txtPiso, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(txtNumDNI, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtDepartamento, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(txtDia, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(txtMes, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(txtAnio, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtNacionalidad, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtCalleUno, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCalleDos, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMeses, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
					.addGap(11)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(1)
									.addComponent(txtInicioDia, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
						.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtInicioMes, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtInicioAnio, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtFinalDia, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtFinalMes, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCambiarEstado, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
									.addComponent(cmbEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtFinalAnio, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);
	}

}
