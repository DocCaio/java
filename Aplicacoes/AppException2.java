public class AppException2 {
		
	public static void main(String args[]) throws ProfessorUgoNaoDaException {		
			metodo1();
	}
	
	private static void metodo1(){
		metodo2();
	}

	private static void metodo2(){
		String frase = null;
		String novaFrase = null;
		try {
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException ne) {
			System.out.println("Exceção tratado no método 2");
		}
	}
	
}
