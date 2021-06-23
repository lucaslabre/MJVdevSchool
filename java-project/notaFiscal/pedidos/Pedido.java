package pedidos;

import java.util.Date;
import java.util.List;

import cadastro.Cadastro;
import cadastro.Empresa;

public class Pedido {
	
	private Integer id;
	private Date data;
	private Double valorTotal;
	private Cadastro cliente;
	private Integer ccf;
	private Integer coo;
	private Empresa empresa;
	private List<PedidoItem> itens;

	public void setItens(List<PedidoItem> itens) {
		this.itens = itens;
	}
	public List<PedidoItem> getItens() {
		return itens;
	}	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	public Integer getCcf() {
		return ccf;
	}
	public void setCcf(Integer ccf) {
		this.ccf = ccf;
	}
	public Integer getCoo() {
		return coo;
	}
	public void setCoo(Integer coo) {
		this.coo = coo;
	}

}
