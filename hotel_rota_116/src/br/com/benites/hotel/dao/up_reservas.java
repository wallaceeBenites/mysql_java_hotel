package br.com.benites.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import br.com.benites.hotel.jdbc.ConnectionFactory;
import br.com.benites.hotel.view.JanelaDoMenuDoUsuario;

public class up_reservas {
	
	public up_reservas() {
		
	}
	
	public void updateReservas(String DATA_ENTRADA, String DATA_SAIDA, String VALOR, String Forma_Pagamento,Integer ID_RESERVA, Integer ID_USUARIO_LOGADO) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();
		Connection con = conexao.recupConexao();
		
		String sql = "UPDATE RESERVAS SET DATA_ENTRADA = ?, DATA_SAIDA = ?, VALOR = ?, Forma_Pagamento = ? WHERE ID = ?";

		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
		    // Substitua os parâmetros na declaração SQL pelos valores desejados
		    pstmt.setString(1, DATA_ENTRADA);        // novaDataEntrada é a nova data de entrada
		    pstmt.setString(2, DATA_SAIDA);           // novaDataSaida é a nova data de saída
		    pstmt.setString(3, VALOR);               // novoValor é o novo valor
		    pstmt.setString(4, Forma_Pagamento);      // novaFormaPagamento é a nova forma de pagamento
		    pstmt.setInt(5, ID_RESERVA);                  // idReserva é o ID da reserva que será atualizada

		    // Execute o comando de atualização
		    int linhasAfetadas = pstmt.executeUpdate();
		    System.out.println("Linhas afetadas: " + linhasAfetadas);
		} catch (SQLException e) {
		    // Trate qualquer exceção que possa ocorrer durante a execução do comando SQL
		    e.printStackTrace();
		}

	}
	

}
