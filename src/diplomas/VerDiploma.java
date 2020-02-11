package diplomas;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class VerDiploma extends JPanel {

	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtNumDNI;
	private JTextField txtNacionalidad;
	private JTextField txtLegajo;
	
	public VerDiploma() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ver Diplomas de un Egresado", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
							.addGap(476))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 549, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(74, Short.MAX_VALUE))
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(UIManager.getColor("Tree.hash"));
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(10, 123, 1009, 371);
		panel_1.add(txtArea);
		
		JLabel label_1 = new JLabel("Legajo del Alumno");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(10, 16, 122, 24);
		panel_1.add(label_1);
		
		JButton button = new JButton("Buscar");
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBounds(294, 11, 107, 35);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(UIManager.getColor("ToolTip.background"));
		panel_2.setBounds(10, 65, 1009, 47);
		panel_1.add(panel_2);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(68, 11, 129, 23);
		panel_2.add(txtNombre);
		
		JLabel label_2 = new JLabel("Nombre");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(10, 9, 48, 24);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Apellido");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(242, 9, 62, 24);
		panel_2.add(label_3);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBounds(302, 11, 129, 23);
		panel_2.add(txtApellido);
		
		JLabel label_4 = new JLabel("Numero DNI");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(489, 11, 88, 24);
		panel_2.add(label_4);
		
		txtNumDNI = new JTextField();
		txtNumDNI.setEditable(false);
		txtNumDNI.setColumns(10);
		txtNumDNI.setBounds(576, 11, 129, 23);
		panel_2.add(txtNumDNI);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNacionalidad.setBounds(758, 11, 77, 24);
		panel_2.add(lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(843, 13, 145, 23);
		panel_2.add(txtNacionalidad);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1029, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 505, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JComboBox cmbLegajo = new JComboBox();
		cmbLegajo.setBounds(142, 18, 45, 20);
		panel_1.add(cmbLegajo);
		
		txtLegajo = new JTextField();
		txtLegajo.setColumns(10);
		txtLegajo.setBounds(197, 17, 76, 23);
		panel_1.add(txtLegajo);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);
	}

}
