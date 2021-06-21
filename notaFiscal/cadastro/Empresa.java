package cadastro;

public class Empresa extends Cadastro{
	
	private Cadastro cadastro;
	private Long ie;
	private Long im;
	
	public Empresa(Long im, Long ie){
		this.ie = ie;
		this.im = im;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public Long getIe() {
		return ie;
	}

	public Long getIm() {
		return im;
	}

}
