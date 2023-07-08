import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AplicacaoData3 {

	public static void main(String[] args) throws ParseException
    {
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Informe a primeira data no formato (dd/MM/yyyy HH:mm:ss):");		
		String texto1 = input.nextLine();
		Date data1 = new Date();		
		data1 = sdf.parse(texto1);
		System.out.println("Data digitada em milissegundos: " + data1.getTime());

		System.out.println("Informe a Segunda data no formato (dd/MM/yyyy HH:mm:ss):");		
		String texto2 = input.nextLine();
		Date data2 = new Date();		
		data2 = sdf.parse(texto2);
		System.out.println("Data digitada em milissegundos: " + data2.getTime());

		Date data3 = new Date(data1.getTime() - data2.getTime());		
		System.out.println("Data digitada em milissegundos: " + data3.getTime());
		
		System.out.println("Diferença em segundos: " + data3.getTime() / 60000 );
		System.out.println("Diferença em minutos: " + data3.getTime() / 3600000 );
		System.out.println("Diferença em horas: " + data3.getTime() / 60000 );
		System.out.println("Diferença em dias: " + data3.getTime() / 86400000 );
		System.out.println("Diferença em meses: " + (data3.getTime() / 86400000) / 30 );
		
		
		
    }
	
}
