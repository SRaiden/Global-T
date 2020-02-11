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
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ModificarCurso extends JPanel {

	private JTextField txtCantidadPC;
	private JTextField txtModulo1;
	private JTextField txtModulo2;
	private JTextField txtModulo3;
	private JTextField txtModulo4;
	private JTextField txtModulo5;
	private JTextField txtModulo6;
	private JTextField txtNomCurso;
	private JTextField txtModulo7;
	private JTextField txtModulo8;
	private JTextField txtModulo9;
	private JTextField txtModulo10;
	private JTextField txtEstado;
	private JTextField txtCodCurso;
	public ModificarCurso() {
		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Modificar Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 59, 986, 350);
		panel.add(panel_1);
		
		JLabel label_1 = new JLabel("Estado");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(589, 301, 49, 24);
		panel_1.add(label_1);
		
		JCheckBox check1 = new JCheckBox("");
		check1.setBounds(440, 67, 21, 23);
		panel_1.add(check1);
		
		JLabel label_2 = new JLabel("Cantidad");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(477, 66, 62, 24);
		panel_1.add(label_2);
		
		txtCantidadPC = new JTextField();
		txtCantidadPC.setColumns(10);
		txtCantidadPC.setBounds(544, 67, 49, 23);
		panel_1.add(txtCantidadPC);
		
		JLabel label_3 = new JLabel("Modulo 1");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(37, 135, 62, 24);
		panel_1.add(label_3);
		
		txtModulo1 = new JTextField();
		txtModulo1.setColumns(10);
		txtModulo1.setBounds(114, 135, 129, 23);
		panel_1.add(txtModulo1);
		
		JLabel label_4 = new JLabel("Modulo 2");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(37, 170, 62, 24);
		panel_1.add(label_4);
		
		txtModulo2 = new JTextField();
		txtModulo2.setColumns(10);
		txtModulo2.setBounds(114, 172, 129, 23);
		panel_1.add(txtModulo2);
		
		JLabel label_5 = new JLabel("Modulo 3");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(37, 205, 62, 24);
		panel_1.add(label_5);
		
		txtModulo3 = new JTextField();
		txtModulo3.setColumns(10);
		txtModulo3.setBounds(114, 206, 129, 23);
		panel_1.add(txtModulo3);
		
		JLabel label_6 = new JLabel("Modulo 6");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(370, 203, 93, 24);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Modulo 5");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(370, 168, 93, 24);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("Modulo 4");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(370, 133, 69, 24);
		panel_1.add(label_8);
		
		txtModulo4 = new JTextField();
		txtModulo4.setColumns(10);
		txtModulo4.setBounds(449, 135, 129, 23);
		panel_1.add(txtModulo4);
		
		txtModulo5 = new JTextField();
		txtModulo5.setColumns(10);
		txtModulo5.setBounds(449, 170, 129, 23);
		panel_1.add(txtModulo5);
		
		txtModulo6 = new JTextField();
		txtModulo6.setColumns(10);
		txtModulo6.setBounds(449, 203, 129, 23);
		panel_1.add(txtModulo6);
		
		JLabel label_9 = new JLabel("Nombre Curso");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(329, 31, 105, 24);
		panel_1.add(label_9);
		
		txtNomCurso = new JTextField();
		txtNomCurso.setColumns(10);
		txtNomCurso.setBounds(440, 33, 158, 23);
		panel_1.add(txtNomCurso);
		
		JLabel label_10 = new JLabel("Computadoras");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(329, 67, 105, 24);
		panel_1.add(label_10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(301, 11, 320, 93);
		panel_1.add(panel_2);
		
		JLabel label_11 = new JLabel("Modulo 7");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(741, 135, 69, 24);
		panel_1.add(label_11);
		
		txtModulo7 = new JTextField();
		txtModulo7.setColumns(10);
		txtModulo7.setBounds(815, 136, 129, 23);
		panel_1.add(txtModulo7);
		
		JLabel label_12 = new JLabel("Modulo 8");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(741, 170, 93, 24);
		panel_1.add(label_12);
		
		txtModulo8 = new JTextField();
		txtModulo8.setColumns(10);
		txtModulo8.setBounds(815, 171, 129, 23);
		panel_1.add(txtModulo8);
		
		JLabel label_13 = new JLabel("Modulo 9");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(741, 205, 93, 24);
		panel_1.add(label_13);
		
		txtModulo9 = new JTextField();
		txtModulo9.setColumns(10);
		txtModulo9.setBounds(815, 204, 129, 23);
		panel_1.add(txtModulo9);
		
		JLabel label_14 = new JLabel("Modulo 10");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(741, 240, 93, 24);
		panel_1.add(label_14);
		
		txtModulo10 = new JTextField();
		txtModulo10.setColumns(10);
		txtModulo10.setBounds(815, 239, 129, 23);
		panel_1.add(txtModulo10);
		
		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setColumns(10);
		txtEstado.setBounds(637, 304, 152, 23);
		panel_1.add(txtEstado);
		
		JLabel label_15 = new JLabel("Codigo Curso");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(10, 23, 122, 24);
		panel.add(label_15);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setColumns(10);
		txtCodCurso.setBounds(115, 25, 41, 23);
		panel.add(txtCodCurso);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String CodCurso = txtCodCurso.getText();
					int codcurso = Integer.parseInt(CodCurso);
					
					CursosVO cod = CursosDAO.BuscarUnCurso(codcurso);
					txtNomCurso.setText(cod.getNombre_curso() + "");
					check1.setSelected(cod.isComputadoras_curso());
					txtCantidadPC.setText(cod.getCantidad_pc() + "");
					txtModulo1.setText(cod.getModulo_uno() + "");
					txtModulo2.setText(cod.getModulo_dos() + "");
					txtModulo3.setText(cod.getModulo_tres() + "");
					txtModulo4.setText(cod.getModulo_cuatro() + "");
					txtModulo5.setText(cod.getModulo_cinco() + "");
					txtModulo6.setText(cod.getModulo_seis() + "");
					txtModulo7.setText(cod.getModulo_siete() + "");
					txtModulo8.setText(cod.getModulo_ocho() + "");
					txtModulo9.setText(cod.getModulo_nueve() + "");
					txtModulo10.setText(cod.getModulo_diez() + "");
					txtEstado.setText(cod.getEstado_curso() + "");
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscar.setBounds(181, 18, 107, 35);
		panel.add(btnBuscar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
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
				
				try {
					String resp = CursosDAO.ActualizarCurso(cur);
					JOptionPane.showMessageDialog(null, resp, "Modificar Curso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
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
					txtEstado.setText("");
					// cargarAlumnos(0);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnModificar.setBounds(837, 296, 107, 35);
		panel_1.add(btnModificar);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(42, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
							.addGap(476))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE)
							.addGap(31))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(212, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

}
