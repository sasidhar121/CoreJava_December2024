package day22;

public class WrapperClassesExample2 {

	public static void main(String[] args) {
		
		
		//Case2 : all primitive data types to String format 
		
	int a = 10;
	double d = 123.56;
	char ch = 'S';
	boolean b = true;
	
	String str1 = String.valueOf(a);
    System.out.println(str1);
    
    String str2 = String.valueOf(d);
    System.out.println(str2);
    
    String str3 = String.valueOf(ch);
    System.out.println(str3);
    
    String str4 = String.valueOf(b);
    System.out.println(str4);
    
    Integer x = 100;
    String str = Integer.toString(x);
    System.out.println(str);
    
    double d1 = 456.78;
    String str7 = Double.toString(d1);
    System.out.println(str7);
    
    //------------
    
    int a1 = 100;//primitive value
    Integer x1 = 1000;//AutoBoxing
	
	Integer x2 = 1000;
	int num = x;//unboxing - wrapper to primitive conversion
	
	
	}

}
