package webCalender;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		
		Date dt = new Date();
		System.out.println(dt);
		
		DateFormat df = new SimpleDateFormat("dd-mm-yyyy - hh-mm-ss");
		System.out.println(df.format(dt));

	}

}
