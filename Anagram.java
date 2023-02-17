//WAP to implement Anagram Checking least inbuilt methods being used.
public class Anagram {
	
	public static void sort(char[] c) {
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=1;j<c.length-i;j++)
			{
				if(c[j]<c[j-1])
				{
					char tempVar=c[j];
					c[j]=c[j-1];
					c[j-1]=tempVar;
				}
			}
		}
		
		
	}
	
	public static boolean equal(char[] a, char[] b) {
	
		boolean result = true;

		if (a.length == b.length) {

			for (int i = 0; i < a.length; i = i + 1) {
				if (a[i] != b[i]) {
					result = false;
	            }
	        }
		}else {
			result = false;
		}
		return result;
	}
	public static void main(String[] args) {
		String str1 = "Race";
	    String str2 = "Care";
	    
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();

	    
	    if(str1.length() == str2.length()) {

	      
	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();

	     
	      sort(charArray1);
	      sort(charArray2);

	    
	      boolean result = equal(charArray1, charArray2);

	      if(result) {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }
	    }
	    else {
	      System.out.println(str1 + " and " + str2 + " are not anagram.");
	    
	    }
	  
	}
	
	
}


