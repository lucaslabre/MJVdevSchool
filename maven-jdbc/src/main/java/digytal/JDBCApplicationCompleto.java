package digytal;

import java.util.List;

import digytal.dao.CadastroDaoCompleto;
import digytal.model.CadastroCompleto;

public class JDBCApplicationCompleto {
	public static CadastroDaoCompleto cadDao = new CadastroDaoCompleto();
	
	public static void main(String[] args) {
		//inserirCadastro();
		//deletarCadastro(2);
		//alterarCadastro(3);
		//listarCadastros();
		buscarCadastro(3);
	}

	public static CadastroCompleto fabricaCadastro() {
		CadastroCompleto cc = new CadastroCompleto();
		
		cc.setPjPf("F");
		cc.setRazaoSocial("Razão social de teste");
		cc.setCpfCnpj("92830492839");
		cc.setIns_est_rg("teste");
		cc.setTel1(984938492l);
		cc.setTel2(982734491l);
		cc.setEmail("teste@teste.com");
		cc.setAtiv_prof("Professor");
		cc.setCep("21897639");
		cc.setEstado("RJ");
		cc.setCidade("Rio de Janeiro");
		cc.setRua("Rua dos bobos");
		cc.setNumero(123);
		cc.setBairro("Bairro teste");
		
		return cc;
	}
	
	public static void inserirCadastro(){
		CadastroCompleto cc = fabricaCadastro();
		cadDao.inserir(cc);
	}
	
	private static void deletarCadastro(Integer codigo) {
		CadastroCompleto cc = fabricaCadastro();
		cadDao.excluirCodigo(codigo);;
	}
	
	private static void alterarCadastro(Integer codigo) {
		CadastroCompleto cc = new CadastroCompleto();
		cc.setPjPf("F");
		cc.setRazaoSocial("alterei a razão");
		cc.setCpfCnpj("92830492839");
		cc.setIns_est_rg("teste");
		cc.setTel1(984938492l);
		cc.setTel2(982739999l);
		cc.setEmail("alterei@teste.com");
		cc.setAtiv_prof("Desempregado");
		cc.setCep("21897639");
		cc.setEstado("RJ");
		cc.setCidade("Rio de Janeiro");
		cc.setRua("Rua dos bobos");
		cc.setNumero(123);
		cc.setBairro("Bairro teste");
		cadDao.alterarDados(codigo, cc);
	}
	
	public static void listarCadastros() {
		List<CadastroCompleto> lista = cadDao.listar();
		System.out.println(String.format("%6s|%5s|%-25s|%-14s", "Codigo", "Pj_Pf", "Razao_Social", "Cpf_Cnpj"));
		System.out.println("-".repeat(50));
		for (CadastroCompleto cc : lista) {
			System.out.println(String.format("%6d|%5s|%-25s|%-14s", 
					cc.getCodigo(), cc.getPjPf(), cc.getRazaoSocial(), cc.getCpfCnpj()));
		}
	}
	
	private static void buscarCadastro(Integer id) {
		CadastroCompleto cc = cadDao.buscarCodigo(id);
		System.out.println(String.format("%6s|%5s|%-25s|%-14s", "Codigo", "Pj_Pf", "Razao_Social", "Cpf_Cnpj"));
		System.out.println("-".repeat(50));
		System.out.println(String.format("%6d|%5s|%-25s|%-14s", 
				cc.getCodigo(), cc.getPjPf(), cc.getRazaoSocial(), cc.getCpfCnpj()));
	}
	
}
