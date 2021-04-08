package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresoComponentes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JRadioButton rdbtnMicro;
	private JRadioButton rdbtnMemoriaRAM;
	private JRadioButton rdbtnTarjeta;
	private JPanel panel_Disco;
	private JPanel panelMicro;
	private JPanel panelTarjeta;
	private JPanel panelRam;
	private JLabel lblTipoconexion_Micro;
	private JLabel lblVelocidad_Micro;
	private JLabel lblTipo_Micro;
	private JTextField txtTipoConexion_Micro;
	private JSpinner spnVelocidad_Micro;
	private JComboBox cbxTipo_Micro;
	private JComboBox cbxTipoRam;
	private JComboBox cbxTipoConector;
	private JLabel lblTipoRam;
	private JLabel lblTipoConector;
	
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
				panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n General", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBounds(10, 5, 621, 122);
				panel.add(panel_1);
				panel_1.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Serie:");
				lblNewLabel.setBounds(18, 23, 36, 23);
				panel_1.add(lblNewLabel);
				
				textField = new JTextField();
				textField.setBounds(72, 23, 46, 23);
				panel_1.add(textField);
				textField.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("Marca:");
				lblNewLabel_1.setBounds(136, 23, 46, 23);
				panel_1.add(lblNewLabel_1);
				
				textField_1 = new JTextField();
				textField_1.setBounds(200, 23, 86, 23);
				panel_1.add(textField_1);
				textField_1.setColumns(10);
				
				JLabel lblNewLabel_2 = new JLabel("Modelo:");
				lblNewLabel_2.setBounds(304, 23, 46, 23);
				panel_1.add(lblNewLabel_2);
				
				textField_2 = new JTextField();
				textField_2.setBounds(368, 23, 86, 23);
				panel_1.add(textField_2);
				textField_2.setColumns(10);
				
				JLabel lblNewLabel_4 = new JLabel("Venta:");
				lblNewLabel_4.setBounds(472, 23, 46, 23);
				panel_1.add(lblNewLabel_4);
				
				JSpinner spinner_1 = new JSpinner();
				spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				spinner_1.setBounds(536, 23, 67, 23);
				panel_1.add(spinner_1);
				
				JLabel lblNewLabel_5 = new JLabel("Cantidad M\u00EDinima:");
				lblNewLabel_5.setBounds(16, 75, 105, 23);
				panel_1.add(lblNewLabel_5);
				
				JSpinner spinner_2 = new JSpinner();
				spinner_2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				spinner_2.setBounds(131, 75, 76, 23);
				panel_1.add(spinner_2);
				
				JLabel lblNewLabel_6 = new JLabel("Cantidad M\u00E1xima:");
				lblNewLabel_6.setBounds(223, 75, 110, 23);
				panel_1.add(lblNewLabel_6);
				
				JSpinner spinner_3 = new JSpinner();
				spinner_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				spinner_3.setBounds(332, 75, 76, 23);
				panel_1.add(spinner_3);
				
				JLabel lblNewLabel_7 = new JLabel("Cantidad Real:");
				lblNewLabel_7.setBounds(424, 75, 85, 23);
				panel_1.add(lblNewLabel_7);
				
				JSpinner spinner_4 = new JSpinner();
				spinner_4.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				spinner_4.setBounds(525, 75, 76, 23);
				panel_1.add(spinner_4);
			}
			
			JPanel panel_Componentes = new JPanel();
			panel_Componentes.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Componentes", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_Componentes.setBounds(10, 130, 621, 57);
			panel.add(panel_Componentes);
			panel_Componentes.setLayout(null);
			
			JRadioButton rdbtnDiscoDuro = new JRadioButton("Disco Duro");
			rdbtnDiscoDuro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					rdbtnMicro.setSelected(false);
					rdbtnTarjeta.setSelected(false);
					rdbtnDiscoDuro.setSelected(true);
					rdbtnMemoriaRAM.setSelected(false);
					panelMicro.setVisible(false);
					panelTarjeta.setVisible(false);
					panel_Disco.setVisible(true);
					panelRam.setVisible(false);
				}
			});
			rdbtnDiscoDuro.setBounds(32, 19, 109, 23);
			panel_Componentes.add(rdbtnDiscoDuro);
			
			JRadioButton rdbtnMemoriaRAM = new JRadioButton("Memoria RAM");
			rdbtnMemoriaRAM.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnMicro.setSelected(false);
					rdbtnTarjeta.setSelected(false);
					rdbtnDiscoDuro.setSelected(false);
					rdbtnMemoriaRAM.setSelected(true);
					panelMicro.setVisible(false);
					panelTarjeta.setVisible(false);
					panel_Disco.setVisible(false);
					panelRam.setVisible(true);
				}
			});
			rdbtnMemoriaRAM.setBounds(173, 19, 109, 23);
			panel_Componentes.add(rdbtnMemoriaRAM);
			
			JRadioButton rdbtnMicro = new JRadioButton("Microprocesadores");
			rdbtnMicro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnMicro.setSelected(true);
					rdbtnTarjeta.setSelected(false);
					rdbtnDiscoDuro.setSelected(true);
					rdbtnMemoriaRAM.setSelected(false);
					panelMicro.setVisible(true);
					panelTarjeta.setVisible(false);
					panel_Disco.setVisible(false);
					panelRam.setVisible(false);
					
				}
			});
			rdbtnMicro.setBounds(314, 19, 151, 23);
			panel_Componentes.add(rdbtnMicro);
			
			JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta Madre");
			rdbtnTarjeta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					rdbtnMicro.setSelected(false);
					rdbtnTarjeta.setSelected(true);
					rdbtnDiscoDuro.setSelected(false);
					rdbtnMemoriaRAM.setSelected(false);
					panelMicro.setVisible(false);
					panelTarjeta.setVisible(true);
					panel_Disco.setVisible(false);
					panelRam.setVisible(false);
				}
			});
			rdbtnTarjeta.setBounds(480, 19, 109, 23);
			panel_Componentes.add(rdbtnTarjeta);
			
			JPanel panel_Disco = new JPanel();
			panel_Disco.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Espec\u00EDfica", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_Disco.setBounds(10, 190, 621, 230);
			panel.add(panel_Disco);
			panel_Disco.setLayout(null);
			
			JLabel lblalmacenamiento = new JLabel("Cantidad de almacenamiento:");
			lblalmacenamiento.setBounds(10, 40, 175, 23);
			panel_Disco.add(lblalmacenamiento);
			
			JLabel lblunidadAlmacenamiento = new JLabel("Unidad de almacenamiento: ");
			lblunidadAlmacenamiento.setBounds(10, 103, 163, 23);
			panel_Disco.add(lblunidadAlmacenamiento);
			
			JLabel lblTipoconexion = new JLabel("Tipo de conexion:");
			lblTipoconexion.setBounds(10, 166, 147, 23);
			panel_Disco.add(lblTipoconexion);
			
			JSpinner spnAlmacenamiento = new JSpinner();
			spnAlmacenamiento.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spnAlmacenamiento.setBounds(195, 40, 147, 23);
			panel_Disco.add(spnAlmacenamiento);
			
			JComboBox cbxUnidadAlmac = new JComboBox();
			cbxUnidadAlmac.setModel(new DefaultComboBoxModel(new String[] {"Gb", "Tb"}));
			cbxUnidadAlmac.setToolTipText("");
			cbxUnidadAlmac.setBounds(196, 103, 146, 23);
			panel_Disco.add(cbxUnidadAlmac);
			
			JComboBox cbxTipoconexion = new JComboBox();
			cbxTipoconexion.setModel(new DefaultComboBoxModel(new String[] {"IDE", "SATA", "SATA-2", "SATA-3"}));
			cbxTipoconexion.setBounds(196, 166, 146, 23);
			panel_Disco.add(cbxTipoconexion);
			
			panelMicro = new JPanel();
			panelMicro.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Espec\u00EDfica", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panelMicro.setBounds(10, 190, 621, 230);
			panel.add(panelMicro);
			panelMicro.setLayout(null);
			
			lblTipoconexion_Micro = new JLabel("Tipo de conexion:");
			lblTipoconexion_Micro.setBounds(10, 40, 175, 23);
			panelMicro.add(lblTipoconexion_Micro);
			
			lblVelocidad_Micro = new JLabel("Velocidad:");
			lblVelocidad_Micro.setBounds(10, 103, 163, 23);
			panelMicro.add(lblVelocidad_Micro);
			
			lblTipo_Micro = new JLabel("Tipo de procesamiento:");
			lblTipo_Micro.setBounds(10, 166, 147, 23);
			panelMicro.add(lblTipo_Micro);
			
			txtTipoConexion_Micro = new JTextField();
			txtTipoConexion_Micro.setBounds(195, 40, 147, 23);
			panelMicro.add(txtTipoConexion_Micro);
			txtTipoConexion_Micro.setColumns(10);
			
			spnVelocidad_Micro = new JSpinner();
			spnVelocidad_Micro.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
			spnVelocidad_Micro.setBounds(196, 103, 146, 23);
			panelMicro.add(spnVelocidad_Micro);
			
			cbxTipo_Micro = new JComboBox();
			cbxTipo_Micro.setModel(new DefaultComboBoxModel(new String[] {"MHz", "GHz"}));
			cbxTipo_Micro.setBounds(196, 166, 146, 23);
			panelMicro.add(cbxTipo_Micro);
			
			panelTarjeta = new JPanel();
			panelTarjeta.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Espec\u00EDfica", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panelTarjeta.setBounds(10, 190, 621, 230);
			panel.add(panelTarjeta);
			panelTarjeta.setLayout(null);

			lblTipoConector = new JLabel("Tipo Conector:");
			lblTipoConector.setBounds(10, 40, 175, 23);
			panelTarjeta.add(lblTipoConector);

			cbxTipoConector = new JComboBox();
			cbxTipoConector.setModel(new DefaultComboBoxModel(new String[] { "<Seleccionar>", "BGA", "PGA", "LGA" }));
			cbxTipoConector.setBounds(195, 40, 147, 23);
			panelTarjeta.add(cbxTipoConector);

			lblTipoRam = new JLabel("Tipo Ram:");
			lblTipoRam.setBounds(10, 103, 163, 23);
			panelTarjeta.add(lblTipoRam);

			cbxTipoRam = new JComboBox();
			cbxTipoRam.setModel(
					new DefaultComboBoxModel(new String[] { "<Seleccionar>", "DDR", "DDR2", "DDR3", "DDR4" }));
			cbxTipoRam.setBounds(196, 103, 146, 23);
			panelTarjeta.add(cbxTipoRam);
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