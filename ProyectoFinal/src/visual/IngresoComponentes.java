package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;

public class IngresoComponentes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			IngresoComponentes dialog = new IngresoComponentes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public IngresoComponentes() {
		setTitle("Ingreso de componentes");
		setBounds(100, 100, 657, 504);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 641, 427);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_1.setBounds(10, 5, 621, 105);
				panel.add(panel_1);
				panel_1.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Serie:");
				lblNewLabel.setBounds(3, 11, 36, 23);
				panel_1.add(lblNewLabel);
				
				textField = new JTextField();
				textField.setBounds(42, 11, 46, 23);
				panel_1.add(textField);
				textField.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("Marca:");
				lblNewLabel_1.setBounds(91, 11, 46, 23);
				panel_1.add(lblNewLabel_1);
				
				textField_1 = new JTextField();
				textField_1.setBounds(140, 11, 86, 23);
				panel_1.add(textField_1);
				textField_1.setColumns(10);
				
				JLabel lblNewLabel_2 = new JLabel("Modelo:");
				lblNewLabel_2.setBounds(229, 11, 46, 23);
				panel_1.add(lblNewLabel_2);
				
				textField_2 = new JTextField();
				textField_2.setBounds(278, 11, 86, 23);
				panel_1.add(textField_2);
				textField_2.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("Compra:");
				lblNewLabel_3.setBounds(367, 11, 56, 23);
				panel_1.add(lblNewLabel_3);
				
				JSpinner spinner = new JSpinner();
				spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				spinner.setBounds(426, 11, 67, 23);
				panel_1.add(spinner);
				
				JLabel lblNewLabel_4 = new JLabel("Venta:");
				lblNewLabel_4.setBounds(496, 11, 46, 23);
				panel_1.add(lblNewLabel_4);
				
				JSpinner spinner_1 = new JSpinner();
				spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				spinner_1.setBounds(545, 11, 67, 23);
				panel_1.add(spinner_1);
				
				JLabel lblNewLabel_5 = new JLabel("Cantidad M\u00EDinima:");
				lblNewLabel_5.setBounds(16, 67, 105, 23);
				panel_1.add(lblNewLabel_5);
				
				JSpinner spinner_2 = new JSpinner();
				spinner_2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				spinner_2.setBounds(131, 67, 76, 23);
				panel_1.add(spinner_2);
				
				JLabel lblNewLabel_6 = new JLabel("Cantidad M\u00E1xima:");
				lblNewLabel_6.setBounds(223, 67, 110, 23);
				panel_1.add(lblNewLabel_6);
				
				JSpinner spinner_3 = new JSpinner();
				spinner_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				spinner_3.setBounds(332, 67, 76, 23);
				panel_1.add(spinner_3);
				
				JLabel lblNewLabel_7 = new JLabel("Cantidad Real:");
				lblNewLabel_7.setBounds(424, 67, 85, 23);
				panel_1.add(lblNewLabel_7);
				
				JSpinner spinner_4 = new JSpinner();
				spinner_4.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				spinner_4.setBounds(525, 67, 76, 23);
				panel_1.add(spinner_4);
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 121, 621, 54);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Disco Duro");
			rdbtnNewRadioButton.setBounds(32, 15, 109, 23);
			panel_1.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Memoria RAM");
			rdbtnNewRadioButton_1.setBounds(173, 15, 109, 23);
			panel_1.add(rdbtnNewRadioButton_1);
			
			JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Microprocesadores");
			rdbtnNewRadioButton_2.setBounds(314, 15, 151, 23);
			panel_1.add(rdbtnNewRadioButton_2);
			
			JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Tarjeta Madre");
			rdbtnNewRadioButton_3.setBounds(480, 15, 109, 23);
			panel_1.add(rdbtnNewRadioButton_3);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(10, 186, 621, 230);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			JLabel lblNewLabel_8 = new JLabel("Cantidad de almacenamiento:");
			lblNewLabel_8.setBounds(10, 40, 175, 23);
			panel_2.add(lblNewLabel_8);
			
			JLabel lblNewLabel_9 = new JLabel("Unidad de almacenamiento: ");
			lblNewLabel_9.setBounds(10, 103, 163, 23);
			panel_2.add(lblNewLabel_9);
			
			JLabel lblNewLabel_10 = new JLabel("Tipo de conexion:");
			lblNewLabel_10.setBounds(10, 166, 147, 23);
			panel_2.add(lblNewLabel_10);
			
			JSpinner spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinner.setBounds(195, 40, 147, 23);
			panel_2.add(spinner);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gb", "Tb"}));
			comboBox.setToolTipText("");
			comboBox.setBounds(196, 103, 146, 23);
			panel_2.add(comboBox);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"IDE", "SATA", "SATA-2", "SATA-3"}));
			comboBox_1.setBounds(196, 166, 146, 23);
			panel_2.add(comboBox_1);
		}
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
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
