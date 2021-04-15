package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegCombo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static DefaultTableModel modelo;
	public static DefaultTableModel modelo_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegCombo dialog = new RegCombo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegCombo() {
		setTitle("Registrar Combos");
		setBounds(100, 100, 644, 493);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(240, 255, 255));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Registro",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(0, 0, 628, 421);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Nombre:");
				lblNewLabel.setBounds(27, 29, 60, 23);
				panel.add(lblNewLabel);
			}

			textField = new JTextField();
			textField.setBounds(97, 29, 170, 23);
			panel.add(textField);
			textField.setColumns(10);

			JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
			lblNewLabel_1.setBounds(351, 29, 54, 23);
			panel.add(lblNewLabel_1);

			textField_1 = new JTextField();
			textField_1.setBounds(415, 29, 170, 23);
			panel.add(textField_1);
			textField_1.setColumns(10);

			JLabel lblNewLabel_2 = new JLabel("Filtro");
			lblNewLabel_2.setBounds(27, 91, 46, 23);
			panel.add(lblNewLabel_2);

			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(97, 91, 170, 23);
			panel.add(comboBox);

			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(240, 255, 255));
			panel_1.setBorder(new TitledBorder(null, "Disponibles", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel_1.setBounds(27, 155, 240, 235);
			panel.add(panel_1);
			panel_1.setLayout(new BorderLayout(0, 0));

			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(234, 226, -229, -191);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			panel_1.add(scrollPane);

			modelo = new DefaultTableModel();
			String columns[] = { "Serie", "Marca", "Modelo", "Precio" };
			modelo.setColumnIdentifiers(columns);
			table = new JTable();
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.addMouseListener(new MouseAdapter() {
				
			});
			table.setModel(modelo);
			scrollPane.setViewportView(table);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(240, 255, 255));
			panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agregados", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_2.setBounds(351, 155, 240, 235);
			panel.add(panel_2);
			panel_2.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(234, 226, -229, -191);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			panel_2.add(scrollPane_1);
			
			modelo_1 = new DefaultTableModel();
			String []columns2 = {"Serie","Marca","Modelo","Precio"};
			modelo_1.setColumnIdentifiers(columns2);
			table_1 = new JTable();
			table_1.addMouseListener(new MouseAdapter() {
				
			});
			table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table_1.setModel(modelo_1);
			scrollPane_1.setViewportView(table_1);
			
			JButton btnNewButton = new JButton("");
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\EN VEREMOS FLECHA DERECHA.png"));
			btnNewButton.setBounds(279, 213, 60, 30);
			panel.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("");
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\flecha-izquierda.png"));
			btnNewButton_1.setBounds(279, 300, 60, 30);
			panel.add(btnNewButton_1);
			
			
			
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setBackground(new Color(240, 255, 255));
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
}}
