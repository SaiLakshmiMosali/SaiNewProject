package com.mckesson.medsurg.pricing.common;

public class ConvertToJulian {
	

	public static void main(String[] args ){
		ConvertToJulian cjul = new ConvertToJulian();
		cjul.convertToJulian();
	}
	
	
	public void convertToJulian()
	{
		String julianDate = null;
		String unformattedDate = "17/08/2016";
		
	  //int resultJulian = 0;
		String resultJulian = null;
		if(unformattedDate.length() > 0)
		{
		 /*Days of month*/
		 int[] monthValues = {31,28,31,30,31,30,31,31,30,31,30,31};
	
		 String dayS, monthS, yearS;
		 dayS = unformattedDate.substring(0,2);
		 monthS = unformattedDate.substring(3, 5);
		 yearS = unformattedDate.substring(6, 10);
		 
		 
		 System.out.println("Days: "+dayS);
		 System.out.println("monthS: "+monthS);
		 System.out.println("yearS: "+yearS);
	
		 
		 int day = Integer.valueOf(dayS);
		 int month = Integer.valueOf(monthS);
		 int year = Integer.valueOf(yearS); 
		 
	     if(year % 4 == 0)
	     {
	      monthValues[1] = 29;    
	      julianDate = "0";
	     }
	     else
	     {
	       julianDate = "1";
	     }
//String julianDate = "1";
         julianDate += yearS.substring(2,4);	 

	    // String julianDate = yearS.substring(2,4);
	     
	     System.out.println("julianDate: "+julianDate);

	     int julianDays = 0;
	    
	     for (int i=0; i < month-1; i++)
	     {
	      julianDays += monthValues[i];
	     }
	     
	     julianDays += day;

	         if(String.valueOf(julianDays).length() < 2)
	         {
	          julianDate += "00";
	         }
	         if(String.valueOf(julianDays).length() < 3)
	         {
	          julianDate += "0";
	         }

	    julianDate += String.valueOf(julianDays);
	    //resultJulian =  Integer.valueOf(julianDate);  
	    resultJulian = julianDate;
	   System.out.println("resultJulian: "+resultJulian);
	 
	}
	
	}
}