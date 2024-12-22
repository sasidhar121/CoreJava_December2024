package day22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {
		
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    String strDate = formatter.format(date);
	    System.out.println(strDate);
	    
	    
	    SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy");
	    String strDate1 = formatter1.format(date);
	    System.out.println(strDate1);
	    
	    
	    SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy  hh:mm:ss");
	    String strDate3 = formatter2.format(date);
	    System.out.println(strDate3);
	
	    SimpleDateFormat formatter4 = new SimpleDateFormat("dd-M-yyyy  hh:mm:ss");
	    String strDate4 = formatter4.format(date);
	    System.out.println(strDate4);
	    
	    
	    SimpleDateFormat formatter5 = new SimpleDateFormat("dd MMM yyyy  zzzz");
	    String strDate5 = formatter5.format(date);
	    System.out.println(strDate5);
	    
	    SimpleDateFormat formatter6 = new SimpleDateFormat("dd MMM yyyy  zzzz HH:MM:SS z");
	    String strDate6 = formatter6.format(date);
	    System.out.println(strDate6);
	}

}
