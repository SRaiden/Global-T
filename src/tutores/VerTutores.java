package tutores;

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
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class VerTutores extends JPanel {
	private JTextField txtAlumnoDNI;
	private JTextField txtLegajo;
	
	public VerTutores() {
		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ver Tutor/es de un Alumno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JLabel label_1 = new JLabel("Legajo Alumno");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(23, 47, 107, 24);
		panel.add(label_1);
		
		JButton btnBuscarXLegajo = new JButton("Buscar");
		btnBuscarXLegajo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarXLegajo.setBounds(265, 42, 107, 35);
		panel.add(btnBuscarXLegajo);
		
		JLabel label_2 = new JLabel("DNI Alumno");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(617, 47, 122, 24);
		panel.add(label_2);
		
		txtAlumnoDNI = new JTextField();
		txtAlumnoDNI.setColumns(10);
		txtAlumnoDNI.setBounds(724, 49, 129, 23);
		panel.add(txtAlumnoDNI);
		
		JButton btnBuscarXDNI = new JButton("Buscar");
		btnBuscarXDNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarXDNI.setBounds(871, 42, 107, 35);
		panel.add(btnBuscarXDNI);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(10, 88, 986, 371);
		panel.add(panel_1);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(10, 11, 966, 349);
		panel_1.add(txtArea);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(487, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(474))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(67, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 470, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(114, Short.MAX_VALUE))
		);
		
		JComboBox cmbLegajo = new JComboBox();
		cmbLegajo.setBounds(126, 48, 45, 20);
		panel.add(cmbLegajo);
		
		txtLegajo = new JTextField();
		txtLegajo.setColumns(10);
		txtLegajo.setBounds(181, 47, 74, 23);
		panel.add(txtLegajo);
		setLayout(groupLayout);
	}
}
