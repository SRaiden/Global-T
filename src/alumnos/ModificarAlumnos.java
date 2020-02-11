package alumnos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;

import classDAO.AlumnosDAO;
import classVO.AlumnosVO;

import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ModificarAlumnos extends JPanel {

	private JTextField txtLegajo;
	private JTextField txtApellido;
	private JTextField txtNumDomicilio;
	private JTextField txtNombre;
	private JTextField txtDomicilio;
	private JTextField txtPiso;
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
	private JTextField txtEstado;
	private JTextField txtCalleUno;
	private JTextField txtCalleDos;
	private JTextField txtDepartamento;
	private JTextField txtBuscarDNI;
	private JTextField txtFinalAnio;
	private JTextField txtFinalMes;
	private JTextField txtFinalDia;
	private JTextField txtInicioAnio;
	private JTextField txtInicioMes;
	private JTextField txtInicioDia;
	private JTextField txtMeses;
	
	public ModificarAlumnos() {
		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Modificar Alumno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JLabel label_1 = new JLabel("Legajo del Alumno");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(10, 40, 116, 17);
		panel.add(label_1);
		
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
		cmbLegajo.setBounds(136, 39, 53, 20);
		panel.add(cmbLegajo);
		
		txtLegajo = new JTextField();
		txtLegajo.setColumns(10);
		txtLegajo.setBounds(199, 39, 86, 20);
		panel.add(txtLegajo);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(173, 109, 129, 23);
		panel.add(txtApellido);
		
		JLabel label_2 = new JLabel("Apellido");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(33, 107, 62, 24);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Nombre");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(33, 142, 48, 24);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Piso");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(33, 248, 62, 24);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Numero Domicilio");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(33, 213, 130, 24);
		panel.add(label_5);
		
		txtNumDomicilio = new JTextField();
		txtNumDomicilio.setColumns(10);
		txtNumDomicilio.setBounds(173, 216, 129, 23);
		panel.add(txtNumDomicilio);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(173, 144, 129, 23);
		panel.add(txtNombre);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(173, 179, 129, 23);
		panel.add(txtDomicilio);
		
		JLabel label_6 = new JLabel("Domicilio");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(33, 178, 62, 24);
		panel.add(label_6);
		
		txtPiso = new JTextField();
		txtPiso.setColumns(10);
		txtPiso.setBounds(173, 250, 129, 23);
		panel.add(txtPiso);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 82, 987, 465);
		panel.add(panel_1);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(525, 238, 200, 23);
		panel_1.add(txtNacionalidad);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_2.setBounds(10, 303, 955, 105);
		panel_1.add(panel_2);
		
		JLabel label_7 = new JLabel("\u00BFPosee Alguna Enfermedad?");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(10, 21, 175, 17);
		panel_2.add(label_7);
		
		JCheckBox check1 = new JCheckBox("");
		check1.setBounds(192, 19, 21, 23);
		panel_2.add(check1);
		
		JLabel label_8 = new JLabel("\u00BFToma Alguna Medicacion?");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(10, 59, 175, 17);
		panel_2.add(label_8);
		
		JCheckBox check2 = new JCheckBox("");
		check2.setBounds(192, 57, 21, 23);
		panel_2.add(check2);
		
		JLabel label_9 = new JLabel("Telefono de Emergencia");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(519, 23, 157, 17);
		panel_2.add(label_9);
		
		txtTelefonoEmergencia = new JTextField();
		txtTelefonoEmergencia.setColumns(10);
		txtTelefonoEmergencia.setBounds(686, 21, 200, 23);
		panel_2.add(txtTelefonoEmergencia);
		
		JLabel label_10 = new JLabel("Sr/a de Emergencia");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(519, 59, 157, 17);
		panel_2.add(label_10);
		
		txtPersonaEmergencia = new JTextField();
		txtPersonaEmergencia.setColumns(10);
		txtPersonaEmergencia.setBounds(686, 57, 200, 23);
		panel_2.add(txtPersonaEmergencia);
		
		JLabel label_11 = new JLabel("Descrip.");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(230, 61, 59, 17);
		panel_2.add(label_11);
		
		txtDescripMedicina = new JTextField();
		txtDescripMedicina.setColumns(10);
		txtDescripMedicina.setBounds(286, 58, 208, 23);
		panel_2.add(txtDescripMedicina);
		
		txtDescripEnfermedad = new JTextField();
		txtDescripEnfermedad.setColumns(10);
		txtDescripEnfermedad.setBounds(286, 21, 208, 23);
		panel_2.add(txtDescripEnfermedad);
		
		JLabel label_12 = new JLabel("Descrip.");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(230, 24, 59, 17);
		panel_2.add(label_12);
		
		JLabel label_13 = new JLabel("Estado");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(653, 424, 49, 24);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("Edad Actual");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(735, 204, 89, 24);
		panel_1.add(label_14);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(814, 206, 48, 23);
		panel_1.add(txtEdad);
		
		JLabel label_15 = new JLabel("Fecha Nacimiento");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(399, 203, 122, 24);
		panel_1.add(label_15);
		
		txtDia = new JTextField();
		txtDia.setColumns(10);
		txtDia.setBounds(525, 205, 48, 23);
		panel_1.add(txtDia);
		
		JLabel label_16 = new JLabel("/");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(583, 202, 9, 24);
		panel_1.add(label_16);
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		txtMes.setBounds(595, 204, 48, 23);
		panel_1.add(txtMes);
		
		JLabel label_17 = new JLabel("/");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(653, 202, 4, 24);
		panel_1.add(label_17);
		
		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		txtAnio.setBounds(663, 204, 62, 23);
		panel_1.add(txtAnio);
		
		JLabel label_18 = new JLabel("Numero DNI");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(399, 166, 122, 24);
		panel_1.add(label_18);
		
		txtNumDNI = new JTextField();
		txtNumDNI.setColumns(10);
		txtNumDNI.setBounds(525, 169, 200, 23);
		panel_1.add(txtNumDNI);
		
		JComboBox cmbTipoDNI = new JComboBox();
		cmbTipoDNI.addItem("DNI");
		cmbTipoDNI.addItem("CARNET EXT.");
		cmbTipoDNI.addItem("RUC");
		cmbTipoDNI.addItem("PASAPORTE");
		cmbTipoDNI.addItem("PART. DE NACIMIENTO-IDENTIDAD");
		cmbTipoDNI.addItem("CEDULA");
		cmbTipoDNI.addItem("OTROS");
		cmbTipoDNI.setBounds(525, 138, 200, 20);
		panel_1.add(cmbTipoDNI);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(525, 104, 200, 23);
		panel_1.add(txtTelefono);
		
		txtCP = new JTextField();
		txtCP.setColumns(10);
		txtCP.setBounds(525, 70, 200, 23);
		panel_1.add(txtCP);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(525, 36, 200, 23);
		panel_1.add(txtLocalidad);
		
		JLabel label_19 = new JLabel("Tipo Documento");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(399, 135, 122, 24);
		panel_1.add(label_19);
		
		JLabel label_20 = new JLabel("Telefono");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_20.setBounds(399, 102, 93, 24);
		panel_1.add(label_20);
		
		JLabel label_21 = new JLabel("Codigo Postal");
		label_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_21.setBounds(399, 68, 93, 24);
		panel_1.add(label_21);
		
		JLabel label_22 = new JLabel("Localidad");
		label_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_22.setBounds(399, 34, 69, 24);
		panel_1.add(label_22);
		
		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setColumns(10);
		txtEstado.setBounds(712, 426, 136, 23);
		panel_1.add(txtEstado);
		
		JLabel label_23 = new JLabel("Entre");
		label_23.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_23.setBounds(24, 267, 53, 24);
		panel_1.add(label_23);
		
		txtCalleUno = new JTextField();
		txtCalleUno.setColumns(10);
		txtCalleUno.setBounds(87, 267, 200, 23);
		panel_1.add(txtCalleUno);
		
		JLabel label_24 = new JLabel("Y ");
		label_24.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_24.setBounds(309, 267, 53, 24);
		panel_1.add(label_24);
		
		txtCalleDos = new JTextField();
		txtCalleDos.setColumns(10);
		txtCalleDos.setBounds(337, 269, 200, 23);
		panel_1.add(txtCalleDos);
		
		JLabel label_25 = new JLabel("Nacionalidad");
		label_25.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_25.setBounds(399, 236, 122, 24);
		panel_1.add(label_25);
		
		JLabel label_26 = new JLabel("Departamento");
		label_26.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_26.setBounds(24, 204, 116, 24);
		panel_1.add(label_26);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(163, 206, 129, 23);
		panel_1.add(txtDepartamento);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AlumnosVO alum = new AlumnosVO();
				
				String legajo1 = (String) cmbLegajo.getSelectedItem();
				int num = Integer.parseInt(legajo1);
				alum.setLegajo_alumno1(num);
				String legajo2 = (String) txtLegajo.getText();
				int num2 = Integer.parseInt(legajo2);
				alum.setLegajo_alumno2(num2);
				String cadena = legajo1 + "-" +  legajo2;
				alum.setLegajo_alumno(cadena);
				
				alum.setNombre_alumno(txtNombre.getText());
				alum.setApellido_alumno(txtApellido.getText());
				alum.setDomicilio_alumno(txtDomicilio.getText());
				alum.setNumero_domicilio_alumno(Integer.parseInt(txtNumDomicilio.getText()));
				alum.setPiso_Alumno(Integer.parseInt(txtPiso.getText()));
				alum.setDepartamento_alumno(txtDepartamento.getText());
				alum.setCalle_alumno_uno(txtCalleUno.getText());
				alum.setCalle_alumno_dos(txtCalleDos.getText());
				alum.setLocalidad_alumno(txtLocalidad.getText());
				alum.setCp_alumno(Integer.parseInt(txtCP.getText()));
				alum.setTelefono_alumno(txtTelefono.getText());
				
				String tipodni = (String) cmbTipoDNI.getSelectedItem();
				alum.setTipo_documento_alumno(tipodni);
				alum.setNumero_documento_alumno(txtNumDNI.getText());
				
				String fecha = txtDia.getText() + " / " + txtMes.getText() + " / " + txtAnio.getText();
				alum.setFecha_nacimiento_alumno(fecha);
				
				alum.setEdad_alumno(Integer.parseInt(txtEdad.getText()));
				alum.setNacionalidad_alumno(txtNacionalidad.getText());
				alum.setMeses_cursada(txtMeses.getText());
				alum.setEnfermedad_alumno(check1.isSelected());
				alum.setDescripcion_enfermedad_alumno(txtDescripEnfermedad.getText());
				alum.setMedicina_alumno(check2.isSelected());
				alum.setDescripcion_medicina_alumno(txtDescripMedicina.getText());
				alum.setTelefono_emergencia(txtTelefonoEmergencia.getText());
				alum.setPersona_emergencia(txtPersonaEmergencia.getText());
				
				String fechainicio = txtInicioDia.getText() + " / " + txtInicioMes.getText() + " / " + txtInicioAnio.getText();
				alum.setFecha_inicio_alumno(fechainicio);
				String fechafinal = txtFinalDia.getText() + " / " + txtFinalMes.getText() + " / " + txtFinalAnio.getText();
				alum.setFecha_final_alumno(fechafinal);
				
				alum.setEstado_alumno(txtEstado.getText());
				try {
					String resp = AlumnosDAO.ActualizarAlumnos(alum);
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
					txtEstado.setText("");
					txtInicioDia.setText("");
					txtInicioMes.setText("");
					txtInicioAnio.setText("");
					txtFinalDia.setText("");
					txtFinalMes.setText("");
					txtFinalAnio.setText("");
					txtMeses.setText("");
					// cargarAlumnos(0);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnModificar.setBounds(858, 419, 107, 35);
		panel_1.add(btnModificar);
		
		txtFinalAnio = new JTextField();
		txtFinalAnio.setColumns(10);
		txtFinalAnio.setBounds(555, 426, 62, 23);
		panel_1.add(txtFinalAnio);
		
		JLabel label_28 = new JLabel("/");
		label_28.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_28.setBounds(547, 424, 4, 24);
		panel_1.add(label_28);
		
		txtFinalMes = new JTextField();
		txtFinalMes.setColumns(10);
		txtFinalMes.setBounds(495, 426, 48, 23);
		panel_1.add(txtFinalMes);
		
		JLabel label_29 = new JLabel("/");
		label_29.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_29.setBounds(482, 424, 9, 24);
		panel_1.add(label_29);
		
		txtFinalDia = new JTextField();
		txtFinalDia.setColumns(10);
		txtFinalDia.setBounds(430, 426, 48, 23);
		panel_1.add(txtFinalDia);
		
		JLabel label_30 = new JLabel("Fecha Finalizacion");
		label_30.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_30.setBounds(307, 424, 113, 24);
		panel_1.add(label_30);
		
		txtInicioAnio = new JTextField();
		txtInicioAnio.setColumns(10);
		txtInicioAnio.setBounds(227, 426, 62, 23);
		panel_1.add(txtInicioAnio);
		
		JLabel label_31 = new JLabel("/");
		label_31.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_31.setBounds(218, 424, 4, 24);
		panel_1.add(label_31);
		
		txtInicioMes = new JTextField();
		txtInicioMes.setColumns(10);
		txtInicioMes.setBounds(160, 426, 48, 23);
		panel_1.add(txtInicioMes);
		
		JLabel label_32 = new JLabel("/");
		label_32.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_32.setBounds(148, 424, 9, 24);
		panel_1.add(label_32);
		
		txtInicioDia = new JTextField();
		txtInicioDia.setColumns(10);
		txtInicioDia.setBounds(90, 426, 48, 23);
		panel_1.add(txtInicioDia);
		
		JLabel label_33 = new JLabel("Fecha Inicio");
		label_33.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_33.setBounds(10, 425, 90, 24);
		panel_1.add(label_33);
		
		txtMeses = new JTextField();
		txtMeses.setColumns(10);
		txtMeses.setBounds(639, 269, 86, 23);
		panel_1.add(txtMeses);
		
		JLabel label_34 = new JLabel("Meses");
		label_34.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_34.setBounds(583, 267, 52, 24);
		panel_1.add(label_34);
		
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
					cmbTipoDNI.setSelectedItem(alum.getTipo_documento_alumno());
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
					
					txtEstado.setText(alum.getEstado_alumno() + "");
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscarXLegajo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarXLegajo.setBounds(295, 29, 92, 39);
		panel.add(btnBuscarXLegajo);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(88)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1007, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(91, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(540, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(535))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 558, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
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
					cmbTipoDNI.setSelectedItem(alum.getTipo_documento_alumno());
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
					
					txtEstado.setText(alum.getEstado_alumno() + "");
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno por DNI", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno por DNI", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscarXDNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarXDNI.setBounds(911, 32, 86, 39);
		panel.add(btnBuscarXDNI);
		
		txtBuscarDNI = new JTextField();
		txtBuscarDNI.setColumns(10);
		txtBuscarDNI.setBounds(742, 43, 159, 20);
		panel.add(txtBuscarDNI);
		
		JLabel label_27 = new JLabel("DNI del Alumno");
		label_27.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_27.setBounds(622, 44, 116, 17);
		panel.add(label_27);
		setLayout(groupLayout);
	}

}
