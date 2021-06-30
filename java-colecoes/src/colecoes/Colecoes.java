package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import dog.Dog;

public class Colecoes {	
	public static void main(String[] args) {
		//N�O USAR RECURSOS DO LAMBDA Strem Java 8
		//Inclus�o, Remo��o, Altera��o
		//SubListas
		//Busca por indices
		//Comparable e Comparator
		//Intera��es
		//Collections (sort, sufle, reverse)
		
		//setHashSet();
		//setTreeSet();
		setLinkedHashSet();
		
	}
	
	//Tentando trazer um cen�rio
	static void list() {
		//List - ArrayList / Vector / LinkedList
		//Permite duplicidade
	}
	static void setHashSet() {
		//N�o permite duplicidade
		System.out.println("Teste 1");
		Set<String> set = new HashSet<String>();
		boolean add1 = set.add("Ol�");
		boolean add2 = set.add("mundo");
		boolean add3 = set.add("Ol�");
		System.out.println(String.format("%s -- %s -- %s", add1, add2, add3));
		System.out.println(set);
		
		
		System.out.println("\nTeste 2");
		Set<String> set2 = Set.of("Ol�", "mundo", "acorda", "para", "vida");
		System.out.println(set2);
		
		
		System.out.println();
		
		
		System.out.println("\nTeste Intera��o");
		for(String str : set2) {
			System.out.println(str);
		}
		
		
		System.out.println("\nTeste Intera��o 2");
		Iterator<String> iterator = set2.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
	}
	
	static void setTreeSet() {
		System.out.println("Teste 1");
		Set set = new TreeSet();
		boolean add1 = set.add("Ol�");
		boolean add2 = set.add("mundo");
		boolean add3 = set.add("Ol�");
		System.out.println(String.format("%s -- %s -- %s", add1, add2, add3));
		System.out.println(set);
		
		set.add("1");
		set.add("3");
		set.add("2");
		System.out.println(set);
		
		System.out.println("\nTeste Itera��o");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
		
		System.out.println("\nTeste remove");
		boolean removed1 = set.remove("1");
		boolean removed2 = set.remove("1");
		System.out.println(String.format("%s -- %s", removed1, removed2));
		System.out.println(set);
		
		System.out.println("\nTeste addAll");
		set.addAll(Set.of("1", "mundo", "acorda", "para", "vida"));
		System.out.println(set);
		
		System.out.println("\nTeste removeAll");
		set.removeAll(Set.of("1", "mundo", "acorda", "para", "vida"));
		System.out.println(set);
		
		System.out.println("\nTeste retainAll");  //mant�m os iguais
		set.retainAll(Set.of("1", "3", "Ol�", "mundo"));
		System.out.println(set);
		
		System.out.println("\nTeste contains");
		boolean contains1 = set.contains("3");
		boolean contains2 = set.contains("mundo");
		System.out.println(String.format("%s -- %s", contains1, contains2));
		
		System.out.println("\nTeste size");
		int size = set.size();
		System.out.println(size);
		
		System.out.println("\nTeste clear");
		set.clear();
		System.out.println(set);
		
		
		// M�todos especiais do TreeSet
		System.out.println("Ordenar o objeto Dog pelo tamanho");
		Dog dog1 = new Dog(5, "Rex");
		Dog dog2 = new Dog(3, "Pipoca");
		Dog dog3 = new Dog(8, "Flor");
		Dog dog4 = new Dog(6, "Osvaldo");
		
		Set setDog = new TreeSet();
		setDog.add(dog1);
		setDog.add(dog2);
		setDog.add(dog3);
		setDog.add(dog4);
		
		Iterator<Dog> it = setDog.iterator();
		while(it.hasNext()) {
			Dog dog = it.next();
			System.out.println(dog.getTamanho() + " " + dog.getNome());
		}
		
	}
	
	static void setLinkedHashSet() {
		System.out.println("Teste itera��o LinkedHashSet");
		Dog dog1 = new Dog(5, "Rex");
		Dog dog2 = new Dog(3, "Pipoca");
		Dog dog3 = new Dog(8, "Flor");
		Dog dog4 = new Dog(6, "Osvaldo");
		
		Set<Dog> lhs = new LinkedHashSet<Dog>();
		lhs.add(dog1);
		lhs.add(dog2);
		lhs.add(dog3);
		lhs.add(dog4);
		
		Iterator<Dog> lhsIterator = lhs.iterator();
		while (lhsIterator.hasNext()) {
			Dog dog = lhsIterator.next();
			System.out.println(dog.getTamanho() + " " + dog.getNome());
		}
	}
	
	
	static void map() {
		//Chave valor
	}
	static void queue() {
		//Fila - Pilha
	}

}