package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cadastro.CD;
import cadastro.Cadastro;
import cadastro.Empresa;
import cadastro.Livro;
import factory.Endereco;
import factory.FabricaCadastro;
import pedidos.Pedido;
import pedidos.PedidoItem;

public class Application {
	
	public static void main(String[] args) {
		
		// creating the client
		Cadastro cli1 = new Cadastro();
		cli1.setNome("Lucas");
		cli1.setEmail("lucaslabre@gmail.com");
		cli1.setTelefone(21984068589l);
		
		// creating the editor
		Cadastro ed1 = new Cadastro();
		ed1.setNome("Intrinseca");
		ed1.setEmail("intrinseca@intrinseca.com");
		ed1.setTelefone(22983740293l);
		
		// creating the book
		Livro l1 = new Livro();
		l1.setTitulo("Java para leigos");
		l1.setEditora(ed1);
		l1.setPaginas(200);
		l1.setValorVenda(100.0);
		
		// creating the artist using the FabricaCadastro static class
		Cadastro art1 = FabricaCadastro.criarCadastro("Guns n' Roses", "guns@guns.com", 21987987698l);	
		
		// creating the cd
		CD cd1 = new CD();
		cd1.setTitulo("Welcome to the jungle");
		cd1.setArtista(art1);
		cd1.setFaixa(10);
		cd1.setValorVenda(200.0);
		
		/* creating the company
		 * parameters: im, ie
		 */
		Empresa empresa = new Empresa(20930184l, 918372839l);
		
		// registering the company
		Cadastro cadEmpresa = FabricaCadastro.criarCadastro("Duvivier Mesa Posta", "duviviermesaposta@gmail.com", 21984938584l);
		Endereco endereco = new Endereco("Rua João XXII", 500, "Hambuurgo", "R. Janeiro", "RJ");
		cadEmpresa.setEndereco(endereco);
		//cadEmpresa.setEndereco("Rua João XXII, 500, Hambuurgo - R. Janeiro - RJ");
		cadEmpresa.setCpfCnpj("92032784000101");
		
		empresa.setCadastro(cadEmpresa);
		
		// creating the request
		Pedido pedido1 = new Pedido();
		pedido1.setEmpresa(empresa);
		pedido1.setCliente(cli1);
		
		
		// creating the buyer
		Cadastro comprador = FabricaCadastro.criarCadastro("Lucas", "lucaslabre@gmail.com", 21983928403l);
		
		pedido1.setCliente(comprador);
		pedido1.setData(new Date(2021,6,21));
		pedido1.setValorTotal(325.0);
		pedido1.setId(23234);
		
		List<PedidoItem> itens = new ArrayList<>();
		PedidoItem item = new PedidoItem();
		item.setProduto(l1);
		item.setQuantidade(2.0);
		item.setValorVenda(l1.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());
		
		itens.add(item);
		
		item= new PedidoItem();
		item.setProduto(cd1);
		item.setQuantidade(4.0);
		item.setValorVenda(cd1.getValorVenda());
		item.setValorTotal(item.getQuantidade() * item.getValorVenda());
		
		itens.add(item);
		
		pedido1.setItens(itens);
		
		PrinterApp.imprimirPedido(pedido1);
		
	}

}
