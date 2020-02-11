package cursos;

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
import classVO.AlumnosVO;
import classVO.CursosVO;

import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AgregarCurso extends JPanel {

	private JTextField txtCantidadPC;
	private JTextField txtModulo1;
	private JTextField txtModulo2;
	private JTextField txtModulo3;
	private JTextField txtModulo4;
	private JTextField txtModulo5;
	private JTextField txtModulo6;
	private JTextField txtNomCurso;
	private JTextField txtCodCurso;
	private JTextField txtModulo7;
	private JTextField txtModulo8;
	private JTextField txtModulo9;
	private JTextField txtModulo10;
	
	public AgregarCurso() {
		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agregar Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 23, 986, 350);
		panel.add(panel_1);
		
		JLabel label_1 = new JLabel("Estado");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(589, 301, 49, 24);
		panel_1.add(label_1);
		
		JComboBox cmbEstado = new JComboBox();
		cmbEstado.setBounds(637, 304, 145, 20);
		cmbEstado.addItem("ACTIVO");
		cmbEstado.addItem("INACTIVO");
		panel_1.add(cmbEstado);
		
		JCheckBox check1 = new JCheckBox("");
		check1.setBounds(440, 93, 21, 23);
		panel_1.add(check1);
		
		JLabel label_2 = new JLabel("Cantidad");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(477, 92, 62, 24);
		panel_1.add(label_2);
		
		txtCantidadPC = new JTextField();
		txtCantidadPC.setColumns(10);
		txtCantidadPC.setBounds(544, 93, 49, 23);
		panel_1.add(txtCantidadPC);
		
		JLabel label_3 = new JLabel("Modulo 1");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(37, 143, 62, 24);
		panel_1.add(label_3);
		
		txtModulo1 = new JTextField();
		txtModulo1.setColumns(10);
		txtModulo1.setBounds(114, 143, 129, 23);
		panel_1.add(txtModulo1);
		
		JLabel label_4 = new JLabel("Modulo 2");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(37, 178, 62, 24);
		panel_1.add(label_4);
		
		txtModulo2 = new JTextField();
		txtModulo2.setColumns(10);
		txtModulo2.setBounds(114, 180, 129, 23);
		panel_1.add(txtModulo2);
		
		JLabel label_5 = new JLabel("Modulo 3");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(37, 213, 62, 24);
		panel_1.add(label_5);
		
		txtModulo3 = new JTextField();
		txtModulo3.setColumns(10);
		txtModulo3.setBounds(114, 214, 129, 23);
		panel_1.add(txtModulo3);
		
		JLabel label_6 = new JLabel("Modulo 6");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(370, 211, 93, 24);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Modulo 5");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(370, 176, 93, 24);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("Modulo 4");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(370, 141, 69, 24);
		panel_1.add(label_8);
		
		txtModulo4 = new JTextField();
		txtModulo4.setColumns(10);
		txtModulo4.setBounds(449, 143, 129, 23);
		panel_1.add(txtModulo4);
		
		txtModulo5 = new JTextField();
		txtModulo5.setColumns(10);
		txtModulo5.setBounds(449, 178, 129, 23);
		panel_1.add(txtModulo5);
		
		txtModulo6 = new JTextField();
		txtModulo6.setColumns(10);
		txtModulo6.setBounds(449, 211, 129, 23);
		panel_1.add(txtModulo6);
		
		JLabel label_9 = new JLabel("Codigo Curso");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(329, 22, 107, 24);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("Nombre Curso");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(329, 57, 105, 24);
		panel_1.add(label_10);
		
		txtNomCurso = new JTextField();
		txtNomCurso.setColumns(10);
		txtNomCurso.setBounds(440, 59, 158, 23);
		panel_1.add(txtNomCurso);
		
		JLabel label_11 = new JLabel("Computadoras");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(329, 93, 105, 24);
		panel_1.add(label_11);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(301, 11, 320, 119);
		panel_1.add(panel_2);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setColumns(10);
		txtCodCurso.setBounds(140, 11, 48, 23);
		panel_2.add(txtCodCurso);
		
		JLabel label_12 = new JLabel("Modulo 7");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(741, 143, 69, 24);
		panel_1.add(label_12);
		
		txtModulo7 = new JTextField();
		txtModulo7.setColumns(10);
		txtModulo7.setBounds(815, 144, 129, 23);
		panel_1.add(txtModulo7);
		
		JLabel label_13 = new JLabel("Modulo 8");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(741, 178, 93, 24);
		panel_1.add(label_13);
		
		txtModulo8 = new JTextField();
		txtModulo8.setColumns(10);
		txtModulo8.setBounds(815, 179, 129, 23);
		panel_1.add(txtModulo8);
		
		JLabel label_14 = new JLabel("Modulo 9");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(741, 213, 93, 24);
		panel_1.add(label_14);
		
		txtModulo9 = new JTextField();
		txtModulo9.setColumns(10);
		txtModulo9.setBounds(815, 212, 129, 23);
		panel_1.add(txtModulo9);
		
		JLabel label_15 = new JLabel("Modulo 10");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(741, 249, 93, 24);
		panel_1.add(label_15);
		
		txtModulo10 = new JTextField();
		txtModulo10.setColumns(10);
		txtModulo10.setBounds(815, 248, 129, 23);
		panel_1.add(txtModulo10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CursosVO cur = new CursosVO();
				
				cur.setCodigo_curso(Integer.parseInt(txtCodCurso.getText()));
				cur.setNombre_curso(txtNomCurso.getText());
				cur.setComputadoras_curso(check1.isSelected());
				cur.setCantidad_pc(Integer.parseInt(txtCantidadPC.getText()));
				cur.setModulo_uno(txtModulo1.getText());
				cur.setModulo_dos(txtModulo2.getText());
				cur.setModulo_tres(txtModulo3.getText());
				cur.setModulo_cuatro(txtModulo4.getText());
				cur.setModulo_cinco(txtModulo5.getText());
				cur.setModulo_seis(txtModulo6.getText());
				cur.setModulo_siete(txtModulo7.getText());
				cur.setModulo_ocho(txtModulo8.getText());
				cur.setModulo_nueve(txtModulo9.getText());
				cur.setModulo_diez(txtModulo10.getText());
				
				String estado = (String)cmbEstado.getSelectedItem();
				cur.setEstado_curso(estado);
				
				try {
					String resp = CursosDAO.RegistrarCursos(cur);
					JOptionPane.showMessageDialog(null, resp, "Agregar Curso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					txtCodCurso.setText("");
					txtNomCurso.setText("");
					txtCantidadPC.setText("");
					txtModulo1.setText("");
					txtModulo2.setText("");
					txtModulo3.setText("");
					txtModulo4.setText("");
					txtModulo5.setText("");
					txtModulo6.setText("");
					txtModulo7.setText("");
					txtModulo8.setText("");
					txtModulo9.setText("");
					txtModulo10.setText("");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAgregar.setBounds(837, 296, 107, 35);
		panel_1.add(btnAgregar);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(29, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE)
							.addGap(41))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
							.addGap(473))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(282, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

}
