package digytal.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import digytal.jdbc.connection.FabricaConexao;
import digytal.model.Cadastro;

public class CadastroDao {
	
	private Connection cnn;
	
	public CadastroDao() {
		FabricaConexao fc = new FabricaConexao();
		cnn = fc.criarConexao();
	}
	
	public void inseart(Cadastro cad) {
		try {
			String fmt = "INSERT INTO public.tab_cadastro (nome,telefone) VALUES ('%s',%d);";
			String sql = String.format(fmt, cad.getNome(), cad.getTelefone());
			Statement st = cnn.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterar() {
		
	}
	
	public void deleteById(int id) {
		try {
			String fmt = "DELETE FROM public.tab_cadastro WHERE id=%d;";
			String sql = String.format(fmt, id);
			Statement st = cnn.createStatement();
			st.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
