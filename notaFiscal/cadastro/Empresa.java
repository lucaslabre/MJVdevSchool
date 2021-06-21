package cadastro;

import pedidos.Pedido;

public class Empresa extends Cadastro{
	
	private Cadastro cadastro;
	private Long ie;
	private Long im;
	private Pedido pedido;
	
	public Empresa(Long im, Long ie){
		this.ie = ie;
		this.im = im;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public Pedido getPedido() {
		return pedido;
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
