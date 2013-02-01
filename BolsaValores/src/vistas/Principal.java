package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.ScrollPane;
import java.io.File;

import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setTitle("Empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 442, 26);
		contentPane.add(menuBar);
		
		JMenu mnSalo = new JMenu(" Historial Saldo");
		menuBar.add(mnSalo);
		
		JMenu mnDisponible = new JMenu("Fecha");
		mnSalo.add(mnDisponible);
		
		JMenuItem mntmUntimoDia = new JMenuItem("Untimo Dia");
		mnDisponible.add(mntmUntimoDia);
		
		JMenuItem mntmUltimosDosDias = new JMenuItem("Ultimos Dos Dias");
		mnDisponible.add(mntmUltimosDosDias);
		
		JMenuItem mntmUltimosTresDias = new JMenuItem("Ultimos Tres Dias");
		mnDisponible.add(mntmUltimosTresDias);
		
		JMenuItem mntmUltimoMes = new JMenuItem("Ultimo Mes");
		mnDisponible.add(mntmUltimoMes);
		
		JMenuItem mntmUltimosDosMeses = new JMenuItem("Ultimos Dos Meses");
		mnDisponible.add(mntmUltimosDosMeses);
		
		JMenuItem mntmUltimosCincoMeses = new JMenuItem("Ultimos Cinco Meses");
		mnDisponible.add(mntmUltimosCincoMeses);
		
		JMenu mnTotal = new JMenu("Total");
		mnSalo.add(mnTotal);
		
		JMenuItem mntmDisponible = new JMenuItem("Disponible");
		mnTotal.add(mntmDisponible);
		
		JMenuItem mntmGlobal = new JMenuItem("Global");
		mnTotal.add(mntmGlobal);
		
		JMenu mnAcciones = new JMenu("Acciones");
		menuBar.add(mnAcciones);
		
		JMenu mnCalzada = new JMenu("Calzada");
		mnAcciones.add(mnCalzada);
		
		JMenuItem mntmUltimoDia = new JMenuItem("Ultimo Dia");
		mnCalzada.add(mntmUltimoDia);
		
		JMenuItem mntmUltimosDosDias_1 = new JMenuItem("Ultimos Dos Dias");
		mnCalzada.add(mntmUltimosDosDias_1);
		
		JMenuItem mntmUltimosTresDias_1 = new JMenuItem("Ultimos Tres Dias");
		mnCalzada.add(mntmUltimosTresDias_1);
		
		JMenuItem mntmUltimoMes_1 = new JMenuItem("Ultimo Mes");
		mnCalzada.add(mntmUltimoMes_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Disponibles");
		mnAcciones.add(mntmNewMenuItem);
		
		JMenu mnCompra = new JMenu("Compra");
		menuBar.add(mnCompra);
		
		JMenuItem mntmEmpresa = new JMenuItem("Empresa");
		mnCompra.add(mntmEmpresa);
		
		JMenuItem mntmValor = new JMenuItem("Valor");
		mnCompra.add(mntmValor);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Alza");
		mnCompra.add(mntmNewMenuItem_1);
		
		JMenuItem mntmBaja = new JMenuItem("Baja");
		mnCompra.add(mntmBaja);
		
		JMenu mnVenta = new JMenu("Venta");
		menuBar.add(mnVenta);
		
		JMenu mnActual = new JMenu("Actual");
		mnVenta.add(mnActual);
		
		JMenu mnFecha = new JMenu("Fecha");
		mnVenta.add(mnFecha);
		
		JLabel label = new JLabel("$ 500.000");
		label.setBounds(10, 76, 113, 14);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("Saldo Actual");
		label_2.setBounds(10, 51, 113, 14);
		contentPane.add(label_2);
		
		JLabel lblJuanCamiloVega = new JLabel("Juan Camilo Vega");
		lblJuanCamiloVega.setBounds(10, 26, 113, 14);
		contentPane.add(lblJuanCamiloVega);
		
		JLabel label_1 = new JLabel("01/05/2013");
		label_1.setBounds(365, 26, 67, 14);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("Imagenes"+File.separator+"grafico.png"));
		label_3.setBounds(0, 112, 350, 132);
		contentPane.add(label_3);
		
		JLabel lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setBackground(Color.LIGHT_GRAY);
		lblEmpresa.setBounds(365, 137, 67, 14);
		contentPane.add(lblEmpresa);
		
		JLabel lblSector = new JLabel("Sector");
		lblSector.setBackground(Color.LIGHT_GRAY);
		lblSector.setBounds(365, 187, 67, 14);
		contentPane.add(lblSector);
		
		JLabel lblValorAccion = new JLabel("Valor Accion");
		lblValorAccion.setBounds(17, 255, 77, 14);
		contentPane.add(lblValorAccion);
		
		JLabel lblCantidadAcciones = new JLabel("Cantidad Acciones");
		lblCantidadAcciones.setBounds(175, 255, 113, 14);
		contentPane.add(lblCantidadAcciones);
		
		JLabel label_4 = new JLabel("$ 1.500.000");
		label_4.setBounds(90, 255, 77, 14);
		contentPane.add(label_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(283, 253, 52, 18);
		contentPane.add(spinner);
		
		JLabel lblEcopetrol = new JLabel("Ecopetrol");
		lblEcopetrol.setBounds(365, 162, 67, 14);
		contentPane.add(lblEcopetrol);
		
		JLabel lblIdrocarburos = new JLabel("Idrocarburos");
		lblIdrocarburos.setBounds(365, 212, 77, 14);
		contentPane.add(lblIdrocarburos);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\Aprendiz\\Desktop\\Ecopetrol_logo.jpg"));
		label_5.setBounds(358, 69, 95, 46);
		contentPane.add(label_5);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnComprar.setBounds(345, 251, 87, 18);
		contentPane.add(btnComprar);
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
