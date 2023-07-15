package interfaces.animal;

public class Mamifero implements Animal {

	@Override
	public void eat() {
		System.out.println("Mamífero comendo");
	}

	@Override
	public void travel() {
		System.out.println("Mamífero viajando");
	}
}
