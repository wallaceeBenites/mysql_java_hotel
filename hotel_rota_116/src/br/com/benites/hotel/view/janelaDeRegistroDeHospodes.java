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
import javax.swing.text.MaskFormatter;
import javax.swing.text.PlainDocument;

import br.com.benites.hotel.dao.processaRegistroDeHospedes;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class janelaDeRegistroDeHospodes extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JFrame frmHotelAlura;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField formattedTextField;

	
	public janelaDeRegistroDeHospodes(int id_logado) throws SQLException{
		frmHotelAlura = new JFrame();
		frmHotelAlura.setResizable(false);
		frmHotelAlura.setFont(new Font("Segoe UI", Font.BOLD, 20));
		frmHotelAlura.setIconImage(Toolkit.getDefaultToolkit().getImage(janelaDeRegistroDeHospodes.class.getResource("/img/aH-40px.png")));
		frmHotelAlura.setTitle("Hotel Alura");
		frmHotelAlura.setBounds(100, 100, 902, 596);
		frmHotelAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelAlura.getContentPane().setLayout(null);
		frmHotelAlura.setVisible(true);
		
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
		lblNewLabel_3.setBounds(583, 15, 214, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("NOME");
		lblNewLabel_3_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(535, 55, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField.setDocument(new UpperCaseDocument());
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
		
		try {
			
		MaskFormatter maskFormatter;
		maskFormatter = new MaskFormatter("(##) #####-####");
		textField_1 = new JFormattedTextField(maskFormatter);
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBackground((Color) null);
		textField_1.setBounds(535, 386, 302, 34);
		Border border_textField_1 = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
		textField_1.setBackground(null);
		textField_1.setBorder(border_textField_1);
		frmHotelAlura.getContentPane().add(textField_1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("DATA DE NASCIMENTO");
		lblNewLabel_3_1_1_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1_1_1.setBounds(535, 202, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1_1_1);
		
		
		
		try {
		MaskFormatter maskFormatterdata;	
		maskFormatterdata = new MaskFormatter("##/##/####");
		formattedTextField = new JFormattedTextField(maskFormatterdata);
		formattedTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		formattedTextField.setBounds(535, 231, 271, 34);
		frmHotelAlura.getContentPane().add(formattedTextField);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
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
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("TELEFONE");
		lblNewLabel_3_1_1_1_1_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_1_1_1_1_1.setBounds(535, 354, 262, 30);
		frmHotelAlura.getContentPane().add(lblNewLabel_3_1_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField_2.setDocument(new UpperCaseDocument());
		textField_2.setColumns(10);
		textField_2.setBackground((Color) null);
		textField_2.setBounds(535, 158, 302, 34);
		Border border_textField_2 = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlight);
		textField_2.setBackground(null);
		textField_2.setBorder(border_textField_2);
		frmHotelAlura.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textField_3.setDocument(new UpperCaseDocument());
		textField_3.setColumns(10);
		textField_3.setBackground((Color) null);
		textField_3.setBounds(535, 310, 302, 34);
		textField_3.setBorder(border_textField_2);
		frmHotelAlura.getContentPane().add(textField_3);
		
		JButton btnNewButton_1 = new JButton("SALVAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				processaRegistroDeHospedes incertIton = new processaRegistroDeHospedes();
				
			boolean resiltadoDeincert = false;
				try {
					resiltadoDeincert = (boolean) incertIton.regitraHospede(textField.getText(), textField_2.getText(), formattedTextField.getText(), textField_3.getText(),textField_1.getText(),id_logado);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				if(resiltadoDeincert) {
					frmHotelAlura.dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR HÓSPEDE");
				}
				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1.setBounds(690, 461, 136, 44);
		frmHotelAlura.getContentPane().add(btnNewButton_1);
		
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
		btnNewButton.setBounds(848, 0, 40, 30);
		frmHotelAlura.getContentPane().add(btnNewButton);
		
		
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
