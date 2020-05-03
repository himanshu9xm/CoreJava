package com.learnjava;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		//Checks whether the matched character is among a, b or c
		Boolean b1 = Pattern.matches("[abc]", "a");
		System.out.println(b1);
		
		Boolean b2 = Pattern.matches("[abc]", "d"); //Return false as d is not in a, b or c
		System.out.println(b2);

	}

}
