package digytal;

import java.util.List;

import digytal.dao.CadastroDao;
import digytal.model.Cadastro;

public class JDBCApplication {
	
	public static CadastroDao dao = new CadastroDao();
	
	public static void main(String[] args) {
		
		//inserir();
		//deletarId(20);
		/*
		Cadastro cad = new Cadastro();
		cad.setNome("Maria");
		cad.setTelefone(983728493l);
		alterar(10, cad);
		*/
		//buscarId(10);
		listar();
		
	}
	
	private static Cadastro fabricaCadastro() {
		Cadastro cadastro = new Cadastro();
		cadastro.setNome("Angelo");
		cadastro.setTelefone(21998763784l);
		return cadastro;
	}
	
	private static void inserir() {
		Cadastro cad = dao.buscarNome(fabricaCadastro().getNome());
		if (cad==null) {			
			Cadastro cadastro = fabricaCadastro();
			dao.inserir(cadastro);
		}else
			System.out.println("Cadastro já existe!");
	}
	
	private static void listar() {
		List<Cadastro> cad = dao.listar();
		for (Cadastro c : cad) {
			System.out.println(String.format("%2d -> %8s -> %11d", c.getId(), c.getNome(), c.getTelefone()));
		}
	}
	
	private static void deletarId(int id) {
		dao.deletarId(id);
	}
	
	private static void alterar(int id, Cadastro cadastro) {
		dao.alterar(id, cadastro);
	}
	
	private static void buscarId(int id) {
		Cadastro c = dao.buscarId(id);
		System.out.println(String.format("%d -> %s -> %d", c.getId(), c.getNome(), c.getTelefone()));
	}
	
}
