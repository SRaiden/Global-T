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
import classDAO.ProfesoresDAO;
import classDAO.TutoresDAO;
import classVO.CursosVO;
import classVO.HorariosVO;
import classVO.ProfesoresVO;
import classVO.TutoresVO;

import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AgregarHorario extends JPanel {

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
	
	public AgregarHorario() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agregar Horario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
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
		
		JComboBox cmbSemana1 = new JComboBox();
		cmbSemana1.addItem("");
		cmbSemana1.addItem("Domingo");
		cmbSemana1.addItem("Lunes");
		cmbSemana1.addItem("Martes");
		cmbSemana1.addItem("Miercoles");
		cmbSemana1.addItem("Jueves");
		cmbSemana1.addItem("Viernes");
		cmbSemana1.addItem("Sabado");
		cmbSemana1.setBounds(240, 119, 107, 20);
		panel_1.add(cmbSemana1);
		
		JLabel label_6 = new JLabel("Descripcion");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(357, 116, 76, 24);
		panel_1.add(label_6);
		
		txtDescrip1 = new JTextField();
		txtDescrip1.setColumns(10);
		txtDescrip1.setBounds(436, 118, 129, 23);
		panel_1.add(txtDescrip1);
		
		JLabel label_7 = new JLabel("Horario 2");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(10, 151, 62, 24);
		panel_1.add(label_7);
		
		txtHorario2 = new JTextField();
		txtHorario2.setColumns(10);
		txtHorario2.setBounds(82, 153, 115, 23);
		panel_1.add(txtHorario2);
		
		JLabel label_8 = new JLabel("Dia");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(207, 151, 35, 24);
		panel_1.add(label_8);
		
		JComboBox cmbSemana2 = new JComboBox();
		cmbSemana2.addItem("");
		cmbSemana2.addItem("Domingo");
		cmbSemana2.addItem("Lunes");
		cmbSemana2.addItem("Martes");
		cmbSemana2.addItem("Miercoles");
		cmbSemana2.addItem("Jueves");
		cmbSemana2.addItem("Viernes");
		cmbSemana2.addItem("Sabado");
		cmbSemana2.setBounds(240, 154, 107, 20);
		panel_1.add(cmbSemana2);
		
		JLabel label_9 = new JLabel("Descripcion");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(357, 151, 76, 24);
		panel_1.add(label_9);
		
		txtDescrip2 = new JTextField();
		txtDescrip2.setColumns(10);
		txtDescrip2.setBounds(436, 153, 129, 23);
		panel_1.add(txtDescrip2);
		
		JLabel label_10 = new JLabel("Horario 3");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(10, 186, 62, 24);
		panel_1.add(label_10);
		
		txtHorario3 = new JTextField();
		txtHorario3.setColumns(10);
		txtHorario3.setBounds(82, 188, 115, 23);
		panel_1.add(txtHorario3);
		
		JLabel label_11 = new JLabel("Dia");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(207, 186, 35, 24);
		panel_1.add(label_11);
		
		JComboBox cmbSemana3 = new JComboBox();
		cmbSemana3.addItem("");
		cmbSemana3.addItem("Domingo");
		cmbSemana3.addItem("Lunes");
		cmbSemana3.addItem("Martes");
		cmbSemana3.addItem("Miercoles");
		cmbSemana3.addItem("Jueves");
		cmbSemana3.addItem("Viernes");
		cmbSemana3.addItem("Sabado");
		cmbSemana3.setBounds(240, 189, 107, 20);
		panel_1.add(cmbSemana3);
		
		JLabel label_12 = new JLabel("Descripcion");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(357, 186, 76, 24);
		panel_1.add(label_12);
		
		txtDescrip3 = new JTextField();
		txtDescrip3.setColumns(10);
		txtDescrip3.setBounds(436, 188, 129, 23);
		panel_1.add(txtDescrip3);
		
		JLabel label_13 = new JLabel("Horario 4");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(10, 221, 62, 24);
		panel_1.add(label_13);
		
		txtHorario4 = new JTextField();
		txtHorario4.setColumns(10);
		txtHorario4.setBounds(82, 223, 115, 23);
		panel_1.add(txtHorario4);
		
		JLabel label_14 = new JLabel("Dia");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(207, 221, 35, 24);
		panel_1.add(label_14);
		
		JComboBox cmbSemana4 = new JComboBox();
		cmbSemana4.addItem("");
		cmbSemana4.addItem("Domingo");
		cmbSemana4.addItem("Lunes");
		cmbSemana4.addItem("Martes");
		cmbSemana4.addItem("Miercoles");
		cmbSemana4.addItem("Jueves");
		cmbSemana4.addItem("Viernes");
		cmbSemana4.addItem("Sabado");
		cmbSemana4.setBounds(240, 224, 107, 20);
		panel_1.add(cmbSemana4);
		
		JLabel label_15 = new JLabel("Descripcion");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(357, 221, 76, 24);
		panel_1.add(label_15);
		
		txtDescrip4 = new JTextField();
		txtDescrip4.setColumns(10);
		txtDescrip4.setBounds(436, 223, 129, 23);
		panel_1.add(txtDescrip4);
		
		JLabel label_16 = new JLabel("Horario 5");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(10, 256, 62, 24);
		panel_1.add(label_16);
		
		txtHorario5 = new JTextField();
		txtHorario5.setColumns(10);
		txtHorario5.setBounds(82, 258, 115, 23);
		panel_1.add(txtHorario5);
		
		JLabel label_17 = new JLabel("Dia");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(207, 256, 35, 24);
		panel_1.add(label_17);
		
		JComboBox cmbSemana5 = new JComboBox();
		cmbSemana5.addItem("");
		cmbSemana5.addItem("Domingo");
		cmbSemana5.addItem("Lunes");
		cmbSemana5.addItem("Martes");
		cmbSemana5.addItem("Miercoles");
		cmbSemana5.addItem("Jueves");
		cmbSemana5.addItem("Viernes");
		cmbSemana5.addItem("Sabado");
		cmbSemana5.setBounds(240, 259, 107, 20);
		panel_1.add(cmbSemana5);
		
		JLabel label_18 = new JLabel("Descripcion");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(357, 256, 76, 24);
		panel_1.add(label_18);
		
		txtDescrip5 = new JTextField();
		txtDescrip5.setColumns(10);
		txtDescrip5.setBounds(436, 258, 129, 23);
		panel_1.add(txtDescrip5);
		
		JLabel label_19 = new JLabel("Dia");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(800, 115, 35, 24);
		panel_1.add(label_19);
		
		JComboBox cmbSemana6 = new JComboBox();
		cmbSemana6.addItem("");
		cmbSemana6.addItem("Domingo");
		cmbSemana6.addItem("Lunes");
		cmbSemana6.addItem("Martes");
		cmbSemana6.addItem("Miercoles");
		cmbSemana6.addItem("Jueves");
		cmbSemana6.addItem("Viernes");
		cmbSemana6.addItem("Sabado");
		cmbSemana6.setBounds(833, 118, 107, 20);
		panel_1.add(cmbSemana6);
		
		JLabel label_20 = new JLabel("Descripcion");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_20.setBounds(950, 115, 76, 24);
		panel_1.add(label_20);
		
		txtDescrip6 = new JTextField();
		txtDescrip6.setColumns(10);
		txtDescrip6.setBounds(1029, 117, 117, 23);
		panel_1.add(txtDescrip6);
		
		JLabel label_21 = new JLabel("Horario 7");
		label_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_21.setBounds(603, 150, 62, 24);
		panel_1.add(label_21);
		
		txtHorario7 = new JTextField();
		txtHorario7.setColumns(10);
		txtHorario7.setBounds(675, 152, 115, 23);
		panel_1.add(txtHorario7);
		
		JLabel label_22 = new JLabel("Dia");
		label_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_22.setBounds(800, 150, 35, 24);
		panel_1.add(label_22);
		
		JComboBox cmbSemana7 = new JComboBox();
		cmbSemana7.addItem("");
		cmbSemana7.addItem("Domingo");
		cmbSemana7.addItem("Lunes");
		cmbSemana7.addItem("Martes");
		cmbSemana7.addItem("Miercoles");
		cmbSemana7.addItem("Jueves");
		cmbSemana7.addItem("Viernes");
		cmbSemana7.addItem("Sabado");
		cmbSemana7.setBounds(833, 153, 107, 20);
		panel_1.add(cmbSemana7);
		
		JLabel label_23 = new JLabel("Descripcion");
		label_23.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_23.setBounds(950, 150, 76, 24);
		panel_1.add(label_23);
		
		txtDescrip7 = new JTextField();
		txtDescrip7.setColumns(10);
		txtDescrip7.setBounds(1029, 152, 117, 23);
		panel_1.add(txtDescrip7);
		
		JLabel label_24 = new JLabel("Horario 8");
		label_24.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_24.setBounds(603, 185, 62, 24);
		panel_1.add(label_24);
		
		txtHorario8 = new JTextField();
		txtHorario8.setColumns(10);
		txtHorario8.setBounds(675, 187, 115, 23);
		panel_1.add(txtHorario8);
		
		JLabel label_25 = new JLabel("Dia");
		label_25.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_25.setBounds(800, 185, 35, 24);
		panel_1.add(label_25);
		
		JComboBox cmbSemana8 = new JComboBox();
		cmbSemana8.addItem("");
		cmbSemana8.addItem("Domingo");
		cmbSemana8.addItem("Lunes");
		cmbSemana8.addItem("Martes");
		cmbSemana8.addItem("Miercoles");
		cmbSemana8.addItem("Jueves");
		cmbSemana8.addItem("Viernes");
		cmbSemana8.addItem("Sabado");
		cmbSemana8.setBounds(833, 188, 107, 20);
		panel_1.add(cmbSemana8);
		
		JLabel label_26 = new JLabel("Descripcion");
		label_26.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_26.setBounds(950, 185, 76, 24);
		panel_1.add(label_26);
		
		txtDescrip8 = new JTextField();
		txtDescrip8.setColumns(10);
		txtDescrip8.setBounds(1029, 187, 117, 23);
		panel_1.add(txtDescrip8);
		
		JLabel label_27 = new JLabel("Horario 9");
		label_27.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_27.setBounds(603, 220, 62, 24);
		panel_1.add(label_27);
		
		txtHorario9 = new JTextField();
		txtHorario9.setColumns(10);
		txtHorario9.setBounds(675, 222, 115, 23);
		panel_1.add(txtHorario9);
		
		JLabel label_28 = new JLabel("Dia");
		label_28.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_28.setBounds(800, 220, 35, 24);
		panel_1.add(label_28);
		
		JComboBox cmbSemana9 = new JComboBox();
		cmbSemana9.addItem("");
		cmbSemana9.addItem("Domingo");
		cmbSemana9.addItem("Lunes");
		cmbSemana9.addItem("Martes");
		cmbSemana9.addItem("Miercoles");
		cmbSemana9.addItem("Jueves");
		cmbSemana9.addItem("Viernes");
		cmbSemana9.addItem("Sabado");
		cmbSemana9.setBounds(833, 223, 107, 20);
		panel_1.add(cmbSemana9);
		
		JLabel label_29 = new JLabel("Descripcion");
		label_29.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_29.setBounds(950, 220, 76, 24);
		panel_1.add(label_29);
		
		txtDescrip9 = new JTextField();
		txtDescrip9.setColumns(10);
		txtDescrip9.setBounds(1029, 222, 117, 23);
		panel_1.add(txtDescrip9);
		
		JLabel label_30 = new JLabel("Horario 10");
		label_30.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_30.setBounds(603, 255, 76, 24);
		panel_1.add(label_30);
		
		txtHorario10 = new JTextField();
		txtHorario10.setColumns(10);
		txtHorario10.setBounds(675, 257, 115, 23);
		panel_1.add(txtHorario10);
		
		JLabel label_31 = new JLabel("Dia");
		label_31.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_31.setBounds(800, 255, 35, 24);
		panel_1.add(label_31);
		
		JComboBox cmbSemana10 = new JComboBox();
		cmbSemana10.addItem("");
		cmbSemana10.addItem("Domingo");
		cmbSemana10.addItem("Lunes");
		cmbSemana10.addItem("Martes");
		cmbSemana10.addItem("Miercoles");
		cmbSemana10.addItem("Jueves");
		cmbSemana10.addItem("Viernes");
		cmbSemana10.addItem("Sabado");
		cmbSemana10.setBounds(833, 258, 107, 20);
		panel_1.add(cmbSemana10);
		
		JLabel label_32 = new JLabel("Descripcion");
		label_32.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_32.setBounds(950, 255, 76, 24);
		panel_1.add(label_32);
		
		txtDescrip10 = new JTextField();
		txtDescrip10.setColumns(10);
		txtDescrip10.setBounds(1029, 257, 117, 23);
		panel_1.add(txtDescrip10);
		
		txtHorario6 = new JTextField();
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
		
		JLabel label_34 = new JLabel("Codigo Curso");
		label_34.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_34.setBounds(10, 28, 94, 24);
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
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Curso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Curso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscar.setBounds(171, 23, 107, 35);
		panel.add(btnBuscar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HorariosVO hor = new HorariosVO();
				
				hor.setCod_Curso(Integer.parseInt(txtCodCurso.getText()));
				hor.setHorario_uno(txtHorario1.getText());
				hor.setHorario_dos(txtHorario2.getText());
				hor.setHorario_tres(txtHorario3.getText());
				hor.setHorario_cuatro(txtHorario4.getText());
				hor.setHorario_cinco(txtHorario5.getText());
				hor.setHorario_seis(txtHorario6.getText());
				hor.setHorario_siete(txtHorario7.getText());
				hor.setHorario_ocho(txtHorario8.getText());
				hor.setHorario_nueve(txtHorario9.getText());
				hor.setHorario_diez(txtHorario10.getText());
				hor.setDescripcion_Uno(txtDescrip1.getText());
				hor.setDescripcion_dos(txtDescrip2.getText());
				hor.setDescripcion_tres(txtDescrip3.getText());
				hor.setDescripcion_cuatro(txtDescrip4.getText());
				hor.setDescripcion_cinco(txtDescrip5.getText());
				hor.setDescripcion_seis(txtDescrip6.getText());
				hor.setDescripcion_siete(txtDescrip7.getText());
				hor.setDescripcion_ocho(txtDescrip8.getText());
				hor.setDescripcion_nueve(txtDescrip9.getText());
				hor.setDescripcion_diez(txtDescrip10.getText());
				
				String semana1 = (String) cmbSemana1.getSelectedItem();
				hor.setDia_uno(semana1);
				String semana2 = (String) cmbSemana2.getSelectedItem();
				hor.setDia_dos(semana2);
				String semana3 = (String) cmbSemana3.getSelectedItem();
				hor.setDia_tres(semana3);
				String semana4 = (String) cmbSemana4.getSelectedItem();
				hor.setDia_cuatro(semana4);
				String semana5 = (String) cmbSemana5.getSelectedItem();
				hor.setDia_cinco(semana5);
				String semana6 = (String) cmbSemana6.getSelectedItem();
				hor.setDia_seis(semana6);
				String semana7 = (String) cmbSemana7.getSelectedItem();
				hor.setDia_siete(semana7);
				String semana8 = (String) cmbSemana8.getSelectedItem();
				hor.setDia_ocho(semana8);
				String semana9 = (String) cmbSemana9.getSelectedItem();
				hor.setDia_nueve(semana9);
				String semana10 = (String) cmbSemana10.getSelectedItem();
				hor.setDia_diez(semana10);
				
				
				try {
					String resp = HorariosDAO.RegistrarHorario(hor);
					JOptionPane.showMessageDialog(null, resp, "Agregar Tutor", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					txtHorario1.setText("");
					txtHorario2.setText("");
					txtHorario3.setText("");
					txtHorario4.setText("");
					txtHorario5.setText("");
					txtHorario6.setText("");
					txtHorario7.setText("");
					txtHorario8.setText("");
					txtHorario9.setText("");
					txtHorario10.setText("");
					txtDescrip1.setText("");
					txtDescrip2.setText("");
					txtDescrip3.setText("");
					txtDescrip4.setText("");
					txtDescrip5.setText("");
					txtDescrip6.setText("");
					txtDescrip7.setText("");
					txtDescrip8.setText("");
					txtDescrip9.setText("");
					txtDescrip10.setText("");
					
					cmbSemana1.setSelectedItem(1);
					cmbSemana2.setSelectedItem(1);
					cmbSemana3.setSelectedItem(1);
					cmbSemana4.setSelectedItem(1);
					cmbSemana5.setSelectedItem(1);
					cmbSemana6.setSelectedItem(1);
					cmbSemana7.setSelectedItem(1);
					cmbSemana8.setSelectedItem(1);
					cmbSemana9.setSelectedItem(1);
					cmbSemana10.setSelectedItem(1);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAgregar.setBounds(1039, 296, 107, 35);
		panel_1.add(btnAgregar);
		
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
