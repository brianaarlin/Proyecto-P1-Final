package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;

public class RegistrarArticulo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarArticulo dialog = new RegistrarArticulo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarArticulo() {
		setTitle("Agregar Articulo");
		setBounds(100, 100, 377, 235);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(0, 0, 361, 158);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Nombre:");
				lblNewLabel.setBounds(10, 28, 67, 14);
				panel.add(lblNewLabel);
			}
			{
				textField = new JTextField();
				textField.setBounds(70, 25, 86, 23);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Precio:");
				lblNewLabel_1.setBounds(190, 28, 46, 14);
				panel.add(lblNewLabel_1);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBounds(258, 25, 86, 23);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Cantidad:");
				lblNewLabel_2.setBounds(10, 80, 67, 14);
				panel.add(lblNewLabel_2);
			}
			
			JSpinner spinner = new JSpinner();
			spinner.setBounds(70, 77, 86, 23);
			panel.add(spinner);
			{
				JLabel lblNewLabel_3 = new JLabel("Descuento:");
				lblNewLabel_3.setBounds(190, 80, 67, 14);
				panel.add(lblNewLabel_3);
			}
			{
				JSpinner spinner_1 = new JSpinner();
				spinner_1.setBounds(258, 76, 86, 23);
				panel.add(spinner_1);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("SubTotal:");
				lblNewLabel_4.setBounds(108, 124, 67, 14);
				panel.add(lblNewLabel_4);
			}
			{
				textField_2 = new JTextField();
				textField_2.setBounds(171, 121, 86, 20);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Agregar");
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
