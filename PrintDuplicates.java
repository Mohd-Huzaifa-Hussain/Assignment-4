//WAP to print Duplicates characters from the String.
public class PrintDuplicates {

	public static void main(String[] args) {
		
		String s1 = "iNeuronAi";  
		    
	     
		char str[] = s1.toCharArray();  
	          
	    int len = str.length;
		
		System.out.println("Duplicate Characters are:");
		  
		for (int i = 0; i < len; i++) {
		   for (int j = i + 1; j < len; j++) {
			   if (str[i] == str[j]) {
				   System.out.print(str[j]);
					break;
				}
		   }
		}

	}

}
