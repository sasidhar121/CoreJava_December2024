package day13;

public class PangramString {

	public static void main(String[] args) {
		
		
       String str = " The quick brown fox jumps over the lazy dog";
       int flag = 1;
		//all 26 alphabets 
		
		str = str.toLowerCase();//convert to lower case
		
		if(str.length()<26) {
			System.out.println(str + " is not Pangram String" );
		}
		else {
			//ascii code
			for( char ch='a';ch<='z';ch++) {
				
				if(str.indexOf(ch)<0) {//check alphabet is missing - not Pangram
					flag = 0;
					//Not a Pangram String
					
				}
				
					
					
				}
			if(flag == 1)
			System.out.println(str + " is an Pangram String");
			else {
				System.out.println(str + "is not an Pangram String");
			}
			}
			
	
		}

	}


