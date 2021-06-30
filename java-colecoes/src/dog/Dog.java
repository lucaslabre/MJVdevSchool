package dog;

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
	
	public void latir() {
		System.out.println("au au");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Integer getTamanho() {
		return tamanho;
	}
	
	@Override
	public int compareTo(Dog dog) {
		return this.tamanho - dog.tamanho;
	}
}


