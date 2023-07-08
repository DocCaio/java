public class AumentaFrase2 {

	public static void main(String[] args) {

		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException ne) {
			System.out.println("Deu erro");
			frase = "Frase vazia";
		}
		finally {
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
		
	}

}
