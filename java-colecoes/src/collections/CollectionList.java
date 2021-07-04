package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import comparator.DogComparator;
import dog.Dog;

public class CollectionList {
	
	public static void main(String[] args) {
		/*
		List<String> nomes = new ArrayList<>();
		nomes.add("Chaves");
		nomes.add("Quico");
		nomes.add("Chiquinha");
		nomes.add("Nhonho");
		nomes.add("Florinda");
		System.out.printf("%-20s%s\n", "Lista original:", nomes);
		
		nomes.add(2, "Madruga");
		System.out.printf("%-20s%s\n", "add(2, \"Madruga\"):", nomes);
		
		nomes.set(1, "Girafales");
		System.out.printf("%-20s%s\n", "set(1, \"Girafales\"):", nomes);
		
		Collections.sort(nomes);
		System.out.printf("%-20s%s\n", "sort():", nomes);
		
		// Qual nome será eliminado?
		nomes.remove(3);
		System.out.printf("%-20s%s\n", "remove(3):", nomes);
		
		nomes.remove("Florinda");
		System.out.printf("%-20s%s\n", "remove(\"Florinda\"):", nomes);
		
		String nome = nomes.get(1);
		System.out.printf("%-20s%s\n", "get(1):", nome);
		
		int tamanho = nomes.size();
		System.out.printf("%-20s%s\n", "size():", tamanho);
		
		boolean existeNhonho = nomes.contains("Nhonho");
		System.out.printf("%-20s%s\n", "contains(\"Nhonho\"):", existeNhonho);
		
		boolean existeFlorinda = nomes.contains("Florinda");
		System.out.printf("%-20s%s\n", "contains(\"Florinda\"):", existeFlorinda);
		
		boolean listaVazia1 = nomes.isEmpty();
		System.out.printf("%-20s%s\n", "isEmpty():", listaVazia1);
		
		// O que sairá na posição?
		int posicao = nomes.indexOf("Chiquinha");
		System.out.printf("%-20s%s\n", "indexOf(\"Chiquinha\"):", posicao);
		
		// O que acontece se eu procurar um elemento que não existe?
		int elementoNaoExiste = nomes.indexOf("Florinda");
		System.out.printf("%-20s%s\n", "indexOf(\"Florinda\"):", elementoNaoExiste);
		
		// Interações
		System.out.println("\nInterações\n");
		for(String item : nomes) {
			System.out.println("--> "+ item);
		}
		
		Iterator<String> iterator = nomes.iterator();
		while(iterator.hasNext()) {
			System.out.println("----> "+ iterator.next());
		}
		*/
		//testeCopia();
		ordenaObjetos();
	}
	
	static void testeCopia() {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Chaves");
		nomes.add("Quico");
		nomes.add("Chiquinha");
		nomes.add("Nhonho");
		nomes.add("Florinda");
		System.out.printf("%-20s%s\n", "Lista original:", nomes);
		
		List<String> copia = nomes;  //cópia da lista original
		System.out.printf("%-20s%s\n", "Lista copia:", copia);
		
		
		nomes.clear();
		System.out.printf("%-20s%s\n", "Lista original:", nomes);
		System.out.printf("%-20s%s\n", "Lista copia:", copia);		
		
		
		/*
		List<String> copiaVerdade = new ArrayList<>();
		copiaVerdade.addAll(nomes);
		

		nomes.clear();
		System.out.printf("%-20s%s\n", "Lista original:", nomes);
		System.out.printf("%-20s%s\n", "Lista copia:", copia);
		System.out.printf("%-20s%s\n", "Lista copia verdade:", copiaVerdade);
		*/
	}
	
	static void ordenaObjetos() {
		// Criando objetos para adicionar no set
		Dog dog1 = new Dog(5, "Rex");
		Dog dog2 = new Dog(3, "Pipoca");
		Dog dog3 = new Dog(8, "Flor");
		Dog dog4 = new Dog(6, "Osvaldo");
		Dog dog5 = new Dog(8, "Floquinho");
		Dog dog6 = new Dog(1, "Pipoca");
		
		List<Dog> lista = new ArrayList<>();
		
		lista.add(dog1);
		lista.add(dog2);
		lista.add(dog3);
		lista.add(dog4);
		lista.add(dog5);
		lista.add(dog6);
		
		// Ordenando por nome
		lista.sort(Comparator.comparing(Dog::getNome));
		imprime("Ordenando por nome", lista);
		
		// Ordenando por tamanho
		lista.sort(Comparator.comparingInt(Dog::getTamanho));
		imprime("Ordenando por tamanho", lista);
		
		// Inverte a ordenação
		lista.sort(Comparator.comparingInt(Dog::getTamanho).reversed());
		imprime("Inverte a ordenação", lista);
		
		// Ordenando do maior para o menor
		lista.sort((first, second) -> second.getTamanho() - first.getTamanho());
		imprime("Ordenando do maior para o menor", lista);
		
		// Ordenando por uma classe que implementa Comparator
		Collections.sort(lista, new DogComparator());
		imprime("Ordenando por uma classe que implementa Comparator", lista);
	}
	
	static void imprime(String texto, List<Dog> lista) {
		System.out.println(texto);
		for (Dog d : lista) {			
			System.out.println(d.getTamanho() + " " + d.getNome() );
		}
		System.out.println();
	}
}
