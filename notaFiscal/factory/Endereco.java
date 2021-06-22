package factory;

public class Endereco {
	
	private Long cep;
	private String lograndouro;
	private String num; // pode ser S/N
	private String bairro;
	private String cidade;
	private String uf;
	
	public void setCep(Long cep) {
		this.cep = cep;
	}
	
	public Long getCep() {
		return cep;
	}

	public String getLograndouro() {
		return lograndouro;
	}

	public void setLograndouro(String lograndouro) {
		this.lograndouro = lograndouro;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
