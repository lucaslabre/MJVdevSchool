package application;

import java.text.SimpleDateFormat;

import cadastro.Empresa;
import factory.Endereco;
import pedidos.Pedido;
import util.FormatUtil;

public class PrinterApp {
	public static void imprimirPedido(Pedido pedido) {
		
		//System.out.printf("Mr.%2$s,%1$s\n\n", "Lucas", "Labre");
		
		Empresa empresa = pedido.getEmpresa();
		
		Endereco end = empresa.getCadastro().getEndereco();		
		String cpfCnpj = empresa.getCadastro().getCpfCnpj();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("%s\n", "-".repeat(63)));
		sb.append(empresa.getCadastro().getNome() + "\n");
		sb.append(String.format("%s, %s, %s - %s - %s CEP: %s\n", end.getLograndouro(), end.getNum(), end.getBairro(), end.getCidade(), 
				end.getUf(), FormatUtil.formatCep(end.getCep().toString())));		
		sb.append(String.format("CNPJ: %s \n", FormatUtil.formatCpfCnpj(cpfCnpj)));
		sb.append(String.format("IE: %11s\nIM: %11s", FormatUtil.formatIe(empresa.getIe().toString()), FormatUtil.formatIm(empresa.getIm().toString())));
		sb.append(String.format("\n%s\n", "-".repeat(63)));
		
		//NUMA LINHA DATA FORMATADA - CCF (6) DIGITOS - COO (6DIGITOS)
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		String dataFormatada = formatador.format(pedido.getData());
		sb.append(String.format("%-40s  CCF:%06d CCO:%06d", dataFormatada + "V", pedido.getCcf(), pedido.getCoo()));
		
		sb.append(String.format("\n%s\n", "-".repeat(63)));
		
		sb.append(String.format("TOTAL %.2f", pedido.getValorTotal()));
		
		
		
		System.out.println(sb.toString());
		
	}
}

