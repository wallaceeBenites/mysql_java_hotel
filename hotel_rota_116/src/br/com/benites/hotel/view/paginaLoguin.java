package br.com.benites.hotel.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paginaLoguin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmHotelAlura;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paginaLoguin window = new paginaLoguin();
					window.frmHotelAlura.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public paginaLoguin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelAlura = new JFrame();
		frmHotelAlura.setFont(new Font("Segoe UI", Font.BOLD, 20));
		frmHotelAlura.setIconImage(Toolkit.getDefaultToolkit().getImage(paginaLoguin.class.getResource("/img/aH-40px.png")));
		frmHotelAlura.setTitle("Hotel Alura");
		frmHotelAlura.setResizable(false);
		frmHotelAlura.setBounds(100, 100, 831, 490);
		frmHotelAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelAlura.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(64, 159, 255));
		lblNewLabel.setIcon(new ImageIcon(paginaLoguin.class.getResource("/img/img-hotel-login-.png")));
		lblNewLabel.setBounds(528, -46, 300, 507);
		frmHotelAlura.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(paginaLoguin.class.getResource("/img/Ha-100px.png")));
		lblNewLabel_1.setBounds(29, 23, 100, 105);
		frmHotelAlura.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 29));
		lblNewLabel_2.setBounds(220, 84, 88, 51);
		frmHotelAlura.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("USUARIO");
		lblNewLabel_3.setForeground(SystemColor.textInactiveText);
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(105, 162, 128, 34);
		frmHotelAlura.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("SENHA");
		lblNewLabel_3_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_3_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(105, 261, 128, 34);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		textField.setBackground(null);
		textField.setBounds(105, 206, 317, 34);
		Border border_textField = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
		textField.setBorder(border_textField);
		frmHotelAlura.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		passwordField.setBackground(null);
		passwordField.setBounds(105, 305, 317, 34);
		Border border_passwordField = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
		passwordField.setBorder(border_passwordField);
		frmHotelAlura.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(new Color(0, 128, 192));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(105, 377, 128, 40);
		frmHotelAlura.getContentPane().add(btnNewButton);
	}
}
