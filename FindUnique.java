//WAP to find if String contains all unique characters.
public class FindUnique {

	public static void main(String[] args) {
		
		String str = "iNeuron is the best learning Platform"; 
		boolean flag = true;
		
		for (int i = 0; i < str.length(); i++)
	           for (int j = i + 1; j < str.length(); j++)
	               if (str.charAt(i) == str.charAt(j))
	                   flag=false;
		 
		if (flag)
            System.out.println("The String " + str + " has all unique characters");
        else
            System.out.println("The String " + str + " has duplicate characters");
		 
	}

}
