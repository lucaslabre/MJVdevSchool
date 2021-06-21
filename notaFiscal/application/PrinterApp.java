package application;

import java.text.SimpleDateFormat;

import cadastro.Empresa;
import pedidos.Pedido;

public class PrinterApp {
	public static void imprimirPedido(Pedido pedido) {
		//GERAR O CUPOM
		//CRIAR O OBJETO - ENDERECO - LOGRADOURO, NUMERO, BAIRRO, CIDADE - SIGLA ESTADO
		//FORMATAR O CNPJ, IE, EM - PLUS
		
		//System.out.printf("Mr.%2$s,%1$s\n\n", "Lucas", "Labre");
		
		Empresa empresa = pedido.getEmpresa();
		
		StringBuilder sb = new StringBuilder();
		sb.append(empresa.getCadastro().getNome() + "\n");
		sb.append(empresa.getCadastro().getEndereco() + "\n");
		
		
		String cpfCnpj = empresa.getCadastro().getCpfCnpj();
		if(cpfCnpj.length() > 12){			
			cpfCnpj = String.format("%s.%s.%s/%s-%s", cpfCnpj.substring(0, 2), cpfCnpj.substring(2, 5), cpfCnpj.substring(5, 8),cpfCnpj.substring(8, 12),cpfCnpj.substring(12, 14));
		}
		else {
			cpfCnpj = String.format("%s.%s.%s-%s", cpfCnpj.substring(0, 3), cpfCnpj.substring(3, 6), cpfCnpj.substring(6, 9), cpfCnpj.substring(9, 11));
		}
		
		
		sb.append(String.format("CNPJ: %s \n", cpfCnpj));
		sb.append(String.format("IE: %d\nIM: %d\n",empresa.getIe(), empresa.getIm()));
		
		sb.append("-".repeat(50));
		
		//NUMA LINHA DATA FORMATADA - CCF (6) DIGITOS - COO (6DIGITOS)
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		String dataFormatada = formatador.format(pedido.getData());
		sb.append(String.format("\n%sV  CCF:%-10s CCO:%s\n", dataFormatada, "000025", "000280"));
		
		sb.append("-".repeat(50));
		
		sb.append(String.format("\nTOTAL %.2f", pedido.getValorTotal()));
		
		
		
		
		
		
		System.out.println(sb.toString());
		/*
		System.out.println(empresa.getCadastro().getNome());
		System.out.println(empresa.getCadastro().getEndereco());
		System.out.println("CNPJ:" + empresa.getCadastro().getCpfCnpj());
		System.out.println("IE:" +empresa.getIe());
		System.out.println("IM:" +empresa.getIm());
		*/
		
	}
}

