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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Facturacion extends JDialog {
	
	public static DefaultTableModel modelo;
	public static DefaultTableModel modelo_1;
	private JTable table;
	private JTable table_1;

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Facturacion dialog = new Facturacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Facturacion() {
		setTitle("Facturacion");
		setBounds(100, 100, 719, 478);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Elementos a Seleccionar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(0, 137, 703, 269);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setForeground(Color.WHITE);
				panel_1.setBackground(Color.LIGHT_GRAY);
				panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBounds(10, 61, 297, 197);
				panel.add(panel_1);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setBounds(289, 263, -269, -244);
					panel_1.add(scrollPane);
					
					modelo = new DefaultTableModel();
					String []columns = {"Codigo","Articulo","Cantidad","Precio","Importe"};
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
					panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					panel_2.setBounds(396, 61, 297, 197);
					panel.add(panel_2);
					panel_2.setLayout(new BorderLayout(0, 0));
					
					JScrollPane scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(10, 172, 254, -158);
					scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
					panel_2.add(scrollPane_1);
					
					modelo_1 = new DefaultTableModel();
					String []columns2 = {"Codigo","Articulo","Cantidad","Precio","Importe"};
					modelo_1.setColumnIdentifiers(columns2);
					table_1 = new JTable();
					table_1.addMouseListener(new MouseAdapter() {

					});
					
					table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table_1.setModel(modelo_1);
					scrollPane_1.setViewportView(table_1);
				}
			}
			{
				JButton btnNewButton = new JButton("");
				btnNewButton.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\EN VEREMOS FLECHA DERECHA.png"));
				btnNewButton.setBounds(317, 108, 70, 32);
				panel.add(btnNewButton);
			}
			{
				JButton btnNewButton_1 = new JButton("");
				btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\flecha-izquierda.png"));
				btnNewButton_1.setBounds(317, 192, 70, 32);
				panel.add(btnNewButton_1);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Todos>", "Disco Duro", "Combos", "Tarjeta Madre", "Microprocesador", "Memoria RAM"}));
				comboBox.setBounds(10, 30, 297, 20);
				panel.add(comboBox);
			}
		}
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Facturar");
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
