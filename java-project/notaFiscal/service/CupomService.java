package service;

import java.text.SimpleDateFormat;
import java.util.List;

import cadastro.Empresa;
import factory.Endereco;
import pedidos.Pedido;
import pedidos.PedidoItem;
import util.FormatUtil;

public class CupomService {
	public static String gerarCupom(Pedido pedido) {
		
		final int MAX_LINE = 63;
		final int MAX_TITLE = 24;
		Empresa empresa = pedido.getEmpresa();
		Endereco end = empresa.getCadastro().getEndereco();		
		String cpfCnpj = empresa.getCadastro().getCpfCnpj();
		StringBuilder sb = new StringBuilder();	
		List<PedidoItem> itens = pedido.getItens();
		
		sb.append(empresa.getCadastro().getNome() + "\n");
		sb.append(String.format("%s, %s, %s - %s - %s CEP: %s\n", end.getLograndouro(), end.getNum(), end.getBairro(), end.getCidade(), 
				end.getUf(), FormatUtil.formatCep(end.getCep().toString())));		
		sb.append(String.format("CNPJ: %s \n", FormatUtil.formatCpfCnpj(cpfCnpj)));
		sb.append(String.format("IE: %11s\nIM: %11s", FormatUtil.formatIe(empresa.getIe().toString()), FormatUtil.formatIm(empresa.getIm().toString())));
		
		sb.append(FormatUtil.insertLine(MAX_LINE));
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		String dataFormatada = formatador.format(pedido.getData());
		sb.append(String.format("%-40s  CCF:%06d CCO:%06d", dataFormatada + "V", pedido.getCcf(), pedido.getCoo()));
		sb.append(FormatUtil.insertLine(MAX_LINE));
		sb.append("CUPOM FISCAL\n");
		sb.append(String.format("%-24s%13s%13s%13s\n" , "ITEM", "QTD.", "VL UNIT(R$)", "VL ITEM(R$)"));
		
		
		
		for (PedidoItem i : itens) {
			sb.append(String.format("%-24s%13.2f%13.2f%13.2f\n", FormatUtil.quebraLinha(i.getProduto().getTitulo(), MAX_TITLE), 
					i.getQuantidade(), i.getValorVenda(), i.getValorTotal()));
		}
		
		sb.append(FormatUtil.insertLine(MAX_LINE));
		sb.append(String.format("%-53s%10.2f","TOTAL", pedido.getValorTotal()));
		
		
		sb.append(FormatUtil.insertLine(MAX_LINE));
		return sb.toString();
	}
}
