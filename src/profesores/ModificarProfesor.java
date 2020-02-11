package profesores;

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
import classDAO.ProfesoresDAO;
import classVO.AlumnosVO;
import classVO.ProfesoresVO;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ModificarProfesor extends JPanel {

	private JTextField txtBuscarCodProfesor;
	private JTextField txtNacionalidad;
	private JTextField txtLocalidad;
	private JTextField txtCP;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtDomicilio;
	private JTextField txtNumDomicilio;
	private JTextField txtPiso;
	private JTextField txtNumDNI;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAnio;
	private JTextField txtCalleDos;
	private JTextField txtCalleUno;
	private JTextField txtEstado;
	private JTextField txtDepartamento;
	private JTextField txtBuscarDNI;
	private JTextField txtCUIT;
	private JTextField txtInicioDia;
	private JTextField txtInicioMes;
	private JTextField txtInicioAnio;
	private JTextField txtCodProfesor;
	
	public ModificarProfesor() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Modificar Profesor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JLabel label_1 = new JLabel("Codigo");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(20, 30, 54, 24);
		panel.add(label_1);
		
		txtBuscarCodProfesor = new JTextField();
		txtBuscarCodProfesor.setColumns(10);
		txtBuscarCodProfesor.setBounds(83, 32, 129, 23);
		panel.add(txtBuscarCodProfesor);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(474)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1010, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 522, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 62, 990, 449);
		panel.add(panel_1);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(512, 299, 200, 23);
		panel_1.add(txtNacionalidad);
		
		JLabel label_2 = new JLabel("Localidad");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(387, 84, 69, 24);
		panel_1.add(label_2);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(512, 86, 200, 23);
		panel_1.add(txtLocalidad);
		
		JLabel label_3 = new JLabel("Codigo Postal");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(387, 119, 93, 24);
		panel_1.add(label_3);
		
		txtCP = new JTextField();
		txtCP.setColumns(10);
		txtCP.setBounds(512, 121, 200, 23);
		panel_1.add(txtCP);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(160, 121, 166, 23);
		panel_1.add(txtApellido);
		
		JLabel label_4 = new JLabel("Apellido");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(20, 119, 62, 24);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(20, 154, 48, 24);
		panel_1.add(label_5);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(160, 156, 166, 23);
		panel_1.add(txtNombre);
		
		JLabel label_6 = new JLabel("Telefono");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(387, 154, 93, 24);
		panel_1.add(label_6);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(512, 156, 200, 23);
		panel_1.add(txtTelefono);
		
		JLabel label_7 = new JLabel("Tipo Documento");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(387, 190, 122, 24);
		panel_1.add(label_7);
		
		JComboBox cmbTipoDNI = new JComboBox();
		cmbTipoDNI.addItem("DNI");
		cmbTipoDNI.addItem("CARNET EXT.");
		cmbTipoDNI.addItem("RUC");
		cmbTipoDNI.addItem("PASAPORTE");
		cmbTipoDNI.addItem("PART. DE NACIMIENTO-IDENTIDAD");
		cmbTipoDNI.addItem("CEDULA");
		cmbTipoDNI.addItem("OTROS");
		cmbTipoDNI.setBounds(512, 193, 200, 20);
		panel_1.add(cmbTipoDNI);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(160, 191, 166, 23);
		panel_1.add(txtDomicilio);
		
		JLabel label_8 = new JLabel("Domicilio");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(20, 190, 62, 24);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Numero Domicilio");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(20, 225, 122, 24);
		panel_1.add(label_9);
		
		txtNumDomicilio = new JTextField();
		txtNumDomicilio.setColumns(10);
		txtNumDomicilio.setBounds(160, 228, 166, 23);
		panel_1.add(txtNumDomicilio);
		
		JLabel label_10 = new JLabel("Piso");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(20, 260, 62, 24);
		panel_1.add(label_10);
		
		txtPiso = new JTextField();
		txtPiso.setColumns(10);
		txtPiso.setBounds(160, 262, 166, 23);
		panel_1.add(txtPiso);
		
		JLabel label_11 = new JLabel("Fecha Nacimiento");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(387, 260, 122, 24);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Numero DNI");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(387, 225, 122, 24);
		panel_1.add(label_12);
		
		txtNumDNI = new JTextField();
		txtNumDNI.setColumns(10);
		txtNumDNI.setBounds(512, 228, 200, 23);
		panel_1.add(txtNumDNI);
		
		txtDia = new JTextField();
		txtDia.setColumns(10);
		txtDia.setBounds(512, 263, 48, 23);
		panel_1.add(txtDia);
		
		JLabel label_13 = new JLabel("/");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(570, 260, 9, 24);
		panel_1.add(label_13);
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		txtMes.setBounds(582, 262, 48, 23);
		panel_1.add(txtMes);
		
		JLabel label_14 = new JLabel("/");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(640, 260, 4, 24);
		panel_1.add(label_14);
		
		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		txtAnio.setBounds(650, 262, 62, 23);
		panel_1.add(txtAnio);
		
		JLabel label_15 = new JLabel("Nacionalidad");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(387, 297, 93, 24);
		panel_1.add(label_15);
		
		txtCalleDos = new JTextField();
		txtCalleDos.setColumns(10);
		txtCalleDos.setBounds(444, 374, 200, 23);
		panel_1.add(txtCalleDos);
		
		JLabel label_16 = new JLabel("Y ");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(415, 372, 53, 24);
		panel_1.add(label_16);
		
		txtCalleUno = new JTextField();
		txtCalleUno.setColumns(10);
		txtCalleUno.setBounds(193, 374, 200, 23);
		panel_1.add(txtCalleUno);
		
		JLabel label_17 = new JLabel("Entre");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(130, 372, 53, 24);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("Estado");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(502, 408, 62, 24);
		panel_1.add(label_18);
		
		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setColumns(10);
		txtEstado.setBounds(551, 408, 165, 23);
		panel_1.add(txtEstado);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDepartamento.setBounds(20, 295, 93, 24);
		panel_1.add(lblDepartamento);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(160, 297, 166, 23);
		panel_1.add(txtDepartamento);
		
		JLabel label_19 = new JLabel("Numero CUIT");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(20, 332, 107, 24);
		panel_1.add(label_19);
		
		txtCUIT = new JTextField();
		txtCUIT.setColumns(10);
		txtCUIT.setBounds(160, 334, 166, 23);
		panel_1.add(txtCUIT);
		
		JLabel label_20 = new JLabel("Fecha Inicio");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_20.setBounds(387, 333, 93, 24);
		panel_1.add(label_20);
		
		txtInicioDia = new JTextField();
		txtInicioDia.setColumns(10);
		txtInicioDia.setBounds(512, 336, 48, 23);
		panel_1.add(txtInicioDia);
		
		JLabel label_21 = new JLabel("/");
		label_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_21.setBounds(570, 333, 9, 24);
		panel_1.add(label_21);
		
		txtInicioMes = new JTextField();
		txtInicioMes.setColumns(10);
		txtInicioMes.setBounds(582, 335, 48, 23);
		panel_1.add(txtInicioMes);
		
		JLabel label_22 = new JLabel("/");
		label_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_22.setBounds(640, 333, 4, 24);
		panel_1.add(label_22);
		
		txtInicioAnio = new JTextField();
		txtInicioAnio.setColumns(10);
		txtInicioAnio.setBounds(650, 335, 62, 23);
		panel_1.add(txtInicioAnio);
		
		JLabel lblCodigoProfesor = new JLabel("Codigo Profesor");
		lblCodigoProfesor.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCodigoProfesor.setBounds(20, 84, 107, 24);
		panel_1.add(lblCodigoProfesor);
		
		txtCodProfesor = new JTextField();
		txtCodProfesor.setColumns(10);
		txtCodProfesor.setBounds(160, 86, 86, 23);
		panel_1.add(txtCodProfesor);
		
		txtBuscarDNI = new JTextField();
		txtBuscarDNI.setColumns(10);
		txtBuscarDNI.setBounds(754, 32, 129, 23);
		panel.add(txtBuscarDNI);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDni.setBounds(716, 30, 38, 24);
		panel.add(lblDni);
		setLayout(groupLayout);

		JButton btnBuscarXCodProfesor = new JButton("Buscar");
		btnBuscarXCodProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String CodProf = txtBuscarCodProfesor.getText();
					int codpro = Integer.parseInt(CodProf);
					
					ProfesoresVO prof = ProfesoresDAO.BuscarUnProfesor(codpro);
					
					txtCodProfesor.setText(prof.getCodigo_Profesor() + "");
					txtApellido.setText(prof.getApellido_Profesor() + "");
					txtNombre.setText(prof.getNombre_Profesor() + "");
					txtDomicilio.setText(prof.getDomicilio_Profesor() + "");
					txtNumDomicilio.setText(prof.getNumero_Domicilio_Profesor() + "");
					txtPiso.setText(prof.getPiso_Profesor() + "");
					txtDepartamento.setText(prof.getDepartamento_Profesor() + "");
					txtCUIT.setText(prof.getNum_CUIT_Profesor() + "");
					txtLocalidad.setText(prof.getLocalidad_Profesor() + "");
					txtCP.setText(prof.getCP_Profesor() + "");
					txtTelefono.setText(prof.getTelefono_Profesor() + "");
					cmbTipoDNI.setSelectedItem(prof.getTipo_Documento_Profesor());
					txtNumDNI.setText(prof.getNum_Documento_Profesor() + "");
					
					String string = prof.getFecha_Nacimiento_Profesor();
					String[] partir = string.split("/");
					String dia = partir[0];
					String mes = partir[1];
					String anio = partir[2];
					txtDia.setText(dia + "");
					txtMes.setText(mes + "");
					txtAnio.setText(anio + "");
					
					
					txtNacionalidad.setText(prof.getNacionalidad_Profesor() + "");
					
					String strings = prof.getFecha_Inicio_Profesor();
					String[] i = strings.split("/");
					String diainicio = i[0];
					String mesinicio = i[1];
					String anioinicio = i[2];
					txtInicioDia.setText(diainicio + "");
					txtInicioMes.setText(mesinicio + "");
					txtInicioAnio.setText(anioinicio + "");
					
					txtCalleUno.setText(prof.getCalle_Profesor_uno() + "");
					txtCalleDos.setText(prof.getCalle_Profesor_dos() + "");
					txtEstado.setText(prof.getTipo_Estado());
					
					//String estado = (String) cmbEstado.getSelectedItem();
					//cod.setEstado_curso(estado);
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscarXCodProfesor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarXCodProfesor.setBounds(222, 25, 107, 35);
		panel.add(btnBuscarXCodProfesor);
		
		JButton btnBuscarXDNI = new JButton("Buscar");
		btnBuscarXDNI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dni = txtBuscarDNI.getText();
					
					ProfesoresVO prof = ProfesoresDAO.BuscarUnProfesorXDNI(dni);
					txtCodProfesor.setText(prof.getCodigo_Profesor() + "");
					txtApellido.setText(prof.getApellido_Profesor() + "");
					txtNombre.setText(prof.getNombre_Profesor() + "");
					txtDomicilio.setText(prof.getDomicilio_Profesor() + "");
					txtNumDomicilio.setText(prof.getNumero_Domicilio_Profesor() + "");
					txtPiso.setText(prof.getPiso_Profesor() + "");
					txtDepartamento.setText(prof.getDepartamento_Profesor() + "");
					txtCUIT.setText(prof.getNum_CUIT_Profesor() + "");
					txtLocalidad.setText(prof.getLocalidad_Profesor() + "");
					txtCP.setText(prof.getCP_Profesor() + "");
					txtTelefono.setText(prof.getTelefono_Profesor() + "");
					cmbTipoDNI.setSelectedItem(prof.getTipo_Documento_Profesor());
					txtNumDNI.setText(prof.getNum_Documento_Profesor() + "");
					
					String string = prof.getFecha_Nacimiento_Profesor();
					String[] partir = string.split("/");
					String dia = partir[0];
					String mes = partir[1];
					String anio = partir[2];
					txtDia.setText(dia + "");
					txtMes.setText(mes + "");
					txtAnio.setText(anio + "");
					
					
					txtNacionalidad.setText(prof.getNacionalidad_Profesor() + "");
					
					String strings = prof.getFecha_Inicio_Profesor();
					String[] i = strings.split("/");
					String diainicio = i[0];
					String mesinicio = i[1];
					String anioinicio = i[2];
					txtInicioDia.setText(diainicio + "");
					txtInicioMes.setText(mesinicio + "");
					txtInicioAnio.setText(anioinicio + "");
					
					txtCalleUno.setText(prof.getCalle_Profesor_uno() + "");
					txtCalleDos.setText(prof.getCalle_Profesor_dos() + "");
					txtEstado.setText(prof.getTipo_Estado());
					
					//String estado = (String) cmbEstado.getSelectedItem();
					//cod.setEstado_curso(estado);
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscarXDNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarXDNI.setBounds(893, 25, 107, 35);
		panel.add(btnBuscarXDNI);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ProfesoresVO prof = new ProfesoresVO();
				
				prof.setCodigo_Profesor(Integer.parseInt(txtCodProfesor.getText()));
				prof.setNombre_Profesor(txtNombre.getText());
				prof.setApellido_Profesor(txtApellido.getText());
				prof.setDomicilio_Profesor(txtDomicilio.getText());
				prof.setNumero_Domicilio_Profesor(Integer.parseInt(txtNumDomicilio.getText()));
				prof.setPiso_Profesor(Integer.parseInt(txtPiso.getText()));
				prof.setDepartamento_Profesor(Integer.parseInt(txtDepartamento.getText()));
				prof.setNum_CUIT_Profesor(txtCUIT.getText());
				prof.setLocalidad_Profesor(txtLocalidad.getText());
				prof.setCP_Profesor(Integer.parseInt(txtCP.getText()));
				prof.setTelefono_Profesor(txtTelefono.getText());
				
				String tipodni = (String) cmbTipoDNI.getSelectedItem();
				prof.setTipo_Documento_Profesor(tipodni);
				prof.setNum_Documento_Profesor(txtNumDNI.getText());
				
				String fecha = txtDia.getText() + " / " + txtMes.getText() + " / " + txtAnio.getText();
				prof.setFecha_Nacimiento_Profesor(fecha);
				
				prof.setNacionalidad_Profesor(txtNacionalidad.getText());
				
				String fechainicio = txtInicioDia.getText() + " / " + txtInicioMes.getText() + " / " + txtInicioAnio.getText();
				prof.setFecha_Inicio_Profesor(fechainicio);
				
				prof.setCalle_Profesor_uno(txtCalleUno.getText());
				prof.setCalle_Profesor_dos(txtCalleDos.getText());
				prof.setTipo_Estado(txtEstado.getText());
				try {
					String resp = ProfesoresDAO.ActualizarProfesor(prof);
					JOptionPane.showMessageDialog(null, resp, "Modificar Profesor", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					txtCodProfesor.setText("");
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
					txtNacionalidad.setText("");
					txtEstado.setText("");
					txtInicioDia.setText("");
					txtInicioMes.setText("");
					txtInicioAnio.setText("");
					txtEstado.setText("");
					txtCUIT.setText("");
					// cargarAlumnos(0);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnModificar.setBounds(726, 403, 107, 35);
		panel_1.add(btnModificar);
		
	}

}
