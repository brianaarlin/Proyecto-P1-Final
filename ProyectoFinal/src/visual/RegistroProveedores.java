package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class RegistroProveedores extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public static DefaultTableModel modelo;
	public static DefaultTableModel modelo_1;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroProveedores dialog = new RegistroProveedores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroProveedores() {
		setTitle("Registro de Proveedores");
		setBounds(100, 100, 622, 479);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(0, 0, 604, 406);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Codigo:");
			lblNewLabel.setBounds(10, 11, 62, 14);
			panel.add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(10, 30, 130, 23);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Empresa:");
			lblNewLabel_1.setBounds(173, 11, 62, 14);
			panel.add(lblNewLabel_1);
			
			textField_1 = new JTextField();
			textField_1.setBounds(173, 30, 223, 23);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Credito Disponible:");
			lblNewLabel_2.setBounds(10, 65, 106, 14);
			panel.add(lblNewLabel_2);
			
			textField_2 = new JTextField();
			textField_2.setBounds(10, 85, 130, 23);
			panel.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("Telefono:");
			lblNewLabel_3.setBounds(429, 11, 62, 14);
			panel.add(lblNewLabel_3);
			
			textField_3 = new JTextField();
			textField_3.setBounds(429, 30, 165, 23);
			panel.add(textField_3);
			textField_3.setColumns(10);
			
			JLabel lblNewLabel_4 = new JLabel("Direccion:");
			lblNewLabel_4.setBounds(173, 65, 62, 14);
			panel.add(lblNewLabel_4);
			
			textField_4 = new JTextField();
			textField_4.setBounds(173, 85, 421, 23);
			panel.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel_5 = new JLabel("Filtro:");
			lblNewLabel_5.setBounds(10, 130, 71, 14);
			panel.add(lblNewLabel_5);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Todos>", "Discos Duros", "Memorias RAM", "Tarjeta Madre", "MicroProcesadores"}));
			comboBox.setToolTipText("");
			comboBox.setEditable(true);
			comboBox.setBounds(10, 150, 130, 23);
			panel.add(comboBox);
			
			JPanel panel_1 = new JPanel();
			panel_1.setForeground(Color.WHITE);
			panel_1.setBackground(Color.LIGHT_GRAY);
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Disponibles", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
			panel_1.setBounds(10, 195, 251, 197);
			panel.add(panel_1);
			panel_1.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(222, 170, -210, -140);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			panel_1.add(scrollPane);
			
			modelo = new DefaultTableModel();
			String []columns = {"Codigo","Tipo","Marca","Modelo"};
			modelo.setColumnIdentifiers(columns);
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {

			});
			
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.setModel(modelo);
			scrollPane.setViewportView(table);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(Color.LIGHT_GRAY);
			panel_2.setForeground(Color.WHITE);
			panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agregados", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
			panel_2.setBounds(343, 195, 251, 197);
			panel.add(panel_2);
			panel_2.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 172, 254, -158);
			scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			panel_2.add(scrollPane_1);
			
			modelo_1 = new DefaultTableModel();
			String []columns2 = {"Codigo","Tipo","Marca","Modelo"};
			modelo_1.setColumnIdentifiers(columns2);
			table_1 = new JTable();
			table_1.addMouseListener(new MouseAdapter() {

			});
			
			table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table_1.setModel(modelo_1);
			scrollPane_1.setViewportView(table_1);
			
			JButton btnNewButton = new JButton("");
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\EN VEREMOS FLECHA DERECHA.png"));
			btnNewButton.setBounds(271, 240, 62, 33);
			panel.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("");
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\flecha-izquierda.png"));
			btnNewButton_1.setBounds(271, 315, 62, 33);
			panel.add(btnNewButton_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 402, 606, 38);
			contentPanel.add(buttonPane);
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
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
