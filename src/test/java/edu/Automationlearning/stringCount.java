package edu.Automationlearning;

public class stringCount {
	String str = "Welcome To Automation";
		
	public static void main(String[] agrs ) {
		stringCount pass = new stringCount();
		System.out.println(pass.lowerCase());
		System.out.println(pass.upperCase());
	}
		public int lowerCase()
		{
		int wordCout = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i) <='z')
			{
				System.out.print(str.charAt(i));
				wordCout++;
			}
		}
		System.out.println();
		System.out.println("Total Lowercase is::"+wordCout);
		return wordCout;
		}
		
		public int upperCase()
		{
		int wordCout = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i) <='Z')
			{
				System.out.print(str.charAt(i));
				wordCout++;
			}
		}
		System.out.println();
		System.out.println("Total Uppercase is::"+wordCout);
		return wordCout;
		}
		
		
	}

