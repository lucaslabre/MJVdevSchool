package digytal;

import digytal.dao.CadastroDao;
import digytal.model.Cadastro;

public class JDBCApplication {

	public static void main(String[] args) {
		CadastroDao dao = new CadastroDao();
		
		Cadastro cadastro = new Cadastro();
		cadastro.setNome("Marcos");
		cadastro.setTelefone(21974839284l);
		dao.inseart(cadastro);
		
		//dao.deleteById(6);
	}
	
}
