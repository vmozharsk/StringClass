package app;

import java.text.*;
import java.util.*;

public class DateActions {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat dtFrm = new SimpleDateFormat("dd.MM.yyyy"); 
		System.out.println("Current date = " + dtFrm.format(c.getTime()));
		c.add(Calendar.WEEK_OF_YEAR, 6);
		System.out.println("Date in 6 weeks = " + dtFrm.format(c.getTime()));
		c = Calendar.getInstance();
		c.add(Calendar.MONTH, -4);
		System.out.println("Date 4 month before = " + dtFrm.format(c.getTime()));
		c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, 45);
		System.out.println("Date in 45 days = " + dtFrm.format(c.getTime()));
		System.out.println(" ");

		SimpleDateFormat dtFrmL = new SimpleDateFormat("dd.MMMM.yyyy", Locale.ENGLISH);
		Date dt = new Date();
		System.out.println("Locale.ENGLISH: " + dtFrmL.format(dt));
		dtFrmL = new SimpleDateFormat("dd.MMMM.yyyy", Locale.GERMAN);
		System.out.println("Locale.GERMAN: " + dtFrmL.format(dt));
		dtFrmL = new SimpleDateFormat("dd.MMMM.yyyy", Locale.FRANCE);
		System.out.println("Locale.FRANCE: " + dtFrmL.format(dt));
		dtFrmL = new SimpleDateFormat("dd.MMMM.yyyy", Locale.ITALIAN);
		System.out.println("Locale.ITALIAN: " + dtFrmL.format(dt));
		Locale locale = new Locale("ua", "ua");
		dtFrmL = new SimpleDateFormat("dd.MMMM.yyyy", locale);
		System.out.println("Locale(\"ua\", \"ua\"): " + dtFrmL.format(dt));
		locale = new Locale("ru", "ru");
		dtFrmL = new SimpleDateFormat("dd.MMMM.yyyy", locale);
		System.out.println("Locale(\"ru\", \"ru\"): " + dtFrmL.format(dt));
		System.out.println(" ");
		
		DateFormat dtFrmD = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.ENGLISH);
		System.out.println("Locale.ENGLISH: " + dtFrmD.format(dt));
		dtFrmD = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.GERMAN);
		System.out.println("Locale.GERMAN: " + dtFrmD.format(dt));
		dtFrmD = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.FRANCE);
		System.out.println("Locale.FRANCE: " + dtFrmD.format(dt));
		dtFrmD = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.ITALIAN);
		System.out.println("Locale.ITALIAN: " + dtFrmD.format(dt));
		locale = new Locale("ua", "ua");
		dtFrmD = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println("Locale(\"ua\", \"ua\"): " + dtFrmD.format(dt));
		locale = new Locale("ru", "ru");
		dtFrmD = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println("Locale(\"ru\", \"ru\"): " + dtFrmD.format(dt));
	}

}

