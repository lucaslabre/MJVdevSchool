package digytal;

import digytal.dao.CadastroDao;
import digytal.model.Cadastro;

public class JDBCApplication {

	public static void main(String[] args) {
		CadastroDao dao = new CadastroDao();
		
		Cadastro cadastro = new Cadastro();
		cadastro.setNome("Roberta");
		cadastro.setTelefone(21993843784l);
		//dao.insert(cadastro);
		
		dao.deleteById(11);
	}
	
}
