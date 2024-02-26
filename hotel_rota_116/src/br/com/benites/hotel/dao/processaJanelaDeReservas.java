package br.com.benites.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.com.benites.hotel.jdbc.ConnectionFactory;
import br.com.benites.hotel.view.JanelaDoMenuDoUsuario;

public class processaJanelaDeReservas extends JFrame {

	private static final long serialVersionUID = 1L;

	public processaJanelaDeReservas() {
	}

	public boolean regitraReservas(String DATA_ENTRADA, String DATA_SAIDA, String VALOR, String Forma_Pagamento,
			String nome_hospede, Integer ID_USUARIO_LOGADO) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();
		Connection con = conexao.recupConexao();

		Statement stm = con.createStatement();
		stm.execute("SELECT ID_HOSPEDES FROM HOSPEDES where SOBRENOME_HOSPEDES ='" + nome_hospede + "';");
		ResultSet rst = stm.getResultSet();
		int id_do_hospede = 0;
		while (rst.next()) {

			id_do_hospede = rst.getInt("ID_HOSPEDES");
		}

		// Evitando SQL injection
		try (PreparedStatement stm1 = con.prepareStatement(
				"INSERT INTO RESERVAS(DATA_ENTRADA, DATA_SAIDA, VALOR, Forma_Pagamento, ID_HOSPEDES, ID_USUARIO) VALUES (?,?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);) {

			stm1.setString(1, DATA_ENTRADA);
			stm1.setString(2, DATA_SAIDA);
			stm1.setString(3, VALOR);
			stm1.setString(4, Forma_Pagamento);
			stm1.setInt(5, id_do_hospede);
			stm1.setInt(6, ID_USUARIO_LOGADO);

			stm1.execute();

			ResultSet rst1 = stm1.getGeneratedKeys();
			boolean reservaCriado = false;
			while (rst1.next()) {

				Integer id_da_reserva = rst1.getInt(1);

				if (id_da_reserva > 0) {
					JOptionPane.showMessageDialog(null,
							"RESERVA CRIADA COM SUCESSO !! O NUMERO DA SUA RESERVA É Nº: " + id_da_reserva);
					new JanelaDoMenuDoUsuario(ID_USUARIO_LOGADO);
					reservaCriado = true;
					break;

				} else {
					JOptionPane.showMessageDialog(null, "ERROR AO ABRIR RESERVA");
					reservaCriado = false;
					break;
				}

			}

			if (reservaCriado == true) {
				con.close();
				return true;
			} else {
				con.close();
				return false;
			}

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Processa  Registro de reservas deu uma  Exception");
			con.rollback();
			return false;
		}

	}

}
