//WAP to implement Pangram Checking with least inbuilt methods being used.
public class Pangram {

	public static void main(String[] args) {
		 
		String str="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
		int count[] = new int[26];
		boolean flag = true;       
		char ch;
		 
		for(int i=0; i<str.length(); i++){
			ch = str.charAt(i);
			if(ch == ' ')
				continue;
			if(ch>='A' && ch<='Z'){
				count[ch-'A']++;      
			}else if(ch>='a' && ch<='z'){
				count[ch-'a']++;      
			}
		}
		for(int i=0; i<count.length; i++){
			if(count[i] == 0){
				flag = false;    
				break;
			}
		}
		if(flag)
			System.out.println("Pangram");
		else 
			System.out.println("Not a Pangram String");
	}

}
