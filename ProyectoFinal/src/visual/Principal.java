package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Tienda de Componentes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 752, 21);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Facturar");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Facturaci\u00F3n ");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listado Facturas");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Componentes");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ingresar Componente");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Lista Componentes");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Cliente");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Lista Cliente");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_3 = new JMenu("Combos");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Registrar Combo");
		mnNewMenu_3.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Lista Combo");
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_4 = new JMenu("Proveedor");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Registrar Proveedor");
		mnNewMenu_4.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Lista Proveedores");
		mnNewMenu_4.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_5 = new JMenu("Administracion");
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Empleados");
		mnNewMenu_5.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Registrar Empleado");
		mnNewMenu_6.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Lista de Empleados");
		mnNewMenu_6.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_7 = new JMenu("Cuentas y Ordenes de Compra");
		mnNewMenu_5.add(mnNewMenu_7);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Generar Orden de Compra");
		mnNewMenu_7.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Lista Ordenes de Compra");
		mnNewMenu_7.add(mntmNewMenuItem_13);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
