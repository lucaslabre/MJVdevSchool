package application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrinterApp {
	public static void print(String conteudo, File dir, String fileName) throws IOException {
		File cupom = new File(dir,"cupom.txt");
		PrinterApp.print(conteudo, dir, cupom);
	}
	
	public static void print(String conteudo, File dir, File file) throws IOException {
		if (!dir.exists())
			dir.mkdir();
		Path path = new File(dir, file.getName()).toPath();
		Files.write(path, conteudo.getBytes());
		
		/*
		if (!dir.exists()) 
			dir.mkdir();
		
		try {
			file.createNewFile();
			FileWriter arq = new FileWriter(file.getPath());
			PrintWriter gravar = new PrintWriter(arq);
			
			gravar.print(conteudo);
			arq.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
}

