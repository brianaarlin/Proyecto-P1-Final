package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;

public class RegistroCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
				textField_2 = new JTextField();
				textField_2.setBounds(79, 111, 113, 23);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Direccion:");
				lblNewLabel_3.setBounds(10, 158, 66, 14);
				panel.add(lblNewLabel_3);
			}
			{
				textField_3 = new JTextField();
				textField_3.setBounds(79, 154, 194, 23);
				panel.add(textField_3);
				textField_3.setColumns(10);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("Desea abrir linea de credito?");
				lblNewLabel_4.setBounds(10, 201, 172, 14);
				panel.add(lblNewLabel_4);
			}
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Si");
			rdbtnNewRadioButton.setSelected(true);
			rdbtnNewRadioButton.setBounds(187, 197, 55, 23);
			panel.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No");
			rdbtnNewRadioButton_1.setBounds(259, 197, 55, 23);
			panel.add(rdbtnNewRadioButton_1);
			
			JLabel lblNewLabel_5 = new JLabel("Credito:");
			lblNewLabel_5.setBounds(10, 244, 55, 14);
			panel.add(lblNewLabel_5);
			
			textField_4 = new JTextField();
			textField_4.setBounds(71, 240, 86, 23);
			panel.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel_6 = new JLabel("Dias para pagar:");
			lblNewLabel_6.setBounds(187, 244, 107, 14);
			panel.add(lblNewLabel_6);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
			comboBox.setBounds(301, 240, 46, 23);
			panel.add(comboBox);
		}
		{
			JPanel buttonPane = new JPanel();
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
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
