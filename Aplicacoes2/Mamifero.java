package interfaces.animal;

public class Mamifero implements Animal {

	@Override
	public void eat() {
		System.out.println("Mam�fero comendo");
	}

	@Override
	public void travel() {
		System.out.println("Mam�fero viajando");
	}
}
