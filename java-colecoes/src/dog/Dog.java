package dog;

import java.util.Comparator;

/*
public class Dog {
	
	Integer tamanho;

	public Dog(Integer tamanho) {
		this.tamanho = tamanho;
	}
	
	public void latir() {
		System.out.println("au au");
	}
}

*/

public class Dog implements Comparable<Dog>{
	
	Integer tamanho;
	String nome;

	public Dog(Integer tamanho, String nome) {
		this.tamanho = tamanho;
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Integer getTamanho() {
		return tamanho;
	}
	
	
	// Implementação devido à interface Comparable
	@Override
	public int compareTo(Dog dog) {
		
		if (this.tamanho < dog.tamanho)
			return -1;
		if (this.tamanho > dog.tamanho)
			return 1;
		return 0;
		
		//return this.tamanho - dog.tamanho
	}
	
	/*
	@Override
	public int compareTo(Dog dog) {
		return this.getNome().compareTo(dog.getNome());
	}
	*/
}


/*
 * O método compareTo() tem como retorno um int com as seguintes características:
 * 		Valor negativo, coloca o objeto atual à esquerda;
 * 		Valor positivo, coloca o objeto atual à direita; 
 * 		Valor zero, entende que é lemento repetido e não insere.
 */

