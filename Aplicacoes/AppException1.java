public class AppException1 {
		
	public static void main(String args[]) throws ProfessorUgoNaoDaException {		
		metodo1();
	}
	
	private static void metodo1(){
		metodo2();
	}

	private static void metodo2(){
		String frase = null;
		String novaFrase = null;
		novaFrase = frase.toUpperCase();
	}
	
}
