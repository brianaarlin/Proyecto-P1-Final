package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logico.Factura;


import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;

public class ListadoFacturacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	
	public static DefaultTableModel modelo;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListadoFacturacion dialog = new ListadoFacturacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListadoFacturacion() {
		setTitle("Listado Facturas");
		setBounds(100, 100, 620, 460);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(240, 255, 255));
			panel.setBounds(0, 0, 604, 388);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 35, 584, 342);
				panel.add(scrollPane);
				{
					modelo = new DefaultTableModel();
					String columns[] = {"Código","Cliente","Vendedor","Total","Fecha","Cant.Artículos"};
					modelo.setColumnIdentifiers(columns);
					table = new JTable();
					table.addMouseListener(new MouseAdapter() {
					});
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table.setModel(modelo);
					scrollPane.setViewportView(table);

				}
			}
			{
				JLabel lblNewLabel = new JLabel("Buscador:");
				lblNewLabel.setBounds(10, 10, 67, 14);
				panel.add(lblNewLabel);
			}
			{
				textField = new JTextField();
				textField.setBounds(74, 7, 116, 20);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Filtro:");
				lblNewLabel_1.setBounds(282, 10, 46, 14);
				panel.add(lblNewLabel_1);
			}
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Todas>", "Pagadas", "Por Cobrar", "Vencidas"}));
			comboBox.setBounds(338, 7, 116, 20);
			panel.add(comboBox);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(240, 255, 255));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Informacion");
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
