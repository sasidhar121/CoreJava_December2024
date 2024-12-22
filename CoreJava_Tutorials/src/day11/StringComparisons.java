package day11;

public class StringComparisons {

	
   public static void main(String[] args) {
	//Example 1 -- it will be created in String constant pool    
    //String str1 = "Welcome";//String constant or String Literal
    //String str2 = "Welcome";
    
   // System.out.println(str1==str2);//boolean
    //System.out.println(str1.equals(str2));
    //Example 2 -- Heap memory - outside the string constant pool
    String s1 = new String("Swaroop");
    String s2 = new String("Swaroop");
   
    System.out.println(s1==s2);//boolean
    System.out.println(s1.equals(s2));//boolean
    
    //Example3 
    String str1 = "Welcome"; // SCP
    String str2 = new String("Welcome");
    //Heap memory - outside SCP
    
    System.out.println(str1==str2);
    System.out.println(str1.equals(str2));
    
    //Example 4 
    String str8 = "Welcome";
    String str5 = new String("Welcome");
    String str4 =str5;
    
    System.out.println(str8==str5);

    System.out.println(str8.equals(str5));
    
    System.out.println(str8 == str5);
    System.out.println(str8.equals(str5));
    
    System.out.println(str5 == str4);
    System.out.println(str5.equals(str4));
    
    //intern()
    String s10 = "Swaroop";//SCP
    String s20 = "Swaroop";//SCP
    
    String s49 = new String("SwaroopNadella");
    //HEAP Memory - outside SCP 
    
    String s78 = s49.intern();
    
   //It will add to the String Constant to SCP
    
	}

}
