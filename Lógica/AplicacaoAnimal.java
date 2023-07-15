package interfaces.animal;

public class AplicacaoAnimal {

	public static void main(String[] args) {

		Mamifero mam = new Mamifero();
		mam.travel();

		Ave ave = new Ave();
		ave.travel();
		ave.descansar();
		Animal.dormir();
	}

}
