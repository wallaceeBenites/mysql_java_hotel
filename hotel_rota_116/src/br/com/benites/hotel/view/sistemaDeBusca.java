package br.com.benites.hotel.view;

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
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import br.com.benites.hotel.dao.processaMostraTabela;

public class sistemaDeBusca extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frmHotelAlura;
	private JTextField textField;
	
	public sistemaDeBusca(int id_logado) throws SQLException {




		frmHotelAlura = new JFrame();
		frmHotelAlura.setResizable(false);
		frmHotelAlura.setFont(new Font("Segoe UI", Font.BOLD, 20));
		frmHotelAlura.setIconImage(
				Toolkit.getDefaultToolkit().getImage(sistemaDeBusca.class.getResource("/img/aH-40px.png")));
		frmHotelAlura.setTitle("Hotel Alura");
		frmHotelAlura.setBounds(100, 100, 1044, 578);
		frmHotelAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelAlura.getContentPane().setLayout(null);
		frmHotelAlura.setVisible(true);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(sistemaDeBusca.class.getResource("/img/logo-hotel-grande.png")));
		lblNewLabel.setBounds(109, 22, 180, 164);
		frmHotelAlura.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					frmHotelAlura.dispose();
					new JanelaDoMenuDoUsuario(id_logado);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});
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
		tabbedPane.setBounds(32, 196, 967, 273);
		frmHotelAlura.getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("RESERVAS", null, panel, null);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 962, 246);
		panel.add(scrollPane);

		
		processaMostraTabela tabelaReservas66 = new processaMostraTabela();
		scrollPane.setViewportView(tabelaReservas66.mostraTabela());

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("HÓSPEDES", null, panel_1, null);
		panel_1.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 962, 246);
		panel_1.add(scrollPane_1);
		

		
		processaMostraTabela tabelaReservas67 = new processaMostraTabela();
		
		scrollPane_1.setViewportView(tabelaReservas67.mostraTabela2());

	}



}
