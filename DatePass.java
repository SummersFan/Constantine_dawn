package javatext_5;

import java.util.Calendar;
import java.util.Date;

public class DatePass {
	public static void main(String[] args){
		Date date1 = new Date(10000);
		System.out.println(date1.toString());
		Date date2 = new Date(100000);
		System.out.println(date2.toString());
		Date date3 = new Date(1000000);
		System.out.println(date3.toString());
		Date date4 = new Date(10000000);
		System.out.println(date4.toString());
		Date date5 = new Date(100000000);
		System.out.println(date5.toString());
		Date date6 = new Date(1000000000);
		System.out.println(date6.toString());	
		Date date7 = new Date(10000000000l);
		System.out.println(date7.toString());	
		Date date8 = new Date(100000000000l);
		System.out.println(date8.toString());
	}	
}
