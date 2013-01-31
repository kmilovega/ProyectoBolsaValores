package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class Login {

	private JFrame frmRegistrate;
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
					Login window = new Login();
					window.frmRegistrate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrate = new JFrame();
		frmRegistrate.setTitle("Registrate");
		frmRegistrate.getContentPane().setBackground(Color.WHITE);
		frmRegistrate.setBounds(100, 100, 450, 300);
		frmRegistrate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrate.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(20, 93, 69, 14);
		frmRegistrate.getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(120, 87, 86, 20);
		frmRegistrate.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido.setBounds(20, 121, 69, 14);
		frmRegistrate.getContentPane().add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 118, 86, 20);
		frmRegistrate.getContentPane().add(textField_1);
		
		JLabel lblDocumentoI = new JLabel("Documento I.");
		lblDocumentoI.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDocumentoI.setBounds(20, 149, 79, 14);
		frmRegistrate.getContentPane().add(lblDocumentoI);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 146, 86, 20);
		frmRegistrate.getContentPane().add(textField_2);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefono.setBounds(20, 180, 69, 14);
		frmRegistrate.getContentPane().add(lblTelefono);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(120, 177, 86, 20);
		frmRegistrate.getContentPane().add(textField_3);
		
		JLabel lblPasswor = new JLabel("Passwor");
		lblPasswor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPasswor.setBounds(20, 211, 69, 14);
		frmRegistrate.getContentPane().add(lblPasswor);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 208, 86, 20);
		frmRegistrate.getContentPane().add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("Imagenes"+File.separator+"url.jpg"));
		label.setBounds(166, 38, 276, 235);
		frmRegistrate.getContentPane().add(label);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Log miLog = new Log();
				miLog.setVisible(true);
				miLog.setDefaultCloseOperation(1);
				
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAceptar.setBounds(55, 239, 91, 23);
		frmRegistrate.getContentPane().add(btnAceptar);
		
		JLabel label_1 = new JLabel("Bolsa de Valores");
		label_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		label_1.setBounds(142, 11, 176, 33);
		frmRegistrate.getContentPane().add(label_1);
	}
}
