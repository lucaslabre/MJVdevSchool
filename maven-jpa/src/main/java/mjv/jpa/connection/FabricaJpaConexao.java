package mjv.jpa.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {	
	public Connection criarConexao() {
		String url     = "jdbc:postgresql://localhost/mjv-db";
		String user    = "postgres";
		String senha   = "postgres";
		Connection cnn = null;
		try{
	        cnn = DriverManager.getConnection(url, user, senha);
	        System.out.println("Conexão realizada com sucesso.");
	    }catch (SQLException e){
	        System.err.print(e.getMessage());
	    }
		return cnn;
	}
}
