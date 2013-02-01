package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JLabel;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
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
		
		JLabel label = new JLabel("Juan Camilo Vega");
		label.setBounds(10, 26, 113, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Saldo Actual");
		label_1.setBounds(10, 51, 113, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("$ 500.000");
		label_2.setBounds(10, 76, 113, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("01/05/2013");
		label_3.setBounds(365, 26, 67, 14);
		contentPane.add(label_3);
		
	}
}
