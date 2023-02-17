//WAP to find the maximum occurring character in a String.
public class MaxChar {

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

	public static void main(String[] args) {
		
		String s = "iNeuron is the best learning Platformnn";  
		char c[] = s.toCharArray();
		
		sort(c);
		
		int n = s.length();
		
		int max_count = 0;
        int count = 1;
        char ch = 'a';
        
        for (int i = 1; i <= n; i++){
           if ((i == n) || (s.charAt(i) != s.charAt(i - 1))){
                if (max_count < count){
                    max_count = count;
                    ch = s.charAt(i-1);
                }
                count = 1;
           }
           else
           {
               count++;
           }
        }
    System.out.println("Maximum occurring character is "+ch);

	}

}
