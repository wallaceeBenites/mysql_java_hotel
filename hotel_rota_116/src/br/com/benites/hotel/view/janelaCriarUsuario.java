package br.com.benites.hotel.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import br.com.benites.hotel.dao.processaCriaUsuario;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class janelaCriarUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frmHotelAlura;
	private JTextField textField;
	private Border border_textField_2 = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	public janelaCriarUsuario(int id_logado) throws SQLException {
		frmHotelAlura = new JFrame();
		frmHotelAlura.setResizable(false);
		frmHotelAlura.setFont(new Font("Segoe UI", Font.BOLD, 20));
		frmHotelAlura.setIconImage(
				Toolkit.getDefaultToolkit().getImage(janelaCriarUsuario.class.getResource("/img/aH-40px.png")));
		frmHotelAlura.setTitle("Hotel Alura");
		frmHotelAlura.setBounds(100, 100, 902, 596);
		frmHotelAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelAlura.getContentPane().setLayout(null);
		frmHotelAlura.setVisible(true);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(janelaCriarUsuario.class.getResource("/img/registro.png")));
		lblNewLabel.setBounds(0, 15, 481, 544);
		frmHotelAlura.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(0, 128, 192));
		lblNewLabel_1.setBounds(0, 0, 487, 559);
		frmHotelAlura.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("Criar Novo Usuario");
		lblNewLabel_3.setForeground(new Color(0, 128, 192));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3.setBounds(583, 15, 214, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("NOME");
		lblNewLabel_3_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(535, 128, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1);

		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField.setDocument(new UpperCaseDocument());
		textField.setColumns(10);
		textField.setBackground((Color) null);
		textField.setBounds(535, 157, 302, 34);
		Border border_textField = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
		textField.setBackground(null);
		textField.setBorder(border_textField);
		frmHotelAlura.getContentPane().add(textField);

		JLabel lblNewLabel_3_1_1 = new JLabel("SENHA");
		lblNewLabel_3_1_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(535, 201, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1_1);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		passwordField.setBackground((Color) null);
		passwordField.setBounds(535, 241, 317, 34);
		passwordField.setBorder(border_textField_2);
		frmHotelAlura.getContentPane().add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		passwordField_1.setBorder(border_textField_2);
		passwordField_1.setBackground((Color) null);
		passwordField_1.setBounds(535, 338, 317, 34);
		frmHotelAlura.getContentPane().add(passwordField_1);

		JButton btnNewButton_1 = new JButton("CRIAR CONTA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				processaCriaUsuario incertIton = new processaCriaUsuario();

				boolean resiltadoDeincert = false;
				try {
					resiltadoDeincert = (boolean) incertIton.regitraUsuario(textField.getText(),
							new String(passwordField.getPassword()), new String(passwordField_1.getPassword()),
							id_logado);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (resiltadoDeincert) {
					frmHotelAlura.dispose();

				} else {
					JOptionPane.showMessageDialog(null, "ERRO AO CRIAR USUARIO");
				}

			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1.setBounds(701, 403, 136, 44);
		frmHotelAlura.getContentPane().add(btnNewButton_1);

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
		btnNewButton.setOpaque(false);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground((Color) null);
		btnNewButton.setBounds(848, 0, 40, 30);
		frmHotelAlura.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_3_1_1_1 = new JLabel("CONFIRMAR SENHA");
		lblNewLabel_3_1_1_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1_1_1.setBounds(535, 285, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1_1_1);

	}

	static class UpperCaseDocument extends PlainDocument {

		private static final long serialVersionUID = 1L;

		@Override
		public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
			if (str == null) {
				return;
			}
			super.insertString(offs, str.toUpperCase(), a);
		}
	}

}
