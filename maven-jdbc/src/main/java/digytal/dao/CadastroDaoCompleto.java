package digytal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import digytal.jdbc.connection.FabricaConexao;
import digytal.model.CadastroCompleto;

public class CadastroDaoCompleto {
	private Connection cnn;
	
	public CadastroDaoCompleto() {
		FabricaConexao fc = new FabricaConexao();
		cnn = fc.criarConexao();
	}
	
	public void inserir(CadastroCompleto cad) {
		try {
			String sql = "INSERT INTO public.tab_cliente (pj_pf,razao_social,cpf_cnpj,ins_est_rg,tel1,tel2,"
					+ "email,ativ_prof,cep,estado,cidade,rua,numero,complemento,bairro,site,observacoes) "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, cad.getPjPf());
			st.setString(2, cad.getRazaoSocial());
			st.setString(3, cad.getCpfCnpj());
			st.setString(4, cad.getIns_est_rg());
			st.setLong(5, cad.getTel1());
			st.setLong(6, cad.getTel2());
			st.setString(7, cad.getEmail());
			st.setString(8, cad.getAtiv_prof());
			st.setString(9, cad.getCep());
			st.setString(10, cad.getEstado());
			st.setString(11, cad.getCidade());
			st.setString(12, cad.getRua());
			st.setInt(13, cad.getNumero());
			st.setString(14, cad.getComplemento());
			st.setString(15, cad.getBairro());
			st.setString(16, cad.getSite());
			st.setString(17, cad.getObservacoes());
			st.execute();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluirCodigo(Integer codigo) {
		try {
			String sql = "DELETE FROM public.tab_cliente WHERE codigo=?;";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, codigo);
			st.execute();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterarDados(Integer id, CadastroCompleto cc) {
		try {
			String sql = "UPDATE public.tab_cliente SET razao_social=?, tel2=?, email=?, ativ_prof=? "
					+ "WHERE codigo=?;";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setString(1, cc.getRazaoSocial());
			st.setLong(2, cc.getTel2());
			st.setString(3, cc.getEmail());
			st.setString(4, cc.getAtiv_prof());
			st.setInt(5, id);
			st.executeUpdate();
			st.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public List<CadastroCompleto> listar(){
		// ResultSet -> pesquisar sobre essa classe
		List<CadastroCompleto> lista = new ArrayList<CadastroCompleto>();
		
		try {
			String sql = "SELECT * FROM public.tab_cliente;";
			PreparedStatement st = cnn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				CadastroCompleto cad = new CadastroCompleto();

				cad.setCodigo(rs.getInt("codigo"));
				cad.setPjPf(rs.getString("pj_pf"));
				cad.setRazaoSocial(rs.getString("razao_social"));
				cad.setCpfCnpj(rs.getString("cpf_cnpj"));
				cad.setIns_est_rg(rs.getString("ins_est_rg"));
				cad.setTel1(rs.getLong("tel1"));
				cad.setTel2(rs.getLong("tel2"));
				cad.setEmail(rs.getString("email"));
				cad.setAtiv_prof(rs.getString("ativ_prof"));
				cad.setCep(rs.getString("cep"));
				cad.setEstado(rs.getString("estado"));
				cad.setCidade(rs.getString("cidade"));
				cad.setRua(rs.getString("rua"));
				cad.setNumero(rs.getInt("numero"));
				cad.setComplemento(rs.getString("complemento"));
				cad.setBairro(rs.getString("bairro"));
				cad.setSite(rs.getString("site"));
				cad.setObservacoes(rs.getString("observacoes"));
				
				lista.add(cad);
			}
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public CadastroCompleto buscarCodigo(Integer codigo) {
		CadastroCompleto cad = null;
		try {
			String sql = "SELECT * FROM public.tab_cliente WHERE codigo=?;";
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, codigo);
			
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				cad = new CadastroCompleto();
				cad.setCodigo(rs.getInt("codigo"));
				cad.setPjPf(rs.getString("pj_pf"));
				cad.setRazaoSocial(rs.getString("razao_social"));
				cad.setCpfCnpj(rs.getString("cpf_cnpj"));
				cad.setIns_est_rg(rs.getString("ins_est_rg"));
				cad.setTel1(rs.getLong("tel1"));
				cad.setTel2(rs.getLong("tel2"));
				cad.setEmail(rs.getString("email"));
				cad.setAtiv_prof(rs.getString("ativ_prof"));
				cad.setCep(rs.getString("cep"));
				cad.setEstado(rs.getString("estado"));
				cad.setCidade(rs.getString("cidade"));
				cad.setRua(rs.getString("rua"));
				cad.setNumero(rs.getInt("numero"));
				cad.setComplemento(rs.getString("complemento"));
				cad.setBairro(rs.getString("bairro"));
				cad.setSite(rs.getString("site"));
				cad.setObservacoes(rs.getString("observacoes"));
			}
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cad;
	}
	
}
