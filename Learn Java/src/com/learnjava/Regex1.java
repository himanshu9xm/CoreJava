package com.learnjava;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex1 {

	public static void main(String[] args) {
		//All of the below matches function return TRUE
		//Method 1 for writing The regex expressions 
		Pattern p = Pattern.compile(".ss.s.");  //specifies that no. of characters are 6 and . represents one character
		Matcher m = p.matcher("assist");
		Boolean b1 = m.matches();
		
		System.out.println(b1);
		
		//Method 2 for writing The regex expressions
		Boolean b2 = Pattern.compile(".ss.s.").matcher("assist").matches();
		
		System.out.println(b2);
		
		//Method 3 for writing The regex expressions
		Boolean b3 = Pattern.matches(".ss.s.", "assist");
		System.out.println(b3);		
	}

}
