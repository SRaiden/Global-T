package horarios;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import classDAO.CursosDAO;
import classDAO.HorariosDAO;
import classVO.CursosVO;
import classVO.HorariosVO;

import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class VerHorarioUnCurso extends JPanel {

	private JTextField txtHorario1;
	private JTextField txtNomCurso;
	private JTextField txtCantidad;
	private JTextField txtDescrip1;
	private JTextField txtHorario2;
	private JTextField txtDescrip2;
	private JTextField txtHorario3;
	private JTextField txtDescrip3;
	private JTextField txtHorario4;
	private JTextField txtDescrip4;
	private JTextField txtHorario5;
	private JTextField txtDescrip5;
	private JTextField txtDescrip6;
	private JTextField txtHorario7;
	private JTextField txtDescrip7;
	private JTextField txtHorario8;
	private JTextField txtDescrip8;
	private JTextField txtHorario9;
	private JTextField txtDescrip9;
	private JTextField txtHorario10;
	private JTextField txtDescrip10;
	private JTextField txtHorario6;
	private JTextField txtCodCurso;
	private JTextField txtSemana6;
	private JTextField txtSemana7;
	private JTextField txtSemana8;
	private JTextField txtSemana9;
	private JTextField txtSemana10;
	private JTextField txtSemana5;
	private JTextField txtSemana4;
	private JTextField txtSemana3;
	private JTextField txtSemana2;
	private JTextField txtSemana1;
	
	public VerHorarioUnCurso() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ver Horario de un Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 63, 1156, 350);
		panel.add(panel_1);
		
		JLabel label_1 = new JLabel("Horario 1");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(10, 116, 62, 24);
		panel_1.add(label_1);
		
		txtHorario1 = new JTextField();
		txtHorario1.setEditable(false);
		txtHorario1.setColumns(10);
		txtHorario1.setBounds(82, 118, 115, 23);
		panel_1.add(txtHorario1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(301, 11, 320, 88);
		panel_1.add(panel_2);
		
		JLabel label_2 = new JLabel("Nombre Curso");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(28, 11, 105, 24);
		panel_2.add(label_2);
		
		txtNomCurso = new JTextField();
		txtNomCurso.setEditable(false);
		txtNomCurso.setColumns(10);
		txtNomCurso.setBounds(139, 13, 158, 23);
		panel_2.add(txtNomCurso);
		
		JLabel label_3 = new JLabel("Computadoras");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(28, 47, 105, 24);
		panel_2.add(label_3);
		
		JCheckBox check1 = new JCheckBox("");
		check1.setEnabled(false);
		check1.setBounds(139, 47, 21, 23);
		panel_2.add(check1);
		
		JLabel label_4 = new JLabel("Cantidad");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(176, 46, 62, 24);
		panel_2.add(label_4);
		
		txtCantidad = new JTextField();
		txtCantidad.setEditable(false);
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(243, 47, 49, 23);
		panel_2.add(txtCantidad);
		
		JLabel label_5 = new JLabel("Dia");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(207, 116, 35, 24);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Descripcion");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(357, 116, 76, 24);
		panel_1.add(label_6);
		
		txtDescrip1 = new JTextField();
		txtDescrip1.setEditable(false);
		txtDescrip1.setColumns(10);
		txtDescrip1.setBounds(436, 118, 129, 23);
		panel_1.add(txtDescrip1);
		
		JLabel label_7 = new JLabel("Horario 2");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(10, 151, 62, 24);
		panel_1.add(label_7);
		
		txtHorario2 = new JTextField();
		txtHorario2.setEditable(false);
		txtHorario2.setColumns(10);
		txtHorario2.setBounds(82, 153, 115, 23);
		panel_1.add(txtHorario2);
		
		JLabel label_8 = new JLabel("Dia");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(207, 151, 35, 24);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Descripcion");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(357, 151, 76, 24);
		panel_1.add(label_9);
		
		txtDescrip2 = new JTextField();
		txtDescrip2.setEditable(false);
		txtDescrip2.setColumns(10);
		txtDescrip2.setBounds(436, 153, 129, 23);
		panel_1.add(txtDescrip2);
		
		JLabel label_10 = new JLabel("Horario 3");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(10, 186, 62, 24);
		panel_1.add(label_10);
		
		txtHorario3 = new JTextField();
		txtHorario3.setEditable(false);
		txtHorario3.setColumns(10);
		txtHorario3.setBounds(82, 188, 115, 23);
		panel_1.add(txtHorario3);
		
		JLabel label_11 = new JLabel("Dia");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(207, 186, 35, 24);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Descripcion");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(357, 186, 76, 24);
		panel_1.add(label_12);
		
		txtDescrip3 = new JTextField();
		txtDescrip3.setEditable(false);
		txtDescrip3.setColumns(10);
		txtDescrip3.setBounds(436, 188, 129, 23);
		panel_1.add(txtDescrip3);
		
		JLabel label_13 = new JLabel("Horario 4");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(10, 221, 62, 24);
		panel_1.add(label_13);
		
		txtHorario4 = new JTextField();
		txtHorario4.setEditable(false);
		txtHorario4.setColumns(10);
		txtHorario4.setBounds(82, 223, 115, 23);
		panel_1.add(txtHorario4);
		
		JLabel label_14 = new JLabel("Dia");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(207, 221, 35, 24);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("Descripcion");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(357, 221, 76, 24);
		panel_1.add(label_15);
		
		txtDescrip4 = new JTextField();
		txtDescrip4.setEditable(false);
		txtDescrip4.setColumns(10);
		txtDescrip4.setBounds(436, 223, 129, 23);
		panel_1.add(txtDescrip4);
		
		JLabel label_16 = new JLabel("Horario 5");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(10, 256, 62, 24);
		panel_1.add(label_16);
		
		txtHorario5 = new JTextField();
		txtHorario5.setEditable(false);
		txtHorario5.setColumns(10);
		txtHorario5.setBounds(82, 258, 115, 23);
		panel_1.add(txtHorario5);
		
		JLabel label_17 = new JLabel("Dia");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(207, 256, 35, 24);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("Descripcion");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(357, 256, 76, 24);
		panel_1.add(label_18);
		
		txtDescrip5 = new JTextField();
		txtDescrip5.setEditable(false);
		txtDescrip5.setColumns(10);
		txtDescrip5.setBounds(436, 258, 129, 23);
		panel_1.add(txtDescrip5);
		
		JLabel label_19 = new JLabel("Dia");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(800, 115, 35, 24);
		panel_1.add(label_19);
		
		JLabel label_20 = new JLabel("Descripcion");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_20.setBounds(950, 115, 76, 24);
		panel_1.add(label_20);
		
		txtDescrip6 = new JTextField();
		txtDescrip6.setEditable(false);
		txtDescrip6.setColumns(10);
		txtDescrip6.setBounds(1029, 117, 117, 23);
		panel_1.add(txtDescrip6);
		
		JLabel label_21 = new JLabel("Horario 7");
		label_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_21.setBounds(603, 150, 62, 24);
		panel_1.add(label_21);
		
		txtHorario7 = new JTextField();
		txtHorario7.setEditable(false);
		txtHorario7.setColumns(10);
		txtHorario7.setBounds(675, 152, 115, 23);
		panel_1.add(txtHorario7);
		
		JLabel label_22 = new JLabel("Dia");
		label_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_22.setBounds(800, 150, 35, 24);
		panel_1.add(label_22);
		
		JLabel label_23 = new JLabel("Descripcion");
		label_23.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_23.setBounds(950, 150, 76, 24);
		panel_1.add(label_23);
		
		txtDescrip7 = new JTextField();
		txtDescrip7.setEditable(false);
		txtDescrip7.setColumns(10);
		txtDescrip7.setBounds(1029, 152, 117, 23);
		panel_1.add(txtDescrip7);
		
		JLabel label_24 = new JLabel("Horario 8");
		label_24.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_24.setBounds(603, 185, 62, 24);
		panel_1.add(label_24);
		
		txtHorario8 = new JTextField();
		txtHorario8.setEditable(false);
		txtHorario8.setColumns(10);
		txtHorario8.setBounds(675, 187, 115, 23);
		panel_1.add(txtHorario8);
		
		JLabel label_25 = new JLabel("Dia");
		label_25.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_25.setBounds(800, 185, 35, 24);
		panel_1.add(label_25);
		
		JLabel label_26 = new JLabel("Descripcion");
		label_26.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_26.setBounds(950, 185, 76, 24);
		panel_1.add(label_26);
		
		txtDescrip8 = new JTextField();
		txtDescrip8.setEditable(false);
		txtDescrip8.setColumns(10);
		txtDescrip8.setBounds(1029, 187, 117, 23);
		panel_1.add(txtDescrip8);
		
		JLabel label_27 = new JLabel("Horario 9");
		label_27.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_27.setBounds(603, 220, 62, 24);
		panel_1.add(label_27);
		
		txtHorario9 = new JTextField();
		txtHorario9.setEditable(false);
		txtHorario9.setColumns(10);
		txtHorario9.setBounds(675, 222, 115, 23);
		panel_1.add(txtHorario9);
		
		JLabel label_28 = new JLabel("Dia");
		label_28.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_28.setBounds(800, 220, 35, 24);
		panel_1.add(label_28);
		
		JLabel label_29 = new JLabel("Descripcion");
		label_29.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_29.setBounds(950, 220, 76, 24);
		panel_1.add(label_29);
		
		txtDescrip9 = new JTextField();
		txtDescrip9.setEditable(false);
		txtDescrip9.setColumns(10);
		txtDescrip9.setBounds(1029, 222, 117, 23);
		panel_1.add(txtDescrip9);
		
		JLabel label_30 = new JLabel("Horario 10");
		label_30.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_30.setBounds(603, 255, 76, 24);
		panel_1.add(label_30);
		
		txtHorario10 = new JTextField();
		txtHorario10.setEditable(false);
		txtHorario10.setColumns(10);
		txtHorario10.setBounds(675, 257, 115, 23);
		panel_1.add(txtHorario10);
		
		JLabel label_31 = new JLabel("Dia");
		label_31.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_31.setBounds(800, 255, 35, 24);
		panel_1.add(label_31);
		
		JLabel label_32 = new JLabel("Descripcion");
		label_32.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_32.setBounds(950, 255, 76, 24);
		panel_1.add(label_32);
		
		txtDescrip10 = new JTextField();
		txtDescrip10.setEditable(false);
		txtDescrip10.setColumns(10);
		txtDescrip10.setBounds(1029, 257, 117, 23);
		panel_1.add(txtDescrip10);
		
		txtHorario6 = new JTextField();
		txtHorario6.setEditable(false);
		txtHorario6.setColumns(10);
		txtHorario6.setBounds(675, 117, 115, 23);
		panel_1.add(txtHorario6);
		
		JLabel label_33 = new JLabel("Horario 6");
		label_33.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_33.setBounds(603, 115, 62, 24);
		panel_1.add(label_33);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(585, 116, 9, 164);
		panel_1.add(separator);
		
		txtSemana6 = new JTextField();
		txtSemana6.setEditable(false);
		txtSemana6.setColumns(10);
		txtSemana6.setBounds(830, 116, 107, 23);
		panel_1.add(txtSemana6);
		
		txtSemana7 = new JTextField();
		txtSemana7.setEditable(false);
		txtSemana7.setColumns(10);
		txtSemana7.setBounds(830, 152, 107, 23);
		panel_1.add(txtSemana7);
		
		txtSemana8 = new JTextField();
		txtSemana8.setEditable(false);
		txtSemana8.setColumns(10);
		txtSemana8.setBounds(830, 187, 107, 23);
		panel_1.add(txtSemana8);
		
		txtSemana9 = new JTextField();
		txtSemana9.setEditable(false);
		txtSemana9.setColumns(10);
		txtSemana9.setBounds(830, 222, 107, 23);
		panel_1.add(txtSemana9);
		
		txtSemana10 = new JTextField();
		txtSemana10.setEditable(false);
		txtSemana10.setColumns(10);
		txtSemana10.setBounds(830, 257, 107, 23);
		panel_1.add(txtSemana10);
		
		txtSemana5 = new JTextField();
		txtSemana5.setEditable(false);
		txtSemana5.setColumns(10);
		txtSemana5.setBounds(240, 257, 107, 23);
		panel_1.add(txtSemana5);
		
		txtSemana4 = new JTextField();
		txtSemana4.setEditable(false);
		txtSemana4.setColumns(10);
		txtSemana4.setBounds(240, 222, 107, 23);
		panel_1.add(txtSemana4);
		
		txtSemana3 = new JTextField();
		txtSemana3.setEditable(false);
		txtSemana3.setColumns(10);
		txtSemana3.setBounds(240, 187, 107, 23);
		panel_1.add(txtSemana3);
		
		txtSemana2 = new JTextField();
		txtSemana2.setEditable(false);
		txtSemana2.setColumns(10);
		txtSemana2.setBounds(240, 152, 107, 23);
		panel_1.add(txtSemana2);
		
		txtSemana1 = new JTextField();
		txtSemana1.setEditable(false);
		txtSemana1.setColumns(10);
		txtSemana1.setBounds(240, 116, 107, 23);
		panel_1.add(txtSemana1);
		
		JLabel label_34 = new JLabel("Codigo Curso");
		label_34.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_34.setBounds(10, 28, 122, 24);
		panel.add(label_34);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setColumns(10);
		txtCodCurso.setBounds(113, 30, 48, 23);
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
					txtCantidad.setText(cod.getCantidad_pc() + "");
					
					HorariosVO hor = HorariosDAO.BuscarUnHorario(codcurso);
					
					txtHorario1.setText(hor.getHorario_uno() + "");
					txtHorario2.setText(hor.getHorario_dos() + "");
					txtHorario3.setText(hor.getHorario_tres() + "");
					txtHorario4.setText(hor.getHorario_cuatro() + "");
					txtHorario5.setText(hor.getHorario_cinco() + "");
					txtHorario6.setText(hor.getHorario_seis() + "");
					txtHorario7.setText(hor.getHorario_siete() + "");
					txtHorario8.setText(hor.getHorario_ocho() + "");
					txtHorario9.setText(hor.getHorario_nueve() + "");
					txtHorario10.setText(hor.getHorario_diez() + "");
					txtDescrip1.setText(hor.getDescripcion_Uno() + "");
					txtDescrip2.setText(hor.getDescripcion_dos() + "");
					txtDescrip3.setText(hor.getDescripcion_tres() + "");
					txtDescrip4.setText(hor.getDescripcion_cuatro() + "");
					txtDescrip5.setText(hor.getDescripcion_cinco() + "");
					txtDescrip6.setText(hor.getDescripcion_seis() + "");
					txtDescrip7.setText(hor.getDescripcion_siete() + "");
					txtDescrip8.setText(hor.getDescripcion_ocho() + "");
					txtDescrip9.setText(hor.getDescripcion_nueve() + "");
					txtDescrip10.setText(hor.getDescripcion_diez() + "");
					
					txtSemana1.setText(hor.getDia_uno());
					txtSemana2.setText(hor.getDia_dos());
					txtSemana3.setText(hor.getDia_tres());
					txtSemana4.setText(hor.getDia_cuatro());
					txtSemana5.setText(hor.getDia_cinco());
					txtSemana6.setText(hor.getDia_seis());
					txtSemana7.setText(hor.getDia_siete());
					txtSemana8.setText(hor.getDia_ocho());
					txtSemana9.setText(hor.getDia_nueve());
					txtSemana10.setText(hor.getDia_diez());
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Horario", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Horario", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscar.setBounds(171, 23, 107, 35);
		panel.add(btnBuscar);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(577, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(505))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(152, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
