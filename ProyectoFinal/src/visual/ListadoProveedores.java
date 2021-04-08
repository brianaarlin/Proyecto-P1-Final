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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListadoProveedores extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	public static DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListadoProveedores dialog = new ListadoProveedores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListadoProveedores() {
		setTitle("Listado de proveedores");
		setBounds(100, 100, 770, 461);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Proveedores",
					TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(0, 0, 754, 389);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 30, 734, 339);
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				panel.add(scrollPane);

				modelo = new DefaultTableModel();
				String columns[] = { "Código", "Nombre", "Teléfono", "Dirección", "Lim.Crédito" };
				modelo.setColumnIdentifiers(columns);
				table = new JTable();
				table.addMouseListener(new MouseAdapter() {
				});
				table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				table.setModel(modelo);
				scrollPane.setViewportView(table);
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton btnNewButton = new JButton("Realizar pago");
					buttonPane.add(btnNewButton);
				}
				{
					JButton okButton = new JButton("Informaci\u00F3n");
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

	}
}
