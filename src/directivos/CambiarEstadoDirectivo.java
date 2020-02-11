package directivos;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import classDAO.DirectivosDAO;
import classDAO.TutoresDAO;
import classVO.DirectivosVO;
import classVO.TutoresVO;

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

public class CambiarEstadoDirectivo extends JPanel {

	private JTextField txtNacionalidad;
	private JTextField txtBuscarCodigo;
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
	private JTextField txtDepartamento;
	private JTextField txtTipoDocumento;
	private JTextField txtBuscarDNI;
	private JTextField txtCodigo;
	
	public CambiarEstadoDirectivo() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cambiar Estado del Directivo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(503, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(453))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1010, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 522, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 101, 990, 410);
		panel.add(panel_1);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(508, 262, 200, 23);
		panel_1.add(txtNacionalidad);
		
		JLabel label_2 = new JLabel("Localidad");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(383, 47, 69, 24);
		panel_1.add(label_2);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setEditable(false);
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(508, 49, 200, 23);
		panel_1.add(txtLocalidad);
		
		JLabel label_3 = new JLabel("Codigo Postal");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(383, 82, 93, 24);
		panel_1.add(label_3);
		
		txtCP = new JTextField();
		txtCP.setEditable(false);
		txtCP.setColumns(10);
		txtCP.setBounds(508, 84, 200, 23);
		panel_1.add(txtCP);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBounds(160, 84, 129, 23);
		panel_1.add(txtApellido);
		
		JLabel label_4 = new JLabel("Apellido");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(20, 82, 62, 24);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(20, 117, 48, 24);
		panel_1.add(label_5);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(160, 119, 129, 23);
		panel_1.add(txtNombre);
		
		JLabel label_6 = new JLabel("Telefono");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(383, 117, 93, 24);
		panel_1.add(label_6);
		
		txtTelefono = new JTextField();
		txtTelefono.setEditable(false);
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(508, 119, 200, 23);
		panel_1.add(txtTelefono);
		
		JLabel label_7 = new JLabel("Tipo Documento");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(383, 153, 122, 24);
		panel_1.add(label_7);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setEditable(false);
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(160, 154, 129, 23);
		panel_1.add(txtDomicilio);
		
		JLabel label_8 = new JLabel("Domicilio");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(20, 153, 62, 24);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Numero Domicilio");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(20, 188, 122, 24);
		panel_1.add(label_9);
		
		txtNumDomicilio = new JTextField();
		txtNumDomicilio.setEditable(false);
		txtNumDomicilio.setColumns(10);
		txtNumDomicilio.setBounds(160, 191, 129, 23);
		panel_1.add(txtNumDomicilio);
		
		JLabel label_10 = new JLabel("Piso");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(20, 223, 62, 24);
		panel_1.add(label_10);
		
		txtPiso = new JTextField();
		txtPiso.setEditable(false);
		txtPiso.setColumns(10);
		txtPiso.setBounds(160, 225, 129, 23);
		panel_1.add(txtPiso);
		
		JLabel label_11 = new JLabel("Fecha Nacimiento");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(383, 223, 122, 24);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Numero DNI");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(383, 188, 122, 24);
		panel_1.add(label_12);
		
		txtNumDNI = new JTextField();
		txtNumDNI.setEditable(false);
		txtNumDNI.setColumns(10);
		txtNumDNI.setBounds(508, 191, 200, 23);
		panel_1.add(txtNumDNI);
		
		txtDia = new JTextField();
		txtDia.setEditable(false);
		txtDia.setColumns(10);
		txtDia.setBounds(508, 226, 48, 23);
		panel_1.add(txtDia);
		
		JLabel label_13 = new JLabel("/");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(566, 223, 9, 24);
		panel_1.add(label_13);
		
		txtMes = new JTextField();
		txtMes.setEditable(false);
		txtMes.setColumns(10);
		txtMes.setBounds(578, 225, 48, 23);
		panel_1.add(txtMes);
		
		JLabel label_14 = new JLabel("/");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(636, 223, 4, 24);
		panel_1.add(label_14);
		
		txtAnio = new JTextField();
		txtAnio.setEditable(false);
		txtAnio.setColumns(10);
		txtAnio.setBounds(646, 225, 62, 23);
		panel_1.add(txtAnio);
		
		JLabel label_15 = new JLabel("Nacionalidad");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(383, 260, 93, 24);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("Estado");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(499, 307, 62, 24);
		panel_1.add(label_16);
		
		JComboBox cmbEstado = new JComboBox();
		cmbEstado.addItem("ACTIVO");
		cmbEstado.addItem("INACTIVO");
		cmbEstado.setBounds(562, 310, 146, 20);
		panel_1.add(cmbEstado);
		
		JLabel label_17 = new JLabel("Departamento");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(20, 258, 107, 24);
		panel_1.add(label_17);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setEditable(false);
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(160, 260, 129, 23);
		panel_1.add(txtDepartamento);
		
		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setEditable(false);
		txtTipoDocumento.setColumns(10);
		txtTipoDocumento.setBounds(508, 153, 200, 23);
		panel_1.add(txtTipoDocumento);
		
		JLabel label_18 = new JLabel("Codigo");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(20, 47, 57, 24);
		panel_1.add(label_18);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(160, 49, 129, 23);
		panel_1.add(txtCodigo);
		
		JLabel label_1 = new JLabel("Codigo");
		label_1.setBounds(23, 43, 57, 24);
		panel.add(label_1);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		txtBuscarCodigo = new JTextField();
		txtBuscarCodigo.setBounds(73, 43, 129, 23);
		panel.add(txtBuscarCodigo);
		txtBuscarCodigo.setColumns(10);
		
		txtBuscarDNI = new JTextField();
		txtBuscarDNI.setColumns(10);
		txtBuscarDNI.setBounds(733, 45, 129, 23);
		panel.add(txtBuscarDNI);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDni.setBounds(683, 43, 40, 24);
		panel.add(lblDni);
		setLayout(groupLayout);
		
		JButton btnBuscarXCodigo = new JButton("Buscar");
		btnBuscarXCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String CodDire = txtBuscarCodigo.getText();
					int codd = Integer.parseInt(CodDire);
					
					DirectivosVO dir = DirectivosDAO.BuscarUnDirectivo(codd);
					
					txtCodigo.setText(dir.getCod_Directivo() + "");
					txtNombre.setText(dir.getNombre_Directivo()+ "");
					txtApellido.setText(dir.getApellido_Directivo() + "");
					txtDomicilio.setText(dir.getDomicilio_Directivo() + "");
					txtNumDomicilio.setText(dir.getNumero_Domicilio_Directivo() + "");
					txtPiso.setText(dir.getPiso_Directivo() + "");
					txtDepartamento.setText(dir.getDepartamento_Directivo() + "");
					txtLocalidad.setText(dir.getLocalidad_Directivo() + "");
					txtCP.setText(dir.getCP_Directivo() + "");
					txtTelefono.setText(dir.getTelefono_Directivo() + "");
					txtTipoDocumento.setText(dir.getTipo_Documento_Directivo() + "");
					txtNumDNI.setText(dir.getNum_Documento_Directivo() + "");
					
					String sa = dir.getNacimiento_Directivo();
					String[] pa = sa.split("/");
					String pas1 = pa[0];
					String pas2 = pa[1];
					String pas3 = pa[2];
					txtDia.setText(pas1 + "");
					txtMes.setText(pas2 + "");
					txtAnio.setText(pas3 + "");
					
					txtNacionalidad.setText(dir.getNacionalidad());
					cmbEstado.setSelectedItem(dir.getTipo_Estado());
					
					//String estado = (String) cmbEstado.getSelectedItem();
					//tut.setTipo_Estado(estado);
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscarXCodigo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarXCodigo.setBounds(211, 38, 129, 35);
		panel.add(btnBuscarXCodigo);
		
		JButton btnBuscarXDNI = new JButton("Buscar");
		btnBuscarXDNI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dni = txtBuscarDNI.getText();
					
					DirectivosVO dir = DirectivosDAO.BuscarUnDirectivoXDNI(dni);
					
					txtCodigo.setText(dir.getCod_Directivo() + "");
					txtNombre.setText(dir.getNombre_Directivo()+ "");
					txtApellido.setText(dir.getApellido_Directivo() + "");
					txtDomicilio.setText(dir.getDomicilio_Directivo() + "");
					txtNumDomicilio.setText(dir.getNumero_Domicilio_Directivo() + "");
					txtPiso.setText(dir.getPiso_Directivo() + "");
					txtDepartamento.setText(dir.getDepartamento_Directivo() + "");
					txtLocalidad.setText(dir.getLocalidad_Directivo() + "");
					txtCP.setText(dir.getCP_Directivo() + "");
					txtTelefono.setText(dir.getTelefono_Directivo() + "");
					txtTipoDocumento.setText(dir.getTipo_Documento_Directivo() + "");
					txtNumDNI.setText(dir.getNum_Documento_Directivo() + "");
					
					String sa = dir.getNacimiento_Directivo();
					String[] pa = sa.split("/");
					String pas1 = pa[0];
					String pas2 = pa[1];
					String pas3 = pa[2];
					txtDia.setText(pas1 + "");
					txtMes.setText(pas2 + "");
					txtAnio.setText(pas3 + "");
					
					txtNacionalidad.setText(dir.getNacionalidad());
					cmbEstado.setSelectedItem(dir.getTipo_Estado());
					
					//String estado = (String) cmbEstado.getSelectedItem();
					//tut.setTipo_Estado(estado);
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscarXDNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarXDNI.setBounds(871, 38, 129, 35);
		panel.add(btnBuscarXDNI);
		
		JButton btnCambiarEstado = new JButton("Cambiar Estado");
		btnCambiarEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DirectivosVO dir = new DirectivosVO();
				
				String codi = (String) txtCodigo.getText();
				int num = Integer.parseInt(codi);
				dir.setCod_Directivo(num);
				
				String estado = (String) cmbEstado.getSelectedItem();
				dir.setTipo_Estado(estado);
				try {
					String resp = DirectivosDAO.CambiarEstadoDirectivo(dir,num);
					JOptionPane.showMessageDialog(null, resp, "Modificar Estado Directivo", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					txtCodigo.setText("");
					txtNombre.setText("");
					txtApellido.setText("");
					txtDomicilio.setText("");
					txtNumDomicilio.setText("");
					txtPiso.setText("");
					txtDepartamento.setText("");
					txtLocalidad.setText("");
					txtTipoDocumento.setText("");
					txtCP.setText("");
					txtTelefono.setText("");
					txtNumDNI.setText("");
					txtDia.setText("");
					txtMes.setText("");
					txtAnio.setText("");
					txtNacionalidad.setText("");
					
					// cargarAlumnos(0);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCambiarEstado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCambiarEstado.setBounds(716, 302, 129, 35);
		panel_1.add(btnCambiarEstado);
	}
}
