package mjv.dao;

import java.sql.Connection;

import mjv.jpa.connection.FabricaConexao;

public class CadastroDao {
	private Connection cnn;
	
	public CadastroDao() {
		FabricaConexao fc = new FabricaConexao();
		cnn = fc.criarConexao();
	}
}
