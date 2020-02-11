package directivos;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;

import alumnos.AgregarAlumno;
import classDAO.DirectivosDAO;
import classDAO.UsuariosDAO;
import classVO.DirectivosVO;
import classVO.UsuariosVO;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CrearUsuario extends JPanel {

	private JTextField txtUser;
	private JPasswordField txtPassword;
	JPanel panelGuardado;
	public boolean confir = false;
	
	public CrearUsuario() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(new Color(244, 164, 96));
		
		JLabel label_1 = new JLabel("User");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(162, 85, 62, 24);
		panel.add(label_1);
		
		txtUser = new JTextField();
		txtUser.setColumns(10);
		txtUser.setBounds(234, 90, 199, 23);
		panel.add(txtUser);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(162, 120, 62, 24);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Ingrese Datos del Administrador");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Sakkal Majalla", Font.BOLD | Font.ITALIC, 40));
		label_3.setBounds(95, 11, 426, 44);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Zona restringida !! Solamente el director podra crear usuarios para los Directivos Existentes");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(10, 266, 570, 24);
		panel.add(label_4);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(234, 124, 199, 20);
		panel.add(txtPassword);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String user = txtUser.getText();
					String pass = txtPassword.getText();
					
					UsuariosVO usu = UsuariosDAO.BuscarUsuarioAdmin(user,pass);
					if(usu.getConfirmacion() == true){
						JOptionPane.showMessageDialog(null, "Administrador valido", "Buscar Administrador", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
						CrearUsuario2 crear2 = new CrearUsuario2();
						crear2.setVisible(true);
					}
					else{
						JOptionPane.showMessageDialog(null, "Usuario o Password Incorrecta", "Buscar Administrador", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					}
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Administrador", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnIngresar.setBounds(226, 168, 129, 35);
		panel.add(btnIngresar);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(270, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
							.addGap(445))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 590, GroupLayout.PREFERRED_SIZE)
							.addGap(211))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(196, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
	}

}
