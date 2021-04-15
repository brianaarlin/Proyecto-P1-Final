package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logico.Cliente;
import logico.Componente;
import logico.DiscosDuros;
import logico.MemoriaRAM;
import logico.Microprocesadores;
import logico.TarjetaMadre;
import logico.Persona;
import logico.Tienda;
import logico.Proveedor;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class ListadoPedido extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;

	public static DefaultTableModel modelo;
	public static Object[] fila;
	
	private int seleccion = -1;
	private int modelrow = -1;
	private JButton btnSeleccionar;
	
	private Componente component = null;
	private Proveedor proveedor = null;
	
	public ListadoPedido() {
		setTitle("Generar Orden de Compra");
		setForeground(UIManager.getColor("Button.focus"));
		setBackground(UIManager.getColor("Button.focus"));
		setBounds(100, 100, 754, 461);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(UIManager.getColor("Button.focus"));
		contentPanel.setBackground(UIManager.getColor("Button.focus"));
		contentPanel.setBorder(new LineBorder(new Color(184, 134, 11)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(240, 255, 255));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					
					modelo = new DefaultTableModel();
					String columns[] = {"Tipo","Cant.Mínina","Cant. Real","Cant. Máxima","Serie","modelo","Marca"};
					modelo.setColumnIdentifiers(columns);
					table = new JTable();
					table.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							
							seleccion = table.getSelectedRow();
							modelrow = table.convertRowIndexToModel(seleccion);
								if(seleccion!=-1 ) {
									
									btnSeleccionar.setEnabled(true);
									component = Tienda.getInstance().buscarComponente(modelo.getValueAt(seleccion, 4).toString());
									//btnSeleccionar.setEnabled(true);
								}else {
									btnSeleccionar.setEnabled(false);
									//btnEliminar.setEnabled(false);
									//btnSeleccionar.setEnabled(false);
								}
							
						}
					});
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table.setModel(modelo);
					scrollPane.setViewportView(table);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new LineBorder(new Color(184, 134, 11)));
			buttonPane.setBackground(new Color(240, 255, 255));
			buttonPane.setForeground(new Color(240, 255, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnSeleccionar = new JButton("Seleccionar");
				btnSeleccionar.setForeground(Color.BLACK);
				btnSeleccionar.setBackground(UIManager.getColor("Panel.background"));
				btnSeleccionar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						proveedor  = Tienda.getInstance().buscarProveedores(component.getSerie());
						if(proveedor !=null) {
						RegPedido a = new RegPedido(component,proveedor);
						dispose();
						a.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "No se ha encontrado un proveedor para el componente.\nDebe registrar al menos un proveedor que suministre dicho componente. ", "Información", JOptionPane.INFORMATION_MESSAGE);
					}
					}
				});
				btnSeleccionar.setEnabled(false);
				btnSeleccionar.setActionCommand("OK");
				buttonPane.add(btnSeleccionar);
				getRootPane().setDefaultButton(btnSeleccionar);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setForeground(Color.BLACK);
				cancelButton.setBackground(UIManager.getColor("Panel.background"));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		cargarTabla();
	}


	private void cargarTabla() {
		modelo.setRowCount(0);
		fila = new Object[modelo.getColumnCount()];
		for(Componente c : Tienda.getInstance().getComponentes()){
			if(c.chequearpedido()) {
				
				if(c instanceof DiscosDuros) {
					fila[0] = "Disco Duro";
				}
				if(c instanceof TarjetaMadre) {
					fila[0] = "MotherBoard";
				}
				if(c instanceof Microprocesadores) {
					fila[0] = "Microprocesadores";
				}
				if(c instanceof MemoriaRAM) {
					fila[0] = "Memoria Ram";
				}
			fila[1]=c.getCantMinima();
			fila[2]=c.getCantReal();
			fila[3]=c.getCantMaxima();
			fila[4]=c.getSerie();
			fila[5] = c.getModelo();
			fila[6] = c.getMarca();
			modelo.addRow(fila);
		}
		
	}
		
	}

}
