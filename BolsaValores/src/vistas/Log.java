package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Log extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log frame = new Log();
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
	public Log() {
		setTitle("Iniciar Sesion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("Imagenes"+File.separator+"url587.jpg"));
		label.setBounds(-39, 77, 295, 215);
		contentPane.add(label);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(270, 80, 71, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(270, 118, 71, 14);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(351, 115, 86, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(351, 77, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxRecordarUsuario = new JCheckBox("Recordar Usuario");
		chckbxRecordarUsuario.setBackground(Color.WHITE);
		chckbxRecordarUsuario.setBounds(270, 150, 167, 23);
		contentPane.add(chckbxRecordarUsuario);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Principal miPrincipal = new Principal();
				miPrincipal.setVisible(true);
				miPrincipal.setDefaultCloseOperation(1);
				dispose();				
			}
		});
		btnAceptar.setBounds(269, 180, 91, 23);
		contentPane.add(btnAceptar);
		
		JLabel label_2 = new JLabel("Bolsa de Valores");
		label_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		label_2.setBounds(137, 20, 176, 33);
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("\u00BFNo dispones de una cuenta?");
		label_1.setBounds(266, 233, 171, 14);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("Reg\u00EDstrate ahora");
		label_3.setForeground(Color.BLUE);
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				RegistroUsuarios miRegistro = new RegistroUsuarios();
				miRegistro.setVisible(true);
				miRegistro.setDefaultCloseOperation(1);
				dispose();
			}
		});
		label_3.setBounds(266, 248, 171, 14);
		contentPane.add(label_3);
	}
}
