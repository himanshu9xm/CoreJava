package com.learnjava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {

	public static void main(String[] args) {
		//This program will take input of a String in first Line
		//Input of the character to find in second line
		//And returns the starting and the ending index of the word
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String Sentence = sc.nextLine();
		System.out.println("Enter the word:");
		String Word = sc.nextLine();
		
		Pattern p = Pattern.compile(Word);
		Matcher m = p.matcher(Sentence);
		
		Boolean found = false;
		while (m.find()) {
			System.out.println("The pattern <"+m.group()+"> is found starting at index: "+m.start()+" ending at: "+m.end());
			found = true;			
		}
		if(!found) {
			System.out.println("Pattern not found");
		}

	}

}
