import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AplicacaoData2 {

	public static void main(String[] args) throws ParseException
    {
		Date data = new Date();		

		data.setTime(1499260517000L);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf1.format(data));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf2.format(data));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm:ss 'do dia' dd 'do mês' MM 'do ano' yyyy");
		System.out.println(sdf3.format(data));

    }
	
}
