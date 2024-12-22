package day13;

public class StringProgram {

	public static void main(String[] args) {
		
      String str = "AuToMation";
      System.out.println(str);
      //output is ATM 
      
      //str = str.replaceAll("[^A-Z]", "");
      //str = str.replaceAll("[a-z]", "");
      
      String result = "";
      for(int i=0;i<str.length();i++) {
    	  char ch = str.charAt(i);
    	  if(Character.isUpperCase(ch)) {
    		  result = result+ch;
    	  }
      }
      System.out.println(result);
	}

}
