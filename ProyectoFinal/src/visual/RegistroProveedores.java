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

import logico.Componente;

import logico.DiscosDuros;
import logico.MemoriaRAM;

import logico.Microprocesadores;

import logico.Proveedor;
import logico.TarjetaMadre;
import logico.Tienda;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class RegistroProveedores extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtEmpresa;
	private JTextField txtCredito;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	public static DefaultTableModel modelo;
	public static DefaultTableModel modelo_1;
	public static Object[] fila;
	private JTable table;
	private JTable table_1;
	private static ArrayList<Componente> agregados = new ArrayList<Componente>();
	private static ArrayList<Componente> disponibles = new ArrayList<Componente>();
	private int cont = 0;
	private Componente q = null;
	private JButton btnAgregar;
	private JButton btnRemover;
	private JButton okButton;
	private JComboBox cbxFiltro;

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
		setModal(true);
		setResizable(false);
		setTitle("Registro de Proveedores");
		setBounds(100, 100, 622, 479);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		for(Componente c: Tienda.getInstance().getComponentes()){
			disponibles.add(c);
		}
		
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(0, 0, 604, 406);
			contentPanel.add(panel);
			panel.setLayout(null);

			JLabel lblCodigo = new JLabel("C\u00F3digo:");
			lblCodigo.setBounds(10, 11, 62, 14);
			panel.add(lblCodigo);

			txtCodigo = new JTextField();
			txtCodigo.setBounds(10, 30, 130, 23);
			panel.add(txtCodigo);
			txtCodigo.setColumns(10);

			JLabel lblEmpresa = new JLabel("Empresa:");
			lblEmpresa.setBounds(173, 11, 62, 14);
			panel.add(lblEmpresa);

			txtEmpresa = new JTextField();
			txtEmpresa.setBounds(173, 30, 223, 23);
			panel.add(txtEmpresa);
			txtEmpresa.setColumns(10);

			JLabel lblCredito = new JLabel("Credito Disponible:");
			lblCredito.setBounds(10, 65, 106, 14);
			panel.add(lblCredito);

			txtCredito = new JTextField();
			txtCredito.setBounds(10, 85, 130, 23);
			panel.add(txtCredito);
			txtCredito.setColumns(10);

			JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
			lblTelefono.setBounds(429, 11, 62, 14);
			panel.add(lblTelefono);

			txtTelefono = new JTextField();
			txtTelefono.setBounds(429, 30, 165, 23);
			panel.add(txtTelefono);
			txtTelefono.setColumns(10);

			JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
			lblDireccion.setBounds(173, 65, 62, 14);
			panel.add(lblDireccion);

			txtDireccion = new JTextField();
			txtDireccion.setBounds(173, 85, 421, 23);
			panel.add(txtDireccion);
			txtDireccion.setColumns(10);

			JLabel lblFiltro = new JLabel("Filtro:");
			lblFiltro.setBounds(10, 130, 71, 14);
			panel.add(lblFiltro);

			JComboBox cbxFiltro = new JComboBox();
			cbxFiltro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CargarTabla();
					CargarTablaVendidos();
				}
			});
			cbxFiltro.setModel(new DefaultComboBoxModel(new String[] {"<Todos>", "Discos Duros", "Memorias RAM", "Tarjeta Madre", "MicroProcesadores"}));
			cbxFiltro.setToolTipText("");
			cbxFiltro.setEditable(true);
			cbxFiltro.setBounds(10, 150, 130, 23);
			panel.add(cbxFiltro);

			JPanel panel_1 = new JPanel();
			panel_1.setForeground(Color.WHITE);
			panel_1.setBackground(Color.LIGHT_GRAY);
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Disponibles",
					TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
			panel_1.setBounds(10, 195, 251, 197);
			panel.add(panel_1);
			panel_1.setLayout(new BorderLayout(0, 0));

			JScrollPane scrollPane = new JScrollPane();
			scrollPane.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			scrollPane.setBounds(222, 170, -210, -140);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			panel_1.add(scrollPane);

			modelo = new DefaultTableModel();
			String[] columns = { "Codigo", "Tipo", "Marca", "Modelo" };
			modelo.setColumnIdentifiers(columns);
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					table_1.clearSelection();
					int seleccion = table.getSelectedRow();
					int modelrow = table.convertRowIndexToModel(seleccion);
					if (seleccion != -1) {
						btnAgregar.setEnabled(true);
						btnRemover.setEnabled(false);

						q = disponibles.get(seleccion);
					} else {
						btnAgregar.setEnabled(false);
						btnRemover.setEnabled(false);
						q = null;
					}
				}

			});

			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.setModel(modelo);
			scrollPane.setViewportView(table);

			JButton btnAgregar = new JButton("");
			btnAgregar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cont++;
					disponibles.remove(q);
					agregados.add(q);
					CargarTabla();
					CargarTablaVendidos();
					btnAgregar.setEnabled(false);
					q = null;
					if (cont > 0) {
						okButton.setEnabled(true);
					} else {
						okButton.setEnabled(false);
					}
				}
			});
			btnAgregar.setIcon(
					new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\EN VEREMOS FLECHA DERECHA.png"));
			btnAgregar.setBounds(271, 240, 62, 33);
			panel.add(btnAgregar);

			JButton btnRemover = new JButton("");
			btnRemover.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cont--;
					agregados.remove(q);
					disponibles.add(q);
					CargarTabla();
					CargarTablaVendidos();
					q = null;
					if (cont > 0) {
						okButton.setEnabled(true);
					} else {
						okButton.setEnabled(false);
					}
				}
			});
			btnRemover.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\P1\\Proyecto Imagenes\\flecha-izquierda.png"));
			btnRemover.setBounds(271, 315, 62, 33);
			panel.add(btnRemover);

			JPanel panel_2 = new JPanel();
			panel_2.setBackground(Color.LIGHT_GRAY);
			panel_2.setForeground(Color.WHITE);
			panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Agregados",
					TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
			panel_2.setBounds(343, 195, 251, 197);
			panel.add(panel_2);
			panel_2.setLayout(new BorderLayout(0, 0));

			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 172, 254, -158);
			scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			panel_2.add(scrollPane_1);

			modelo_1 = new DefaultTableModel();
			String[] columns2 = { "Codigo", "Tipo", "Marca", "Modelo" };
			modelo_1.setColumnIdentifiers(columns2);
			table_1 = new JTable();
			table_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					table.clearSelection();
					int seleccion = table_1.getSelectedRow();
					int modelrow = table_1.convertRowIndexToModel(seleccion);
					if (seleccion != -1) {
						btnAgregar.setEnabled(false);
						btnRemover.setEnabled(true);

						q = agregados.get(seleccion);
					} else {
						btnAgregar.setEnabled(false);
						btnRemover.setEnabled(false);
						q = null;
					}
				}

			});

			table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table_1.setModel(modelo_1);
			scrollPane_1.setViewportView(table_1);

		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 402, 606, 38);
			contentPanel.add(buttonPane);
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Proveedor p = new Proveedor(txtEmpresa.getText(), txtCodigo.getText(), txtTelefono.getText(),
								txtDireccion.getText(), Float.parseFloat(txtCredito.getText()));
						Tienda.getInstance().insertarProveedor(p);
						for (Componente c : agregados) {
							p.insertarcomponentes(c);
						}
						JOptionPane.showMessageDialog(null, "Se ha registrado correctamente el proveedor");
						clear();
					}

				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						disponibles.removeAll(disponibles);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		CargarTabla();
		CargarTablaVendidos();
	}

	private void CargarTabla() {
		switch (cbxFiltro.getSelectedIndex()) {
		case 0:
			modelo.setRowCount(0);
			fila = new Object[modelo.getColumnCount()];
			for (Componente c : disponibles) {
				fila[0] = c.getSerie();
				if (c instanceof DiscosDuros) {
					fila[1] = "Discos Duros";
				}
				if (c instanceof MemoriaRAM) {
					fila[1] = "Memoria Ram";
				}
				if (c instanceof Microprocesadores) {
					fila[1] = "Microprocesadores";
				}
				if (c instanceof TarjetaMadre) {
					fila[1] = "Tarjeta Madre";
				}
				fila[2] = c.getMarca();
				fila[3] = c.getModelo();
				modelo.addRow(fila);
			}
			break;
		case 1:
			modelo.setRowCount(0);
			fila = new Object[modelo.getColumnCount()];
			for (Componente c : disponibles) {
				if (c instanceof DiscosDuros) {
					fila[0] = c.getSerie();
					fila[1] = "Discos Duros";
					fila[2] = c.getMarca();
					fila[3] = c.getModelo();
					modelo.addRow(fila);
				}
			}
			break;
		case 2:
			modelo.setRowCount(0);
			fila = new Object[modelo.getColumnCount()];
			for (Componente c : disponibles) {
				if (c instanceof MemoriaRAM) {
					fila[0] = c.getSerie();
					fila[1] = "Memoria Ram";
					fila[2] = c.getMarca();
					fila[3] = c.getModelo();
					modelo.addRow(fila);
				}
			}
			break;
		case 3:
			modelo.setRowCount(0);
			fila = new Object[modelo.getColumnCount()];
			for (Componente c : disponibles) {
				if (c instanceof Microprocesadores) {
					fila[0] = c.getSerie();
					fila[1] = "Microprocesadores";
					fila[2] = c.getMarca();
					fila[3] = c.getModelo();
					modelo.addRow(fila);
				}
			}
			break;
		case 4:
			modelo.setRowCount(0);
			fila = new Object[modelo.getColumnCount()];
			for (Componente c : disponibles) {
				if (c instanceof TarjetaMadre) {
					fila[0] = c.getSerie();
					fila[1] = "Tarjeta Madre";
					fila[2] = c.getMarca();
					fila[3] = c.getModelo();
					modelo.addRow(fila);
				}
			}
			break;
		}

	}

	private void CargarTablaVendidos() {
		switch (cbxFiltro.getSelectedIndex()) {
		case 0:
			modelo_1.setRowCount(0);
			fila = new Object[modelo_1.getColumnCount()];
			for (Componente c : agregados) {
				fila[0] = c.getSerie();
				if (c instanceof DiscosDuros) {
					fila[1] = "Discos Duros";
				}
				if (c instanceof MemoriaRAM) {
					fila[1] = "Memoria Ram";
				}
				if (c instanceof Microprocesadores) {
					fila[1] = "Microprocesadores";
				}
				if (c instanceof TarjetaMadre) {
					fila[1] = "Tarjeta Madre";
				}
				fila[2] = c.getMarca();
				fila[3] = c.getModelo();
				modelo_1.addRow(fila);
			}
			break;
		case 1:
			modelo_1.setRowCount(0);
			fila = new Object[modelo_1.getColumnCount()];
			for (Componente c : agregados) {
				if (c instanceof DiscosDuros) {
					fila[0] = c.getSerie();
					fila[1] = "Discos Duros";
					fila[2] = c.getMarca();
					fila[3] = c.getModelo();
					modelo_1.addRow(fila);
				}
			}
			break;
		case 2:
			modelo_1.setRowCount(0);
			fila = new Object[modelo_1.getColumnCount()];
			for (Componente c : agregados) {
				if (c instanceof MemoriaRAM) {
					fila[0] = c.getSerie();
					fila[1] = "Memoria Ram";
					fila[2] = c.getMarca();
					fila[3] = c.getModelo();
					modelo_1.addRow(fila);
				}
			}
			break;
		case 3:
			modelo_1.setRowCount(0);
			fila = new Object[modelo_1.getColumnCount()];
			for (Componente c : agregados) {
				if (c instanceof Microprocesadores) {
					fila[0] = c.getSerie();
					fila[1] = "Microprocesadores";
					fila[2] = c.getMarca();
					fila[3] = c.getModelo();
					modelo_1.addRow(fila);
				}
			}
			break;
		case 4:
			modelo_1.setRowCount(0);
			fila = new Object[modelo_1.getColumnCount()];
			for (Componente c : agregados) {
				if (c instanceof TarjetaMadre) {
					fila[0] = c.getSerie();
					fila[1] = "Tarjeta Madre";
					fila[2] = c.getMarca();
					fila[3] = c.getModelo();
					modelo_1.addRow(fila);
				}
			}
			break;
		}
	}
		private void clear() {
			txtCodigo.setText("P-"+Tienda.getInstance().getCod_proveedores());
			txtEmpresa.setText("");
			txtDireccion.setText("");
			txtTelefono.setText("");
			txtCredito.setText("");
			modelo.setRowCount(0);
			modelo_1.setRowCount(0);
			disponibles.removeAll(disponibles);
			for(Componente c : Tienda.getInstance().getComponentes()) {
				disponibles.add(c);
			}
			agregados.removeAll(agregados);
			
			CargarTabla();
			CargarTablaVendidos();
			
		}
	}

