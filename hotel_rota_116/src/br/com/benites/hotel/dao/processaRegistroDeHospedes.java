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

public class processaRegistroDeHospedes extends JFrame {

	private static final long serialVersionUID = 1L;

	public processaRegistroDeHospedes() {
	}

	public boolean regitraHospede(String NOME, String SOBRENOME, String DATA_NASCIMENTO, String NACIONALIDADE,
			String TELEFONE, int ID_USUARIO_LOGADO) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();
		Connection con = conexao.recupConexao();

		// Evitando SQL injection

		try (PreparedStatement stm = con.prepareStatement(
				"INSERT INTO HOSPEDES(NOME_HOSPEDES, SOBRENOME_HOSPEDES, DATA_NASCIMENTO, NACIONALIDADE, TELEFONE, ID_USUARIO) VALUES (?,?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);) {
			stm.setString(1, NOME);
			stm.setString(2, SOBRENOME);
			stm.setString(3, DATA_NASCIMENTO);
			stm.setString(4, NACIONALIDADE);
			stm.setString(5, TELEFONE);
			stm.setInt(6, ID_USUARIO_LOGADO);

			stm.execute();
			System.out.println("aqui ta bem ainda");
			ResultSet rst = stm.getGeneratedKeys();
			boolean hospedeCriado = false;
			while (rst.next()) {

				Integer id_do_hospede = rst.getInt(1);

				if (id_do_hospede > 0) {
					JOptionPane.showMessageDialog(null, "HÓSPEDE REGISTRADO COM SUCESSO !! Nº: " + id_do_hospede);
					new JanelaDoMenuDoUsuario(ID_USUARIO_LOGADO);
					hospedeCriado = true;
					break;

				} else {
					JOptionPane.showMessageDialog(null, "Hospede nº :" + id_do_hospede + "Erro ao criar usaurio");
					hospedeCriado = false;
					break;
				}

			}

			if (hospedeCriado == true) {
				con.close();
				return true;
			} else {
				con.close();
				return false;
			}

		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Processa  Registro de Hospedes deu uma  Exception");
			con.rollback();
			return false;
			
		}

	}

}
