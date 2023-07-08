import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AplicacaoData1 {

	public static void main(String[] args) throws ParseException
    {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe uma data no formato (dd/MM/yyyy HH:mm:ss):");
		
		String texto = input.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date data = new Date();		

		data = sdf.parse(texto);
		
		System.out.println("Data digitada em milissegundos: " + data.getTime());
		System.out.println("Data digitada no formato padrão: " + data);		

    }
	
}
