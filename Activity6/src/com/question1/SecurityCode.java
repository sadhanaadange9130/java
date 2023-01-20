package com.question1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecurityCode {
	 public static void main(String a[]){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Generate your Security Code");
	        String code = sc.next();
	        String regex = "[A-Za-z0-9@*#]{8}";
	        Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(code);
	        boolean matchFound = m.find();
	        if(matchFound)
	        System.out.println("Security Code Generated Successfully");
	        else
	        System.out.println("Invalid Security Code, Try Again!");
	    }
	}


	
		