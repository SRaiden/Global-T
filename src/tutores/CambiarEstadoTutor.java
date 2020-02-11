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
import classDAO.CursosDAO;
import classDAO.TutoresDAO;
import classVO.AlumnosVO;
import classVO.CursosVO;
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

public class CambiarEstadoTutor extends JPanel {

	private JTextField txtBuscarCodTutor;
	private JTextField txtLegajo2;
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
	private JTextField txtBuscarDNITutor;
	private JTextField txtTipoDNI;
	private JTextField txtLegajo1;
	private JTextField txtCodCurso;
	
	public CambiarEstadoTutor() {
		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cambiar Estado del Tutor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
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
		
		JComboBox cmbEstado = new JComboBox();
		cmbEstado.addItem("ACTIVO");
		cmbEstado.addItem("INACTIVO");
		cmbEstado.setBounds(667, 292, 145, 20);
		panel_1.add(cmbEstado);
		
		JLabel label_3 = new JLabel("Fecha Nac.");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(498, 242, 86, 24);
		panel_1.add(label_3);
		
		txtLegajo2 = new JTextField();
		txtLegajo2.setEditable(false);
		txtLegajo2.setColumns(10);
		txtLegajo2.setBounds(331, 72, 74, 23);
		panel_1.add(txtLegajo2);
		
		txtAnio = new JTextField();
		txtAnio.setEditable(false);
		txtAnio.setColumns(10);
		txtAnio.setBounds(761, 244, 62, 23);
		panel_1.add(txtAnio);
		
		JLabel label_4 = new JLabel("/");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(751, 242, 4, 24);
		panel_1.add(label_4);
		
		txtMes = new JTextField();
		txtMes.setEditable(false);
		txtMes.setColumns(10);
		txtMes.setBounds(693, 244, 48, 23);
		panel_1.add(txtMes);
		
		JLabel label_5 = new JLabel("/");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(681, 242, 9, 24);
		panel_1.add(label_5);
		
		txtDia = new JTextField();
		txtDia.setEditable(false);
		txtDia.setColumns(10);
		txtDia.setBounds(623, 245, 48, 23);
		panel_1.add(txtDia);
		
		txtCP = new JTextField();
		txtCP.setEditable(false);
		txtCP.setColumns(10);
		txtCP.setBounds(623, 107, 200, 23);
		panel_1.add(txtCP);
		
		JLabel label_6 = new JLabel("Piso");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(136, 241, 69, 24);
		panel_1.add(label_6);
		
		txtPiso = new JTextField();
		txtPiso.setEditable(false);
		txtPiso.setColumns(10);
		txtPiso.setBounds(276, 243, 129, 23);
		panel_1.add(txtPiso);
		
		JLabel label_7 = new JLabel("Departamento ");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(498, 38, 93, 24);
		panel_1.add(label_7);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setEditable(false);
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(623, 40, 200, 23);
		panel_1.add(txtDepartamento);
		
		JLabel label_8 = new JLabel("Localidad");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(498, 71, 93, 24);
		panel_1.add(label_8);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setEditable(false);
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
		txtTelefono.setEditable(false);
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(623, 141, 200, 23);
		panel_1.add(txtTelefono);
		
		JLabel label_11 = new JLabel("Tipo DNI");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(498, 174, 74, 24);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Numero DNI");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(498, 207, 122, 24);
		panel_1.add(label_12);
		
		txtNumDNI = new JTextField();
		txtNumDNI.setEditable(false);
		txtNumDNI.setColumns(10);
		txtNumDNI.setBounds(623, 207, 200, 23);
		panel_1.add(txtNumDNI);
		
		JLabel label_13 = new JLabel("Legajo Alumno");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(136, 70, 107, 24);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("Nombre");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(136, 104, 48, 24);
		panel_1.add(label_14);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(276, 106, 129, 23);
		panel_1.add(txtNombre);
		
		JLabel label_15 = new JLabel("Apellido");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(136, 140, 62, 24);
		panel_1.add(label_15);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBounds(276, 141, 129, 23);
		panel_1.add(txtApellido);
		
		JLabel label_16 = new JLabel("Domicilio");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(136, 175, 122, 24);
		panel_1.add(label_16);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setEditable(false);
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(276, 174, 129, 23);
		panel_1.add(txtDomicilio);
		
		JLabel label_17 = new JLabel("Numero Domicilio");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(136, 206, 122, 24);
		panel_1.add(label_17);
		
		txtNumDomicilio = new JTextField();
		txtNumDomicilio.setEditable(false);
		txtNumDomicilio.setColumns(10);
		txtNumDomicilio.setBounds(276, 208, 129, 23);
		panel_1.add(txtNumDomicilio);
		
		txtTipoDNI = new JTextField();
		txtTipoDNI.setEditable(false);
		txtTipoDNI.setColumns(10);
		txtTipoDNI.setBounds(623, 175, 200, 23);
		panel_1.add(txtTipoDNI);
		
		txtLegajo1 = new JTextField();
		txtLegajo1.setEditable(false);
		txtLegajo1.setColumns(10);
		txtLegajo1.setBounds(276, 72, 45, 23);
		panel_1.add(txtLegajo1);
		
		JLabel label_18 = new JLabel("DNI Tutor");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(619, 32, 73, 24);
		panel.add(label_18);
		
		txtBuscarDNITutor = new JTextField();
		txtBuscarDNITutor.setColumns(10);
		txtBuscarDNITutor.setBounds(711, 34, 144, 23);
		panel.add(txtBuscarDNITutor);
		
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
					txtLegajo1.setText(parte1 + "");
					txtLegajo2.setText(parte2 + "");
					
					txtCodCurso.setText(tut.getCodigo_tutor() + "");
					txtNombre.setText(tut.getNombre_Tutor()+ "");
					txtApellido.setText(tut.getApellido_Tutor() + "");
					txtDomicilio.setText(tut.getDomicilio_Tutor() + "");
					txtNumDomicilio.setText(tut.getNumero_Domicilio_Tutor() + "");
					txtPiso.setText(tut.getPiso_Tutor() + "");
					txtDepartamento.setText(tut.getDepartamento_Tutor() + "");
					txtLocalidad.setText(tut.getLocalidad_Tutor() + "");
					txtCP.setText(tut.getCP_Tutor() + "");
					txtTelefono.setText(tut.getTelefono_Tutor() + "");
					txtTipoDNI.setText(tut.getTipo_Documento_Tutor() + "");
					txtNumDNI.setText(tut.getNum_Documento_Tutor() + "");
					
					String sa = tut.getFecha_Nacimiento_Tutor();
					String[] pa = sa.split("/");
					String pas1 = pa[0];
					String pas2 = pa[1];
					String pas3 = pa[2];
					txtDia.setText(pas1 + "");
					txtMes.setText(pas2 + "");
					txtAnio.setText(pas3 + "");
					
					cmbEstado.setSelectedItem(tut.getTipo_Estado());
					
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
					txtLegajo1.setText(parte1 + "");
					txtLegajo2.setText(parte2 + "");
					
					txtCodCurso.setText(tut.getCodigo_tutor() + "");
					txtNombre.setText(tut.getNombre_Tutor() + "");
					txtApellido.setText(tut.getApellido_Tutor() + "");
					txtDomicilio.setText(tut.getDomicilio_Tutor() + "");
					txtNumDomicilio.setText(tut.getNumero_Domicilio_Tutor() + "");
					txtPiso.setText(tut.getPiso_Tutor() + "");
					txtDepartamento.setText(tut.getDepartamento_Tutor() + "");
					txtLocalidad.setText(tut.getLocalidad_Tutor() + "");
					txtCP.setText(tut.getCP_Tutor() + "");
					txtTelefono.setText(tut.getTelefono_Tutor() + "");
					txtTipoDNI.setText(tut.getTipo_Documento_Tutor() + "");
					txtNumDNI.setText(tut.getNum_Documento_Tutor() + "");
					
					String sa = tut.getFecha_Nacimiento_Tutor();
					String[] pa = sa.split("/");
					String dia = pa[0];
					String mes = pa[1];
					String anio = pa[2];
					txtDia.setText(dia + "");
					txtMes.setText(mes + "");
					txtAnio.setText(anio + "");
					
					cmbEstado.setSelectedItem(tut.getTipo_Estado());
					
					String estado = (String) cmbEstado.getSelectedItem();
					tut.setTipo_Estado(estado);
					
					JOptionPane.showMessageDialog(null, "Busqueda Exitosa", "Buscar Alumno por DNI", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Busqueda Fallida", "Buscar Alumno por DNI", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					e1.printStackTrace();
				}
			}
		});
		txtBuscadXDNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtBuscadXDNI.setBounds(873, 27, 107, 35);
		panel.add(txtBuscadXDNI);
		
		JButton btnCambiarEstado = new JButton("Cambiar Estado\r\n");
		btnCambiarEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TutoresVO tut = new TutoresVO();
				
				String legajo1 = (String) txtCodCurso.getText();
				int num = Integer.parseInt(legajo1);
				tut.setLegajo_Alumno1(num);
				
				String estado = (String) cmbEstado.getSelectedItem();
				tut.setTipo_Estado(estado);
				try {
					String resp = TutoresDAO.CambiarEstadoTutor(tut,num);
					JOptionPane.showMessageDialog(null, resp, "Modificar Alumno", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("./iconoJOP/global.png"));
					txtCodCurso.setText("");
					txtLegajo1.setText("");
					txtLegajo2.setText("");
					txtNombre.setText("");
					txtApellido.setText("");
					txtDomicilio.setText("");
					txtNumDomicilio.setText("");
					txtPiso.setText("");
					txtDepartamento.setText("");
					txtLocalidad.setText("");
					txtTipoDNI.setText("");
					txtCP.setText("");
					txtTelefono.setText("");
					txtNumDNI.setText("");
					txtDia.setText("");
					txtMes.setText("");
					txtAnio.setText("");
					
					// cargarAlumnos(0);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCambiarEstado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCambiarEstado.setBounds(836, 284, 129, 35);
		panel_1.add(btnCambiarEstado);
		
		JLabel label_19 = new JLabel("Codigo Tutor");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(136, 38, 122, 24);
		panel_1.add(label_19);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setEditable(false);
		txtCodCurso.setColumns(10);
		txtCodCurso.setBounds(276, 40, 129, 23);
		panel_1.add(txtCodCurso);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(459)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(51, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
