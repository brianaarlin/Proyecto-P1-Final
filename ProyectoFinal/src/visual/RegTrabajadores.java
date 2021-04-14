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


import logico.Administrativo;

import logico.Persona;

import logico.Tienda;
import logico.Vendedor;


import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JTextField txtContrasena;
	private JTextField txtNombreUsuario;
	private JTextField txtContrasena_1;
	private JLabel lblNombre_Usuario;
	private JLabel lblContrasena_1;
	private JLabel lblSueldo_1;
	private JSpinner spnSueldo_1;
	private JRadioButton rdbtnAdministracion;
	private JRadioButton rdbtnVendedor;
	private JPanel panel_Vendedor;
	private JPanel panel_Administracion;
	private JLabel lblSueldo;
	private JSpinner spnSueldo;
	private JLabel lblUsuario;
	private JLabel lblContrasena;
	

	
	

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
		setModal(false);
		setResizable(false);
		setTitle("Registrar Trabajadores");
		setBounds(100, 100, 620, 348);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 604, 271);
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
				panel_Vendedor.setVisible(true);
				
				
				lblSueldo.setVisible(true);
				spnSueldo.setVisible(true);
				lblUsuario.setVisible(true);
				txtUsuario.setVisible(true);
				lblContrasena.setVisible(true);
				txtContrasena.setVisible(true);
				
				lblNombre_Usuario.setVisible(false);
				txtNombreUsuario.setVisible(false);
				lblContrasena_1.setVisible(false);
				txtContrasena_1.setVisible(false);
				lblSueldo_1.setVisible(false);
				spnSueldo_1.setVisible(false);
				
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
				panel_Administracion.setVisible(true);
				
				
				lblSueldo.setVisible(false);
				spnSueldo.setVisible(false);
				lblUsuario.setVisible(false);
				txtUsuario.setVisible(false);
				lblContrasena.setVisible(false);
				txtContrasena.setVisible(false);
				
				lblNombre_Usuario.setVisible(true);
				txtNombreUsuario.setVisible(true);
				lblContrasena_1.setVisible(true);
				txtContrasena_1.setVisible(true);
				lblSueldo_1.setVisible(true);
				spnSueldo_1.setVisible(true);
				
			}
		});
		rdbtnAdministracion.setBounds(341, 13, 136, 23);
		panel_2.add(rdbtnAdministracion);
		
		panel_Vendedor = new JPanel();
		panel_Vendedor.setBorder(new TitledBorder(null, "Informacion Especifica", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_Vendedor.setBounds(10, 170, 584, 82);
		panel.add(panel_Vendedor);
		panel_Vendedor.setLayout(null);
		
		lblSueldo = new JLabel("Sueldo:");
		lblSueldo.setBounds(9, 40, 46, 14);
		panel_Vendedor.add(lblSueldo);
		
		spnSueldo = new JSpinner();
		spnSueldo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnSueldo.setBounds(64, 37, 58, 20);
		panel_Vendedor.add(spnSueldo);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(145, 40, 58, 14);
		panel_Vendedor.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(205, 37, 132, 20);
		panel_Vendedor.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setBounds(360, 40, 92, 14);
		panel_Vendedor.add(lblContrasena);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(440, 37, 132, 20);
		panel_Vendedor.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		panel_Administracion = new JPanel();
		panel_Administracion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion Especifica", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Administracion.setBounds(10, 170, 584, 82);
		panel.add(panel_Administracion);
		panel_Administracion.setVisible(false);
		panel_Administracion.setLayout(null);
		
		lblNombre_Usuario = new JLabel("Nombre Usuario:");
		lblNombre_Usuario.setBounds(10, 23, 108, 14);
		panel_Administracion.add(lblNombre_Usuario);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBounds(110, 20, 132, 20);
		panel_Administracion.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		lblContrasena_1 = new JLabel("Contrase\u00F1a:");
		lblContrasena_1.setBounds(10, 57, 86, 14);
		panel_Administracion.add(lblContrasena_1);
		
		txtContrasena_1 = new JTextField();
		txtContrasena_1.setBounds(110, 51, 132, 20);
		panel_Administracion.add(txtContrasena_1);
		txtContrasena_1.setColumns(10);
		
		lblSueldo_1 = new JLabel("Sueldo:");
		lblSueldo_1.setBounds(288, 23, 61, 14);
		panel_Administracion.add(lblSueldo_1);
		
		spnSueldo_1 = new JSpinner();
		spnSueldo_1.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnSueldo_1.setBounds(335, 20, 58, 20);
		panel_Administracion.add(spnSueldo_1);
		
		

		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String nombre = txtNombre.getText();
						String cedula = txtCedula.getText();
						String direccion = txtDireccion.getText();
						String telefono = txtTelefono.getText();
						if(cedula.isEmpty() || direccion.isEmpty() || nombre.isEmpty() || telefono.isEmpty()) {
							JOptionPane.showMessageDialog(null, "Ha dejado espacios vacios!!\nFAVOR DE LLENARLOS CORRECTAMENTE.", "ERROR", JOptionPane.ERROR_MESSAGE);
						}else {
						if(rdbtnVendedor.isSelected()) {
							
							Persona aux = new Vendedor(nombre, cedula, telefono, direccion, 0, Float.parseFloat(spnSueldo.getValue().toString()), txtUsuario.getText(), txtContrasena.getText());
							Tienda.getInstance().insertarPersona(aux);
						}
						
						if(rdbtnAdministracion.isSelected()) {
							Persona aux = new Administrativo(nombre, cedula, telefono, direccion, txtNombreUsuario.getText(), txtContrasena_1.getText(),Float.parseFloat(spnSueldo_1.getValue().toString()));
							Tienda.getInstance().insertarPersona(aux);
						}
						clear();
						JOptionPane.showMessageDialog(null, "Se ha ingresado correctamente!!", "Información", JOptionPane.INFORMATION_MESSAGE);
						}
					}

					
					
					
				});
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
		
		private void clear() {
			txtNombre.setText("");
			txtCedula.setText("");
			txtTelefono.setText("");
			txtDireccion.setText("");
			
			txtContrasena_1.setText("");
			txtNombreUsuario.setText("");
			spnSueldo_1.setValue(new Integer(1));
			
			
			spnSueldo.setValue(new Integer(1));
			txtContrasena.setText("");
			txtUsuario.setText("");
			
		}
	}

