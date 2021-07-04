package comparator;

import java.util.Comparator;

import dog.Dog;

public class DogComparator implements Comparator<Dog> {
	
	// Implementa��o devido � interface Comparable
	public int compare(Dog dog1, Dog dog2) {
		return dog1.getNome().compareTo(dog2.getNome());
	}
		
}
