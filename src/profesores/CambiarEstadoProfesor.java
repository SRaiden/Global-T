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
import classDAO.CursosDAO;
import classDAO.ProfesoresDAO;
import classVO.AlumnosVO;
import classVO.CursosVO;
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

public class CambiarEstadoProfesor extends JPanel {

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
	private JTextField txtTipoDocumento;
	private JTextField txtDepartamento;
	private JTextField txtBuscarDNI;
	private JTextField txtCUIT;
	private JTextField txtInicioDia;
	private JTextField txtInicioMes;
	private JTextField txtInicioAnio;
	private JComboBox cmbEstado;
	private JTextField txtCodigoProfesor;
	
	public CambiarEstadoProfesor() {
		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cambiar Estado del Profesor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JLabel label_1 = new JLabel("Codigo");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(22, 30, 54, 24);
		panel.add(label_1);
		
		txtBuscarCodProfesor = new JTextField();
		txtBuscarCodProfesor.setColumns(10);
		txtBuscarCodProfesor.setBounds(85, 32, 129, 23);
		panel.add(txtBuscarCodProfesor);
			
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(478)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1010, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 522, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 65, 990, 446);
		panel.add(panel_1);
		
		JButton btnCambiarEstado = new JButton("Cambiar Estado");
		btnCambiarEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ProfesoresVO prof = new ProfesoresVO();
				String cod = txtCodigoProfesor.getText();
				
