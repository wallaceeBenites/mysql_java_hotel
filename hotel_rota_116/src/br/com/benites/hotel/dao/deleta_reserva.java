package br.com.benites.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.benites.hotel.jdbc.ConnectionFactory;

public class deleta_reserva {
	
public deleta_reserva() {
		
	}
	
	public void  DELL(Integer ID_RESERVA) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();
		Connection con = conexao.recupConexao();
		
		String sql = "DELETE FROM RESERVAS WHERE ID = ?";

		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
		     
		    pstmt.setInt(1, ID_RESERVA);                

		   
		    int linhasAfetadas = pstmt.executeUpdate();
		    System.out.println("Linhas afetadas: " + linhasAfetadas);
		} catch (SQLException e) {
		   
		    e.printStackTrace();
		}

	}
	
	
	

}
