package br.com.benites.hotel.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import br.com.benites.hotel.dao.processaMostraTabelaPesquisandoNumeroDeReserva;
import br.com.benites.hotel.dao.processaMostraTabelaPesquisandoSobrenome;


public class sistemaDeBusca extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frmHotelAlura;
	private JTextField textField;
	private processaMostraTabelaPesquisandoSobrenome pesquisasomente_sobrenome = null;
	private processaMostraTabelaPesquisandoNumeroDeReserva pesquisasomente_numero_de_reserva = null;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private processaMostraTabela tabelaReservas66;
	private boolean condMostroutabela1 = false;
	private boolean condMostroutabela2 = false;
	private boolean condMostroutabela3 = false;
	

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

				System.out.println("TESTANDO TEXFILED" + textField.getText());
				condMostroutabela1 = false;
				condMostroutabela2 = false;
				condMostroutabela3 = false;

				try {
					
					 

					
					if (textField.getText().isEmpty()) {

						tabelaReservas66 = new processaMostraTabela();
						scrollPane.setViewportView(tabelaReservas66.mostraTabela());
						scrollPane_1.setViewportView(tabelaReservas66.mostraTabela2());
						
						condMostroutabela1 = true;

					} else {
						
						
						
						try {
							
							
							
							int numeroInteiro_id_reserva = Integer.parseInt(textField.getText());

							pesquisasomente_numero_de_reserva = new processaMostraTabelaPesquisandoNumeroDeReserva(textField.getText());
							scrollPane.setViewportView(pesquisasomente_numero_de_reserva.mostraTabelaPesquisada1());
							scrollPane_1.setViewportView(pesquisasomente_numero_de_reserva.mostraTabelaPesquisada2());

							System.out.println("é numero " + numeroInteiro_id_reserva);
							
							condMostroutabela2 = true;

						} catch (NumberFormatException x) {
							
							pesquisasomente_sobrenome = new processaMostraTabelaPesquisandoSobrenome(textField.getText());
							scrollPane.setViewportView(pesquisasomente_sobrenome.mostraTabelaPesquisada1());
							scrollPane_1.setViewportView(pesquisasomente_sobrenome.mostraTabelaPesquisada2());
							
							condMostroutabela3 = true;
						}

					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				// pesquisasomente_sobrenome.mostraTabelaPesquisada1();

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
				
				
				if(condMostroutabela1){
					tabelaReservas66.deletaRESERVAS();
					 JOptionPane.showMessageDialog(null, "Reserva Deletada com Sucesso");
					 
					 condMostroutabela1 = false;
				};
				
				if(condMostroutabela2){
					pesquisasomente_numero_de_reserva.deletaRESERVAS();
					 JOptionPane.showMessageDialog(null, "Reserva Deletada com Sucesso");
					condMostroutabela2 = false;
				};
				
				if(condMostroutabela3){
				pesquisasomente_sobrenome.deletaRESERVAS();
				 JOptionPane.showMessageDialog(null, "Reserva Deletada com Sucesso");
					condMostroutabela3 = false;
				};
				
				
				
				
				
				
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setBackground(new Color(0, 128, 192));
		btnNewButton_1_1.setBounds(867, 487, 136, 44);
		frmHotelAlura.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("EDITAR");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(condMostroutabela1){
					tabelaReservas66.UptabelaRESERVAS();
					 JOptionPane.showMessageDialog(null, "Edição feita com sucesso");
					 
					 condMostroutabela1 = false;
				};
				
				if(condMostroutabela2){
					pesquisasomente_numero_de_reserva.UptabelaRESERVAS();
					JOptionPane.showMessageDialog(null, "Edição feita com sucesso");
					condMostroutabela2 = false;
				};
				
				if(condMostroutabela3){
				pesquisasomente_sobrenome.UptabelaRESERVAS();
					JOptionPane.showMessageDialog(null, "Edição feita com sucesso");
					condMostroutabela3 = false;
				};
		
				
				
				
				
			}
		});
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

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 962, 246);
		panel.add(scrollPane);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("HÓSPEDES", null, panel_1, null);
		panel_1.setLayout(null);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 962, 246);
		panel_1.add(scrollPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("Pesquise por sobrenome ou numero de reserva!");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_1.setBounds(565, 184, 346, 13);
		frmHotelAlura.getContentPane().add(lblNewLabel_1);

	}

}
