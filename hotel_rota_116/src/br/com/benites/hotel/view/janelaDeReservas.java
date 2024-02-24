package br.com.benites.hotel.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class janelaDeReservas {

	private JFrame frmHotelAlura;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaDeReservas window = new janelaDeReservas();
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
	public janelaDeReservas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelAlura = new JFrame();
		frmHotelAlura.setResizable(false);
		frmHotelAlura.setIconImage(Toolkit.getDefaultToolkit().getImage(janelaDeReservas.class.getResource("/img/aH-40px.png")));
		frmHotelAlura.setFont(new Font("Segoe UI", Font.BOLD, 20));
		frmHotelAlura.setTitle("Hotel Alura");
		frmHotelAlura.setBounds(100, 100, 902, 596);
		frmHotelAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelAlura.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(janelaDeReservas.class.getResource("/img/reservas-img-3.png")));
		lblNewLabel.setBounds(411, 163, 467, 343);
		frmHotelAlura.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(janelaDeReservas.class.getResource("/img/Ha-100px.png")));
		lblNewLabel_1.setBounds(579, 25, 160, 150);
		frmHotelAlura.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(0, 128, 192));
		lblNewLabel_2.setBounds(401, 0, 487, 559);
		frmHotelAlura.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.setBackground(null);
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton.setBounds(10, 0, 59, 30);
		frmHotelAlura.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("SISTEMA DE RESERVAS");
		lblNewLabel_3.setForeground(new Color(0, 128, 192));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3.setBounds(96, 54, 295, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("DATA DE CHECK IN");
		lblNewLabel_3_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(57, 107, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("DATA DE CHECK OUT");
		lblNewLabel_3_2.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(57, 191, 302, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("VALOR DE RESERVA");
		lblNewLabel_3_3.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_3.setBounds(57, 275, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("FORMA DE PAGAMENTO");
		lblNewLabel_3_4.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_4.setBounds(57, 370, 315, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_4);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		formattedTextField.setBounds(57, 147, 271, 34);
		frmHotelAlura.getContentPane().add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		formattedTextField_1.setBounds(57, 231, 271, 34);
		frmHotelAlura.getContentPane().add(formattedTextField_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		textField.setBounds(57, 315, 302, 34);
		Border border_textField = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
		textField.setBackground(null);
		textField.setBorder(border_textField);
		frmHotelAlura.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		comboBox.setBounds(57, 410, 302, 44);
		comboBox.setBackground(null);
		comboBox.setOpaque(false);
		
		frmHotelAlura.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("PRÓXIMO");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1.setBounds(223, 482, 136, 44);
		frmHotelAlura.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setIcon(new ImageIcon(janelaDeReservas.class.getResource("/img/icon-reservas.png")));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(0, 128, 192));
		lblNewLabel_4.setBounds(57, 231, 302, 34);
		frmHotelAlura.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(janelaDeReservas.class.getResource("/img/icon-reservas.png")));
		lblNewLabel_4_1.setOpaque(true);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_1.setBackground(new Color(0, 128, 192));
		lblNewLabel_4_1.setBounds(57, 147, 302, 34);
		frmHotelAlura.getContentPane().add(lblNewLabel_4_1);
	}
}
