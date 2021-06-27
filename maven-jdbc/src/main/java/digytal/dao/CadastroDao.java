package digytal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import digytal.jdbc.connection.FabricaConexao;
import digytal.model.Cadastro;

public class CadastroDao {
	
	private Connection cnn;
	
	public CadastroDao() {
		FabricaConexao fc = new FabricaConexao();
		cnn = fc.criarConexao();
	}
	
	public void inserir(Cadastro cad) {
		try {
			String sql = "INSERT INTO public.tab_cadastro (nome,telefone) VALUES (?,?);";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, cad.getNome());
			st.setLong(2, cad.getTelefone());
			st.execute();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterar(int id, Cadastro updatedCadastro) {
		try {
			String sql = "UPDATE public.tab_cadastro SET nome=?, telefone=? WHERE id=?;";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, updatedCadastro.getNome());
			st.setLong(2, updatedCadastro.getTelefone());
			st.setInt(3, id);
			st.executeUpdate();
			st.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void deletarId(int id) {
		try {
			String sql = "DELETE FROM public.tab_cliente WHERE id=?;";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, id);
			st.execute();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Cadastro> listar(){
		// ResultSet -> pesquisar sobre essa classe
		List<Cadastro> lista = new ArrayList<Cadastro>();
		
		try {
			String sql = "SELECT * FROM public.tab_cadastro;";
			PreparedStatement st = cnn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Cadastro cad = new Cadastro();
				cad.setId(rs.getInt("id"));
				cad.setNome(rs.getString("nome"));
				cad.setTelefone(rs.getLong("telefone"));
				lista.add(cad);
			}
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public Cadastro buscarId(int id) {
		Cadastro cad = null;
		try {
			String sql = "SELECT * FROM public.tab_cadastro WHERE id=?;";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, id);
			
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				cad = new Cadastro();
				cad.setId(rs.getInt("id"));
				cad.setNome(rs.getString("nome"));
				cad.setTelefone(rs.getLong("telefone"));
			}
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cad;
	}
	
	public Cadastro buscarNome(String nome) {
		Cadastro cad = null;
		try {
			String sql = "SELECT * FROM public.tab_cadastro WHERE nome=?;";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, nome);
			
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				cad = new Cadastro();
				cad.setId(rs.getInt("id"));
				cad.setNome(rs.getString("nome"));
				cad.setTelefone(rs.getLong("telefone"));
			}
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cad;
	}

}
