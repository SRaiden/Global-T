package alumnos;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import classDAO.AlumnosDAO;
import classVO.AlumnosVO;

public class AgregarAlumno extends JPanel {

	private JTextField txtNacionalidad;
	private JTextField txtEdad;
	private JTextField txtCalleUno;
	private JTextField txtCalleDos;
	private JTextField txtDepartamento;
	private JTextField txtDescripEnfermedad;
	private JTextField txtTelEmergencia;
	private JTextField txtPersonaEmergencia;
	private JTextField txtDescripMedicina;
	private JTextField txtLegajo;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtDomicilio;
	private JTextField txtNumDomicilio;
	private JTextField txtPiso;
	private JTextField txtLocalidad;
	private JTextField txtCodPostal;
	private JTextField txtTelefono;
	private JTextField txtNumDNI;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAnio;
	private JTextField txtInicioDia;
	private JTextField txtInicioMes;
	private JTextField txtInicioAnio;
	private JTextField txtFinalDia;
	private JTextField txtFinalMes;
	private JTextField txtFinalAnio;
	
	public AgregarAlumno() {
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agregar Alumno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JLabel label_25 = new JLabel("Global - T");
		label_25.setForeground(Color.BLACK);
		label_25.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(529)
							.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1095, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 533, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(122, Short.MAX_VALUE))
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setColumns(10);
		
		JLabel label_8 = new JLabel("Edad Actual");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		
		JLabel label_9 = new JLabel("Entre");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtCalleUno = new JTextField();
		txtCalleUno.setColumns(10);
		
		JLabel label_10 = new JLabel("Y ");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtCalleDos = new JTextField();
		txtCalleDos.setColumns(10);
		
		JLabel label_11 = new JLabel("Departamento");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtDepartamento = new JTextField();
		txtDepartamento.setColumns(10);
		
		JLabel label_12 = new JLabel("Nacionalidad");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JComboBox cmbEstado = new JComboBox();
		cmbEstado.addItem("APERTURA");
		cmbEstado.addItem("FINALIZADO");
		cmbEstado.addItem("INCORPORACION");
		cmbEstado.addItem("REINCORPORACION");
		cmbEstado.addItem("SUSPENDIDO");
		cmbEstado.addItem("ABANDONO");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBackground(SystemColor.inactiveCaption);
		
		JLabel label = new JLabel("\u00BFPosee Alguna Enfermedad?");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel label_1 = new JLabel("Descrip.");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtDescripEnfermedad = new JTextField();
		txtDescripEnfermedad.setColumns(10);
		
		JCheckBox check1 = new JCheckBox("");
		
		JLabel label_2 = new JLabel("\u00BFToma Alguna Medicacion?");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JCheckBox check2 = new JCheckBox("");
		
		JLabel label_3 = new JLabel("Telefono de Emergencia");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtTelEmergencia = new JTextField();
		txtTelEmergencia.setColumns(10);
		
		JLabel label_4 = new JLabel("Sr/a de Emergencia");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtPersonaEmergencia = new JTextField();
		txtPersonaEmergencia.setColumns(10);
		
		JLabel label_5 = new JLabel("Descrip.");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtDescripMedicina = new JTextField();
		txtDescripMedicina.setColumns(10);
		
		JLabel label_6 = new JLabel("Legajo del Alumno");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
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
		
		JLabel label_7 = new JLabel("Apellido");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		
		JLabel label_13 = new JLabel("Nombre");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		JLabel label_14 = new JLabel("Domicilio");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtDomicilio = new JTextField();
		txtDomicilio.setColumns(10);
		
		JLabel label_15 = new JLabel("Numero Domicilio");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtNumDomicilio = new JTextField();
		txtNumDomicilio.setColumns(10);
		
		JLabel label_16 = new JLabel("Piso");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtPiso = new JTextField();
		txtPiso.setColumns(10);
		
		JLabel label_17 = new JLabel("Localidad");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtLocalidad = new JTextField();
		txtLocalidad.setColumns(10);
		
		JLabel label_18 = new JLabel("Codigo Postal");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtCodPostal = new JTextField();
		txtCodPostal.setColumns(10);
		
