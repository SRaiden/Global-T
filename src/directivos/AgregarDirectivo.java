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

public class AgregarDirectivo extends JPanel {

	private JTextField txtNacionalidad;
	private JTextField txtCodigo;
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
	
	public AgregarDirectivo() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agregar Directivo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(493, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(468))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1010, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 522, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 23, 990, 488);
		panel.add(panel_1);

		txtNacionalidad = new JTextField();
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(512, 299, 200, 23);
		panel_1.add(txtNacionalidad);
		
		JLabel label_1 = new JLabel("Codigo");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(24, 84, 122, 24);
		panel_1.add(label_1);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(164, 86, 129, 23);
		panel_1.add(txtCodigo);
		
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
		txtApellido.setBounds(164, 121, 129, 23);
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
		txtNombre.setBounds(164, 156, 129, 23);
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
		txtDomicilio.setBounds(164, 191, 129, 23);
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
		txtNumDomicilio.setBounds(164, 228, 129, 23);
		panel_1.add(txtNumDomicilio);
		
		JLabel label_10 = new JLabel("Piso");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(24, 260, 62, 24);
		panel_1.add(label_10);
		
		txtPiso = new JTextField();
		txtPiso.setColumns(10);
		txtPiso.setBounds(164, 262, 129, 23);
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
		
		JLabel label_16 = new JLabel("Estado");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(503, 344, 62, 24);
		panel_1.add(label_16);
		
		JComboBox cmbEstado = new JComboBox();
		cmbEstado.addItem("ACTIVO");
		cmbEstado.addItem("INACTIVO");
		cmbEstado.setBounds(566, 347, 146, 20);
		panel_1.add(cmbEstado);
		
		JLabel label_17 = new JLabel("Departamento");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(24, 295, 107, 24);
		panel_1.add(label_17);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(164, 297, 129, 23);
		panel_1.add(txtDepartamento);
		setLayout(groupLayout);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DirectivosVO dir = new DirectivosVO();
				
				dir.setApellido_Directivo(txtApellido.getText());
				dir.setNombre_Directivo(txtNombre.getText());
				dir.setDomicilio_Directivo(txtDomicilio.getText());
				dir.setNumero_Domicilio_Directivo(txtNumDomicilio.getText());
				dir.setPiso_Directivo(Integer.parseInt(txtPiso.getText()));
				dir.setDepartamento_Directivo(Integer.parseInt(txtDepartamento.getText()));
				dir.setLocalidad_Directivo(txtLocalidad.getText());
				dir.setCP_Directivo(Integer.parseInt(txtCP.getText()));
				dir.setTelefono_Directivo(txtTelefono.getText());
				
				String tipodni = (String) cmbTipoDNI.getSelectedItem();
				dir.setTipo_Documento_Directivo(tipodni);
				
				dir.setNum_Documento_Directivo(txtNumDNI.getText());
				String fecha = txtDia.getText() + " / " + txtMes.getText() + " / " + txtAnio.getText();
				dir.setNacimiento_Directivo(fecha);
				
				dir.setNacionalidad(txtNacionalidad.getText());
				
				String estado = (String) cmbEstado.getSelectedItem();
				dir.setTipo_Estado(estado);
				try {
					String resp = DirectivosDAO.RegistrarDirectivo(dir);
					JOptionPane.showMessageDialog(null, resp, "Agregar Directivo", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					txtNombre.setText("");
					txtApellido.setText("");
					txtDomicilio.setText("");
					txtNumDomicilio.setText("");
					txtPiso.setText("");
					txtDepartamento.setText("");
					txtLocalidad.setText("");
					txtCP.setText("");
					txtTelefono.setText("");
					txtNumDNI.setText("");
					txtDia.setText("");
					txtMes.setText("");
					txtAnio.setText("");
					txtNacionalidad.setText("");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAgregar.setBounds(722, 339, 107, 35);
		panel_1.add(btnAgregar);
	}

}
