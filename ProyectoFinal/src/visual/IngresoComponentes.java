package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import logico.Componente;

import logico.DiscosDuros;
import logico.MemoriaRAM;
import logico.Microprocesadores;

import logico.TarjetaMadre;
import logico.Tienda;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class IngresoComponentes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtSerie;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JRadioButton rdbtnMicro;
	private JRadioButton rdbtnMemoriaRam;
	private JRadioButton rdbtnTarjeta;
	private JRadioButton rdbtnDiscoDuro;
	private JPanel panel_Disco;
	private JPanel panelMicro;
	private JPanel panelTarjeta;
	private JPanel panel_RAM;
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
	private JLabel lblunidadAlmacenamiento;
	private JLabel lblalmacenamiento;
	private JLabel lblTipoconexion;
	private ArrayList<String> listaconexiones;
	private JSpinner spnAlmacenamiento;
	private JSpinner spnVenta;
	private JSpinner spnCompra;
	private JSpinner spnCantMinima;
	private JSpinner spnCantMaxima;
	private JSpinner spnCantReal;
	private JComboBox cbxUnidadAlmac;
	private JComboBox cbxTipoconexion;
	private JLabel lblCantidad_Memoria;
	private JSpinner spn_CantidadMemoria;
	private JLabel lblTipo_Memoria;
	private JComboBox cbx_TipoMemoria;
	private JLabel lblMemoria;
	private JComboBox cbxMemoria;
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
		setBounds(100, 100, 657, 498);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(240, 255, 255));
			panel.setBounds(0, 0, 641, 421);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(240, 255, 255));
				panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n General", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBounds(10, 5, 621, 122);
				panel.add(panel_1);
				panel_1.setLayout(null);
				
				JLabel lblSerie = new JLabel("Serie:");
				lblSerie.setBounds(10, 27, 36, 23);
				panel_1.add(lblSerie);
				
				txtSerie = new JTextField();
				txtSerie.setBounds(47, 27, 46, 23);
				panel_1.add(txtSerie);
				txtSerie.setColumns(10);
				
				JLabel lblMarca = new JLabel("Marca:");
				lblMarca.setBounds(96, 27, 46, 23);
				panel_1.add(lblMarca);
				
				txtMarca = new JTextField();
				txtMarca.setBounds(138, 27, 86, 23);
				panel_1.add(txtMarca);
				txtMarca.setColumns(10);
				
				JLabel lblModelo = new JLabel("Modelo:");
				lblModelo.setBounds(230, 27, 46, 23);
				panel_1.add(lblModelo);
				
				txtModelo = new JTextField();
				txtModelo.setBounds(281, 27, 86, 23);
				panel_1.add(txtModelo);
				txtModelo.setColumns(10);
				
				JLabel lblVenta = new JLabel("Venta:");
				lblVenta.setBounds(502, 27, 46, 23);
				panel_1.add(lblVenta);
				
				JLabel lblCantMinima = new JLabel("Cantidad M\u00EDinima:");
				lblCantMinima.setBounds(16, 75, 105, 23);
				panel_1.add(lblCantMinima);
				
				JSpinner spnCantMinima = new JSpinner();
				spnCantMinima.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
				spnCantMinima.setBounds(131, 75, 76, 23);
				panel_1.add(spnCantMinima);
				
				JLabel lblCantMaxima = new JLabel("Cantidad M\u00E1xima:");
				lblCantMaxima.setBounds(223, 75, 110, 23);
				panel_1.add(lblCantMaxima);
				
				JSpinner spnCantMaxima = new JSpinner();
				spnCantMaxima.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
				spnCantMaxima.setBounds(332, 75, 76, 23);
				panel_1.add(spnCantMaxima);
				
				JLabel lblCantReal = new JLabel("Cantidad Real:");
				lblCantReal.setBounds(424, 75, 85, 23);
				panel_1.add(lblCantReal);
				
				JSpinner spnCantReal = new JSpinner();
				spnCantReal.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
				spnCantReal.setBounds(525, 75, 76, 23);
				panel_1.add(spnCantReal);
				
				JLabel lblCompra = new JLabel("Compra:");
				lblCompra.setBounds(375, 27, 53, 23);
				panel_1.add(lblCompra);
				
				JSpinner spnVenta = new JSpinner();
				spnVenta.setBounds(544, 27, 67, 23);
				panel_1.add(spnVenta);
				
				JSpinner spnCompra = new JSpinner();
				spnCompra.setBounds(428, 27, 67, 23);
				panel_1.add(spnCompra);
			}
			
			JPanel panel_Componentes = new JPanel();
			panel_Componentes.setBackground(new Color(240, 255, 255));
			panel_Componentes.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Componentes", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_Componentes.setBounds(10, 130, 621, 57);
			panel.add(panel_Componentes);
			panel_Componentes.setLayout(null);
			
			rdbtnDiscoDuro = new JRadioButton("Disco Duro");
			rdbtnDiscoDuro.setBackground(new Color(240, 255, 255));
			rdbtnDiscoDuro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					rdbtnMicro.setSelected(false);
					rdbtnTarjeta.setSelected(false);
					rdbtnDiscoDuro.setSelected(true);
					rdbtnMemoriaRam.setSelected(false);
					
					panelTarjeta.setVisible(false);
					panelMicro.setVisible(false);
					panel_Disco.setVisible(true);
					panel_RAM.setVisible(false);
					
					lblTipoConector.setVisible(false);
					cbxTipoConector.setVisible(false);
					lblTipoRam.setVisible(false);
					cbxTipoRam.setVisible(false);
					
					lblTipoconexion_Micro.setVisible(false);
					lblVelocidad_Micro.setVisible(false);
					lblTipo_Micro.setVisible(false);
					txtTipoConexion_Micro.setVisible(false);
					spnVelocidad_Micro.setVisible(false);
					cbxTipo_Micro.setVisible(false);
					
					lblalmacenamiento.setVisible(true);
					lblunidadAlmacenamiento.setVisible(true);
					lblTipoconexion.setVisible(true);
					spnAlmacenamiento.setVisible(true);
					cbxUnidadAlmac.setVisible(true);
					cbxTipoconexion.setVisible(true);
				}
			});
			rdbtnDiscoDuro.setBounds(32, 19, 109, 23);
			panel_Componentes.add(rdbtnDiscoDuro);
			
			rdbtnMemoriaRam = new JRadioButton("Memoria Ram");
			rdbtnMemoriaRam.setBackground(new Color(240, 255, 255));
			rdbtnMemoriaRam.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					rdbtnMicro.setSelected(false);
					rdbtnTarjeta.setSelected(false);
					rdbtnDiscoDuro.setSelected(false);
					rdbtnMemoriaRam.setSelected(true);
					
					panelTarjeta.setVisible(false);
					panelMicro.setVisible(false);
					panel_Disco.setVisible(false);
					panel_RAM.setVisible(true);
					
					lblTipoConector.setVisible(true);
					cbxTipoConector.setVisible(true);
					lblTipoRam.setVisible(true);
					cbxTipoRam.setVisible(true);
					
					lblTipoconexion_Micro.setVisible(false);
					lblVelocidad_Micro.setVisible(false);
					lblTipo_Micro.setVisible(false);
					txtTipoConexion_Micro.setVisible(false);
					spnVelocidad_Micro.setVisible(false);
					cbxTipo_Micro.setVisible(false);
					
					lblalmacenamiento.setVisible(false);
					lblunidadAlmacenamiento.setVisible(false);
					lblTipoconexion.setVisible(false);
					spnAlmacenamiento.setVisible(false);
					cbxUnidadAlmac.setVisible(false);
					cbxTipoconexion.setVisible(false);
				}
			});
			rdbtnMemoriaRam.setBounds(173, 19, 109, 23);
			panel_Componentes.add(rdbtnMemoriaRam);
			
			rdbtnMicro = new JRadioButton("Microprocesadores");
			rdbtnMicro.setBackground(new Color(240, 255, 255));
			rdbtnMicro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					rdbtnMicro.setSelected(true);
					rdbtnTarjeta.setSelected(false);
					rdbtnDiscoDuro.setSelected(false);
					rdbtnMemoriaRam.setSelected(false);
					
					panelTarjeta.setVisible(false);
					panelMicro.setVisible(true);
					panel_Disco.setVisible(false);
					panel_RAM.setVisible(false);
					
					lblTipoConector.setVisible(false);
					cbxTipoConector.setVisible(false);
					lblTipoRam.setVisible(false);
					cbxTipoRam.setVisible(false);
					
					lblTipoconexion_Micro.setVisible(true);
					lblVelocidad_Micro.setVisible(true);
					lblTipo_Micro.setVisible(true);
					txtTipoConexion_Micro.setVisible(true);
					spnVelocidad_Micro.setVisible(true);
					cbxTipo_Micro.setVisible(true);
					
					lblalmacenamiento.setVisible(false);
					lblunidadAlmacenamiento.setVisible(false);
					lblTipoconexion.setVisible(false);
					spnAlmacenamiento.setVisible(false);
					cbxUnidadAlmac.setVisible(false);
					cbxTipoconexion.setVisible(false);
					
				}
			});
			rdbtnMicro.setBounds(314, 19, 151, 23);
			panel_Componentes.add(rdbtnMicro);
			
			rdbtnTarjeta = new JRadioButton("Tarjeta Madre");
			rdbtnTarjeta.setBackground(new Color(240, 255, 255));
			rdbtnTarjeta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					rdbtnMicro.setSelected(false);
					rdbtnTarjeta.setSelected(true);
					rdbtnDiscoDuro.setSelected(false);
					rdbtnMemoriaRam.setSelected(false);
					
					panelTarjeta.setVisible(true);
					panelMicro.setVisible(false);
					panel_Disco.setVisible(false);
					panel_RAM.setVisible(false);
					
					lblTipoConector.setVisible(true);
					cbxTipoConector.setVisible(true);
					lblTipoRam.setVisible(true);
					cbxTipoRam.setVisible(true);
					
					lblTipoconexion_Micro.setVisible(false);
					lblVelocidad_Micro.setVisible(false);
					lblTipo_Micro.setVisible(false);
					txtTipoConexion_Micro.setVisible(false);
					spnVelocidad_Micro.setVisible(false);
					cbxTipo_Micro.setVisible(false);
					
					lblalmacenamiento.setVisible(false);
					lblunidadAlmacenamiento.setVisible(false);
					lblTipoconexion.setVisible(false);
					spnAlmacenamiento.setVisible(false);
					cbxUnidadAlmac.setVisible(false);
					cbxTipoconexion.setVisible(false);
				}
			});
			rdbtnTarjeta.setBounds(480, 19, 109, 23);
			panel_Componentes.add(rdbtnTarjeta);
			
			panel_Disco = new JPanel();
			panel_Disco.setBackground(new Color(240, 255, 255));
			panel_Disco.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Espec\u00EDfica", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_Disco.setBounds(10, 190, 621, 230);
			panel.add(panel_Disco);
			panel_Disco.setLayout(null);
			
			lblalmacenamiento = new JLabel("Cantidad de almacenamiento:");
			lblalmacenamiento.setBounds(10, 40, 175, 23);
			panel_Disco.add(lblalmacenamiento);
			
			lblunidadAlmacenamiento = new JLabel("Unidad de almacenamiento: ");
			lblunidadAlmacenamiento.setBounds(10, 103, 163, 23);
			panel_Disco.add(lblunidadAlmacenamiento);
			
			lblTipoconexion = new JLabel("Tipo de conexion:");
			lblTipoconexion.setBounds(10, 166, 147, 23);
			panel_Disco.add(lblTipoconexion);
			
			spnAlmacenamiento = new JSpinner();
			spnAlmacenamiento.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spnAlmacenamiento.setBounds(195, 40, 147, 23);
			panel_Disco.add(spnAlmacenamiento);
			
			cbxUnidadAlmac = new JComboBox();
			cbxUnidadAlmac.setModel(new DefaultComboBoxModel(new String[] {"Gb", "Tb"}));
			cbxUnidadAlmac.setToolTipText("");
			cbxUnidadAlmac.setBounds(196, 103, 146, 23);
			panel_Disco.add(cbxUnidadAlmac);
			
			cbxTipoconexion = new JComboBox();
			cbxTipoconexion.setModel(new DefaultComboBoxModel(new String[] {"IDE", "SATA", "SATA-2", "SATA-3"}));
			cbxTipoconexion.setBounds(196, 166, 146, 23);
			panel_Disco.add(cbxTipoconexion);
			
			panelMicro = new JPanel();
			panelMicro.setBackground(new Color(240, 255, 255));
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
			panelTarjeta.setBackground(new Color(240, 255, 255));
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
			cbxTipoRam.setModel(new DefaultComboBoxModel(new String[] { "<Seleccionar>", "DDR", "DDR2", "DDR3", "DDR4" }));
			cbxTipoRam.setBounds(196, 103, 146, 23);
			panelTarjeta.add(cbxTipoRam);
			
			panel_RAM = new JPanel();
			panel_RAM.setBackground(new Color(240, 255, 255));
			panel_RAM.setBorder(new TitledBorder(null, "Informacion Adicional", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel_RAM.setBounds(10, 198, 621, 219);
			panel.add(panel_RAM);
			panel_RAM.setVisible(false);
			panel_RAM.setLayout(null);
			
			lblCantidad_Memoria = new JLabel("Cantidad de Memoria:");
			lblCantidad_Memoria.setBounds(10, 42, 125, 14);
			panel_RAM.add(lblCantidad_Memoria);
			
			spn_CantidadMemoria = new JSpinner();
			spn_CantidadMemoria.setBounds(143, 39, 80, 20);
			panel_RAM.add(spn_CantidadMemoria);
			
			lblTipo_Memoria = new JLabel("Tipo de Memoria:");
			lblTipo_Memoria.setBounds(10, 99, 108, 14);
			panel_RAM.add(lblTipo_Memoria);
			
			cbx_TipoMemoria = new JComboBox();
			cbx_TipoMemoria.setModel(new DefaultComboBoxModel(new String[] {"<Todas>", "DDR", "DDR-2", "DDR-3"}));
			cbx_TipoMemoria.setBounds(143, 96, 80, 20);
			panel_RAM.add(cbx_TipoMemoria);
			
			lblMemoria = new JLabel("Memoria:");
			lblMemoria.setBounds(10, 152, 67, 14);
			panel_RAM.add(lblMemoria);
			
			cbxMemoria = new JComboBox();
			cbxMemoria.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Gb", "Mb"}));
			cbxMemoria.setBounds(143, 149, 80, 20);
			panel_RAM.add(cbxMemoria);
		}
		
		JPanel Buttonpane = new JPanel();
		Buttonpane.setBackground(new Color(240, 255, 255));
		Buttonpane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Buttonpane.setBounds(0, 421, 641, 38);
		contentPanel.add(Buttonpane);
		Buttonpane.setLayout(null);
		
		JButton CancelarButton = new JButton("Cancelar");
		CancelarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose();
			}
		});
		CancelarButton.setBounds(542, 7, 89, 23);
		CancelarButton.setToolTipText("");
		Buttonpane.add(CancelarButton);
		
		JButton RegistrarButton = new JButton("Registrar");
		RegistrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Componente aux = null;
				String serie = txtSerie.getText();
				String modelo= txtModelo.getText();
				String marca = txtMarca.getText();
				float compra = Float.parseFloat(spnCompra.getValue().toString());
				float venta = Float.parseFloat(spnVenta.getValue().toString());
				int cantMin = Integer.parseInt(spnCantMinima.getValue().toString());
				int cantMax = Integer.parseInt(spnCantMaxima.getValue().toString());
				int cantReal = Integer.parseInt(spnCantReal.getValue().toString());	
				if( (cantReal<=cantMax && cantReal>=cantMin) && (venta>=(compra+compra*0.10f)) ) {
					if(!txtMarca.getText().isEmpty() || !txtModelo.getText().isEmpty() ) {
						
				if(rdbtnDiscoDuro.isSelected()) {
					float almacenamiento = Float.parseFloat(spnAlmacenamiento.getValue().toString());
					String conexion = cbxTipoconexion.getSelectedItem().toString();
					boolean Gb = true;
					if(cbxUnidadAlmac.getSelectedItem().toString() == "Tb") {
						Gb = false;
					}
					aux = new DiscosDuros(txtSerie.getText(), modelo, marca, compra, venta, cantMin, cantMax, cantReal, almacenamiento, Gb, conexion);
					Tienda.getInstance().insertarComponente(aux);
					JOptionPane.showMessageDialog(null, "Registro Exitoso!!. ", "información", JOptionPane.INFORMATION_MESSAGE);	

				}
				if(rdbtnMemoriaRam.isSelected()) {
					float cantidadMem = Float.parseFloat(spn_CantidadMemoria.getValue().toString());
					String tipo= cbx_TipoMemoria.getSelectedItem().toString();
					boolean Gb = true;
					if(cbxMemoria.getSelectedItem().toString() == "Mb") {
						Gb = false;
					}
					aux = new MemoriaRAM(txtSerie.getText(), modelo, marca, venta, compra, cantMin, cantMax, cantReal, cantidadMem, tipo, Gb);
					Tienda.getInstance().insertarComponente(aux);
					JOptionPane.showMessageDialog(null, "Registro Exitoso!! ", "información", JOptionPane.INFORMATION_MESSAGE);	

				}
				if(rdbtnMicro.isSelected()) {
					if(!txtTipoConexion_Micro.getText().isEmpty()) {
					
					String conector = txtTipoConexion_Micro.getText();
					float velocidad = Float.parseFloat(spnVelocidad_Micro.getValue().toString());
					boolean GHz = true;
					if(cbxTipo_Micro.getSelectedItem().toString() == "MHz") {
						GHz = false;
					}
						aux = new Microprocesadores(txtSerie.getText(), modelo, marca, venta, compra, cantMin, cantMax, cantReal, conector, velocidad, GHz);
						Tienda.getInstance().insertarComponente(aux);
						JOptionPane.showMessageDialog(null, "El Componente ha sido registrado con exito. ", "información", JOptionPane.INFORMATION_MESSAGE);	

				}else {
					JOptionPane.showMessageDialog(null, "Recuerde que debe de llenar el apartado de Tipo de conexion para el microprocesador.", "Información", JOptionPane.INFORMATION_MESSAGE);

				}
				}
				
				if(rdbtnTarjeta.isSelected() ) {
					String conector = cbxTipoConector.getSelectedItem().toString();
					String tipoRam = cbxTipoRam.getSelectedItem().toString();
					if (conector.isEmpty() || tipoRam.isEmpty()) {
					
					aux = new TarjetaMadre(txtSerie.getText(), modelo, marca, venta, compra, cantMin, cantMax, cantReal, conector, tipoRam, listaconexiones);
					Tienda.getInstance().insertarComponente(aux);
					JOptionPane.showMessageDialog(null, "El Componente ha sido registrado con exito. ", "información", JOptionPane.INFORMATION_MESSAGE);	

				}else {
					JOptionPane.showMessageDialog(null, "Recuerde que debe de llenar los apartados de la seccion Motherboard.\nTambien debe verificar que la tabla tenga al menos 1 conexión agregada.", "Información", JOptionPane.INFORMATION_MESSAGE);
				}
					
				}
				
				LIMPIAR();
				}else {
					JOptionPane.showMessageDialog(null,"Debe llenar la informacion general!!!","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(null, "El precio de venta debe de ser al menos un 10% mas alto que el precio de compra.\nRecuerde que la cantidad real debe ser mayor que la míninma y menor que la cantidad máxima del componente.", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			}

			private void LIMPIAR() {
				txtSerie.setText("S-"+Tienda.getInstance().getCod_componente());
				txtModelo.setText("");
				txtMarca.setText("");
				spnCompra.setValue(new Integer(1));
				spnVenta.setValue(new Integer(1));
				spnCantMinima.setValue(new Integer(1));
				spnCantMaxima.setValue(new Integer(1));
				spnCantReal.setValue(new Integer(1));
				//Motherboard
				cbxTipoConector.setSelectedItem(0);
				cbxTipoRam.setSelectedItem(0);
				//disco
				spnAlmacenamiento.setValue(new Integer(1));
				cbxTipoconexion.setSelectedItem(0);
				cbxUnidadAlmac.setSelectedItem(0);
				//Memoria Ram
				spn_CantidadMemoria.setValue(new Integer(1));
				cbxMemoria.setSelectedItem(0);
				cbx_TipoMemoria.setSelectedItem(0);
				//Microprocesadores
				txtTipoConexion_Micro.setText("");
				spnVelocidad_Micro.setValue(new Integer(1));
				cbxTipo_Micro.setSelectedItem(0);
				
			}
		
		});
		RegistrarButton.setBounds(443, 7, 89, 23);
		Buttonpane.add(RegistrarButton);}	
}
	

		/*{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			/*{
				/*JButton okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						Componente aux = null;
						String serie = txtSerie.getText();
						String modelo= txtModelo.getText();
						String marca = txtMarca.getText();
						float compra = Float.parseFloat(spnCompra.getValue().toString());
						float venta = Float.parseFloat(spnVenta.getValue().toString());
						int cantMin = Integer.parseInt(spnCantMinima.getValue().toString());
						int cantMax = Integer.parseInt(spnCantMaxima.getValue().toString());
						int cantReal = Integer.parseInt(spnCantReal.getValue().toString());	
						if( (cantReal<=cantMax && cantReal>=cantMin) && (venta>=(compra+compra*0.10f)) ) {
							if(!txtMarca.getText().isEmpty() || !txtModelo.getText().isEmpty() ) {
								
						if(rdbtnDiscoDuro.isSelected()) {
							float almacenamiento = Float.parseFloat(spnAlmacenamiento.getValue().toString());
							String conexion = cbxTipoconexion.getSelectedItem().toString();
							boolean Gb = true;
							if(cbxUnidadAlmac.getSelectedItem().toString() == "Tb") {
								Gb = false;
							}
							aux = new DiscosDuros(txtSerie.getText(), modelo, marca, venta, compra, cantMin, cantMax, cantReal, almacenamiento, Gb, conexion);
							Tienda.getInstance().insertarComponente(aux);
							JOptionPane.showMessageDialog(null, "Registro Exitoso!!. ", "información", JOptionPane.INFORMATION_MESSAGE);	

						}
						if(rdbtnMemoriaRam.isSelected()) {
							float cantidadMem = Float.parseFloat(spn_CantidadMemoria.getValue().toString());
							String tipo= cbx_TipoMemoria.getSelectedItem().toString();
							boolean Gb = true;
							if(cbxMemoria.getSelectedItem().toString() == "Mb") {
								Gb = false;
							}
							aux = new MemoriaRAM(txtSerie.getText(), modelo, marca, venta, compra, cantMin, cantMax, cantReal, cantidadMem, tipo, Gb);
							Tienda.getInstance().insertarComponente(aux);
							JOptionPane.showMessageDialog(null, "Registro Exitoso!! ", "información", JOptionPane.INFORMATION_MESSAGE);	

						}
						if(rdbtnMicro.isSelected()) {
							if(!txtTipoConexion_Micro.getText().isEmpty()) {
							
							String conector = txtTipoConexion_Micro.getText();
							float velocidad = Float.parseFloat(spnVelocidad_Micro.getValue().toString());
							boolean GHz = true;
							if(cbxTipo_Micro.getSelectedItem().toString() == "MHz") {
								GHz = false;
							}
								aux = new Microprocesadores(txtSerie.getText(), modelo, marca, venta, compra, cantMin, cantMax, cantReal, conector, velocidad, GHz);
								Tienda.getInstance().insertarComponente(aux);
								JOptionPane.showMessageDialog(null, "El Componente ha sido registrado con exito. ", "información", JOptionPane.INFORMATION_MESSAGE);	

						}else {
							JOptionPane.showMessageDialog(null, "Recuerde que debe de llenar el apartado de Tipo de conexion para el microprocesador.", "Información", JOptionPane.INFORMATION_MESSAGE);

						}
						}
						
						if(rdbtnTarjeta.isSelected() ) {
							if(!txtConexion_MotherBoard.getText().isEmpty() || !txtTipoRam_MotherBoard.getText().isEmpty() || modelo_1.getRowCount()>0){
							String conector = txtConexion_MotherBoard.getText();
							String tipoRam = txtTipoRam_MotherBoard.getText();
							
							aux = new TarjetaMadre(txtSerie.getText(), modelo, marca, venta, compra, cantMin, cantMax, cantReal, conector, tipoRam, listaconexiones);
							Tienda.getInstance().insertarComponente(aux);
							JOptionPane.showMessageDialog(null, "El Componente ha sido registrado con exito. ", "información", JOptionPane.INFORMATION_MESSAGE);	

						}else {
							JOptionPane.showMessageDialog(null, "Recuerde que debe de llenar los apartados de la seccion Motherboard.\nTambien debe verificar que la tabla tenga al menos 1 conexión agregada.", "Información", JOptionPane.INFORMATION_MESSAGE);
						}
							
						}
						
						LIMPIAR();
						}else {
							JOptionPane.showMessageDialog(null,"Debe llenar la informacion general!!!","ERROR",JOptionPane.ERROR_MESSAGE);
						}
					}else {
						JOptionPane.showMessageDialog(null, "El precio de venta debe de ser al menos un 10% mas alto que el precio de compra.\nRecuerde que la cantidad real debe ser mayor que la míninma y menor que la cantidad máxima del componente.", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
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
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}*/