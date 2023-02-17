//WAP to remove Duplicates from a String.
public class RemoveDuplicates {

	public static void main(String[] args) {
		 
		
		String s1 = "iNeuron is the best learning Platform";  
		String s2 ="";    
	     
		char str[] = s1.toCharArray();  
	          
	     
		int len = str.length;   
		
		 
	        int i,j;
	        for(i=0;i<len;i++){
	            for(j=0;j<i;j++){
	                if(str[i]==str[j]){
	                    break;     
	                }              
	                               
	            }
	            if(j==i){          
	                s2+=str[i];    
	            }                 
	        }
	        System.out.print(s2);

	}

}
