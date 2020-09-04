// Java program to Compare two strings 
// lexicographically 
class ques1 { 

	// This method compares two strings 
	// lexicographically without using 
	// library functions 
	public static int stringCompare(String str1,String str2) 
	{ 
		for (int i = 0; i < str1.length() && i < str2.length(); i++) { 
			if ((int)str1.charAt(i) == (int)str2.charAt(i)) { 
				continue; 
			} 
			else { 
				return (int)str1.charAt(i)-(int)str2.charAt(i); 
			} 
		} 

	
		if (str1.length() < str2.length()) { 
			return (str1.length()-str2.length()); 
		} 
		else if (str1.length() > str2.length()) { 
			return (str1.length()-str2.length()); 
		} 
		

		else { 
			return 0; 
		} 
	} 


	public static void main(String args[]) 
	{ 
		String string1 = new String("Harsh"); 
		String string2 = new String("Practice"); 
		String string3 = new String("Harsh"); 
		String string4 = new String("HarshBansal"); 
	
		System.out.println(stringCompare(string1,string2)); 
		System.out.println(stringCompare(string1,string3)); 
		System.out.println(stringCompare(string2,string1)); 

		// To show for edge case 
		// In these cases, the output is the difference of 
		// length of the string 
		System.out.println(stringCompare(string1,string4)); 
		System.out.println(stringCompare(string4,string1)); 
	} 
} 