		JLabel label_19 = new JLabel("Telefono");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		
		JLabel label_20 = new JLabel("Tipo Documento");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JComboBox CmbTipoDNI = new JComboBox();
		CmbTipoDNI.addItem("DNI");
		CmbTipoDNI.addItem("CARNET EXT.");
		CmbTipoDNI.addItem("RUC");
		CmbTipoDNI.addItem("PASAPORTE");
		CmbTipoDNI.addItem("PART. DE NACIMIENTO-IDENTIDAD");
		CmbTipoDNI.addItem("CEDULA");
		CmbTipoDNI.addItem("OTROS");
		
		txtNumDNI = new JTextField();
		txtNumDNI.setColumns(10);
		
		JLabel label_21 = new JLabel("Numero DNI");
		label_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel label_22 = new JLabel("Fecha Nacimiento");
		label_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtDia = new JTextField();
		txtDia.setColumns(10);
		
		JLabel label_23 = new JLabel("/");
		label_23.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		
		JLabel label_24 = new JLabel("/");
		label_24.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		
		
		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		
		JLabel label_26 = new JLabel("Estado");
		label_26.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label)
							.addGap(7)
							.addComponent(check1)
							.addGap(17))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(check2)
							.addGap(18)))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDescripMedicina, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDescripEnfermedad, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))))
					.addGap(68)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtPersonaEmergencia, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtTelEmergencia, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
					.addGap(102))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(2)
							.addComponent(label))
						.addComponent(check1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDescripEnfermedad, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(3)
									.addComponent(label_1))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(3)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_3)
										.addComponent(txtTelEmergencia, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_2.createSequentialGroup()
											.addGap(1)
											.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
												.addComponent(label_4)
												.addComponent(txtPersonaEmergencia, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtDescripMedicina, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_5))
											.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_2.createSequentialGroup()
													.addGap(2)
													.addComponent(label_2))
												.addComponent(check2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))))))
					.addGap(25))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel label_27 = new JLabel("Fecha Inicio");
		label_27.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtInicioDia = new JTextField();
		txtInicioDia.setColumns(10);
		
		JLabel label_28 = new JLabel("/");
		label_28.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtInicioMes = new JTextField();
		txtInicioMes.setColumns(10);
		
		JLabel label_29 = new JLabel("/");
		label_29.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtInicioAnio = new JTextField();
		txtInicioAnio.setColumns(10);
		
		JLabel label_30 = new JLabel("Fecha Finalizacion");
		label_30.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtFinalDia = new JTextField();
		txtFinalDia.setColumns(10);
		
		JLabel label_31 = new JLabel("/");
		label_31.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtFinalMes = new JTextField();
		txtFinalMes.setColumns(10);
		
		JLabel label_32 = new JLabel("/");
		label_32.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtFinalAnio = new JTextField();
		txtFinalAnio.setColumns(10);
		
		JLabel lblMeses = new JLabel("Meses");
		lblMeses.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JComboBox cmbMes = new JComboBox();
		cmbMes.addItem("1");
		cmbMes.addItem("2");
		cmbMes.addItem("3");
		cmbMes.addItem("4");
		cmbMes.addItem("5");
		cmbMes.addItem("6");
		cmbMes.addItem("7");
		cmbMes.addItem("8");
		cmbMes.addItem("9");
		cmbMes.addItem("10");
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlumnosVO alum = new AlumnosVO();
				
				String legajo1 = (String) cmbLegajo.getSelectedItem();
				int num = Integer.parseInt(legajo1);
				alum.setLegajo_alumno1(num);
				
				alum.setLegajo_alumno2(Integer.parseInt(txtLegajo.getText()));
				
				String cadena = cmbLegajo.getSelectedItem() + "-"+ txtLegajo.getText();
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
				alum.setCp_alumno(Integer.parseInt(txtCodPostal.getText()));
				alum.setTelefono_alumno(txtTelefono.getText());
				
				String tipodni = (String) CmbTipoDNI.getSelectedItem();
				alum.setTipo_documento_alumno(tipodni);
				
				alum.setNumero_documento_alumno(txtNumDNI.getText());
				String fecha = txtDia.getText() + " / " + txtMes.getText() + " / " + txtAnio.getText();
				alum.setFecha_nacimiento_alumno(fecha);
				alum.setEdad_alumno(Integer.parseInt(txtEdad.getText()));
				alum.setNacionalidad_alumno(txtNacionalidad.getText());
				String mes = (String) cmbMes.getSelectedItem();
				alum.setMeses_cursada(mes);
				alum.setEnfermedad_alumno(check1.isSelected());
				alum.setDescripcion_enfermedad_alumno(txtDescripEnfermedad.getText());
				alum.setMedicina_alumno(check2.isSelected());
				alum.setDescripcion_medicina_alumno(txtDescripMedicina.getText());
				alum.setTelefono_emergencia(txtTelEmergencia.getText());
				alum.setPersona_emergencia(txtPersonaEmergencia.getText());
				
				String fechainicio = txtInicioDia.getText() + " / " + txtInicioMes.getText() + " / " + txtInicioAnio.getText();
				alum.setFecha_inicio_alumno(fechainicio);
				
				String fechafinal = txtFinalDia.getText() + " / " + txtFinalMes.getText() + " / " + txtFinalAnio.getText();
				alum.setFecha_final_alumno(fechafinal);
				
				String estado = (String) cmbEstado.getSelectedItem();
				alum.setEstado_alumno(estado);
				try {
					String resp = AlumnosDAO.RegistrarAlumnos(alum);
					JOptionPane.showMessageDialog(null, resp, "Agregar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
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
					txtCodPostal.setText("");
					txtTelefono.setText("");
					txtNumDNI.setText("");
					txtDia.setText("");
					txtMes.setText("");
					txtAnio.setText("");
					txtEdad.setText("");
					txtNacionalidad.setText("");
					txtDescripEnfermedad.setText("");
					txtDescripMedicina.setText("");
					txtTelEmergencia.setText("");
					txtPersonaEmergencia.setText("");
					txtInicioDia.setText("");
					txtInicioMes.setText("");
					txtInicioAnio.setText("");
					txtFinalDia.setText("");
					txtFinalMes.setText("");
					txtFinalAnio.setText("");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1063, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(13, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 1032, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(16)
									.addComponent(cmbLegajo, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(txtLegajo, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addGap(159)
									.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addGap(56)
									.addComponent(txtLocalidad, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
									.addGap(78)
									.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(159)
									.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addGap(32)
									.addComponent(txtCodPostal, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_13)
									.addGap(92)
									.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(159)
									.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addGap(32)
									.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
									.addGap(78)
									.addComponent(txtDomicilio, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(159)
									.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(CmbTipoDNI, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(txtNumDomicilio, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(159)
									.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(txtNumDNI, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
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
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtFinalDia, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtFinalMes, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtFinalAnio, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
									.addGap(65)
									.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cmbEstado, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
									.addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
											.addGap(78)
											.addComponent(txtPiso, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
											.addGap(159)
											.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(txtDia, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(txtMes, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(label_24)
											.addGap(6)
											.addComponent(txtAnio, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
													.addGap(25)
													.addComponent(txtDepartamento, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
													.addGap(159)
													.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
													.addGap(10)
													.addComponent(txtCalleUno, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
													.addGap(18)
													.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
														.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_panel_1.createSequentialGroup()
															.addGap(28)
															.addComponent(txtCalleDos, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))))
											.addGap(5)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
													.addComponent(lblMeses, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
													.addGap(18)
													.addComponent(cmbMes, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED))
												.addComponent(txtNacionalidad, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
									.addGap(37)
									.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(4)
									.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addGap(26)))
							.addGap(22))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(cmbLegajo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtLegajo, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtLocalidad, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtCodPostal, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(txtDomicilio, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(CmbTipoDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(txtNumDomicilio, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(txtNumDNI, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(9)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtPiso, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(txtDia, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtMes, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(txtAnio, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(9)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(txtDepartamento, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(txtNacionalidad, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCalleUno, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(2)
									.addComponent(txtCalleDos, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(cmbMes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMeses, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
					.addGap(17)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(16)
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
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtInicioAnio, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtFinalDia, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addComponent(cmbEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtFinalMes, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtFinalAnio, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(18)
							.addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);
	}

}
