package transmissores;

import java.util.Date;

public class TransmissorEmail extends TransmissorMensagem{
	
	private String titulo;
	
	public TransmissorEmail(Date data) {
		super(data);
	}
	
	@Override
	public void enviar(String mensagem) {
		
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
}
