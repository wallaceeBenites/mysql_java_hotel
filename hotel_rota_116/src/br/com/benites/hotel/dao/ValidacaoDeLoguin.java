package br.com.benites.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

import br.com.benites.hotel.jdbc.ConnectionFactory;
import br.com.benites.hotel.view.JanelaDoMenuDoUsuario;

public class ValidacaoDeLoguin extends JFrame {

	private static final long serialVersionUID = 1L;

	public ValidacaoDeLoguin() {
	}

	public boolean validaSenha(String Usuario, String Senha) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();
		Connection con = conexao.recupConexao();

		try (PreparedStatement stm = con
				.prepareStatement("SELECT ID_USUARIO, NOME_USUARIO, SENHA, ID_CATEGORIA FROM USUARIO");

		) {
			stm.execute();

			ResultSet rst = stm.getResultSet();

			boolean usuarioEncontrado = false;
			while (rst.next()) {
				Integer id = rst.getInt("ID_USUARIO");
				System.out.println(id);

				String nome_usuario = rst.getString("NOME_USUARIO");
				System.out.println(nome_usuario);

				String senha_usuario = rst.getString("SENHA");
				System.out.println(senha_usuario);

				Integer id_categoria = rst.getInt("ID_CATEGORIA");
				System.out.println(id_categoria);

				if (Usuario.equals(nome_usuario) && Senha.equals(senha_usuario)) {

					new JanelaDoMenuDoUsuario(id);
					usuarioEncontrado = true;
					break;

				}

			}

			if (usuarioEncontrado == true) {
				con.close();
				return true;
			} else {
				con.close();
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("validação de loguin deu uma  Exception");
			con.rollback();
			return false;
		}

	}

}
