package directivos;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class CrearUsuario2 extends JPanel {

	private JTextField txtBuscarCodigo;
	private JTextField txtBuscarDNI;
	private JTextField txtLocalidad;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtDomicilio;
	private JTextField txtNumDNI;
	private JTextField txtUser;
	private JTextField txtContraseña;
	private JTextField txtRepetirContraseña;

	public CrearUsuario2() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Crear Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JLabel label_1 = new JLabel("Codigo del Directivo");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(27, 23, 150, 24);
		panel.add(label_1);
		
		txtBuscarCodigo = new JTextField();
		txtBuscarCodigo.setColumns(10);
		txtBuscarCodigo.setBounds(177, 25, 171, 23);
		panel.add(txtBuscarCodigo);
		
		JButton btnBuscarXCodigo = new JButton("Buscar");
		btnBuscarXCodigo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarXCodigo.setBounds(372, 18, 107, 35);
		panel.add(btnBuscarXCodigo);
		
		txtBuscarDNI = new JTextField();
		txtBuscarDNI.setColumns(10);
		txtBuscarDNI.setBounds(682, 25, 171, 23);
		panel.add(txtBuscarDNI);
		
		JLabel label_2 = new JLabel("DNI del Directivo");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(558, 23, 114, 24);
		panel.add(label_2);
		
		JButton btnBuscarXDNI = new JButton("Buscar");
		btnBuscarXDNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarXDNI.setBounds(877, 18, 107, 35);
		panel.add(btnBuscarXDNI);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(542, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(415))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1010, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 58, 990, 366);
		panel.add(panel_1);
		
		JLabel label_3 = new JLabel("Localidad");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(378, 66, 69, 24);
		panel_1.add(label_3);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(457, 68, 148, 23);
		panel_1.add(txtLocalidad);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(103, 33, 129, 23);
		panel_1.add(txtApellido);
		
		JLabel label_4 = new JLabel("Apellido");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(24, 33, 62, 24);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(24, 68, 48, 24);
		panel_1.add(label_5);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(103, 68, 129, 23);
		panel_1.add(txtNombre);
		
		JLabel label_6 = new JLabel("Telefono");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(711, 31, 69, 24);
		panel_1.add(label_6);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(804, 33, 140, 23);
		panel_1.add(txtTelefono);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(457, 34, 148, 23);
		panel_1.add(txtDomicilio);
		
		JLabel label_7 = new JLabel("Domicilio");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(378, 31, 62, 24);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("Numero DNI");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(711, 66, 78, 24);
		panel_1.add(label_8);
		
		txtNumDNI = new JTextField();
		txtNumDNI.setColumns(10);
		txtNumDNI.setBounds(804, 68, 140, 23);
		panel_1.add(txtNumDNI);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(24, 144, 920, 164);
		panel_1.add(panel_2);
		
		JLabel label_9 = new JLabel("Usuario");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(21, 34, 63, 24);
		panel_2.add(label_9);
		
		txtUser = new JTextField();
		txtUser.setColumns(10);
		txtUser.setBounds(98, 36, 167, 23);
		panel_2.add(txtUser);
		
		JLabel label_10 = new JLabel("Contrase\u00F1a");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(305, 35, 89, 24);
		panel_2.add(label_10);
		
		txtContraseña = new JTextField();
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(404, 36, 158, 23);
		panel_2.add(txtContraseña);
		
		JLabel label_11 = new JLabel("Repetir Contrase\u00F1a");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(610, 34, 149, 24);
		panel_2.add(label_11);
		
		txtRepetirContraseña = new JTextField();
		txtRepetirContraseña.setColumns(10);
		txtRepetirContraseña.setBounds(756, 34, 154, 23);
		panel_2.add(txtRepetirContraseña);
		
		JButton btnRegistrar = new JButton("Registrar Como Usuario\r\n");
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRegistrar.setBounds(321, 94, 272, 35);
		panel_2.add(btnRegistrar);
		setLayout(groupLayout);
	}

}
