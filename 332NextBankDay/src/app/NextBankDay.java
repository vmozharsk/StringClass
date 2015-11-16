package app;

import java.text.SimpleDateFormat;
import java.util.*;

public class NextBankDay {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = getNextBankDate(d1);
		SimpleDateFormat dtFrm = new SimpleDateFormat("dd.MM.yyyy"); 
        String txt = "Given date = " + dtFrm.format(d1) + ";    next bank date = " + dtFrm.format(d2);
        System.out.println(txt);
  
        GregorianCalendar calendar = new GregorianCalendar(2014, GregorianCalendar.JUNE, 14);
        d1 = calendar.getTime();
        d2 = getNextBankDate(d1);
        txt = "Given date = " + dtFrm.format(d1) + ";    next bank date = " + dtFrm.format(d2);
        System.out.println(txt);

        calendar = new GregorianCalendar(2014, GregorianCalendar.JUNE, 6);
        d1 = calendar.getTime();
        d2 = getNextBankDate(d1);
        txt = "Given date = " + dtFrm.format(d1) + ";    next bank date = " + dtFrm.format(d2);
        System.out.println(txt);
	}

	public static Date getNextBankDate(Date dt) {
	     GregorianCalendar calendar = new GregorianCalendar();
	     calendar.setTime(dt);
	     int incr = 1;
	     int dw = calendar.get(GregorianCalendar.DAY_OF_WEEK);
	     if (dw == Calendar.SATURDAY) incr = 2;
	     if (dw == Calendar.FRIDAY) incr = 3;
	     calendar.add(GregorianCalendar.DAY_OF_YEAR, incr);
	     dt = calendar.getTime();
	     return dt;
	}
}
