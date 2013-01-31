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
		setTitle("Log In");
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
		lblUsuario.setBounds(266, 117, 71, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(266, 155, 71, 14);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(347, 152, 86, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(347, 114, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxRecordarUsuario = new JCheckBox("Recordar Usuario");
		chckbxRecordarUsuario.setBackground(Color.WHITE);
		chckbxRecordarUsuario.setBounds(262, 193, 118, 23);
		contentPane.add(chckbxRecordarUsuario);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Principal miPrincipal = new Principal();
				miPrincipal.setVisible(true);
				miPrincipal.setDefaultCloseOperation(1);
				
			}
		});
		btnAceptar.setBounds(289, 239, 91, 23);
		contentPane.add(btnAceptar);
		
		JLabel label_2 = new JLabel("Bolsa de Valores");
		label_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		label_2.setBounds(137, 20, 176, 33);
		contentPane.add(label_2);
	}
}
