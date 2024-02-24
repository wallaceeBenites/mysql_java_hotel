package br.com.benites.hotel.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmHotelAlura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
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
	public MenuPrincipal() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelAlura = new JFrame();
		frmHotelAlura.setFont(new Font("Segoe UI", Font.BOLD, 20));
		frmHotelAlura.setResizable(false);
		frmHotelAlura.getContentPane().setForeground(new Color(51, 153, 255));
		frmHotelAlura.getContentPane().setBackground(new Color(255, 255, 255));
		frmHotelAlura.setBackground(new Color(255, 255, 255));
		frmHotelAlura.setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/img/aH-40px.png")));
		frmHotelAlura.setTitle("Hotel Alura");
		frmHotelAlura.setBounds(100, 100, 1128, 593);
		frmHotelAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelAlura.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/menu-img.png")));
		lblNewLabel.setBounds(0, 0, 906, 520);
		frmHotelAlura.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Desenvolvido por Wallace Benites © 2024");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(0, 104, 208));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 519, 1180, 37);
		frmHotelAlura.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/logo-hotel-grande.png")));
		lblNewLabel_2.setBounds(933, 43, 152, 130);
		frmHotelAlura.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/login.png")));
		btnNewButton.setBounds(966, 265, 105, 81);
		btnNewButton.setBorder(null);
		Color corDaborda = new Color(0, 150, 255);
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			@Override
            public void mouseEntered(MouseEvent e) {
				
                // Define a borda  quando o mouse entra
				btnNewButton.setBorder(BorderFactory.createLineBorder(corDaborda, 1));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Define a borda padrão quando o mouse sai
            	btnNewButton.setBorder(null);
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
            	btnNewButton.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            	frmHotelAlura.dispose();
            	paginaLoguin.main(null);


            }

            @Override
            public void mouseReleased(MouseEvent e) {
            	btnNewButton.setBorder(null); // Remove a borda ao liberar o clique do botão
            }
			
			
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		frmHotelAlura.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setForeground(new Color(0, 128, 255));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(966, 218, 105, 37);
		frmHotelAlura.getContentPane().add(lblNewLabel_3);
	}
}
