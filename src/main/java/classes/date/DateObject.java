package classes.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Convert a string "25/01/2013" into Date object      - Wrong o/p
 */
public class DateObject {

	public void convertion() throws ParseException {
		String str = "26/04/2013";

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date d = sdf.parse(str);
		System.out.println(d);  //Sat Jan 26 00:04:00 IST 2013
	}

	public static void main(String[] args) throws ParseException {
		DateObject obj = new DateObject();
		obj.convertion();
	}
}
