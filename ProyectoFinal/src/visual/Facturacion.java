package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Facturacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tableComponente;
	private JTable tableFactura;
	public static DefaultTableModel model;
	public static DefaultTableModel model1;
	private String numSerie;
	private static Object[] filas;
	private String codigox;
	private static Object[] filasx;
	private JTextField txtCodigoFactura;
	private JTextField txtNumeroComponentes;

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
		setBounds(100, 100, 836, 545);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 820, 473);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Elementos a Seleccionar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 800, 310);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox cbxFiltro = new JComboBox();
		cbxFiltro.setModel(new DefaultComboBoxModel(new String[] {"<Todos>", "Disco Duro", "Combos", "Tarjeta Madre", "Microprocesador", "Memoria Ram"}));
		cbxFiltro.setBounds(10, 27, 301, 20);
		panel_1.add(cbxFiltro);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 58, 301, 241);
		panel_1.add(scrollPane);
		
		tableComponente = new JTable();
		tableComponente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = tableComponente.getSelectedRow();
				numSerie = String.valueOf(tableComponente.getValueAt(index, 0));
				
			}
		});
		model = new DefaultTableModel();
		String[] column = {"Codigo","Articulo","Cantidad","Precio","Importe"};
		filas = new Object[5];
		model.setColumnIdentifiers(column);
		tableComponente.setModel(model);
		scrollPane.setViewportView(tableComponente);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(489, 58, 301, 241);
		panel_1.add(scrollPane_1);
		
		tableFactura = new JTable();
		tableFactura.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = tableFactura.getSelectedRow();

				codigox = String.valueOf(tableFactura.getValueAt(index, 0));

			}
		});
		model1 = new DefaultTableModel();
		String[] column1 = { "Codigo","Articulo","Cantidad","Precio","Importe" };
		filasx = new Object[4];
		model1.setColumnIdentifiers(column1);
		tableFactura.setModel(model1);
		scrollPane_1.setViewportView(tableFactura);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\EN VEREMOS FLECHA DERECHA.png"));
		btnNewButton.setBounds(362, 91, 66, 33);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\flecha-izquierda.png"));
		btnNewButton_1.setBounds(362, 199, 66, 33);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Seleccionar Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 349, 239, 113);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnSeleccionarCliente = new JButton("Seleccionar Cliente");
		btnSeleccionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroCliente aux = new RegistroCliente();
				aux.setVisible(true);
			}
		});
		btnSeleccionarCliente.setBounds(27, 16, 187, 97);
		panel_2.add(btnSeleccionarCliente);
		btnSeleccionarCliente.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\REG CLIENTE.png"));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Agregar Articulo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(269, 349, 239, 113);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnAnadirArticulo = new JButton("New button");
		btnAnadirArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarArticulo aux = new RegistrarArticulo();
				aux.setVisible(true);
			}
		});
		btnAnadirArticulo.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\Sin t\u00EDtulo-2.png"));
		btnAnadirArticulo.setBounds(27, 16, 187, 97);
		panel_3.add(btnAnadirArticulo);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Factura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(533, 349, 277, 113);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo Factura:");
		lblNewLabel.setBounds(10, 26, 93, 14);
		panel_4.add(lblNewLabel);
		
		txtCodigoFactura = new JTextField();
		txtCodigoFactura.setBounds(133, 23, 86, 20);
		panel_4.add(txtCodigoFactura);
		txtCodigoFactura.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Precio Total:");
		lblNewLabel_1.setBounds(10, 57, 78, 14);
		panel_4.add(lblNewLabel_1);
		
		JTextField txtPrecioTotal = new JTextField();
		txtPrecioTotal.setBounds(133, 54, 86, 20);
		panel_4.add(txtPrecioTotal);
		txtPrecioTotal.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("# De Componentes:");
		lblNewLabel_2.setBounds(10, 88, 123, 14);
		panel_4.add(lblNewLabel_2);
		
		txtNumeroComponentes = new JTextField();
		txtNumeroComponentes.setBounds(133, 85, 86, 20);
		panel_4.add(txtNumeroComponentes);
		txtNumeroComponentes.setColumns(10);
		{
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
