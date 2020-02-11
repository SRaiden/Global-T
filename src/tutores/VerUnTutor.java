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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class VerUnTutor extends JPanel {

	private JTextField txtCodTutor;
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
	private JTextField txtTipoDNI;
	private JTextField txtEstado;
	private JTextField txtLegajo;
	private JTextField txtNombreAlumno;
	private JTextField txtApellidoAlumno;
	private JTextField txtDNITutor;
	
	public VerUnTutor() {

		JLabel label = new JLabel("Global - T");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("AngsanaUPC", Font.BOLD | Font.ITALIC, 40));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ver Datos de unTutor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		
		JLabel label_1 = new JLabel("Codigo Tutor");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(28, 27, 92, 24);
		panel.add(label_1);
		
		txtCodTutor = new JTextField();
		txtCodTutor.setColumns(10);
		txtCodTutor.setBounds(135, 29, 129, 23);
		panel.add(txtCodTutor);
		
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
		label_6.setBounds(135, 288, 69, 24);
		panel_1.add(label_6);
		
		txtPiso = new JTextField();
		txtPiso.setEditable(false);
		txtPiso.setColumns(10);
		txtPiso.setBounds(275, 290, 129, 23);
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
		label_11.setBounds(498, 176, 122, 24);
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
		
		JLabel label_13 = new JLabel("Nombre");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(135, 151, 48, 24);
		panel_1.add(label_13);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(275, 153, 129, 23);
		panel_1.add(txtNombre);
		
		JLabel label_14 = new JLabel("Apellido");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(135, 187, 62, 24);
		panel_1.add(label_14);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBounds(275, 188, 129, 23);
		panel_1.add(txtApellido);
		
		JLabel label_15 = new JLabel("Domicilio");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(135, 222, 122, 24);
		panel_1.add(label_15);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setEditable(false);
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(275, 221, 129, 23);
		panel_1.add(txtDomicilio);
		
		JLabel label_16 = new JLabel("Numero Domicilio");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(135, 253, 122, 24);
		panel_1.add(label_16);
		
		txtNumDomicilio = new JTextField();
		txtNumDomicilio.setEditable(false);
		txtNumDomicilio.setColumns(10);
		txtNumDomicilio.setBounds(275, 255, 129, 23);
		panel_1.add(txtNumDomicilio);
		
		txtTipoDNI = new JTextField();
		txtTipoDNI.setEditable(false);
		txtTipoDNI.setColumns(10);
		txtTipoDNI.setBounds(623, 175, 200, 23);
		panel_1.add(txtTipoDNI);
		
		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setColumns(10);
		txtEstado.setBounds(673, 292, 152, 23);
		panel_1.add(txtEstado);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(117, 21, 305, 122);
		panel_1.add(panel_2);
		
		JLabel label_17 = new JLabel("Legajo Alumno");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(10, 11, 107, 24);
		panel_2.add(label_17);
		
		txtLegajo = new JTextField();
		txtLegajo.setEditable(false);
		txtLegajo.setColumns(10);
		txtLegajo.setBounds(150, 13, 145, 23);
		panel_2.add(txtLegajo);
		
		txtNombreAlumno = new JTextField();
		txtNombreAlumno.setEditable(false);
		txtNombreAlumno.setColumns(10);
		txtNombreAlumno.setBounds(150, 48, 145, 23);
		panel_2.add(txtNombreAlumno);
		
		JLabel label_18 = new JLabel("Nombre del Alumno");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(10, 46, 130, 24);
		panel_2.add(label_18);
		
		txtApellidoAlumno = new JTextField();
		txtApellidoAlumno.setEditable(false);
		txtApellidoAlumno.setColumns(10);
		txtApellidoAlumno.setBounds(150, 84, 145, 23);
		panel_2.add(txtApellidoAlumno);
		
		JLabel label_19 = new JLabel("Apellido del Alumno");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(10, 82, 130, 24);
		panel_2.add(label_19);
		
		JLabel label_20 = new JLabel("DNI Tutor");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_20.setBounds(659, 27, 73, 24);
		panel.add(label_20);
		
		txtDNITutor = new JTextField();
		txtDNITutor.setColumns(10);
		txtDNITutor.setBounds(735, 29, 129, 23);
		panel.add(txtDNITutor);
		
		JButton txtBuscarXDNI = new JButton("Buscar");
		txtBuscarXDNI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dni = txtDNITutor.getText();
					
					TutoresVO tut = TutoresDAO.BuscarUnTutorXDNI(dni);
					
					String sa = tut.getLegajo_Alumno();
					String[] pa = sa.split("-");
					String pas1 = pa[0];
					String pas2 = pa[1];
					int parte1 = Integer.parseInt(pas1);
					int parte2 = Integer.parseInt(pas2);
					AlumnosVO alum = AlumnosDAO.BuscarUnAlumno(parte1, parte2);
					
					txtLegajo.setText(tut.getLegajo_Alumno());
					txtNombreAlumno.setText(alum.getNombre_alumno());
					txtApellidoAlumno.setText(alum.getApellido_alumno());
					
					txtNombre.setText(tut.getNombre_Tutor()+ "");
					txtApellido.setText(tut.getApellido_Tutor() + "");
					txtDomicilio.setText(tut.getDomicilio_Tutor() + "");
					txtNumDomicilio.setText(tut.getNumero_Domicilio_Tutor() + "");
					txtPiso.setText(tut.getPiso_Tutor() + "");
					txtDepartamento.setText(tut.getDepartamento_Tutor() + "");
					txtLocalidad.setText(tut.getLocalidad_Tutor() + "");
					txtCP.setText(tut.getCP_Tutor() + "");
					txtTelefono.setText(tut.getTelefono_Tutor() + "");
					txtTipoDNI.setText(tut.getTipo_Documento_Tutor());
					txtNumDNI.setText(tut.getNum_Documento_Tutor() + "");
					
					String sas = tut.getFecha_Nacimiento_Tutor();
					String[] pas = sas.split("/");
					String past1 = pas[0];
					String past2 = pas[1];
					String past3 = pas[2];
					txtDia.setText(past1 + "");
					txtMes.setText(past2 + "");
					txtAnio.setText(past3);
					
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
		txtBuscarXDNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtBuscarXDNI.setBounds(874, 22, 107, 35);
		panel.add(txtBuscarXDNI);
		
		JButton btnBuscarXCodTutor = new JButton("Buscar");
		btnBuscarXCodTutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String CodTutor = txtCodTutor.getText();
					int codtut = Integer.parseInt(CodTutor);
					
					TutoresVO tut = TutoresDAO.BuscarUnTutor(codtut);
					
					String sa = tut.getLegajo_Alumno();
					String[] pa = sa.split("-");
					String pas1 = pa[0];
					String pas2 = pa[1];
					int parte1 = Integer.parseInt(pas1);
					int parte2 = Integer.parseInt(pas2);
					AlumnosVO alum = AlumnosDAO.BuscarUnAlumno(parte1, parte2);
					
					txtLegajo.setText(tut.getLegajo_Alumno());
					txtNombreAlumno.setText(alum.getNombre_alumno());
					txtApellidoAlumno.setText(alum.getApellido_alumno());
					
					txtNombre.setText(tut.getNombre_Tutor()+ "");
					txtApellido.setText(tut.getApellido_Tutor() + "");
					txtDomicilio.setText(tut.getDomicilio_Tutor() + "");
					txtNumDomicilio.setText(tut.getNumero_Domicilio_Tutor() + "");
					txtPiso.setText(tut.getPiso_Tutor() + "");
					txtDepartamento.setText(tut.getDepartamento_Tutor() + "");
					txtLocalidad.setText(tut.getLocalidad_Tutor() + "");
					txtCP.setText(tut.getCP_Tutor() + "");
					txtTelefono.setText(tut.getTelefono_Tutor() + "");
					txtTipoDNI.setText(tut.getTipo_Documento_Tutor());
					txtNumDNI.setText(tut.getNum_Documento_Tutor() + "");
					
					String sas = tut.getFecha_Nacimiento_Tutor();
					String[] pas = sas.split("/");
					String past1 = pas[0];
					String past2 = pas[1];
					String past3 = pas[2];
					txtDia.setText(past1 + "");
					txtMes.setText(past2 + "");
					txtAnio.setText(past3);
					
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
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(497, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(464))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(206, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

}
