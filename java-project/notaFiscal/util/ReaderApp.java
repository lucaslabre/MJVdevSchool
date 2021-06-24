package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import pedidos.Pedido;

public class ReaderApp {
	
	public static List<Pedido> gerarPedido(File dir, String fileName) throws Exception {
		SimpleDateFormat formatador = new SimpleDateFormat("yyyyMMdd");
		List<String> linhas = read(dir, fileName);
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		for (String l : linhas) {
			String [] campos = l.split("\\|");
			Pedido p = new Pedido();
			p.setData(formatador.parse(campos[0]));
			p.setCcf(Integer.valueOf(campos[1]));
			p.setCoo(Integer.valueOf(campos[2]));
			
			pedidos.add(p);
		}
		
		return pedidos;
	}
	
	public static List<String> read(File dir, String fileName) throws Exception {
		Path path = new File(dir, fileName).toPath();
		return Files.readAllLines(path);
	}

}
