package br.com.benites.hotel.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Toolkit;

public class janelaDeRegistroDeHospodes {

	private JFrame frmHotelAlura;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaDeRegistroDeHospodes window = new janelaDeRegistroDeHospodes();
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
	public janelaDeRegistroDeHospodes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelAlura = new JFrame();
		frmHotelAlura.setResizable(false);
		frmHotelAlura.setFont(new Font("Segoe UI", Font.BOLD, 20));
		frmHotelAlura.setIconImage(Toolkit.getDefaultToolkit().getImage(janelaDeRegistroDeHospodes.class.getResource("/img/aH-40px.png")));
		frmHotelAlura.setTitle("Hotel Alura");
		frmHotelAlura.setBounds(100, 100, 902, 596);
		frmHotelAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelAlura.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(janelaDeRegistroDeHospodes.class.getResource("/img/registro.png")));
		lblNewLabel.setBounds(0, 15, 481, 544);
		frmHotelAlura.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(0, 128, 192));
		lblNewLabel_1.setBounds(0, 0, 487, 559);
		frmHotelAlura.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("REGISTRO HÓSPEDE");
		lblNewLabel_3.setForeground(new Color(0, 128, 192));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3.setBounds(583, 15, 295, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("NOME");
		lblNewLabel_3_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(535, 55, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		textField.setColumns(10);
		textField.setBackground((Color) null);
		textField.setBounds(535, 83, 302, 34);
		Border border_textField = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
		textField.setBackground(null);
		textField.setBorder(border_textField);
		frmHotelAlura.getContentPane().add(textField);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("SOBRENOME");
		lblNewLabel_3_1_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(535, 129, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		textField_1.setColumns(10);
		textField_1.setBackground((Color) null);
		textField_1.setBounds(535, 386, 302, 34);
		Border border_textField_1 = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
		textField_1.setBackground(null);
		textField_1.setBorder(border_textField_1);
		frmHotelAlura.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("DATA DE NASCIMENTO");
		lblNewLabel_3_1_1_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1_1_1.setBounds(535, 202, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1_1_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		formattedTextField.setBounds(535, 231, 271, 34);
		frmHotelAlura.getContentPane().add(formattedTextField);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(janelaDeRegistroDeHospodes.class.getResource("/img/icon-reservas.png")));
		lblNewLabel_4_1.setOpaque(true);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_1.setBackground(new Color(0, 128, 192));
		lblNewLabel_4_1.setBounds(535, 231, 302, 34);
		frmHotelAlura.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("NACIONALIDADE");
		lblNewLabel_3_1_1_1_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1_1_1_1.setBounds(535, 275, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setOpaque(false);
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		comboBox.setBackground((Color) null);
		comboBox.setBounds(535, 310, 302, 44);
		frmHotelAlura.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("TELEFONE");
		lblNewLabel_3_1_1_1_1_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1_1_1_1_1.setBounds(535, 354, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		textField_2.setColumns(10);
		textField_2.setBackground((Color) null);
		textField_2.setBounds(535, 158, 302, 34);
		Border border_textField_2 = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
		textField_2.setBackground(null);
		textField_2.setBorder(border_textField_2);
		frmHotelAlura.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("NUMERO DE RESERVA");
		lblNewLabel_3_1_1_1_1_1_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1_1_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1_1_1_1_1_1.setBounds(535, 430, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1_1_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		textField_3.setColumns(10);
		textField_3.setBackground((Color) null);
		textField_3.setBounds(535, 461, 302, 34);
		textField_3.setBackground(null);
		textField_3.setBorder(border_textField);
		frmHotelAlura.getContentPane().add(textField_3);
		
		JButton btnNewButton_1 = new JButton("SALVAR");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1.setBounds(701, 505, 136, 44);
		frmHotelAlura.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.setOpaque(false);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground((Color) null);
		btnNewButton.setBounds(848, 0, 59, 30);
		frmHotelAlura.getContentPane().add(btnNewButton);
	}

}
