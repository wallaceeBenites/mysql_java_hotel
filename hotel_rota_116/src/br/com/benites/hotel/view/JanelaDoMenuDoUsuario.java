package br.com.benites.hotel.view;

import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import br.com.benites.hotel.jdbc.ConnectionFactory;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaDoMenuDoUsuario extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JFrame frmHotelAlura;

	
	public JanelaDoMenuDoUsuario(Integer id_logado) throws SQLException {
		
		ConnectionFactory conexao = new ConnectionFactory();
		Connection con = conexao.recupConexao();
		
		
		System.out.println("ID do usuario chegou aqui ? : numero : "+id_logado);
		
		Statement stm = con.createStatement();
		stm.execute("SELECT NOME_USUARIO, ID_CATEGORIA FROM USUARIO where ID_USUARIO ="+id_logado+";");
		ResultSet rst = stm.getResultSet();
		String nome_usuario = null;
		int id_categoria_do_usuario_logado = 0;
		while (rst.next()) {
			 nome_usuario = rst.getString("NOME_USUARIO");
			 id_categoria_do_usuario_logado = rst.getInt("ID_CATEGORIA");
		}
		System.out.println("ID do CATEGORIA chegou aqui ? : numero : "+id_categoria_do_usuario_logado);
		Statement stm1 = con.createStatement();
		stm1.execute("SELECT NOME_CATEGORIA FROM CATEGORIA_DE_USUARIO where ID_CATEGORIA = "+id_categoria_do_usuario_logado+";");
		ResultSet rst1 = stm1.getResultSet();
		String nome_categoria = null;
		while (rst1.next()) {
			nome_categoria = rst1.getString("NOME_CATEGORIA");
			 
		}
		
		con.close();

		
		

		
		
		// janela começa aqui 
		frmHotelAlura = new JFrame();
		frmHotelAlura.setResizable(false);
		frmHotelAlura.setFont(new Font("Segoe UI", Font.BOLD, 20));
		frmHotelAlura.setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaDoMenuDoUsuario.class.getResource("/img/aH-40px.png")));
		frmHotelAlura.setTitle("Hotel Alura");
		frmHotelAlura.setBounds(100, 100, 817, 502);
		frmHotelAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelAlura.getContentPane().setLayout(null);
		frmHotelAlura.setVisible(true);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(JanelaDoMenuDoUsuario.class.getResource("/img/logo-hotel-grande.png")));
		lblNewLabel_1.setBounds(10, 23, 229, 174);
		Border border_lblNewLabel_1 = BorderFactory.createMatteBorder(0, 0, 3, 0, SystemColor.textHighlightText);
		lblNewLabel_1.setBorder(border_lblNewLabel_1);
		frmHotelAlura.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Registro de reservas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					frmHotelAlura.dispose();
					new	janelaDeReservas(id_logado);
				} catch (SQLException e1) {
					
					e1.printStackTrace();
					
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.setIcon(new ImageIcon(JanelaDoMenuDoUsuario.class.getResource("/img/icon-reservas.png")));
		btnNewButton.setBounds(36, 273, 188, 49);
		btnNewButton.setBorder(null);
		frmHotelAlura.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHotelAlura.dispose();
				try {
					new	sistemaDeBusca(id_logado);
				} catch (SQLException e1) {
	
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_1.setIcon(new ImageIcon(JanelaDoMenuDoUsuario.class.getResource("/img/icon-buscar.png")));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(SystemColor.desktop);
		btnNewButton_1.setBounds(36, 227, 188, 49);
		frmHotelAlura.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Registro de hóspedes");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				frmHotelAlura.dispose();
				new	janelaDeRegistroDeHospodes(id_logado);
			} catch (SQLException e1) {

				e1.printStackTrace();
				
			}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(JanelaDoMenuDoUsuario.class.getResource("/img/icon-reservas.png")));
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_2.setForeground(SystemColor.text);
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(SystemColor.desktop);
		btnNewButton_2.setBounds(36, 325, 188, 49);
		frmHotelAlura.getContentPane().add(btnNewButton_2);
		
	if(id_categoria_do_usuario_logado == 1) {
			JButton btnNewButton_3 = new JButton("Criar Novo Usuario");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						frmHotelAlura.dispose();
						new	janelaCriarUsuario(id_logado);
					} catch (SQLException e1) {
	
						e1.printStackTrace();
						
					}
					
				}
			});
	
			
		btnNewButton_3.setIcon(new ImageIcon(JanelaDoMenuDoUsuario.class.getResource("/img/icon-reservas.png")));
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_3.setForeground(SystemColor.text);
		btnNewButton_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(SystemColor.desktop);
		btnNewButton_3.setBounds(36, 376, 188, 49);
		frmHotelAlura.getContentPane().add(btnNewButton_3);
		}
		
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 131, 193));
		lblNewLabel.setBounds(0, 0, 253, 487);
		frmHotelAlura.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Sistema de reservas Hotel Alura");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(468, 67, 291, 49);
		frmHotelAlura.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("USUARIO: "+ nome_usuario + "  CARGO: "+nome_categoria);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_2.setBounds(286, 126, 461, 49);
		frmHotelAlura.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(64, 193, 255));
		lblNewLabel_4.setBounds(250, 70, 655, 108);
		frmHotelAlura.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Bem-vindo");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(303, 232, 104, 31);
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
		
		JLabel lblNewLabel_5_1 = new JLabel(nome_usuario);
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_5_1.setBounds(404, 232, 266, 31);
		frmHotelAlura.getContentPane().add(lblNewLabel_5_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(303, 103, 45, 13);
		frmHotelAlura.getContentPane().add(label);
		
		
		
		
		
		
		
		
		
		
	}
}
