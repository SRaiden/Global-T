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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AgregarProfesor extends JPanel {

	private JTextField txtNacionalidad;
	private JTextField txtCodProfesor;
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
	private JTextField txtDepartamento;
	private JTextField txtCUIT;
	private JTextField txtInicioAnio;
	private JTextField txtInicioMes;
	private JTextField txtInicioDia;
	
	public AgregarProfesor() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agregar Profesor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(470)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1010, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 522, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 21, 990, 490);
		panel.add(panel_1);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(512, 297, 200, 23);
		panel_1.add(txtNacionalidad);
		
		JLabel label_1 = new JLabel("Codigo");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(24, 84, 122, 24);
		panel_1.add(label_1);
		
		txtCodProfesor = new JTextField();
		txtCodProfesor.setColumns(10);
		txtCodProfesor.setBounds(164, 86, 170, 23);
		panel_1.add(txtCodProfesor);
		
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
		txtApellido.setBounds(164, 121, 170, 23);
		panel_1.add(txtApellido);
		
		JLabel label_4 = new JLabel("Apellido");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(24, 119, 62, 24);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(24, 154, 48, 24);
		panel_1.add(label_5);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(164, 156, 170, 23);
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
		txtDomicilio.setBounds(164, 191, 170, 23);
		panel_1.add(txtDomicilio);
		
		JLabel label_8 = new JLabel("Domicilio");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(24, 190, 62, 24);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Numero Domicilio");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(24, 225, 122, 24);
		panel_1.add(label_9);
		
		txtNumDomicilio = new JTextField();
		txtNumDomicilio.setColumns(10);
		txtNumDomicilio.setBounds(164, 228, 170, 23);
		panel_1.add(txtNumDomicilio);
		
		JLabel label_10 = new JLabel("Piso");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(24, 260, 62, 24);
		panel_1.add(label_10);
		
		txtPiso = new JTextField();
		txtPiso.setColumns(10);
		txtPiso.setBounds(164, 262, 170, 23);
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
		label_15.setBounds(387, 295, 93, 24);
		panel_1.add(label_15);
		
		txtCalleDos = new JTextField();
		txtCalleDos.setColumns(10);
		txtCalleDos.setBounds(337, 384, 200, 23);
		panel_1.add(txtCalleDos);
		
		JLabel label_16 = new JLabel("Y ");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(309, 382, 53, 24);
		panel_1.add(label_16);
		
		txtCalleUno = new JTextField();
		txtCalleUno.setColumns(10);
		txtCalleUno.setBounds(87, 382, 200, 23);
		panel_1.add(txtCalleUno);
		
		JLabel label_17 = new JLabel("Entre");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(24, 382, 53, 24);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("Estado");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(512, 418, 62, 24);
		panel_1.add(label_18);
		
		JComboBox cmbEstado = new JComboBox();
		cmbEstado.addItem("ACTIVO");
		cmbEstado.addItem("INACTIVO");
		cmbEstado.setBounds(575, 421, 137, 20);
		panel_1.add(cmbEstado);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDepartamento.setBounds(24, 295, 107, 24);
		panel_1.add(lblDepartamento);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(164, 297, 170, 23);
		panel_1.add(txtDepartamento);
		
		JLabel lblNumeroCuit = new JLabel("Numero CUIT");
		lblNumeroCuit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNumeroCuit.setBounds(24, 330, 107, 24);
		panel_1.add(lblNumeroCuit);
		
		txtCUIT = new JTextField();
		txtCUIT.setColumns(10);
		txtCUIT.setBounds(164, 332, 170, 23);
		panel_1.add(txtCUIT);
		
		txtInicioAnio = new JTextField();
		txtInicioAnio.setColumns(10);
		txtInicioAnio.setBounds(650, 330, 62, 23);
		panel_1.add(txtInicioAnio);
		
		JLabel label_19 = new JLabel("/");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(640, 328, 4, 24);
		panel_1.add(label_19);
		
		txtInicioMes = new JTextField();
		txtInicioMes.setColumns(10);
		txtInicioMes.setBounds(582, 330, 48, 23);
		panel_1.add(txtInicioMes);
		
		JLabel label_20 = new JLabel("/");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_20.setBounds(570, 328, 9, 24);
		panel_1.add(label_20);
		
		txtInicioDia = new JTextField();
		txtInicioDia.setColumns(10);
		txtInicioDia.setBounds(512, 331, 48, 23);
		panel_1.add(txtInicioDia);
		
		JLabel lblFechaInicio = new JLabel("Fecha Inicio");
		lblFechaInicio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFechaInicio.setBounds(387, 328, 93, 24);
		panel_1.add(lblFechaInicio);
		setLayout(groupLayout);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfesoresVO prof = new ProfesoresVO();
				
				prof.setCodigo_Profesor(Integer.parseInt(txtCodProfesor.getText()));
				prof.setNombre_Profesor(txtNombre.getText());
				prof.setApellido_Profesor(txtApellido.getText());
				prof.setDomicilio_Profesor(txtDomicilio.getText());
				prof.setNumero_Domicilio_Profesor(Integer.parseInt(txtNumDomicilio.getText()));
				prof.setPiso_Profesor(Integer.parseInt(txtPiso.getText()));
				prof.setDepartamento_Profesor(Integer.parseInt(txtDepartamento.getText()));
				prof.setCalle_Profesor_uno(txtCalleUno.getText());
				prof.setCalle_Profesor_dos(txtCalleDos.getText());
				prof.setLocalidad_Profesor(txtLocalidad.getText());
				prof.setCP_Profesor(Integer.parseInt(txtCP.getText()));
				prof.setTelefono_Profesor(txtTelefono.getText());
				
				String tipodni = (String) cmbTipoDNI.getSelectedItem();
				prof.setTipo_Documento_Profesor(tipodni);
				prof.setNum_Documento_Profesor(txtNumDNI.getText());
				
				String fecha = txtDia.getText() + " / " + txtMes.getText() + " / " + txtAnio.getText();
				prof.setFecha_Nacimiento_Profesor(fecha);
				
				prof.setNacionalidad_Profesor(txtNacionalidad.getText());
				prof.setNum_CUIT_Profesor(txtCUIT.getText());
				
				String fechainicio = txtInicioDia.getText() + " / " + txtInicioMes.getText() + " / " + txtInicioAnio.getText();
				prof.setFecha_Inicio_Profesor(fechainicio);
				
				String estado = (String) cmbEstado.getSelectedItem();
				prof.setTipo_Estado(estado);
				try {
					String resp = ProfesoresDAO.RegistrarProfesor(prof);
					JOptionPane.showMessageDialog(null, resp, "Agregar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					//cmbTipoDNI.setSelectedItem(1);
					//cmbEstado.setSelectedItem(1);
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
					txtCUIT.setText("");
					txtInicioDia.setText("");
					txtInicioMes.setText("");
					txtInicioAnio.setText("");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAgregar.setBounds(722, 413, 107, 35);
		panel_1.add(btnAgregar);
	}

}
