package day13;

public class StringConcatenationWithArthimeticOperators {

	public static void main(String[] args) {
		
		System.out.println("java"+10+20);//concatenation
		System.out.println(10+20+"java");//addition + concatenation 
        System.out.println(10+20+"java"+30+40);//addition+concatenation
        
        //Arithmetic Operators : + - * / %
        System.out.println("java"+(100-20));//concatenation+subtraction
        System.out.println(100-50+"java"+(80-40));//addition+concatenation
        
        System.out.println("java" + 10*20);
        System.out.println(30*40+"java" + 10*20);
        System.out.println(15*100+"java");
        
        System.out.println("java" + 10/20);
        System.out.println(100/50+"java");
        System.out.println(190/80+"Java"+30/20);
        
        
        System.out.println("java" + 10%20);
        System.out.println(300%100 + "java");
        System.out.println(302%100 + "java" + 500%200);
	}

}
