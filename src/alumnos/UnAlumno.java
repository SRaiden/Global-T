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
import classVO.AlumnosVO;

import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UnAlumno extends JPanel {

	private JTextField txtLegajo;
	private JTextField txtNacionalidad;
	private JTextField txtTelefonoEmergencia;
	private JTextField txtPersonaEmergencia;
	private JTextField txtDescripMedicacion;
	private JTextField txtDescripEnfermedad;
	private JTextField txtEstado;
	private JTextField txtTipoDocumento;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAnio;
	private JTextField txtLocalidad;
	private JTextField txtCP;
	private JTextField txtTelefono;
	private JTextField txtNumDNI;
	private JTextField txtEdad;
	private JTextField txtCalleUno;
	private JTextField txtCalleDos;
	private JTextField txtDepartamento;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtDomicilio;
	private JTextField txtNumDomicilio;
	private JTextField txtPiso;
	private JTextField txtBuscarDNI;
	private JTextField txtFinalAnio;
	private JTextField txtFinalMes;
	private JTextField txtFinalDia;
	private JTextField txtInicioAnio;
	private JTextField txtInicioMes;
	private JTextField txtInicioDia;
	private JTextField txtMeses;
	
	public UnAlumno() {
		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ver Datos de un Alumno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
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
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(522, 239, 200, 23);
		panel_1.add(txtNacionalidad);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_2.setBounds(10, 303, 955, 105);
		panel_1.add(panel_2);
		
		JLabel label_2 = new JLabel("\u00BFPosee Alguna Enfermedad?");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(10, 21, 175, 17);
		panel_2.add(label_2);
		
		JCheckBox check1 = new JCheckBox("");
		check1.setEnabled(false);
		check1.setBounds(192, 19, 21, 23);
		panel_2.add(check1);
		
		JLabel label_3 = new JLabel("\u00BFToma Alguna Medicacion?");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(10, 59, 175, 17);
		panel_2.add(label_3);
		
		JCheckBox check2 = new JCheckBox("");
		check2.setEnabled(false);
		check2.setBounds(192, 57, 21, 23);
		panel_2.add(check2);
		
		JLabel label_4 = new JLabel("Telefono de Emergencia");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(519, 23, 157, 17);
		panel_2.add(label_4);
		
		txtTelefonoEmergencia = new JTextField();
		txtTelefonoEmergencia.setEditable(false);
		txtTelefonoEmergencia.setColumns(10);
		txtTelefonoEmergencia.setBounds(686, 21, 200, 23);
		panel_2.add(txtTelefonoEmergencia);
		
		JLabel label_5 = new JLabel("Sr/a de Emergencia");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(519, 59, 157, 17);
		panel_2.add(label_5);
		
		txtPersonaEmergencia = new JTextField();
		txtPersonaEmergencia.setEditable(false);
		txtPersonaEmergencia.setColumns(10);
		txtPersonaEmergencia.setBounds(686, 58, 200, 23);
		panel_2.add(txtPersonaEmergencia);
		
		JLabel label_6 = new JLabel("Descrip.");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(230, 61, 59, 17);
		panel_2.add(label_6);
		
		txtDescripMedicacion = new JTextField();
		txtDescripMedicacion.setEditable(false);
		txtDescripMedicacion.setColumns(10);
		txtDescripMedicacion.setBounds(286, 58, 208, 23);
		panel_2.add(txtDescripMedicacion);
		
		txtDescripEnfermedad = new JTextField();
		txtDescripEnfermedad.setEditable(false);
		txtDescripEnfermedad.setColumns(10);
		txtDescripEnfermedad.setBounds(286, 21, 208, 23);
		panel_2.add(txtDescripEnfermedad);
		
		JLabel label_7 = new JLabel("Descrip.");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(230, 24, 59, 17);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("Estado");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(641, 424, 49, 24);
		panel_1.add(label_8);
		
		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setColumns(10);
		txtEstado.setBounds(689, 427, 200, 23);
		panel_1.add(txtEstado);
		
		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setEditable(false);
		txtTipoDocumento.setColumns(10);
		txtTipoDocumento.setBounds(522, 135, 200, 23);
		panel_1.add(txtTipoDocumento);
		
		JLabel label_9 = new JLabel("Fecha Nacimiento");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(396, 202, 122, 24);
		panel_1.add(label_9);
		
		txtDia = new JTextField();
		txtDia.setEditable(false);
		txtDia.setColumns(10);
		txtDia.setBounds(522, 205, 48, 23);
		panel_1.add(txtDia);
		
		JLabel label_10 = new JLabel("/");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(580, 202, 9, 24);
		panel_1.add(label_10);
		
		txtMes = new JTextField();
		txtMes.setEditable(false);
		txtMes.setColumns(10);
		txtMes.setBounds(592, 204, 48, 23);
		panel_1.add(txtMes);
		
		JLabel label_11 = new JLabel("/");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(650, 202, 4, 24);
		panel_1.add(label_11);
		
		txtAnio = new JTextField();
		txtAnio.setEditable(false);
		txtAnio.setColumns(10);
		txtAnio.setBounds(660, 204, 62, 23);
		panel_1.add(txtAnio);
		
		JLabel label_12 = new JLabel("Localidad");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(397, 25, 69, 24);
		panel_1.add(label_12);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setEditable(false);
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(522, 27, 200, 23);
		panel_1.add(txtLocalidad);
		
		JLabel label_13 = new JLabel("Codigo Postal");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(397, 62, 93, 24);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("Telefono");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(397, 97, 93, 24);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("Tipo Documento");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(397, 133, 122, 24);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("Numero DNI");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(397, 167, 122, 24);
		panel_1.add(label_16);
		
		txtCP = new JTextField();
		txtCP.setEditable(false);
		txtCP.setColumns(10);
		txtCP.setBounds(522, 62, 200, 23);
		panel_1.add(txtCP);
		
		txtTelefono = new JTextField();
		txtTelefono.setEditable(false);
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(522, 99, 200, 23);
		panel_1.add(txtTelefono);
		
		txtNumDNI = new JTextField();
		txtNumDNI.setEditable(false);
		txtNumDNI.setColumns(10);
		txtNumDNI.setBounds(522, 169, 200, 23);
		panel_1.add(txtNumDNI);
		
		JLabel label_17 = new JLabel("Edad Actual");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(732, 204, 80, 24);
		panel_1.add(label_17);
		
		txtEdad = new JTextField();
		txtEdad.setEditable(false);
		txtEdad.setColumns(10);
		txtEdad.setBounds(810, 205, 48, 23);
		panel_1.add(txtEdad);
		
		JLabel label_18 = new JLabel("Entre");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(20, 267, 53, 24);
		panel_1.add(label_18);
		
		txtCalleUno = new JTextField();
		txtCalleUno.setEditable(false);
		txtCalleUno.setColumns(10);
		txtCalleUno.setBounds(83, 267, 200, 23);
		panel_1.add(txtCalleUno);
		
		JLabel label_19 = new JLabel("Y ");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(305, 267, 53, 24);
		panel_1.add(label_19);
		
		txtCalleDos = new JTextField();
		txtCalleDos.setEditable(false);
		txtCalleDos.setColumns(10);
		txtCalleDos.setBounds(333, 269, 200, 23);
		panel_1.add(txtCalleDos);
		
		JLabel label_20 = new JLabel("Nacionalidad");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_20.setBounds(396, 237, 122, 24);
		panel_1.add(label_20);
		
		JLabel label_21 = new JLabel("Departamento");
		label_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_21.setBounds(20, 202, 93, 24);
		panel_1.add(label_21);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setEditable(false);
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(160, 204, 129, 23);
		panel_1.add(txtDepartamento);

		txtBuscarDNI = new JTextField();
		txtBuscarDNI.setColumns(10);
		
		JLabel label_27 = new JLabel("DNI del Alumno");
		label_27.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
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
					txtDescripMedicacion.setText(alum.getDescripcion_medicina_alumno() + "");
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
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1007, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(535, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(470))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 558, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(76, Short.MAX_VALUE))
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
					txtDescripMedicacion.setText(alum.getDescripcion_medicina_alumno() + "");
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
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno por DNI", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno por DNI", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscarXDNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(16)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cmbLegajo, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(txtLegajo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnBuscarXLegajo, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
							.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(txtBuscarDNI, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnBuscarXDNI, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 975, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(4)
								.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(3)
								.addComponent(txtBuscarDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addComponent(btnBuscarXDNI, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnBuscarXLegajo)
							.addComponent(txtLegajo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(cmbLegajo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_1)))
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 465, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		
		JLabel label_22 = new JLabel("Apellido");
		label_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_22.setBounds(20, 25, 62, 24);
		panel_1.add(label_22);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBounds(160, 27, 129, 23);
		panel_1.add(txtApellido);
		
		JLabel label_23 = new JLabel("Nombre");
		label_23.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_23.setBounds(20, 60, 48, 24);
		panel_1.add(label_23);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(160, 62, 129, 23);
		panel_1.add(txtNombre);
		
		JLabel label_24 = new JLabel("Domicilio");
		label_24.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_24.setBounds(20, 96, 62, 24);
		panel_1.add(label_24);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setEditable(false);
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(160, 97, 129, 23);
		panel_1.add(txtDomicilio);
		
		JLabel label_25 = new JLabel("Numero Domicilio");
		label_25.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_25.setBounds(20, 131, 111, 24);
		panel_1.add(label_25);
		
		txtNumDomicilio = new JTextField();
		txtNumDomicilio.setEditable(false);
		txtNumDomicilio.setColumns(10);
		txtNumDomicilio.setBounds(160, 134, 129, 23);
		panel_1.add(txtNumDomicilio);
		
		JLabel label_26 = new JLabel("Piso");
		label_26.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_26.setBounds(20, 166, 62, 24);
		panel_1.add(label_26);
		
		txtPiso = new JTextField();
		txtPiso.setEditable(false);
		txtPiso.setColumns(10);
		txtPiso.setBounds(160, 168, 129, 23);
		panel_1.add(txtPiso);
		
		txtFinalAnio = new JTextField();
		txtFinalAnio.setEditable(false);
		txtFinalAnio.setColumns(10);
		txtFinalAnio.setBounds(555, 426, 62, 23);
		panel_1.add(txtFinalAnio);
		
		JLabel label_28 = new JLabel("/");
		label_28.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_28.setBounds(547, 424, 4, 24);
		panel_1.add(label_28);
		
		txtFinalMes = new JTextField();
		txtFinalMes.setEditable(false);
		txtFinalMes.setColumns(10);
		txtFinalMes.setBounds(495, 426, 48, 23);
		panel_1.add(txtFinalMes);
		
		JLabel label_29 = new JLabel("/");
		label_29.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_29.setBounds(482, 424, 9, 24);
		panel_1.add(label_29);
		
		txtFinalDia = new JTextField();
		txtFinalDia.setEditable(false);
		txtFinalDia.setColumns(10);
		txtFinalDia.setBounds(430, 426, 48, 23);
		panel_1.add(txtFinalDia);
		
		JLabel label_30 = new JLabel("Fecha Finalizacion");
		label_30.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_30.setBounds(307, 424, 113, 24);
		panel_1.add(label_30);
		
		txtInicioAnio = new JTextField();
		txtInicioAnio.setEditable(false);
		txtInicioAnio.setColumns(10);
		txtInicioAnio.setBounds(227, 426, 62, 23);
		panel_1.add(txtInicioAnio);
		
		JLabel label_31 = new JLabel("/");
		label_31.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_31.setBounds(218, 424, 4, 24);
		panel_1.add(label_31);
		
		txtInicioMes = new JTextField();
		txtInicioMes.setEditable(false);
		txtInicioMes.setColumns(10);
		txtInicioMes.setBounds(160, 426, 48, 23);
		panel_1.add(txtInicioMes);
		
		JLabel label_32 = new JLabel("/");
		label_32.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_32.setBounds(148, 424, 9, 24);
		panel_1.add(label_32);
		
		txtInicioDia = new JTextField();
		txtInicioDia.setEditable(false);
		txtInicioDia.setColumns(10);
		txtInicioDia.setBounds(90, 426, 48, 23);
		panel_1.add(txtInicioDia);
		
		JLabel label_33 = new JLabel("Fecha Inicio");
		label_33.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_33.setBounds(10, 425, 90, 24);
		panel_1.add(label_33);
		
		txtMeses = new JTextField();
		txtMeses.setEditable(false);
		txtMeses.setColumns(10);
		txtMeses.setBounds(636, 269, 86, 23);
		panel_1.add(txtMeses);
		
		JLabel label_34 = new JLabel("Meses");
		label_34.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_34.setBounds(580, 267, 52, 24);
		panel_1.add(label_34);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);
	}

}
