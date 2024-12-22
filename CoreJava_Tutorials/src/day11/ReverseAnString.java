package day11;

public class ReverseAnString {

	public static void main(String[] args) {
		//Approach 1
		String str = "Welcome"; //emoclew
	    String rev = ""; // Will create Empty String
	    
	    for(int i=str.length()-1;i>=0;i--) {
	    	rev =  rev + str.charAt(i);
	    	
	    }
	    System.out.println(str);
     System.out.println(rev);
     
     //Approach 2 
     String s = "Sasidhar";
     String rev1 = "";//Empty String
     
     char arr[] = s.toCharArray();
     for(int i=arr.length-1;i>=0;i--) {
    	 rev1 = rev1+arr[i];
    	 
     }
     System.out.println(s);
     System.out.println(rev1);
     
     //Approach 3 
     StringBuffer str4 = new StringBuffer("Swaroop");
//   StringBuilder str3 = new StringBuilder("Welcome");
     System.out.println(str4);
   System.out.println(str4.reverse());
// Approach 4 
   StringBuilder str7 = new StringBuilder("Goaloriented");
   System.out.println(str7.reverse());
   
	}
	

}
