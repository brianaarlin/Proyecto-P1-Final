package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JSpinner;

public class RegistroCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtCredito;
	private JLabel lblCredito;
	private JLabel lblDias;
	private JSpinner spnDias;
	private JRadioButton rdbtnNo;
	private JRadioButton rdbtnSi;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroCliente dialog = new RegistroCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroCliente() {
		setTitle("Registrar Cliente");
		setBounds(100, 100, 377, 363);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(240, 255, 255));
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(0, 0, 361, 291);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Nombre:");
				lblNewLabel.setBounds(10, 29, 55, 14);
				panel.add(lblNewLabel);
			}
			{
				textField = new JTextField();
				textField.setBounds(79, 22, 149, 23);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Cedula:");
				lblNewLabel_1.setBounds(10, 72, 46, 14);
				panel.add(lblNewLabel_1);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBounds(79, 68, 113, 23);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Telefono:");
				lblNewLabel_2.setBounds(10, 115, 55, 14);
				panel.add(lblNewLabel_2);
			}
			{
				txtTelefono = new JTextField();
				txtTelefono.setBounds(79, 111, 113, 23);
				panel.add(txtTelefono);
				txtTelefono.setColumns(10);
			}
			{
				JLabel lblDireccion = new JLabel("Direccion:");
				lblDireccion.setBackground(UIManager.getColor("Button.focus"));
				lblDireccion.setForeground(Color.BLACK);
				lblDireccion.setBounds(10, 158, 68, 14);
				panel.add(lblDireccion);
			}
			{
				txtDireccion = new JTextField();
				txtDireccion.setBackground(Color.WHITE);
				txtDireccion.setForeground(new Color(0, 0, 255));
				txtDireccion.setColumns(10);
				txtDireccion.setBounds(79, 154, 194, 23);
				panel.add(txtDireccion);
			}
			
			lblCredito = new JLabel("Credito:");
			lblCredito.setBackground(UIManager.getColor("Button.focus"));
			lblCredito.setForeground(Color.BLACK);
			lblCredito.setBounds(10, 243, 89, 16);
			panel.add(lblCredito);
			

			
			lblDias = new JLabel("Dias Para Pagar:");
			lblDias.setBackground(UIManager.getColor("Button.focus"));
			lblDias.setForeground(Color.BLACK);
			lblDias.setBounds(176, 243, 124, 16);
			panel.add(lblDias);
			
			spnDias = new JSpinner();
			spnDias.setForeground(new Color(0, 0, 255));
			spnDias.setBackground(UIManager.getColor("Button.focus"));
			spnDias.setModel(new SpinnerNumberModel(1, 1, 120, 1));
			spnDias.setBounds(283, 240, 68, 23);
			panel.add(spnDias);
			
			txtCredito = new JTextField();
			txtCredito.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char carac = e.getKeyChar();
					if(((carac<'0') || (carac>'9')) && ((carac!='.') && (carac!='\b'))) {
						e.consume();
					}
				}
			});
			txtCredito.setBackground(Color.WHITE);
			txtCredito.setForeground(new Color(0, 0, 255));
			txtCredito.setBounds(57, 240, 109, 23);
			panel.add(txtCredito);
			txtCredito.setColumns(10);
		
			
			rdbtnSi = new JRadioButton("Si");
			rdbtnSi.setBackground(new Color(240, 255, 255));
			rdbtnSi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnNo.setSelected(false);
					txtCredito.setVisible(true);
					lblCredito.setVisible(true);
					lblDias.setVisible(true);
					spnDias.setVisible(true);
				}
			});
			
			rdbtnSi.setSelected(true);
			rdbtnSi.setBounds(187, 197, 55, 23);
			panel.add(rdbtnSi);
			
	
				JLabel lblNewLabel_4 = new JLabel("Desea abrir linea de credito?");
				lblNewLabel_4.setForeground(Color.BLACK);
				lblNewLabel_4.setBackground(UIManager.getColor("Button.focus"));
				lblNewLabel_4.setBounds(10, 200, 226, 16);
				panel.add(lblNewLabel_4);
				

		
			
			rdbtnNo = new JRadioButton("No");
			rdbtnNo.setBackground(new Color(240, 255, 255));
			rdbtnNo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnSi.setSelected(false);
					txtCredito.setVisible(false);
					lblCredito.setVisible(false);
					lblDias.setVisible(false);
					spnDias.setVisible(false);
				}
			});
			rdbtnNo.setBounds(259, 197, 55, 23);
			panel.add(rdbtnNo);
		
			;
		}
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(240, 255, 255));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Regsitrar");
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
