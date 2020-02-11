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
import javax.swing.JCheckBox;

public class VerTodosDiplomas extends JPanel {

	private JTextField txtCodCurso;
	private JTextField txtNombre;
	private JTextField txtCantidad;

	public VerTodosDiplomas() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ver Diplomas de Egresados de un Curso Especifico", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(451)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1060, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(143, Short.MAX_VALUE))
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(UIManager.getColor("Tree.hash"));
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(10, 123, 1009, 371);
		panel_1.add(txtArea);
		
		JLabel label_1 = new JLabel("Codigo del Curso");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(10, 16, 122, 24);
		panel_1.add(label_1);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setColumns(10);
		txtCodCurso.setBounds(127, 18, 48, 23);
		panel_1.add(txtCodCurso);
		
		JButton button = new JButton("Buscar");
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBounds(197, 11, 107, 35);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(UIManager.getColor("ToolTip.background"));
		panel_2.setBounds(10, 65, 584, 47);
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
		
		JLabel label_3 = new JLabel("Computadoras");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(263, 9, 105, 24);
		panel_2.add(label_3);
		
		JCheckBox check = new JCheckBox("");
		check.setBounds(361, 11, 21, 23);
		panel_2.add(check);
		
		JLabel label_4 = new JLabel("Cantidad");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(447, 11, 62, 24);
		panel_2.add(label_4);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(514, 12, 49, 23);
		panel_2.add(txtCantidad);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1029, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 505, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);
	}

}