				String estado = (String) cmbEstado.getSelectedItem();
				prof.setTipo_Estado(estado);
				try {
					String resp = ProfesoresDAO.CambiarEstadoProfesor(prof, cod);
					JOptionPane.showMessageDialog(null, resp, "Modificar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					txtCodigoProfesor.setText("");
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
					txtInicioDia.setText("");
					txtInicioMes.setText("");
					txtInicioAnio.setText("");
					txtCUIT.setText("");
					
					// cargarAlumnos(0);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCambiarEstado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCambiarEstado.setBounds(722, 400, 129, 35);
		panel_1.add(btnCambiarEstado);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(512, 300, 200, 23);
		panel_1.add(txtNacionalidad);
		
		JLabel label_2 = new JLabel("Localidad");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(387, 84, 69, 24);
		panel_1.add(label_2);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setEditable(false);
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(512, 86, 200, 23);
		panel_1.add(txtLocalidad);
		
		JLabel label_3 = new JLabel("Codigo Postal");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(387, 119, 93, 24);
		panel_1.add(label_3);
		
		txtCP = new JTextField();
		txtCP.setEditable(false);
		txtCP.setColumns(10);
		txtCP.setBounds(512, 121, 200, 23);
		panel_1.add(txtCP);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBounds(161, 121, 161, 23);
		panel_1.add(txtApellido);
		
		JLabel label_4 = new JLabel("Apellido");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(21, 119, 62, 24);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(21, 154, 48, 24);
		panel_1.add(label_5);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(161, 156, 161, 23);
		panel_1.add(txtNombre);
		
		JLabel label_6 = new JLabel("Telefono");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(387, 154, 93, 24);
		panel_1.add(label_6);
		
		txtTelefono = new JTextField();
		txtTelefono.setEditable(false);
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(512, 156, 200, 23);
		panel_1.add(txtTelefono);
		
		JLabel label_7 = new JLabel("Tipo Documento");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(387, 190, 122, 24);
		panel_1.add(label_7);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setEditable(false);
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(161, 191, 161, 23);
		panel_1.add(txtDomicilio);
		
		JLabel label_8 = new JLabel("Domicilio");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(21, 190, 62, 24);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Numero Domicilio");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(21, 225, 122, 24);
		panel_1.add(label_9);
		
		txtNumDomicilio = new JTextField();
		txtNumDomicilio.setEditable(false);
		txtNumDomicilio.setColumns(10);
		txtNumDomicilio.setBounds(161, 228, 161, 23);
		panel_1.add(txtNumDomicilio);
		
		JLabel label_10 = new JLabel("Piso");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(21, 260, 62, 24);
		panel_1.add(label_10);
		
		txtPiso = new JTextField();
		txtPiso.setEditable(false);
		txtPiso.setColumns(10);
		txtPiso.setBounds(161, 262, 161, 23);
		panel_1.add(txtPiso);
		
		JLabel label_11 = new JLabel("Fecha Nacimiento");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(387, 263, 122, 24);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Numero DNI");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(387, 225, 122, 24);
		panel_1.add(label_12);
		
		txtNumDNI = new JTextField();
		txtNumDNI.setEditable(false);
		txtNumDNI.setColumns(10);
		txtNumDNI.setBounds(512, 228, 200, 23);
		panel_1.add(txtNumDNI);
		
		txtDia = new JTextField();
		txtDia.setEditable(false);
		txtDia.setColumns(10);
		txtDia.setBounds(512, 266, 48, 23);
		panel_1.add(txtDia);
		
		JLabel label_13 = new JLabel("/");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(570, 263, 9, 24);
		panel_1.add(label_13);
		
		txtMes = new JTextField();
		txtMes.setEditable(false);
		txtMes.setColumns(10);
		txtMes.setBounds(582, 265, 48, 23);
		panel_1.add(txtMes);
		
		JLabel label_14 = new JLabel("/");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(640, 263, 4, 24);
		panel_1.add(label_14);
		
		txtAnio = new JTextField();
		txtAnio.setEditable(false);
		txtAnio.setColumns(10);
		txtAnio.setBounds(650, 265, 62, 23);
		panel_1.add(txtAnio);
		
		JLabel label_15 = new JLabel("Nacionalidad");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(387, 298, 93, 24);
		panel_1.add(label_15);
		
		txtCalleDos = new JTextField();
		txtCalleDos.setEditable(false);
		txtCalleDos.setColumns(10);
		txtCalleDos.setBounds(430, 376, 200, 23);
		panel_1.add(txtCalleDos);
		
		JLabel label_16 = new JLabel("Y ");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(401, 374, 53, 24);
		panel_1.add(label_16);
		
		txtCalleUno = new JTextField();
		txtCalleUno.setEditable(false);
		txtCalleUno.setColumns(10);
		txtCalleUno.setBounds(179, 376, 200, 23);
		panel_1.add(txtCalleUno);
		
		JLabel label_17 = new JLabel("Entre");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(116, 374, 53, 24);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("Estado");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(498, 405, 62, 24);
		panel_1.add(label_18);
		
		cmbEstado = new JComboBox();
		cmbEstado.addItem("ACTIVO");
		cmbEstado.addItem("INACTIVO");
		cmbEstado.setBounds(561, 408, 151, 20);
		panel_1.add(cmbEstado);
		
		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setEditable(false);
		txtTipoDocumento.setColumns(10);
		txtTipoDocumento.setBounds(512, 190, 200, 23);
		panel_1.add(txtTipoDocumento);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDepartamento.setBounds(21, 297, 104, 24);
		panel_1.add(lblDepartamento);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setEditable(false);
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(161, 299, 161, 23);
		panel_1.add(txtDepartamento);
		
		JLabel label_19 = new JLabel("Numero CUIT");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(21, 332, 107, 24);
		panel_1.add(label_19);
		
		txtCUIT = new JTextField();
		txtCUIT.setEditable(false);
		txtCUIT.setColumns(10);
		txtCUIT.setBounds(161, 334, 161, 23);
		panel_1.add(txtCUIT);
		
		JLabel label_20 = new JLabel("Fecha Inicio");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_20.setBounds(387, 334, 93, 24);
		panel_1.add(label_20);
		
		txtInicioDia = new JTextField();
		txtInicioDia.setEditable(false);
		txtInicioDia.setColumns(10);
		txtInicioDia.setBounds(512, 337, 48, 23);
		panel_1.add(txtInicioDia);
		
		JLabel label_21 = new JLabel("/");
		label_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_21.setBounds(570, 334, 9, 24);
		panel_1.add(label_21);
		
		txtInicioMes = new JTextField();
		txtInicioMes.setEditable(false);
		txtInicioMes.setColumns(10);
		txtInicioMes.setBounds(582, 336, 48, 23);
		panel_1.add(txtInicioMes);
		
		JLabel label_22 = new JLabel("/");
		label_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_22.setBounds(640, 334, 4, 24);
		panel_1.add(label_22);
		
		txtInicioAnio = new JTextField();
		txtInicioAnio.setEditable(false);
		txtInicioAnio.setColumns(10);
		txtInicioAnio.setBounds(650, 336, 62, 23);
		panel_1.add(txtInicioAnio);
		
		JLabel lblCodigoProfesor = new JLabel("Codigo Profesor");
		lblCodigoProfesor.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCodigoProfesor.setBounds(21, 84, 104, 24);
		panel_1.add(lblCodigoProfesor);
		
		txtCodigoProfesor = new JTextField();
		txtCodigoProfesor.setEditable(false);
		txtCodigoProfesor.setColumns(10);
		txtCodigoProfesor.setBounds(161, 86, 78, 23);
		panel_1.add(txtCodigoProfesor);
		
		JLabel DNI = new JLabel("DNI");
		DNI.setFont(new Font("Times New Roman", Font.BOLD, 14));
		DNI.setBounds(714, 30, 37, 24);
		panel.add(DNI);
		
		txtBuscarDNI = new JTextField();
		txtBuscarDNI.setColumns(10);
		txtBuscarDNI.setBounds(754, 32, 129, 23);
		panel.add(txtBuscarDNI);
		
		JButton btnBuscarXDNI = new JButton("Buscar");
		btnBuscarXDNI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dni = txtBuscarDNI.getText();
					
					ProfesoresVO prof = ProfesoresDAO.BuscarUnProfesorXDNI(dni);
					txtCodigoProfesor.setText(prof.getCodigo_Profesor() + "");
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
					txtTipoDocumento.setText(prof.getTipo_Documento_Profesor() + "");
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
					cmbEstado.setSelectedItem(prof.getTipo_Estado());
					
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
		setLayout(groupLayout);
		
		JButton btnBuscarXCodProfesor = new JButton("Buscar");
		btnBuscarXCodProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String CodProf = txtBuscarCodProfesor.getText();
					int codpro = Integer.parseInt(CodProf);
					
					ProfesoresVO prof = ProfesoresDAO.BuscarUnProfesor(codpro);
					
					txtCodigoProfesor.setText(prof.getCodigo_Profesor() + "");
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
					txtTipoDocumento.setText(prof.getTipo_Documento_Profesor() + "");
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
					cmbEstado.setSelectedItem(prof.getTipo_Estado());
					
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
		btnBuscarXCodProfesor.setBounds(224, 25, 107, 35);
		panel.add(btnBuscarXCodProfesor);
	}
}
