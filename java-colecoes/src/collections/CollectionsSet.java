package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import dog.Dog;

public class CollectionsSet {
	
	public static void main(String[] args) {
		/*
		 * Características da Collection Set
		 * 1. não permite duplicidade de elementos
		 * 2. Não é possível manipular a ordem dos elementos
		 */
		
		// Testando os métodos HashSet, TreeSet e LinkedHashSet
		//setHashSet();
		setTreeSet();
		//setLinkedHashSet();
		
	}
	
	static void setHashSet() {
		/*
		 * Implementação padrão da Collection Set.
		 * Quando utilizamos? Quando não é necessário manter uma ordenação.
		 * Ordenação? Não é ordenado e não permite valores repetidos.
		 * Performance? Por não ter repetição de elementos e não ser ordenado,
		 * é a implementação mais performática.
		 */
		
		Set<String> hashSet = new HashSet<>();
		
		// Adiciona elemento no set e retorna um boolean se adicionou ou não.
		boolean add1 = hashSet.add("Chaves");
		boolean add2 = hashSet.add("Chiquinha");
		boolean add3 = hashSet.add("Chaves");
		
		System.out.printf("%-20s%s -- %s -- %s\n","Teste add:", add1, add2, add3);
		System.out.printf("%-20s%s\n", "Set original", hashSet);
		
		// Remover um elemento
		hashSet.remove("Chaves");
		System.out.printf("%-20s%s\n", "Remove elemento:", hashSet);
		
		// Adicionando novos elementos
		hashSet.add("Chaves");
		hashSet.add("Quico");
		hashSet.add("Nhonho");
		hashSet.add("Madruga");
		System.out.printf("%-20s%s\n", "Add elementos:",hashSet);
		
		// Descobrindo o tamanho do set com o método size()
		int tamanho = hashSet.size();
		System.out.printf("%-20s%s\n", "Tamanho do set:", tamanho);
		
		// Testando interação simples
		System.out.println("\nTeste interação simples");
		for(String str : hashSet) {
			System.out.println(str);
		}
		
		// Testando interação com Iterator
		System.out.println("\nTeste Interação com Iterator");
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			if(next == "Nhonho") {
				iterator.remove();
			}
		}
		System.out.println(hashSet);
	}
	
	static void setTreeSet() {
		/*
		 * Quando utilizar? Quando é necessário alterar a ordem através do uso de comparators.
		 * Ordenação? Mantém a ordem e pode ser reordenado.
		 * Performance? É performático para leitura. Para modificação tem a necessidade de reordenar,
		 * sendo mais lento que o LinkedHashSet.
		 */
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		// Adiciona elemento no set e retorna um boolean se adicionou ou não.
		boolean add1 = treeSet.add("Chaves");
		boolean add2 = treeSet.add("Quico");
		boolean add3 = treeSet.add("Chaves");
		System.out.printf("%-20s%s -- %s -- %s\n","Teste add:", add1, add2, add3);
		System.out.printf("%-20s%s\n", "Set original:", treeSet);
		
		// Adicionando mais elementos no set
		treeSet.add("Chiquinha");
		treeSet.add("Nhonho");
		treeSet.add("1");
		treeSet.add("3");
		treeSet.add("2");
		System.out.printf("%-20s%s\n", "Add elementos:", treeSet); // Perceba que os elementos já são adicionados ordenados
		
		// Removendo elementos
		boolean removed1 = treeSet.remove("2");
		boolean removed2 = treeSet.remove("2");
		System.out.printf("%-20s%s -- %s\n","Teste remove:", removed1, removed2);
		System.out.printf("%-20s%s\n", "Novo set:", treeSet);
		
		// Teste de iteração com Iterator
		System.out.println("\nTeste Iteração com Iterator");
		Iterator<String> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println("-->" + next);
			if(next == "Chiquinha") {
				iterator.remove();
			}
		}
		System.out.printf("%-20s%s\n", "iterator.remove():", treeSet);
		
		// Teste de adição de elementos pré-definidos
		treeSet.addAll(Set.of("3", "Chiquinha", "Nhonho", "Madruga", "2"));
		System.out.printf("%-20s%s\n", "Teste addAll:", treeSet);
		
		// Teste de remoção de todos os elementos
		treeSet.removeAll(Set.of("1", "Chaves", "Nhonho", "Girafales"));
		System.out.printf("%-20s%s\n", "Teste removeAll:", treeSet);
		
		// Teste para manter apenas os elementos desejados
		treeSet.retainAll(Set.of("2", "Quico", "Madruga"));
		System.out.printf("%-20s%s\n", "Teste retainAll:", treeSet); 
		
		// Teste contém elemento
		boolean contains1 = treeSet.contains("1");
		boolean contains2 = treeSet.contains("Quico");
		System.out.printf("%-20s%s -- %s\n","Teste contains:", contains1, contains2);
		
		// Teste tamanho set
		int size = treeSet.size();
		System.out.printf("%-20s%s\n", "Teste size:", size); 
		
		// Teste primeiro, último, antes e depois
		System.out.printf("%-20s%s\n", "Primeiro:", treeSet.first());
		System.out.printf("%-20s%s\n", "Último:", treeSet.last());
		System.out.printf("%-20s%s\n", "Antes do Madruga:", treeSet.lower("Madruga"));
		System.out.printf("%-20s%s\n", "Depois do Madruga:", treeSet.higher("Madruga"));
		
		System.out.printf("%-20s%s\n", "Set original:", treeSet);

		// Removendo elemetos e atribuindo a variáveis
		String primeiro = treeSet.pollFirst();
		System.out.printf("%-20s%s\n", "Remove primeiro:", primeiro);
		String ultimo = treeSet.pollLast();
		System.out.printf("%-20s%s\n", "Remove primeiro:", ultimo);
		System.out.printf("%-20s%s\n", "Set original:", treeSet);
		
		// Teste limpar set
		treeSet.clear();
		System.out.printf("%-20s%s\n", "Teste clear:", treeSet); 

		
		// Criando objetos para adicionar no set
		Dog dog1 = new Dog(5, "Rex");
		Dog dog2 = new Dog(3, "Pipoca");
		Dog dog3 = new Dog(8, "Flor");
		Dog dog4 = new Dog(6, "Osvaldo");
		Dog dog5 = new Dog(8, "Floquinho");
		Dog dog6 = new Dog(1, "Pipoca");
		
		// Teste de ordenação do objeto Dob pelo tamanho
		System.out.println("\nOrdenar o objeto Dog pelo tamanho:");
		TreeSet<Dog> treeSetDog = new TreeSet<>();
		
		treeSetDog.add(dog1);
		treeSetDog.add(dog2);
		treeSetDog.add(dog3);
		treeSetDog.add(dog4);
		treeSetDog.add(dog5);
		treeSetDog.add(dog6);
		
		Iterator<Dog> it = treeSetDog.iterator();
		while(it.hasNext()) {
			Dog dog = it.next();
			System.out.println(dog.getTamanho() + " " + dog.getNome());
		}
		
	}
	
	static void setLinkedHashSet() {
		/*
		 * Quando utilizar? Quando é necessário manter a ordem de inserção dos elementos.
		 * Ordenação? Mantém a ordem de inserção dos elementos.
		 * Perfomance? É a implementação mais lenta por ser necessário manter a ordem.
		 */
		

		Set<Dog> linkedHashSet = new LinkedHashSet<Dog>();
		
		Dog dog1 = new Dog(5, "Rex");
		Dog dog2 = new Dog(3, "Pipoca");
		Dog dog3 = new Dog(8, "Flor");
		Dog dog4 = new Dog(6, "Osvaldo");
		
		linkedHashSet.add(dog1);
		linkedHashSet.add(dog2);
		linkedHashSet.add(dog3);
		linkedHashSet.add(dog4);
		
		Iterator<Dog> lhsIterator = linkedHashSet.iterator();
		while (lhsIterator.hasNext()) {
			Dog dog = lhsIterator.next();
			System.out.println(dog.getTamanho() + " " + dog.getNome());
		}
		
	}
	
	static void setImutavel() {
		// Gera um Set imutável!!!
		System.out.println("\nTeste of");
		Set<String> setImutavel = Set.of("Chaves", "Chiquinha", "Quico", "Nhonho", "Madruga");
		System.out.println(setImutavel);
		
		System.out.println("\nTeste remoção de elemento");
		setImutavel.remove("Quico");
		System.out.println(setImutavel);
	}
	
}
