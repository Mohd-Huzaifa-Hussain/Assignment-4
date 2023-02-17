//WAP to count the number of consonants, vowels, special characters in a String.
public class Count {

	public static void main(String[] args) {
		
		String s = "i_Neuron.ai"; 
		
		int vowels = 0 ;
	    int consonant = 0;
	    int specialChar = 0; 
		           
	    for (int i = 0; i < s.length(); i++) {
	    	char ch = s.charAt(i);
	    	if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
	    		ch = Character.toLowerCase(ch);
	    		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	    			vowels++;
		        else
		        	consonant++;
		        
	    	}
		        else
		            specialChar++;
		        
	    }
  
		     System.out.println("Vowels: " + vowels);
		     System.out.println("Consonant: " + consonant);
		     System.out.println("Special Character: " + specialChar);

	}

}
