package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import logico.Administrativo;
import logico.Componente;
import logico.OrdenCompra;
import logico.Tienda;
import logico.Proveedor;

import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class RegPedido extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JSpinner spnCantidad;
	private Componente componente = null;
	private Proveedor proveedor = null;
	private float total = 0.0f;
	private JLabel lblTotal;
	

	/**
	 * Launch the application.
	 */

	public RegPedido(Componente c, Proveedor p) {
		setForeground(UIManager.getColor("Button.focus"));
		setBackground(UIManager.getColor("Button.focus"));
		this.componente=c;
		this.proveedor=p;
		setTitle("Ordenes De Compra");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 723, 493);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(new Color(240, 255, 255));
		contentPanel.setBackground(new Color(240, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setForeground(Color.DARK_GRAY);
			panel.setBackground(new Color(240, 255, 255));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Componente:");
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBackground(UIManager.getColor("Button.focus"));
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblNewLabel.setBounds(12, 13, 197, 40);
			panel.add(lblNewLabel);
			
			JLabel lblSerie = new JLabel("Serie: "+componente.getSerie());
			lblSerie.setForeground(Color.BLACK);
			lblSerie.setBackground(UIManager.getColor("Button.focus"));
			lblSerie.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblSerie.setBounds(12, 66, 291, 24);
			panel.add(lblSerie);
			
			JLabel lblMarca = new JLabel("Marca: "+componente.getMarca());
			lblMarca.setBackground(UIManager.getColor("Button.focus"));
			lblMarca.setForeground(Color.BLACK);
			lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblMarca.setBounds(12, 103, 291, 24);
			panel.add(lblMarca);
			
			JLabel lblModelo = new JLabel("Modelo: "+componente.getModelo());
			lblModelo.setForeground(Color.BLACK);
			lblModelo.setBackground(UIManager.getColor("Button.focus"));
			lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblModelo.setBounds(12, 140, 291, 24);
			panel.add(lblModelo);
			
			JLabel lblProveedor = new JLabel("Proveedor:");
			lblProveedor.setForeground(Color.BLACK);
			lblProveedor.setBackground(UIManager.getColor("Button.focus"));
			lblProveedor.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblProveedor.setBounds(392, 13, 206, 40);
			panel.add(lblProveedor);
			
			JLabel lblNombre = new JLabel("Nombre: "+proveedor.getNombre());
			lblNombre.setBackground(UIManager.getColor("Button.focus"));
			lblNombre.setForeground(Color.BLACK);
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNombre.setBounds(392, 70, 268, 24);
			panel.add(lblNombre);
			
			JLabel lblTelefono = new JLabel("Telefono: "+proveedor.getTelefono());
			lblTelefono.setBackground(UIManager.getColor("Button.focus"));
			lblTelefono.setForeground(Color.BLACK);
			lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblTelefono.setBounds(392, 107, 282, 24);
			panel.add(lblTelefono);
			
			JLabel lblDireccion = new JLabel("Direccion: "+proveedor.getTelefono());
			lblDireccion.setBackground(UIManager.getColor("Button.focus"));
			lblDireccion.setForeground(Color.BLACK);
			lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblDireccion.setBounds(392, 140, 282, 24);
			panel.add(lblDireccion);
			
			JSeparator separator = new JSeparator();
			separator.setForeground(Color.WHITE);
			separator.setBackground(Color.WHITE);
			separator.setOrientation(SwingConstants.VERTICAL);
			separator.setBounds(342, 13, 7, 160);
			panel.add(separator);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setForeground(Color.WHITE);
			separator_1.setBackground(Color.WHITE);
			separator_1.setBounds(12, 189, 675, 2);
			panel.add(separator_1);
			
			JLabel lblCantidades = new JLabel("Cantidades:");
			lblCantidades.setBackground(UIManager.getColor("Button.focus"));
			lblCantidades.setForeground(Color.BLACK);
			lblCantidades.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblCantidades.setBounds(289, 199, 168, 24);
			panel.add(lblCantidades);
			
			JLabel lblMinima = new JLabel("Minima: "+componente.getCantMinima());
			lblMinima.setBackground(UIManager.getColor("Button.focus"));
			lblMinima.setForeground(Color.BLACK);
			lblMinima.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblMinima.setBounds(12, 247, 138, 24);
			panel.add(lblMinima);
			
			JLabel lblReal = new JLabel("Real: "+componente.getCantReal());
			lblReal.setBackground(UIManager.getColor("Button.focus"));
			lblReal.setForeground(Color.BLACK);
			lblReal.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblReal.setBounds(319, 247, 138, 24);
			panel.add(lblReal);
			
			JLabel lblMaxima = new JLabel("Maxima: "+componente.getCantMaxima());
			lblMaxima.setBackground(UIManager.getColor("Button.focus"));
			lblMaxima.setForeground(Color.BLACK);
			lblMaxima.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblMaxima.setBounds(549, 247, 138, 24);
			panel.add(lblMaxima);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setForeground(Color.WHITE);
			separator_2.setBackground(Color.WHITE);
			separator_2.setBounds(12, 301, 675, 2);
			panel.add(separator_2);
			
			spnCantidad = new JSpinner();
			spnCantidad.setForeground(new Color(0, 0, 255));
			spnCantidad.setBackground(UIManager.getColor("Button.focus"));
			spnCantidad.addChangeListener(new ChangeListener() {
				  @Override
				  public void stateChanged(ChangeEvent e) {
				   total = (componente.getPrecioCompra()*Integer.parseInt(spnCantidad.getValue().toString()));
				  
				  
				   lblTotal.setText("Total: "+total);
				  }
				});
			spnCantidad.setModel(new SpinnerNumberModel(1, 1, componente.getCantMaxima()-componente.getCantReal(), 1));
			spnCantidad.setBounds(186, 356, 85, 24);
			panel.add(spnCantidad);
			
			JLabel lblNewLabel_1 = new JLabel("Cantidad A Comprar: ");
			lblNewLabel_1.setForeground(Color.BLACK);
			lblNewLabel_1.setBackground(UIManager.getColor("Button.focus"));
			lblNewLabel_1.setBounds(12, 356, 164, 24);
			panel.add(lblNewLabel_1);
			
			JLabel lblComprar = new JLabel("Comprar: ");
			lblComprar.setForeground(Color.BLACK);
			lblComprar.setBackground(UIManager.getColor("Button.focus"));
			lblComprar.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblComprar.setBounds(303, 316, 154, 24);
			panel.add(lblComprar);
			
			lblTotal = new JLabel("Total: "+total);
			lblTotal.setForeground(Color.BLACK);
			lblTotal.setBackground(UIManager.getColor("Button.focus"));
			lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblTotal.setBounds(460, 355, 154, 24);
			panel.add(lblTotal);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setForeground(UIManager.getColor("Button.focus"));
			buttonPane.setBackground(new Color(240, 255, 255));
			buttonPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Hacer Pedido");
				okButton.setForeground(UIManager.getColor("Button.focus"));
				okButton.setBackground(UIManager.getColor("Button.focus"));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(total<=proveedor.getLimCredito()) {
							
							OrdenCompra oc = new OrdenCompra("O-"+Tienda.getInstance().getCod_OrdenC(), new Date(), c, p, Integer.parseInt(spnCantidad.getValue().toString()), total,(Administrativo)Tienda.getInstance().getUser());
							Tienda.getInstance().InsertarOrden(oc);
							proveedor.setLimCredito(proveedor.getLimCredito()-total);
							c.setCantReal(c.getCantReal()+Integer.parseInt(spnCantidad.getValue().toString()));
							JOptionPane.showMessageDialog(null, "Se ha creado la orden de compra, por favor recuerde pagar a los proveedores");
							dispose();
						}else {
							JOptionPane.showMessageDialog(null, "La compañia no cuenta con sufienciente Credito con el proveedor: "+proveedor.getNombre());
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setForeground(UIManager.getColor("Button.focus"));
				cancelButton.setBackground(UIManager.getColor("Button.focus"));
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
