import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AplicacaoData4 {

	public static void main(String[] args) throws ParseException
    {		        
		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
		System.out.println(calendar.getTimeInMillis());
		System.out.println(calendar.getTime());
		
		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

		int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);
		int millisecond= calendar.get(Calendar.MILLISECOND);
			
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
			
		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);
			
		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);		
    }
	
}
