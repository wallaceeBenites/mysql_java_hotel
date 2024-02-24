package br.com.benites.hotel.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.Component;
import java.awt.Toolkit;

public class sistemaDeBusca {

	private JFrame frmHotelAlura;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sistemaDeBusca window = new sistemaDeBusca();
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
	public sistemaDeBusca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelAlura = new JFrame();
		frmHotelAlura.setResizable(false);
		frmHotelAlura.setFont(new Font("Segoe UI", Font.BOLD, 20));
		frmHotelAlura.setIconImage(Toolkit.getDefaultToolkit().getImage(sistemaDeBusca.class.getResource("/img/aH-40px.png")));
		frmHotelAlura.setTitle("Hotel Alura");
		frmHotelAlura.setBounds(100, 100, 1044, 578);
		frmHotelAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelAlura.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(sistemaDeBusca.class.getResource("/img/logo-hotel-grande.png")));
		lblNewLabel.setBounds(109, 22, 180, 164);
		frmHotelAlura.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.setOpaque(false);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground((Color) null);
		btnNewButton.setBounds(10, 0, 59, 30);
		frmHotelAlura.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("SISTEMA DE BUSCA");
		lblNewLabel_3.setForeground(new Color(0, 128, 192));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_3.setBounds(373, 51, 295, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		textField.setColumns(10);
		textField.setBackground((Color) null);
		textField.setBounds(555, 141, 302, 34);
		textField.setBackground(null);
		Border border_textField = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
		textField.setBorder(border_textField);
		frmHotelAlura.getContentPane().add(textField);
		
		JButton btnNewButton_1 = new JButton("BUSCAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1.setBounds(863, 141, 136, 34);
		frmHotelAlura.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("DELETAR");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1_1.setBounds(867, 487, 136, 44);
		frmHotelAlura.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("EDITAR");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_2.setFocusPainted(false);
		btnNewButton_1_2.setBackground(new Color(0, 128, 192));
		btnNewButton_1_2.setBounds(691, 487, 136, 44);
		frmHotelAlura.getContentPane().add(btnNewButton_1_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		tabbedPane.setBounds(27, 196, 972, 273);
		frmHotelAlura.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setToolTipText("");
		tabbedPane.addTab("Reservas", null, tabbedPane_2, null);
		
		JButton btnNewButton_2 = new JButton("New button");
		tabbedPane_2.addTab("New tab", null, btnNewButton_2, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Hospedes", null, tabbedPane_1, null);
	}
}
