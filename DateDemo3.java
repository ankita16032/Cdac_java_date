package date;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo3 {

	public static void main(String[] args) {
	
		Date d =new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf= new SimpleDateFormat(" dd/MM/yy");
		System.out.println("date is "+sdf.format(d));
		
		SimpleDateFormat sdf1= new SimpleDateFormat(" dd MMM yy");
		System.out.println("date is "+sdf1.format(d));
		
		SimpleDateFormat sdf2= new SimpleDateFormat(" yyyy.MMM.dd hh:mm:ss a");
		System.out.println("date is "+sdf2.format(d));
		

		SimpleDateFormat sdf3= new SimpleDateFormat(" d MMMM y");
		System.out.println("date is "+sdf3.format(d));
		
	}

}
