package br.com.benites.hotel.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.benites.hotel.jdbc.ConnectionFactory;

public class processaMostraTabela {
	
	private JTable tableReservas;
	private JTable tableReservas1;
	private DefaultTableModel model_tabela;
	private DefaultTableModel model_tabela1;

	ArrayList<Integer> Id_reserva = new ArrayList<>();
	ArrayList<String> DATA_ENTRADA = new ArrayList<>();
	ArrayList<String> DATA_SAIDA = new ArrayList<>();
	ArrayList<String> VALOR = new ArrayList<>();
	ArrayList<String> Forma_Pagamento = new ArrayList<>();
	ArrayList<String> NOME_USUARIO = new ArrayList<>();
	ArrayList<String> NOME_HOSPEDES = new ArrayList<>();
	ArrayList<String> SOBRENOME_HOSPEDES = new ArrayList<>();
	
	ArrayList<String> DATA_NASCIMENTO = new ArrayList<>();
	ArrayList<String> NACIONALIDADE = new ArrayList<>();
	ArrayList<String> TELEFONE = new ArrayList<>();
	

	public processaMostraTabela() throws SQLException{
		
		ConnectionFactory conexao = new ConnectionFactory();
		Connection con = conexao.recupConexao();
		Statement stm = con.createStatement();
		String query = "SELECT * " + "FROM RESERVAS R " + "INNER JOIN HOSPEDES H ON R.ID_HOSPEDES = H.ID_HOSPEDES "
				+ "INNER JOIN USUARIO U ON R.ID_USUARIO = U.ID_USUARIO";
		stm.execute(query);
		ResultSet rst = stm.getResultSet();

		while (rst.next()) {

			Integer id = rst.getInt("ID");
			Id_reserva.add(id);

			String dataEntrada = rst.getString("DATA_ENTRADA");
			DATA_ENTRADA.add(dataEntrada);

			String datasairda = rst.getString("DATA_SAIDA");
			DATA_SAIDA.add(datasairda);

			String valor_reserva = rst.getString("VALOR");
			VALOR.add(valor_reserva);

			String formaPagamento = rst.getString("Forma_Pagamento");
			Forma_Pagamento.add(formaPagamento);

			String NomeDofuncionario = rst.getString("NOME_USUARIO");
			NOME_USUARIO.add(NomeDofuncionario);

			String nome_do_hospede = rst.getString("NOME_HOSPEDES");
			NOME_HOSPEDES.add(nome_do_hospede);

			String sobreno_do_hospede = rst.getString("SOBRENOME_HOSPEDES");
			SOBRENOME_HOSPEDES.add(sobreno_do_hospede);

			String nascimento_hospede = rst.getString("DATA_NASCIMENTO");
			DATA_NASCIMENTO.add(nascimento_hospede);

			String nacionalidade_hospede = rst.getString("NACIONALIDADE");
			NACIONALIDADE.add(nacionalidade_hospede);

			String tele_hospede = rst.getString("TELEFONE");
			TELEFONE.add(tele_hospede);

		}

		rst.close();
		stm.close();
		con.close();
		
		tableReservas = new JTable();
		model_tabela = new DefaultTableModel();
	   tableReservas.setModel(model_tabela);

		model_tabela.addColumn("Numero de reserva");
		model_tabela.addColumn("Data de entrada");
		model_tabela.addColumn("Data de saida");
		model_tabela.addColumn("Valor da reserva");
		model_tabela.addColumn("Forma de pagamento");
		model_tabela.addColumn("Funcionario que atendeu");
		model_tabela.addColumn("Nome do hóspede");
		model_tabela.addColumn("Sobrenome do hóspede");
		
		
		tableReservas1 = new JTable();
		model_tabela1 = new DefaultTableModel();
		tableReservas1.setModel(model_tabela1);
		
		model_tabela1.addColumn("Nome");
		model_tabela1.addColumn("Sobrenome");
		model_tabela1.addColumn("Data de nascimento");
		model_tabela1.addColumn("Nacionalidade");
		model_tabela1.addColumn("Telefone");
		model_tabela1.addColumn("Funcionario que registrou ");
		
	}
	
	public JTable mostraTabela() {
		
		

		for (int i = 0; i < Id_reserva.size(); i++) {

			Object[] fila = new Object[8];
			fila[0] = Id_reserva.get(i);
			fila[1] = DATA_ENTRADA.get(i);
			fila[2] = DATA_SAIDA.get(i);
			fila[3] = VALOR.get(i);
			fila[4] = Forma_Pagamento.get(i);
			fila[5] = NOME_USUARIO.get(i);
			fila[6] = NOME_HOSPEDES.get(i);
			fila[7] = SOBRENOME_HOSPEDES.get(i);

			 model_tabela.addRow(fila);

		}
		return tableReservas;

	}
	
	public JTable mostraTabela2() {

		for (int i = 0; i < Id_reserva.size(); i++) {

			Object[] fila1 = new Object[8];
			fila1[0] = NOME_HOSPEDES.get(i);
			fila1[1] = SOBRENOME_HOSPEDES.get(i);
			fila1[2] = DATA_NASCIMENTO.get(i);
			fila1[3] = NACIONALIDADE.get(i);
			fila1[4] = TELEFONE.get(i);
			fila1[5] = NOME_USUARIO.get(i);
		

			model_tabela1.addRow(fila1);

		}
		
		return tableReservas1;

	}

}
