package br.com.benites.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import br.com.benites.hotel.jdbc.ConnectionFactory;
import br.com.benites.hotel.view.JanelaDoMenuDoUsuario;

public class processaCriaUsuario {
	public processaCriaUsuario() {
	}

	public boolean regitraUsuario(String NOME, String SENHA, String CONFIRMA_SENHA, int ID_USUARIO_LOGADO)
			throws SQLException {

		if (!SENHA.equals(CONFIRMA_SENHA)) {
			JOptionPane.showMessageDialog(null, "AS SENHAS NÃO SÃO IGUAIS");
			return false;
		}

		ConnectionFactory conexao = new ConnectionFactory();
		Connection con = conexao.recupConexao();

		// Evitando SQL injection

		try (PreparedStatement stm = con.prepareStatement(
				"INSERT INTO USUARIO(NOME_USUARIO, SENHA, ID_CATEGORIA) VALUES (?,?,?)",
				Statement.RETURN_GENERATED_KEYS);) {

			stm.setString(1, NOME);
			stm.setString(2, SENHA);
			stm.setInt(3, 2); // fixar a crianção de usuario para funciona

			stm.execute();
			System.out.println("aqui ta bem ainda");
			ResultSet rst = stm.getGeneratedKeys();
			boolean USUARIO_Criado = false;
			while (rst.next()) {

				Integer id_do_USUARIO = rst.getInt(1);

				if (id_do_USUARIO > 0) {
					JOptionPane.showMessageDialog(null, "USUARIO CRIADO COM SUCESSO !! Nº: " + id_do_USUARIO);
					new JanelaDoMenuDoUsuario(ID_USUARIO_LOGADO);
					USUARIO_Criado = true;
					break;

				} else {
					JOptionPane.showMessageDialog(null, "Hospede nº :" + id_do_USUARIO + "Erro ao criar usaurio");
					USUARIO_Criado = false;
					break;
				}

			}

			if (USUARIO_Criado == true) {
				con.close();
				return true;
			} else {
				con.close();
				return false;
			}

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Processa  cria usuario deu uma  Exception");
			con.rollback();
			return false;
		}

	}

}
