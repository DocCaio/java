import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DataUtil {

	public static Date converter( String data, String formato ){
		
		SimpleDateFormat dtf = new SimpleDateFormat(formato);
		try {
			return dtf.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void exibir( Date data, String formato ){
		SimpleDateFormat dtf = new SimpleDateFormat(formato);
		System.out.println( dtf.format(data) );		
	}
	
}
