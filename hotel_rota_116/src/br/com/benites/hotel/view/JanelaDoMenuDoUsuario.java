package br.com.benites.hotel.view;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

public class JanelaDoMenuDoUsuario {

	private JFrame frmHotelAlura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaDoMenuDoUsuario window = new JanelaDoMenuDoUsuario();
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
	public JanelaDoMenuDoUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelAlura = new JFrame();
		frmHotelAlura.setResizable(false);
		frmHotelAlura.setFont(new Font("Segoe UI", Font.BOLD, 20));
		frmHotelAlura.setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaDoMenuDoUsuario.class.getResource("/img/aH-40px.png")));
		frmHotelAlura.setTitle("Hotel Alura");
		frmHotelAlura.setBounds(100, 100, 817, 502);
		frmHotelAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelAlura.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(JanelaDoMenuDoUsuario.class.getResource("/img/logo-hotel-grande.png")));
		lblNewLabel_1.setBounds(10, 23, 229, 174);
		Border border_lblNewLabel_1 = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlightText);
		lblNewLabel_1.setBorder(border_lblNewLabel_1);
		frmHotelAlura.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Registro de reservas");
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.setIcon(new ImageIcon(JanelaDoMenuDoUsuario.class.getResource("/img/icon-reservas.png")));
		btnNewButton.setBounds(36, 232, 188, 49);
		btnNewButton.setBorder(null);
		frmHotelAlura.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_1.setIcon(new ImageIcon(JanelaDoMenuDoUsuario.class.getResource("/img/icon-buscar.png")));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(SystemColor.desktop);
		btnNewButton_1.setBounds(36, 291, 188, 49);
		frmHotelAlura.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 131, 193));
		lblNewLabel.setBounds(0, 0, 253, 487);
		frmHotelAlura.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Sistema de reservas Hotel Alura");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(468, 67, 291, 49);
		frmHotelAlura.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Hoje é 12/09/2022");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 26));
		lblNewLabel_2.setBounds(286, 126, 362, 49);
		frmHotelAlura.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(64, 193, 255));
		lblNewLabel_4.setBounds(250, 70, 655, 108);
		frmHotelAlura.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Bem-vindo");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(303, 232, 130, 31);
		frmHotelAlura.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Sistema de reservas de hotéis. Controle e gerencie de forma otimizada e fácil");
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(325, 273, 488, 13);
		frmHotelAlura.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("o fluxo de reservas e hóspedes do hotel");
		lblNewLabel_6_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(325, 289, 488, 13);
		frmHotelAlura.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Esta ferramenta permitirá que você mantenha um controle completo e");
		lblNewLabel_6_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_6_1_1.setBounds(325, 314, 488, 13);
		frmHotelAlura.getContentPane().add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("detalhado de suas reservas e hóspedes, você terá acesso a ferramentas");
		lblNewLabel_6_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_6_1_2.setBounds(325, 327, 488, 13);
		frmHotelAlura.getContentPane().add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("especiais para tarefas específicas como:");
		lblNewLabel_6_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_6_1_3.setBounds(325, 339, 488, 13);
		frmHotelAlura.getContentPane().add(lblNewLabel_6_1_3);
		
		JLabel lblNewLabel_6_1_4 = new JLabel("- Registro de Reservas e Hóspedes");
		lblNewLabel_6_1_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_6_1_4.setBounds(325, 371, 488, 13);
		frmHotelAlura.getContentPane().add(lblNewLabel_6_1_4);
		
		JLabel lblNewLabel_6_1_5 = new JLabel("- Edição de Reservas e Hóspedes existentes");
		lblNewLabel_6_1_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_6_1_5.setBounds(325, 394, 488, 13);
		frmHotelAlura.getContentPane().add(lblNewLabel_6_1_5);
		
		JLabel lblNewLabel_6_1_6 = new JLabel("- Excluir todos os tipos de registros");
		lblNewLabel_6_1_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_6_1_6.setBounds(325, 417, 488, 13);
		frmHotelAlura.getContentPane().add(lblNewLabel_6_1_6);
		
		
		
		
		
		
	}
}
