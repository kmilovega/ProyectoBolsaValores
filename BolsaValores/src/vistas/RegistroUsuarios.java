package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class RegistroUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroUsuarios frame = new RegistroUsuarios();
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
	public RegistroUsuarios() {
		setTitle("Registrate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Bolsa de Valores");
		label.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		label.setBounds(132, 11, 176, 33);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(10, 93, 69, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(110, 87, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 118, 86, 20);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("Apellido");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(10, 121, 69, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Documento I.");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(10, 149, 79, 14);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 146, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(110, 177, 86, 20);
		contentPane.add(textField_3);
		
		JLabel label_4 = new JLabel("Telefono");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(10, 180, 69, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Passwor");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(10, 211, 69, 14);
		contentPane.add(label_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(110, 208, 86, 20);
		contentPane.add(passwordField);
		
		JButton button = new JButton("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Log miLog = new Log();
				miLog.setVisible(true);
				miLog.setDefaultCloseOperation(1);
				dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(45, 239, 91, 23);
		contentPane.add(button);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("Imagenes"+File.separator+"url.jpg"));
		label_6.setBounds(166, 38, 276, 235);
		contentPane.add(label_6);
		
		JLabel lblRegistrateYa = new JLabel("Reg\u00EDstrate ahora");
		lblRegistrateYa.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		lblRegistrateYa.setBounds(10, 49, 186, 33);
		contentPane.add(lblRegistrateYa);
	}
}
