package cadastro;

import factory.Endereco;

public class Cadastro {
	
	private Integer id;
	private String nome;
	private Long telefone;
	private String email;
	private Endereco endereco;
	private String cpfCnpj;
	
	public Cadastro() {}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		/*
		if(cpfCnpj.length() > 12){			
			this.cpfCnpj = String.format("%s.%s.%s/%s-%s", cpfCnpj.substring(0, 2), cpfCnpj.substring(2, 5), cpfCnpj.substring(5, 8),cpfCnpj.substring(8, 12),cpfCnpj.substring(12, 14));
		}
		else {
			this.cpfCnpj = String.format("%s.%s.%s-%s", cpfCnpj.substring(0, 3), cpfCnpj.substring(3, 6), cpfCnpj.substring(6, 9), cpfCnpj.substring(9, 11));
		}
		*/
		this.cpfCnpj = cpfCnpj;
	}
	
}
