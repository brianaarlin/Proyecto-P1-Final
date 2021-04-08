package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class RegTrabajadores extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtUsuario;
	private JTextField txtContraseña;
	private JTextField txtNombreUsuario;
	private JTextField txtContraseña_1;
	private JLabel lblNombre_Usuario;
	private JLabel lblContraseña_1;
	private JLabel lblSueldo_1;
	private JSpinner spnSueldo_1;
	private JRadioButton rdbtnAdministracion;
	private JRadioButton rdbtnVendedor;
	private JPanel panel_Vendedor;
	private JPanel panel_Administracion;
	private JLabel lblComision;
	private JLabel lblSueldo;
	private JSpinner spnComision;
	private JSpinner spnSueldo;
	private JLabel lblNewLabel;
	private JLabel lblUsuario;
	private JLabel lblContraseña;
	

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegTrabajadores dialog = new RegTrabajadores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegTrabajadores() {
		setTitle("Registrar Trabajadores");
		setBounds(100, 100, 620, 438);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 604, 361);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion General", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 11, 584, 94);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(10, 28, 46, 14);
		panel_1.add(lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char carac = e.getKeyChar();
				if(((carac<'0') || (carac>'9')) && ((carac!='-') && (carac!='\b'))) {
					e.consume();
				}
			}
		});
		txtCedula.setBounds(66, 25, 147, 20);
		panel_1.add(txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 69, 59, 14);
		panel_1.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(66, 66, 147, 20);
		panel_1.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(329, 28, 73, 14);
		panel_1.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(400, 25, 147, 20);
		panel_1.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(329, 69, 73, 14);
		panel_1.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char carac = e.getKeyChar();
				if(((carac<'0') || (carac>'9')) && ((carac!='(') && (carac!='\b') && (carac!=')') && (carac!='-') && (carac!='+'))) {
					e.consume();
				}
			}
		});
		txtTelefono.setBounds(400, 66, 147, 20);
		panel_1.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo de Trabajador", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 116, 584, 43);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		rdbtnVendedor = new JRadioButton("Vendedor");
		rdbtnVendedor.setSelected(true);
		rdbtnVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnVendedor.setSelected(true);
				rdbtnAdministracion.setSelected(false);
				
				panel_Administracion.setVisible(false);
				
				lblComision.setVisible(true);
				lblSueldo.setVisible(true);
				spnComision.setVisible(true);
				spnSueldo.setVisible(true);
				lblNewLabel.setVisible(true);
				lblUsuario.setVisible(true);
				txtUsuario.setVisible(true);
				lblContraseña.setVisible(true);
				txtContraseña.setVisible(true);
				
			}
		});
		rdbtnVendedor.setBounds(91, 13, 109, 23);
		panel_2.add(rdbtnVendedor);
		
		rdbtnAdministracion = new JRadioButton("Administracion");
		rdbtnAdministracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnVendedor.setSelected(false);
				rdbtnAdministracion.setSelected(true);
				
				panel_Vendedor.setVisible(false);
				
				lblComision.setVisible(false);
				lblSueldo.setVisible(false);
				spnComision.setVisible(false);
				spnSueldo.setVisible(false);
				lblNewLabel.setVisible(false);
				lblUsuario.setVisible(false);
				txtUsuario.setVisible(false);
				lblContraseña.setVisible(false);
				txtContraseña.setVisible(false);
			}
		});
		rdbtnAdministracion.setBounds(341, 13, 136, 23);
		panel_2.add(rdbtnAdministracion);
		
		panel_Vendedor = new JPanel();
		panel_Vendedor.setBorder(new TitledBorder(null, "Informacion Especifica", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_Vendedor.setBounds(10, 170, 584, 82);
		panel.add(panel_Vendedor);
		panel_Vendedor.setLayout(null);
		
		lblComision = new JLabel("Comision:");
		lblComision.setBounds(10, 22, 58, 14);
		panel_Vendedor.add(lblComision);
		
		lblSueldo = new JLabel("Sueldo:");
		lblSueldo.setBounds(10, 57, 46, 14);
		panel_Vendedor.add(lblSueldo);
		
		spnComision = new JSpinner();
		spnComision.setBounds(78, 22, 58, 20);
		panel_Vendedor.add(spnComision);
		
		spnSueldo = new JSpinner();
		spnSueldo.setBounds(78, 54, 58, 20);
		panel_Vendedor.add(spnSueldo);
		
		lblNewLabel = new JLabel("(Ingresar Porciento de Comision Por Venta)");
		lblNewLabel.setBounds(146, 25, 249, 14);
		panel_Vendedor.add(lblNewLabel);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(176, 57, 58, 14);
		panel_Vendedor.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(229, 54, 132, 20);
		panel_Vendedor.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setBounds(371, 57, 92, 14);
		panel_Vendedor.add(lblContraseña);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(445, 54, 132, 20);
		panel_Vendedor.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		panel_Administracion = new JPanel();
		panel_Administracion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion Especifica", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Administracion.setBounds(10, 268, 584, 82);
		panel.add(panel_Administracion);
		panel_Administracion.setLayout(null);
		
		lblNombre_Usuario = new JLabel("Nombre Usuario:");
		lblNombre_Usuario.setBounds(10, 23, 108, 14);
		panel_Administracion.add(lblNombre_Usuario);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBounds(110, 20, 132, 20);
		panel_Administracion.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		lblContraseña_1 = new JLabel("Contrase\u00F1a:");
		lblContraseña_1.setBounds(10, 57, 86, 14);
		panel_Administracion.add(lblContraseña_1);
		
		txtContraseña_1 = new JTextField();
		txtContraseña_1.setBounds(110, 51, 132, 20);
		panel_Administracion.add(txtContraseña_1);
		txtContraseña_1.setColumns(10);
		
		lblSueldo_1 = new JLabel("Sueldo:");
		lblSueldo_1.setBounds(288, 23, 61, 14);
		panel_Administracion.add(lblSueldo_1);
		
		spnSueldo_1 = new JSpinner();
		spnSueldo_1.setBounds(335, 20, 58, 20);
		panel_Administracion.add(spnSueldo_1);
		
		

		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setBackground(UIManager.getColor("Button.focus"));
				cancelButton.setForeground(Color.BLACK);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		
	}
}
