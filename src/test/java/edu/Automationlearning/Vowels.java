package edu.Automationlearning;

public class Vowels {

	public static void main(String[] args)
	{
	String s = "welcome";
	String s1 = " ";	
	s1 = s.replaceAll("[aeiou]", "");
	System.out.println("Vowels removed from a word  "+ s1);
	
	
	}
	
}
