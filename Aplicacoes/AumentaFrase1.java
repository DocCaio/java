public class AumentaFrase1 {

	public static void main(String[] args) {

		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		} catch (ClassCastException ne) {
			System.out.println("Deu erro");
			frase = "Frase vazia";
		}
		
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
		
	}

}
