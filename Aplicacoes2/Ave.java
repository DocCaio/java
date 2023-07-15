package interfaces.animal;

public class Ave implements Animal {

	@Override
	public void eat() {
		System.out.println("Ave comendo");
	}

	@Override
	public void travel() {
		System.out.println("Ave viajando");
	}

}
