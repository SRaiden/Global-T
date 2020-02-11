package diplomas;

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
import classDAO.DiplomasDAO;
import classVO.AlumnosVO;
import classVO.CursosVO;
import classVO.DiplomasVO;

import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
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
import classDAO.DiplomasDAO;
import classVO.AlumnosVO;
import classVO.CursosVO;
import classVO.DiplomasVO;

import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ModificarDiploma extends JPanel {

	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtNumDNI;
	private JTextField txtNacionalidad;
	private JTextField txtModulo1;
	private JTextField txtModulo2;
	private JTextField txtModulo3;
	private JTextField txtModulo4;
	private JTextField txtModulo5;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNota4;
	private JTextField txtNota5;
	private JTextField txtModulo6;
	private JTextField txtModulo7;
	private JTextField txtModulo8;
	private JTextField txtModulo9;
	private JTextField txtModulo10;
	private JTextField txtNota6;
	private JTextField txtNota7;
	private JTextField txtNota8;
	private JTextField txtNota9;
	private JTextField txtNota10;
	private JTextField txtPromedio;
	private JTextField txtLegajo;
	private JTextField txtFinalDia;
	private JTextField txtFinalMes;
	private JTextField txtFinalAnio;
	private JTextField txtInicioAnio;
	private JTextField txtInicioMes;
	private JTextField txtInicioDia;
	private JTextField txtTipo;
	
	public ModificarDiploma() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Modificar Diploma", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 72, 1080, 350);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(UIManager.getColor("ToolBar.shadow"));
		panel_2.setBounds(10, 11, 1060, 47);
		panel_1.add(panel_2);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(68, 11, 113, 23);
		panel_2.add(txtNombre);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(10, 9, 48, 24);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Apellido");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(191, 9, 62, 24);
		panel_2.add(label_2);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBounds(244, 11, 129, 23);
		panel_2.add(txtApellido);
		
		JLabel label_3 = new JLabel("Numero DNI");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(595, 9, 88, 24);
		panel_2.add(label_3);
		
		txtNumDNI = new JTextField();
		txtNumDNI.setEditable(false);
		txtNumDNI.setColumns(10);
		txtNumDNI.setBounds(693, 11, 129, 23);
		panel_2.add(txtNumDNI);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNacionalidad.setBounds(832, 9, 88, 24);
		panel_2.add(lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(930, 11, 120, 23);
		panel_2.add(txtNacionalidad);
		
		JLabel Tipo = new JLabel("Tipo");
		Tipo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Tipo.setBounds(405, 9, 39, 24);
		panel_2.add(Tipo);
		
		txtTipo = new JTextField();
		txtTipo.setEditable(false);
		txtTipo.setColumns(10);
		txtTipo.setBounds(444, 13, 129, 23);
		panel_2.add(txtTipo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(245, 222, 179));
		panel_3.setBounds(10, 84, 1060, 201);
		panel_1.add(panel_3);
		
		JLabel label_5 = new JLabel("Modulo 1");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(54, 16, 62, 24);
		panel_3.add(label_5);
		
		txtModulo1 = new JTextField();
		txtModulo1.setEditable(false);
		txtModulo1.setColumns(10);
		txtModulo1.setBounds(126, 18, 129, 23);
		panel_3.add(txtModulo1);
		
		JLabel label_6 = new JLabel("Modulo 2");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(54, 51, 62, 24);
		panel_3.add(label_6);
		
		txtModulo2 = new JTextField();
		txtModulo2.setEditable(false);
		txtModulo2.setColumns(10);
		txtModulo2.setBounds(126, 53, 129, 23);
		panel_3.add(txtModulo2);
		
		JLabel label_7 = new JLabel("Modulo 3");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(54, 86, 62, 24);
		panel_3.add(label_7);
		
		txtModulo3 = new JTextField();
		txtModulo3.setEditable(false);
		txtModulo3.setColumns(10);
		txtModulo3.setBounds(126, 87, 129, 23);
		panel_3.add(txtModulo3);
		
		JLabel label_8 = new JLabel("Modulo 4");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(54, 121, 69, 24);
		panel_3.add(label_8);
		
		txtModulo4 = new JTextField();
		txtModulo4.setEditable(false);
		txtModulo4.setColumns(10);
		txtModulo4.setBounds(126, 123, 129, 23);
		panel_3.add(txtModulo4);
		
		JLabel label_9 = new JLabel("Modulo 5");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(54, 156, 62, 24);
		panel_3.add(label_9);
		
		txtModulo5 = new JTextField();
		txtModulo5.setEditable(false);
		txtModulo5.setColumns(10);
		txtModulo5.setBounds(126, 158, 129, 23);
		panel_3.add(txtModulo5);
		
		JLabel label_10 = new JLabel("Nota");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(281, 16, 34, 24);
		panel_3.add(label_10);
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		txtNota1.setBounds(317, 16, 56, 23);
		panel_3.add(txtNota1);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(317, 51, 56, 23);
		panel_3.add(txtNota2);
		
		JLabel label_11 = new JLabel("Nota");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(281, 51, 34, 24);
		panel_3.add(label_11);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(317, 86, 56, 23);
		panel_3.add(txtNota3);
		
		JLabel label_12 = new JLabel("Nota");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(281, 86, 34, 24);
		panel_3.add(label_12);
		
		txtNota4 = new JTextField();
		txtNota4.setColumns(10);
		txtNota4.setBounds(317, 121, 56, 23);
		panel_3.add(txtNota4);
		
		JLabel label_13 = new JLabel("Nota");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(281, 121, 34, 24);
		panel_3.add(label_13);
		
		txtNota5 = new JTextField();
		txtNota5.setColumns(10);
		txtNota5.setBounds(317, 156, 56, 23);
		panel_3.add(txtNota5);
		
		JLabel label_14 = new JLabel("Nota");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(281, 156, 34, 24);
		panel_3.add(label_14);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(424, 16, 27, 164);
		panel_3.add(separator);
		
		JLabel label_15 = new JLabel("Modulo 6");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(461, 16, 62, 24);
		panel_3.add(label_15);
		
		txtModulo6 = new JTextField();
		txtModulo6.setEditable(false);
		txtModulo6.setColumns(10);
		txtModulo6.setBounds(533, 18, 129, 23);
		panel_3.add(txtModulo6);
		
		JLabel label_16 = new JLabel("Modulo 7");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(461, 51, 62, 24);
		panel_3.add(label_16);
		
		txtModulo7 = new JTextField();
		txtModulo7.setEditable(false);
		txtModulo7.setColumns(10);
		txtModulo7.setBounds(533, 53, 129, 23);
		panel_3.add(txtModulo7);
		
		JLabel label_17 = new JLabel("Modulo 8");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(461, 86, 62, 24);
		panel_3.add(label_17);
		
		txtModulo8 = new JTextField();
		txtModulo8.setEditable(false);
		txtModulo8.setColumns(10);
		txtModulo8.setBounds(533, 87, 129, 23);
		panel_3.add(txtModulo8);
		
		JLabel label_18 = new JLabel("Modulo 9");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(461, 121, 69, 24);
		panel_3.add(label_18);
		
		txtModulo9 = new JTextField();
		txtModulo9.setEditable(false);
		txtModulo9.setColumns(10);
		txtModulo9.setBounds(533, 123, 129, 23);
		panel_3.add(txtModulo9);
		
		JLabel label_19 = new JLabel("Modulo 10");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(461, 156, 69, 24);
		panel_3.add(label_19);
		
		txtModulo10 = new JTextField();
		txtModulo10.setEditable(false);
		txtModulo10.setColumns(10);
		txtModulo10.setBounds(533, 158, 129, 23);
		panel_3.add(txtModulo10);
		
		JLabel label_20 = new JLabel("Nota");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_20.setBounds(688, 16, 34, 24);
		panel_3.add(label_20);
		
		txtNota6 = new JTextField();
		txtNota6.setColumns(10);
		txtNota6.setBounds(724, 18, 56, 23);
		panel_3.add(txtNota6);
		
		txtNota7 = new JTextField();
		txtNota7.setColumns(10);
		txtNota7.setBounds(724, 51, 56, 23);
		panel_3.add(txtNota7);
		
		JLabel label_21 = new JLabel("Nota");
		label_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_21.setBounds(688, 51, 34, 24);
		panel_3.add(label_21);
		
		txtNota8 = new JTextField();
		txtNota8.setColumns(10);
		txtNota8.setBounds(724, 86, 56, 23);
		panel_3.add(txtNota8);
		
		JLabel label_22 = new JLabel("Nota");
		label_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_22.setBounds(688, 86, 34, 24);
		panel_3.add(label_22);
		
		txtNota9 = new JTextField();
		txtNota9.setColumns(10);
		txtNota9.setBounds(724, 121, 56, 23);
		panel_3.add(txtNota9);
		
		JLabel label_23 = new JLabel("Nota");
		label_23.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_23.setBounds(688, 121, 34, 24);
		panel_3.add(label_23);
		
		txtNota10 = new JTextField();
		txtNota10.setColumns(10);
		txtNota10.setBounds(724, 156, 56, 23);
		panel_3.add(txtNota10);
		
		JLabel label_24 = new JLabel("Nota");
		label_24.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_24.setBounds(688, 156, 34, 24);
		panel_3.add(label_24);
		
		txtPromedio = new JTextField();
		txtPromedio.setEditable(false);
		txtPromedio.setColumns(10);
		txtPromedio.setBounds(823, 111, 133, 23);
		panel_3.add(txtPromedio);
		
		JLabel label_25 = new JLabel("Promedio Alumno");
		label_25.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_25.setBounds(823, 86, 133, 24);
		panel_3.add(label_25);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(UIManager.getColor("ToolBar.shadow"));
		panel_4.setBounds(10, 296, 663, 47);
		panel_1.add(panel_4);
		
		JLabel lblFechaInicio = new JLabel("Fecha Inicio");
		lblFechaInicio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFechaInicio.setBounds(10, 9, 90, 24);
		panel_4.add(lblFechaInicio);
		
		JLabel lblFechaFinalizacion = new JLabel("Fecha Finalizacion");
		lblFechaFinalizacion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFechaFinalizacion.setBounds(331, 9, 113, 24);
		panel_4.add(lblFechaFinalizacion);
		
		txtFinalDia = new JTextField();
		txtFinalDia.setEditable(false);
		txtFinalDia.setColumns(10);
		txtFinalDia.setBounds(454, 11, 48, 23);
		panel_4.add(txtFinalDia);
		
		JLabel label_4 = new JLabel("/");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(512, 9, 9, 24);
		panel_4.add(label_4);
		
		txtFinalMes = new JTextField();
		txtFinalMes.setEditable(false);
		txtFinalMes.setColumns(10);
		txtFinalMes.setBounds(524, 11, 48, 23);
		panel_4.add(txtFinalMes);
		
		JLabel label_27 = new JLabel("/");
		label_27.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_27.setBounds(582, 9, 4, 24);
		panel_4.add(label_27);
		
		txtFinalAnio = new JTextField();
		txtFinalAnio.setEditable(false);
		txtFinalAnio.setColumns(10);
		txtFinalAnio.setBounds(591, 11, 62, 23);
		panel_4.add(txtFinalAnio);
		
		txtInicioAnio = new JTextField();
		txtInicioAnio.setEditable(false);
		txtInicioAnio.setColumns(10);
		txtInicioAnio.setBounds(227, 10, 62, 23);
		panel_4.add(txtInicioAnio);
		
		JLabel label_28 = new JLabel("/");
		label_28.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_28.setBounds(218, 8, 4, 24);
		panel_4.add(label_28);
		
		txtInicioMes = new JTextField();
		txtInicioMes.setEditable(false);
		txtInicioMes.setColumns(10);
		txtInicioMes.setBounds(160, 10, 48, 23);
		panel_4.add(txtInicioMes);
		
		JLabel label_29 = new JLabel("/");
		label_29.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_29.setBounds(148, 8, 9, 24);
		panel_4.add(label_29);
		
		txtInicioDia = new JTextField();
		txtInicioDia.setEditable(false);
		txtInicioDia.setColumns(10);
		txtInicioDia.setBounds(90, 10, 48, 23);
		panel_4.add(txtInicioDia);
		
		JLabel label_26 = new JLabel("Legajo del Alumno");
		label_26.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_26.setBounds(10, 24, 122, 24);
		panel.add(label_26);
		
		JComboBox cmbLegajo = new JComboBox();
		cmbLegajo.addItem("01");
		cmbLegajo.addItem("02");
		cmbLegajo.addItem("03");
		cmbLegajo.addItem("04");
		cmbLegajo.addItem("05");
		cmbLegajo.addItem("06");
		cmbLegajo.addItem("07");
		cmbLegajo.addItem("08");
		cmbLegajo.addItem("09");
		cmbLegajo.addItem("10");
		cmbLegajo.addItem("11");
		cmbLegajo.addItem("12");
		cmbLegajo.addItem("13");
		cmbLegajo.addItem("14");
		cmbLegajo.addItem("15");
		cmbLegajo.addItem("16");
		cmbLegajo.addItem("17");
		cmbLegajo.addItem("18");
		cmbLegajo.addItem("19");
		cmbLegajo.addItem("20");
		cmbLegajo.addItem("21");
		cmbLegajo.addItem("22");
		cmbLegajo.addItem("23");
		cmbLegajo.addItem("24");
		cmbLegajo.addItem("25");
		cmbLegajo.addItem("26");
		cmbLegajo.addItem("27");
		cmbLegajo.addItem("28");
		cmbLegajo.addItem("29");
		cmbLegajo.addItem("30");
		cmbLegajo.setBounds(148, 27, 45, 20);
		panel.add(cmbLegajo);
		
		txtLegajo = new JTextField();
		txtLegajo.setColumns(10);
		txtLegajo.setBounds(203, 26, 76, 23);
		panel.add(txtLegajo);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String legajo = (String) cmbLegajo.getSelectedItem();
					int codleg = Integer.parseInt(legajo);
					
					String legajo2 = txtLegajo.getText();
					int codleg2 = Integer.parseInt(legajo2);
					
					String cadena = cmbLegajo.getSelectedItem() + "-" + txtLegajo.getText();
					
					AlumnosVO alum = AlumnosDAO.BuscarUnAlumno(codleg, codleg2);
					
					txtNombre.setText(alum.getNombre_alumno() + "");
					txtApellido.setText(alum.getApellido_alumno() + "");
					txtNumDNI.setText(alum.getNumero_documento_alumno() + "");
					txtTipo.setText(alum.getTipo_documento_alumno() + "");
					txtNacionalidad.setText(alum.getNacionalidad_alumno() + "");
					
					String inicio = alum.getFecha_inicio_alumno();
					String[] partir2 = inicio.split("/");
					String diainicio = partir2[0];
					String mesinicio = partir2[1];
					String anioinicio = partir2[2];
					txtInicioDia.setText(diainicio + "");
					txtInicioMes.setText(mesinicio + "");
					txtInicioAnio.setText(anioinicio + "");
					
					String finals = alum.getFecha_final_alumno();
					String[] partir3 = finals.split("/");
					String diafinal = partir3[0];
					String mesfinal = partir3[1];
					String aniofinal = partir3[2];
					txtFinalDia.setText(diafinal + "");
					txtFinalMes.setText(mesfinal + "");
					txtFinalAnio.setText(aniofinal + "");
					
					DiplomasVO dip = DiplomasDAO.BuscarUnDiploma(cadena);
					
					txtModulo1.setText(dip.getModulo_uno() + "");
					txtModulo2.setText(dip.getModulo_dos() + "");
					txtModulo3.setText(dip.getModulo_tres() + "");
					txtModulo4.setText(dip.getModulo_cuatro() + "");
					txtModulo5.setText(dip.getModulo_cinco() + "");
					txtModulo6.setText(dip.getModulo_seis() + "");
					txtModulo7.setText(dip.getModulo_siete() + "");
					txtModulo8.setText(dip.getModulo_ocho() + "");
					txtModulo9.setText(dip.getModulo_nueve() + "");
					txtModulo10.setText(dip.getModulo_diez() + "");
					
					if(dip.getModulo_uno().isEmpty()){
						txtNota1.setEditable(false);
						txtNota2.setEditable(false);
						txtNota3.setEditable(false);
						txtNota4.setEditable(false);
						txtNota5.setEditable(false);
						txtNota6.setEditable(false);
						txtNota7.setEditable(false);
						txtNota8.setEditable(false);
						txtNota9.setEditable(false);
						txtNota10.setEditable(false);
					}else if(dip.getModulo_dos().isEmpty()){
						txtNota1.setText(String.valueOf((dip.getNota_uno() + "")));
						txtNota2.setEditable(false);
						txtNota3.setEditable(false);
						txtNota4.setEditable(false);
						txtNota5.setEditable(false);
						txtNota6.setEditable(false);
						txtNota7.setEditable(false);
						txtNota8.setEditable(false);
						txtNota9.setEditable(false);
						txtNota10.setEditable(false);
						txtPromedio.setText(dip.getPromedio());
					}else if(dip.getModulo_tres().isEmpty()){
						txtNota1.setText(String.valueOf((dip.getNota_uno() + "")));
						txtNota2.setText(String.valueOf((dip.getNota_dos() + "")));
						txtNota3.setEditable(false);
						txtNota4.setEditable(false);
						txtNota5.setEditable(false);
						txtNota6.setEditable(false);
						txtNota7.setEditable(false);
						txtNota8.setEditable(false);
						txtNota9.setEditable(false);
						txtNota10.setEditable(false);
						txtPromedio.setText(dip.getPromedio());
					}else if(dip.getModulo_cuatro().isEmpty()){
						txtNota1.setText(String.valueOf((dip.getNota_uno() + "")));
						txtNota2.setText(String.valueOf((dip.getNota_dos() + "")));
						txtNota3.setText(String.valueOf((dip.getNota_tres() + "")));
						txtNota4.setEditable(false);
						txtNota5.setEditable(false);
						txtNota6.setEditable(false);
						txtNota7.setEditable(false);
						txtNota8.setEditable(false);
						txtNota9.setEditable(false);
						txtNota10.setEditable(false);
						txtPromedio.setText(dip.getPromedio());
					}else if(dip.getModulo_cinco().isEmpty()){
						txtNota1.setText(String.valueOf((dip.getNota_uno() + "")));
						txtNota2.setText(String.valueOf((dip.getNota_dos() + "")));
						txtNota3.setText(String.valueOf((dip.getNota_tres() + "")));
						txtNota4.setText(String.valueOf((dip.getNota_cuatro() + "")));
						txtNota5.setEditable(false);
						txtNota6.setEditable(false);
						txtNota7.setEditable(false);
						txtNota8.setEditable(false);
						txtNota9.setEditable(false);
						txtNota10.setEditable(false);
						txtPromedio.setText(dip.getPromedio());
					}else if(dip.getModulo_seis().isEmpty()){
						txtNota1.setText(String.valueOf((dip.getNota_uno() + "")));
						txtNota2.setText(String.valueOf((dip.getNota_dos() + "")));
						txtNota3.setText(String.valueOf((dip.getNota_tres() + "")));
						txtNota4.setText(String.valueOf((dip.getNota_cuatro() + "")));
						txtNota5.setText(String.valueOf((dip.getNota_cinco() + "")));
						txtNota6.setEditable(false);
						txtNota7.setEditable(false);
						txtNota8.setEditable(false);
						txtNota9.setEditable(false);
						txtNota10.setEditable(false);
						txtPromedio.setText(dip.getPromedio());
					}else if(dip.getModulo_siete().isEmpty()){
						txtNota1.setText(String.valueOf((dip.getNota_uno() + "")));
						txtNota2.setText(String.valueOf((dip.getNota_dos() + "")));
						txtNota3.setText(String.valueOf((dip.getNota_tres() + "")));
						txtNota4.setText(String.valueOf((dip.getNota_cuatro() + "")));
						txtNota5.setText(String.valueOf((dip.getNota_cinco() + "")));
						txtNota6.setText(String.valueOf((dip.getNota_seis() + "")));
						txtNota7.setEditable(false);
						txtNota8.setEditable(false);
						txtNota9.setEditable(false);
						txtNota10.setEditable(false);
						txtPromedio.setText(dip.getPromedio());
					}else if(dip.getModulo_ocho().isEmpty()){
						txtNota1.setText(String.valueOf((dip.getNota_uno() + "")));
						txtNota2.setText(String.valueOf((dip.getNota_dos() + "")));
						txtNota3.setText(String.valueOf((dip.getNota_tres() + "")));
						txtNota4.setText(String.valueOf((dip.getNota_cuatro() + "")));
						txtNota5.setText(String.valueOf((dip.getNota_cinco() + "")));
						txtNota6.setText(String.valueOf((dip.getNota_seis() + "")));
						txtNota7.setText(String.valueOf((dip.getNota_siete() + "")));
						txtNota8.setEditable(false);
						txtNota9.setEditable(false);
						txtNota10.setEditable(false);
						txtPromedio.setText(dip.getPromedio());
					}else if(dip.getModulo_nueve().isEmpty()){
						txtNota1.setText(String.valueOf((dip.getNota_uno() + "")));
						txtNota2.setText(String.valueOf((dip.getNota_dos() + "")));
						txtNota3.setText(String.valueOf((dip.getNota_tres() + "")));
						txtNota4.setText(String.valueOf((dip.getNota_cuatro() + "")));
						txtNota5.setText(String.valueOf((dip.getNota_cinco() + "")));
						txtNota6.setText(String.valueOf((dip.getNota_seis() + "")));
						txtNota7.setText(String.valueOf((dip.getNota_siete() + "")));
						txtNota8.setText(String.valueOf((dip.getNota_ocho() + "")));
						txtNota9.setEditable(false);
						txtNota10.setEditable(false);
						txtPromedio.setText(dip.getPromedio());
					}else if(dip.getModulo_diez().isEmpty()){
						txtNota1.setText(String.valueOf((dip.getNota_uno() + "")));
						txtNota2.setText(String.valueOf((dip.getNota_dos() + "")));
						txtNota3.setText(String.valueOf((dip.getNota_tres() + "")));
						txtNota4.setText(String.valueOf((dip.getNota_cuatro() + "")));
						txtNota5.setText(String.valueOf((dip.getNota_cinco() + "")));
						txtNota6.setText(String.valueOf((dip.getNota_seis() + "")));
						txtNota7.setText(String.valueOf((dip.getNota_siete() + "")));
						txtNota8.setText(String.valueOf((dip.getNota_ocho() + "")));
						txtNota9.setText(String.valueOf((dip.getNota_nueve() + "")));
						txtNota10.setEditable(false);
						txtPromedio.setText(dip.getPromedio());
					}else{
						txtNota1.setText(String.valueOf((dip.getNota_uno() + "")));
						txtNota2.setText(String.valueOf((dip.getNota_dos() + "")));
						txtNota3.setText(String.valueOf((dip.getNota_tres() + "")));
						txtNota4.setText(String.valueOf((dip.getNota_cuatro() + "")));
						txtNota5.setText(String.valueOf((dip.getNota_cinco() + "")));
						txtNota6.setText(String.valueOf((dip.getNota_seis() + "")));
						txtNota7.setText(String.valueOf((dip.getNota_siete() + "")));
						txtNota8.setText(String.valueOf((dip.getNota_ocho() + "")));
						txtNota9.setText(String.valueOf((dip.getNota_nueve() + "")));
						txtNota10.setText(String.valueOf((dip.getNota_diez() + "")));
						txtPromedio.setText(dip.getPromedio());
					}
					
					
					
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscar.setBounds(294, 19, 107, 35);
		panel.add(btnBuscar);
		
		JButton btnPromedio = new JButton("Promediar");
		btnPromedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contador = 0;
				double promedio1 = 0;
				double promedio2 = 0;
				double promedio3 = 0;
				double promedio4 = 0;
				double promedio5 = 0;
				double promedio6 = 0;
				double promedio7 = 0;
				double promedio8 = 0;
				double promedio9 = 0;
				double promedio10 = 0;
				
				double acumular = 0;
				double promediototal;
				String ver;
				
				
				if(!txtModulo1.getText().isEmpty()){
					String pro1 = (String) txtNota1.getText();
					promedio1 = Integer.parseInt(pro1);
					contador++;
				}
				if(!txtModulo2.getText().isEmpty()){
					String pro2 = (String) txtNota2.getText();
					promedio2 = Integer.parseInt(pro2);
					contador++;
				}
				if(!txtModulo3.getText().isEmpty()){
					String pro3 = (String) txtNota3.getText();
					promedio3 = Integer.parseInt(pro3);
					contador++;
				}
				if(!txtModulo4.getText().isEmpty()){
					String pro4 = (String) txtNota4.getText();
					promedio4 = Integer.parseInt(pro4);
					contador++;
				}
				if(!txtModulo5.getText().isEmpty()){
					String pro5 = (String) txtNota5.getText();
					promedio5 = Integer.parseInt(pro5);
					contador++;
				}
				if(!txtModulo6.getText().isEmpty()){
					String pro6 = (String) txtNota6.getText();
					promedio6 = Integer.parseInt(pro6);
					contador++;
				}
				if(!txtModulo7.getText().isEmpty()){
					String pro7 = (String) txtNota7.getText();
					promedio7 = Integer.parseInt(pro7);
					contador++;
				}
				if(!txtModulo8.getText().isEmpty()){
					String pro8 = (String) txtNota8.getText();
					promedio8 = Integer.parseInt(pro8);
					contador++;
				}
				if(!txtModulo9.getText().isEmpty()){
					String pro9 = (String) txtNota9.getText();
					promedio9 = Integer.parseInt(pro9);
					contador++;
				}
				if(!txtModulo10.getText().isEmpty()){
					String pro10 = (String) txtNota10.getText();
					promedio10 = Integer.parseInt(pro10);
					contador++;
				}

				acumular += promedio1 + promedio2 + promedio3 + promedio4 + promedio5 + promedio6 + promedio7 + promedio8 + promedio9 + promedio10;
				promediototal = acumular / contador;
				String cadena = String.valueOf(promediototal);
				txtPromedio.setText(cadena);
			}
		});
		btnPromedio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPromedio.setBounds(825, 145, 131, 35);
		panel_3.add(btnPromedio);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiplomasVO dip = new DiplomasVO();
				
				String legajo1 = (String) cmbLegajo.getSelectedItem();
				int num = Integer.parseInt(legajo1);
				/*dip.setLegajo_alumno1(num);
				
				dip.setLegajo_alumno2(Integer.parseInt(txtLegajo.getText()));*/
				
				String cadena = cmbLegajo.getSelectedItem() + "-" + txtLegajo.getText();
				
				dip.setLegajo_Alumno(cadena);
				dip.setCod_Curso(num);
				
				if(txtNota1.getText().isEmpty()){
					dip.setNota_uno(0);
				}else{
					dip.setNota_uno(Integer.parseInt(txtNota1.getText()));
				}
				
				if(txtNota2.getText().isEmpty()){
					dip.setNota_dos(0);
				}else{
					dip.setNota_dos(Integer.parseInt(txtNota2.getText()));
				}
				
				if(txtNota3.getText().isEmpty()){
					dip.setNota_uno(0);
				}else{
					dip.setNota_uno(Integer.parseInt(txtNota1.getText()));
				}
				
				if(txtNota3.getText().isEmpty()){
					dip.setNota_tres(0);
				}else{
					dip.setNota_tres(Integer.parseInt(txtNota3.getText()));
				}
				
				if(txtNota4.getText().isEmpty()){
					dip.setNota_cuatro(0);
				}else{
					dip.setNota_cuatro(Integer.parseInt(txtNota4.getText()));
				}
				
				if(txtNota5.getText().isEmpty()){
					dip.setNota_cinco(0);
				}else{
					dip.setNota_cinco(Integer.parseInt(txtNota5.getText()));
				}
				
				if(txtNota6.getText().isEmpty()){
					dip.setNota_seis(0);
				}else{
					dip.setNota_seis(Integer.parseInt(txtNota6.getText()));
				}
				
				if(txtNota7.getText().isEmpty()){
					dip.setNota_siete(0);
				}else{
					dip.setNota_siete(Integer.parseInt(txtNota7.getText()));
				}
				
				if(txtNota8.getText().isEmpty()){
					dip.setNota_ocho(0);
				}else{
					dip.setNota_ocho(Integer.parseInt(txtNota8.getText()));
				}
				
				if(txtNota9.getText().isEmpty()){
					dip.setNota_nueve(0);
				}else{
					dip.setNota_nueve(Integer.parseInt(txtNota9.getText()));
				}
				
				if(txtNota10.getText().isEmpty()){
					dip.setNota_diez(0);
				}else{
					dip.setNota_diez(Integer.parseInt(txtNota10.getText()));
				}

				dip.setModulo_uno(txtModulo1.getText());
				dip.setModulo_dos(txtModulo2.getText());
				dip.setModulo_tres(txtModulo3.getText());
				dip.setModulo_cuatro(txtModulo4.getText());
				dip.setModulo_cinco(txtModulo5.getText());
				dip.setModulo_seis(txtModulo6.getText());
				dip.setModulo_siete(txtModulo7.getText());
				dip.setModulo_ocho(txtModulo8.getText());
				dip.setModulo_nueve(txtModulo9.getText());
				dip.setModulo_diez(txtModulo10.getText());
				
				dip.setPromedio(txtPromedio.getText());
				try {
					String resp = DiplomasDAO.RegistrarDiploma(dip);
					JOptionPane.showMessageDialog(null, resp, "Agregar Diploma", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					txtLegajo.setText("");
					txtNombre.setText("");
					txtApellido.setText("");
					txtNumDNI.setText("");
					txtTipo.setText("");
					txtNacionalidad.setText("");
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
					txtNota1.setText("");
					txtNota2.setText("");
					txtNota3.setText("");
					txtNota4.setText("");
					txtNota5.setText("");
					txtNota6.setText("");
					txtNota7.setText("");
					txtNota8.setText("");
					txtNota9.setText("");
					txtNota10.setText("");
					txtInicioDia.setText("");
					txtInicioMes.setText("");
					txtInicioAnio.setText("");
					txtFinalDia.setText("");
					txtFinalMes.setText("");
					txtFinalAnio.setText("");
					
					txtPromedio.setText("");
					
					txtNota1.setEditable(true);
					txtNota2.setEditable(true);
					txtNota3.setEditable(true);
					txtNota4.setEditable(true);
					txtNota5.setEditable(true);
					txtNota6.setEditable(true);
					txtNota7.setEditable(true);
					txtNota8.setEditable(true);
					txtNota9.setEditable(true);
					txtNota10.setEditable(true);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnModificar.setBounds(963, 296, 107, 35);
		panel_1.add(btnModificar);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1098, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(499)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(82, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

	}

