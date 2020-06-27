package covid19proj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class CovidJsonUtil {

	public static ArrayList<String> makeArrayofDates() throws ParseException {

		ArrayList<String> arr = new ArrayList<String>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		int MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
		

		arr.add("01/03/2020");
		String nextDate = "01/03/2020";
		Date dateObj = new Date();
		
		while(!(nextDate.equalsIgnoreCase(sdf.format(dateObj)))) {
			nextDate = sdf.format(sdf.parse(nextDate).getTime() + MILLIS_IN_DAY);
			arr.add(nextDate);
		}
		return arr;
	}

}
