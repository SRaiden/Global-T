package tutores;

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
import classDAO.TutoresDAO;
import classVO.AlumnosVO;
import classVO.TutoresVO;

import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ModificarTutor extends JPanel {

	private JTextField txtBuscarCodTutor;
	private JTextField txtLegajo;
	private JTextField txtAnio;
	private JTextField txtMes;
	private JTextField txtDia;
	private JTextField txtCP;
	private JTextField txtPiso;
	private JTextField txtDepartamento;
	private JTextField txtLocalidad;
	private JTextField txtTelefono;
	private JTextField txtNumDNI;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDomicilio;
	private JTextField txtNumDomicilio;
	private JTextField txtEstado;
	private JTextField txtBuscarDNITutor;
	private JTextField txtCodTutor;
	
	public ModificarTutor() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Modificar Tutor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JLabel label_1 = new JLabel("Codigo Tutor");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(28, 27, 122, 24);
		panel.add(label_1);
		
		txtBuscarCodTutor = new JTextField();
		txtBuscarCodTutor.setColumns(10);
		txtBuscarCodTutor.setBounds(135, 29, 129, 23);
		panel.add(txtBuscarCodTutor);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 78, 986, 354);
		panel.add(panel_1);
		
		JLabel label_2 = new JLabel("Estado");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(619, 289, 49, 24);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Fecha Nac.");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(498, 242, 86, 24);
		panel_1.add(label_3);
		
		JComboBox cmbLegajo = new JComboBox();
		cmbLegajo.setEnabled(false);
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
		cmbLegajo.setBounds(275, 73, 45, 20);
		panel_1.add(cmbLegajo);
		
		txtLegajo = new JTextField();
		txtLegajo.setEditable(false);
		txtLegajo.setColumns(10);
		txtLegajo.setBounds(330, 72, 74, 23);
		panel_1.add(txtLegajo);
		
		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		txtAnio.setBounds(761, 244, 62, 23);
		panel_1.add(txtAnio);
		
		JLabel label_4 = new JLabel("/");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(751, 242, 4, 24);
		panel_1.add(label_4);
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		txtMes.setBounds(693, 244, 48, 23);
		panel_1.add(txtMes);
		
		JLabel label_5 = new JLabel("/");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(681, 242, 9, 24);
		panel_1.add(label_5);
		
		txtDia = new JTextField();
		txtDia.setColumns(10);
		txtDia.setBounds(623, 245, 48, 23);
		panel_1.add(txtDia);
		
		JComboBox cmbTipoDNI = new JComboBox();
		cmbTipoDNI.addItem("DNI");
		cmbTipoDNI.addItem("CARNET EXT.");
		cmbTipoDNI.addItem("RUC");
		cmbTipoDNI.addItem("PASAPORTE");
		cmbTipoDNI.addItem("PART. DE NACIMIENTO-IDENTIDAD");
		cmbTipoDNI.addItem("CEDULA");
		cmbTipoDNI.addItem("OTROS");
		cmbTipoDNI.setBounds(623, 176, 200, 20);
		panel_1.add(cmbTipoDNI);
		
		txtCP = new JTextField();
		txtCP.setColumns(10);
		txtCP.setBounds(623, 107, 200, 23);
		panel_1.add(txtCP);
		
		JLabel label_6 = new JLabel("Piso");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(135, 241, 69, 24);
		panel_1.add(label_6);
		
		txtPiso = new JTextField();
		txtPiso.setColumns(10);
		txtPiso.setBounds(275, 243, 129, 23);
		panel_1.add(txtPiso);
		
		JLabel label_7 = new JLabel("Departamento ");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(498, 38, 93, 24);
		panel_1.add(label_7);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(623, 40, 200, 23);
		panel_1.add(txtDepartamento);
		
		JLabel label_8 = new JLabel("Localidad");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(498, 71, 93, 24);
		panel_1.add(label_8);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(623, 73, 200, 23);
		panel_1.add(txtLocalidad);
		
		JLabel label_9 = new JLabel("Codigo Postal");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(498, 106, 122, 24);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("Telefono ");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(498, 141, 122, 24);
		panel_1.add(label_10);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(623, 141, 200, 23);
		panel_1.add(txtTelefono);
		
		JLabel label_11 = new JLabel("Tipo DNI");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(498, 176, 122, 24);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Numero DNI");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(498, 207, 122, 24);
		panel_1.add(label_12);
		
		txtNumDNI = new JTextField();
		txtNumDNI.setColumns(10);
		txtNumDNI.setBounds(623, 207, 200, 23);
		panel_1.add(txtNumDNI);
		
		JLabel label_13 = new JLabel("Legajo Alumno");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(135, 70, 107, 24);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("Nombre");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(135, 104, 48, 24);
		panel_1.add(label_14);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(275, 106, 129, 23);
		panel_1.add(txtNombre);
		
		JLabel label_15 = new JLabel("Apellido");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(135, 140, 62, 24);
		panel_1.add(label_15);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(275, 141, 129, 23);
		panel_1.add(txtApellido);
		
		JLabel label_16 = new JLabel("Domicilio");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(135, 175, 122, 24);
		panel_1.add(label_16);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(275, 174, 129, 23);
		panel_1.add(txtDomicilio);
		
		JLabel label_17 = new JLabel("Numero Domicilio");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(135, 206, 122, 24);
		panel_1.add(label_17);
		
		txtNumDomicilio = new JTextField();
		txtNumDomicilio.setColumns(10);
		txtNumDomicilio.setBounds(275, 208, 129, 23);
		panel_1.add(txtNumDomicilio);
		
		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setColumns(10);
		txtEstado.setBounds(664, 292, 143, 23);
		panel_1.add(txtEstado);
		
		JLabel label_18 = new JLabel("DNI Tutor");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(644, 27, 75, 24);
		panel.add(label_18);
		
		txtBuscarDNITutor = new JTextField();
		txtBuscarDNITutor.setColumns(10);
		txtBuscarDNITutor.setBounds(729, 29, 129, 23);
		panel.add(txtBuscarDNITutor);
		
		JButton txtBuscadXDNI = new JButton("Buscar");
		txtBuscadXDNI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String dni = txtBuscarDNITutor.getText();
					
					TutoresVO tut = TutoresDAO.BuscarUnTutorXDNI(dni);
					
					String s = tut.getLegajo_Alumno();
					String[] p = s.split("-");
					String parte1 = p[0];
					String parte2 = p[1];
					cmbLegajo.setSelectedItem(parte1);
					txtLegajo.setText(parte2 + "");

					txtCodTutor.setText(tut.getCodigo_tutor() + "");
					txtNombre.setText(tut.getNombre_Tutor() + "");
					txtApellido.setText(tut.getApellido_Tutor() + "");
					txtDomicilio.setText(tut.getDomicilio_Tutor() + "");
					txtNumDomicilio.setText(tut.getNumero_Domicilio_Tutor() + "");
					txtPiso.setText(tut.getPiso_Tutor() + "");
					txtDepartamento.setText(tut.getDepartamento_Tutor() + "");
					txtLocalidad.setText(tut.getLocalidad_Tutor() + "");
					txtCP.setText(tut.getCP_Tutor() + "");
					txtTelefono.setText(tut.getTelefono_Tutor() + "");
					cmbTipoDNI.setSelectedItem(tut.getTipo_Documento_Tutor() + "");
					txtNumDNI.setText(tut.getNum_Documento_Tutor() + "");
					
					String sa = tut.getFecha_Nacimiento_Tutor();
					String[] pa = sa.split("/");
					String dia = pa[0];
					String mes = pa[1];
					String anio = pa[2];
					txtDia.setText(dia + "");
					txtMes.setText(mes + "");
					txtAnio.setText(anio + "");
					
					txtEstado.setText(tut.getTipo_Estado());
					
					//String estado = (String) cmbEstado.getSelectedItem();
					//tut.setTipo_Estado(estado);
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno por DNI", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno por DNI", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		txtBuscadXDNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtBuscadXDNI.setBounds(868, 22, 107, 35);
		panel.add(txtBuscadXDNI);
		
		JButton btnBuscarXCodTutor = new JButton("Buscar");
		btnBuscarXCodTutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String CodTutor = txtBuscarCodTutor.getText();
					int codtut = Integer.parseInt(CodTutor);
					
					TutoresVO tut = TutoresDAO.BuscarUnTutor(codtut);
					
					String s = tut.getLegajo_Alumno();
					String[] p = s.split("-");
					String parte1 = p[0];
					String parte2 = p[1];
					cmbLegajo.setSelectedItem(parte1);
					txtLegajo.setText(parte2 + "");
					
					txtCodTutor.setText(tut.getCodigo_tutor() + "");
					txtNombre.setText(tut.getNombre_Tutor()+ "");
					txtApellido.setText(tut.getApellido_Tutor() + "");
					txtDomicilio.setText(tut.getDomicilio_Tutor() + "");
					txtNumDomicilio.setText(tut.getNumero_Domicilio_Tutor() + "");
					txtPiso.setText(tut.getPiso_Tutor() + "");
					txtDepartamento.setText(tut.getDepartamento_Tutor() + "");
					txtLocalidad.setText(tut.getLocalidad_Tutor() + "");
					txtCP.setText(tut.getCP_Tutor() + "");
					txtTelefono.setText(tut.getTelefono_Tutor() + "");
					cmbTipoDNI.setSelectedItem(tut.getTipo_Documento_Tutor());
					txtNumDNI.setText(tut.getNum_Documento_Tutor() + "");
					
					String sa = tut.getFecha_Nacimiento_Tutor();
					String[] pa = sa.split("/");
					String pas1 = pa[0];
					String pas2 = pa[1];
					String pas3 = pa[2];
					txtDia.setText(pas1 + "");
					txtMes.setText(pas2 + "");
					txtAnio.setText(pas3 + "");
					
					txtEstado.setText(tut.getTipo_Estado());
					
					//String estado = (String) cmbEstado.getSelectedItem();
					//tut.setTipo_Estado(estado);
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		btnBuscarXCodTutor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarXCodTutor.setBounds(282, 22, 107, 35);
		panel.add(btnBuscarXCodTutor);
		
		JButton button = new JButton("Modificar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TutoresVO tut = new TutoresVO();
				
				String das = (String) txtCodTutor.getText();
				int codtut = Integer.parseInt(das);;
				
				tut.setCodigo_tutor(Integer.parseInt(txtCodTutor.getText()));
				
				String legajo1 = (String) cmbLegajo.getSelectedItem();
				int num = Integer.parseInt(legajo1);
				String legajo2 = (String) txtLegajo.getText();
				int num2 = Integer.parseInt(legajo2);
				String cadena = num + "-" +  num2;
				
				//tut.setLegajo_Alumno(cadena);
				tut.setNombre_Tutor(txtNombre.getText());
				tut.setApellido_Tutor(txtApellido.getText());
				tut.setDomicilio_Tutor(txtDomicilio.getText());
				tut.setNumero_Domicilio_Tutor(txtNumDomicilio.getText());
				tut.setPiso_Tutor(Integer.parseInt(txtPiso.getText()));
				tut.setDepartamento_Tutor(Integer.parseInt(txtDepartamento.getText()));
				tut.setLocalidad_Tutor(txtLocalidad.getText());
				tut.setCP_Tutor(Integer.parseInt(txtCP.getText()));
				tut.setTelefono_Tutor(txtTelefono.getText());
				
				String tipodni = (String) cmbTipoDNI.getSelectedItem();
				tut.setTipo_Documento_Tutor(tipodni);
				
				tut.setNum_Documento_Tutor(txtNumDNI.getText());
				
				String fecha = txtDia.getText() + " / " + txtMes.getText() + " / " + txtAnio.getText();
				tut.setFecha_Nacimiento_Tutor(fecha);
				
				tut.setTipo_Estado(txtEstado.getText());
				try {
					String resp = TutoresDAO.ActualizarTutor(tut, codtut);
					JOptionPane.showMessageDialog(null, resp, "Modificar Tutor", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					txtCodTutor.setText("");
					txtLegajo.setText("");
					txtNombre.setText("");
					txtApellido.setText("");
					txtDomicilio.setText("");
					txtNumDomicilio.setText("");
					txtPiso.setText("");
					txtDepartamento.setText("");
					txtLocalidad.setText("");
					txtCP.setText("");
					txtTelefono.setText("");
					txtNumDNI.setText("");
					txtDia.setText("");
					txtMes.setText("");
					txtAnio.setText("");
					txtEstado.setText("");
					// cargarAlumnos(0);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBounds(836, 284, 107, 35);
		panel_1.add(button);
		
		JLabel label_19 = new JLabel("Codigo Tutor");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(135, 37, 122, 24);
		panel_1.add(label_19);
		
		txtCodTutor = new JTextField();
		txtCodTutor.setEditable(false);
		txtCodTutor.setColumns(10);
		txtCodTutor.setBounds(275, 40, 129, 23);
		panel_1.add(txtCodTutor);
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(63, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(498, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(459))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(106, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

}
