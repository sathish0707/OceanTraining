package edu.Automationlearning;

public class removeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Germany(95)";
        
		for(int i=1; i<=str.length()-1; i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				System.out.print(str.charAt(i));
			}
		}
       
	}

	}
