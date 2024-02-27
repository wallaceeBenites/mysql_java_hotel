package br.com.benites.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;




import br.com.benites.hotel.jdbc.ConnectionFactory;


public class up_reservas {
	
	public up_reservas() {
		
	}
	
	public void updateReservas(String DATA_ENTRADA, String DATA_SAIDA, String VALOR, String Forma_Pagamento,Integer ID_RESERVA) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();
		Connection con = conexao.recupConexao();
		
		String sql = "UPDATE RESERVAS SET DATA_ENTRADA = ?, DATA_SAIDA = ?, VALOR = ?, Forma_Pagamento = ? WHERE ID = ?";

		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
		   
		    pstmt.setString(1, DATA_ENTRADA);       
		    pstmt.setString(2, DATA_SAIDA);         
		    pstmt.setString(3, VALOR);              
		    pstmt.setString(4, Forma_Pagamento);     
		    pstmt.setInt(5, ID_RESERVA);                

		    int linhasAfetadas = pstmt.executeUpdate();
		    System.out.println("Linhas afetadas: " + linhasAfetadas);
		} catch (SQLException e) {
		   
		    e.printStackTrace();
		}

	}
	
	
	

}
