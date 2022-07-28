package edu.Automationlearning;

public class swapChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String strg = "Helloworld";
		 String strr = "";
		 
		 for (int i=0; i<=strg.length()-1; i++)
		 {
			 if (strg.charAt(i)== 'e')
			 {
				strr = strg.replace('e', 'o');
			 
			 }
			  if (strg.charAt(i)=='o')
					strr = strg.replace('o', 'e');
		 }
		 System.out.println(strr);
		 }
}
