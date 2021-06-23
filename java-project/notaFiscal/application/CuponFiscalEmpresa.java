package application;

import cadastro.Empresa;

public class CuponFiscalEmpresa {
	
	public static void main(String[] args) {
		Empresa empresa = new Empresa(987897l, 987654l);
		empresa.setNome("Duvivier Mesa Posta");
		empresa.setTelefone(21928304928l);
		empresa.setEmail("duviviermesaposta@gmail.com");
		
		
		System.out.println(empresa.getCadastro().getNome());
		
	}

}
