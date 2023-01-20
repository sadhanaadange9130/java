package com.question2;

public class LowLetUnderscore {

	public static void main(String[] args) {
		 System.out.println(validate("Sadhana_Adange"));
			System.out.println(validate("Sadhana_Adange"));
			System.out.println(validate("Sadhana_Adange"));		
			System.out.println(validate("SAdhana_Adange"));	
	}
	 public static String validate(String text) {
		   if (text.matches("^[a-z]+_[a-z]+$"))
	                return "Found a match!";
	       else
	                return "Not matched!";
}
}


	


