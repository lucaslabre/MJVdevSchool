package factory;

public class Endereco {
	
	private String lograndouro;
	private Integer num;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Endereco(String lograndouro, Integer num, String bairro, String cidade, String uf) {
		super();
		this.lograndouro = lograndouro;
		this.num = num;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	@Override
	public String toString() {
		StringBuilder end = new StringBuilder();
		end.append(String.format("%s, ", this.lograndouro));
		end.append(String.format("%s, ", this.num));
		end.append(String.format("%s - ", this.bairro));
		end.append(String.format("%s", this.uf));
		return end.toString();
	}

	public String getLograndouro() {
		return lograndouro;
	}

	public void setLograndouro(String lograndouro) {
		this.lograndouro = lograndouro;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
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
