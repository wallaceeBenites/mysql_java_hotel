package br.com.benites.hotel.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

import br.com.benites.hotel.dao.processaJanelaDeReservas;
import br.com.benites.hotel.jdbc.ConnectionFactory;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class janelaDeReservas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frmHotelAlura;
	private JTextField textField;
	private JTextField formattedTextField;
	private JTextField formattedTextField_1;
	ArrayList<String> sobrenomes = new ArrayList<>();
	DefaultComboBoxModel<String> comboBox_1;
	

	public janelaDeReservas(Integer id_logado) throws SQLException {
		
		
		ConnectionFactory conexao = new ConnectionFactory();
		Connection con = conexao.recupConexao();
		Statement stm = con.createStatement();
		stm.execute("SELECT SOBRENOME_HOSPEDES FROM HOSPEDES");
		ResultSet rst = stm.getResultSet();
		
		while (rst.next()) {
			
			String sobrenome = rst.getString("SOBRENOME_HOSPEDES");
		    sobrenomes.add(sobrenome);
			
			
		}
		rst.close();
		stm.close();
		con.close();
		
		
		
		
		frmHotelAlura = new JFrame();
		frmHotelAlura.setResizable(false);
		frmHotelAlura.setIconImage(
				Toolkit.getDefaultToolkit().getImage(janelaDeReservas.class.getResource("/img/aH-40px.png")));
		frmHotelAlura.setFont(new Font("Segoe UI", Font.BOLD, 20));
		frmHotelAlura.setTitle("Hotel Alura");
		frmHotelAlura.setBounds(100, 100, 902, 596);
		frmHotelAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelAlura.getContentPane().setLayout(null);
		frmHotelAlura.setVisible(true);

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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmHotelAlura.dispose();
					new JanelaDoMenuDoUsuario(id_logado);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
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
		lblNewLabel_3.setBounds(70, 34, 295, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("DATA DE CHECK IN");
		lblNewLabel_3_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(57, 74, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_2 = new JLabel("DATA DE CHECK OUT");
		lblNewLabel_3_2.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(57, 147, 302, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_2);

		JLabel lblNewLabel_3_3 = new JLabel("VALOR DE RESERVA");
		lblNewLabel_3_3.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_3.setBounds(57, 219, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_3);

		JLabel lblNewLabel_3_4 = new JLabel("FORMA DE PAGAMENTO");
		lblNewLabel_3_4.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_4.setBounds(57, 290, 315, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_4);

		try {

			MaskFormatter maskFormatter;
			maskFormatter = new MaskFormatter("##/##/#### ##:##");
			formattedTextField = new JFormattedTextField(maskFormatter);
			formattedTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			formattedTextField.setBounds(57, 103, 271, 34);
			frmHotelAlura.getContentPane().add(formattedTextField);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			MaskFormatter maskFormatter1;
			maskFormatter1 = new MaskFormatter("##/##/#### ##:##");
			formattedTextField_1 = new JFormattedTextField(maskFormatter1);
			formattedTextField_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			formattedTextField_1.setBounds(57, 175, 271, 34);
			frmHotelAlura.getContentPane().add(formattedTextField_1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			MaskFormatter maskFormatter2;
			maskFormatter2 = new MaskFormatter("R$###,##");
			textField = new JFormattedTextField(maskFormatter2);
			textField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			textField.setBounds(57, 246, 302, 34);
			Border border_textField = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
			textField.setBackground(null);
			textField.setBorder(border_textField);
			frmHotelAlura.getContentPane().add(textField);
			textField.setColumns(10);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 String[] pagamentos = {"DEBITO", "CREDITO", "PIX", "DINHEIRO", "DEPOSITO"};
	     DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(pagamentos);
		JComboBox<String> comboBox = new JComboBox<String>(model);
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		comboBox.setBounds(57, 322, 302, 44);
		comboBox.setBackground(null);
		comboBox.setOpaque(false);
		
		String[] arraySobrenomes = sobrenomes.toArray(new String[0]);
		DefaultComboBoxModel<String> hospedes = new DefaultComboBoxModel<>(arraySobrenomes);
		JComboBox<String> comboBox_1 = new JComboBox<>(hospedes);
		comboBox_1.setOpaque(false);
		comboBox_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		comboBox_1.setBackground((Color) null);
		comboBox_1.setBounds(57, 424, 302, 44);
		frmHotelAlura.getContentPane().add(comboBox_1);

		frmHotelAlura.getContentPane().add(comboBox);

		JButton btnNewButton_1 = new JButton("PRÓXIMO");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tipo_pagamentos = comboBox.getSelectedItem().toString();
				String nome_hospede = (String) comboBox_1.getSelectedItem();
				
				System.out.println("tipo_pagamentos : "+tipo_pagamentos);
				System.out.println("nome_hospede : "+nome_hospede);
				

				processaJanelaDeReservas incert_into = new processaJanelaDeReservas();

				boolean resultado_do_incert = false;
				try {
					resultado_do_incert = (boolean) incert_into.regitraReservas(formattedTextField.getText(),formattedTextField_1.getText(), textField.getText(), tipo_pagamentos, nome_hospede, id_logado);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (resultado_do_incert) {
					frmHotelAlura.dispose();

				} else {
					JOptionPane.showMessageDialog(null, "ERRO AO CRIAR RESERVA");
				}

			}
		});
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1.setBounds(223, 492, 136, 44);
		frmHotelAlura.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setIcon(new ImageIcon(janelaDeReservas.class.getResource("/img/icon-reservas.png")));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(0, 128, 192));
		lblNewLabel_4.setBounds(57, 175, 302, 34);
		frmHotelAlura.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(janelaDeReservas.class.getResource("/img/icon-reservas.png")));
		lblNewLabel_4_1.setOpaque(true);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_1.setBackground(new Color(0, 128, 192));
		lblNewLabel_4_1.setBounds(57, 103, 302, 34);
		frmHotelAlura.getContentPane().add(lblNewLabel_4_1);

		JLabel lblNewLabel_3_4_1 = new JLabel("SOBRENOME DO HÓSPEDE");
		lblNewLabel_3_4_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_4_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_4_1.setBounds(57, 384, 315, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_4_1);
		
		
	}
}
