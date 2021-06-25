package digytal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import digytal.jdbc.connection.FabricaConexao;
import digytal.model.Cadastro;

public class CadastroDao {
	
	private Connection cnn;
	
	public CadastroDao() {
		FabricaConexao fc = new FabricaConexao();
		cnn = fc.criarConexao();
	}
	
	public void insert(Cadastro cad) {
		try {
			String sql = "INSERT INTO public.tab_cadastro (nome,telefone) VALUES (?,?);";
			//String sql = String.format(fmt, cad.getNome(), cad.getTelefone());
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, cad.getNome());
			st.setLong(2, cad.getTelefone());
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterar() {
		
	}
	
	public void deleteById(int id) {
		try {
			String sql = "DELETE FROM public.tab_cadastro WHERE id=?;";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, id);
			st.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Cadastro> listar(){
		// ResultSet -> pesquisar sobre essa classe
		return null;
	}
	
	public Cadastro buscar() {
		return null;
	}

}
