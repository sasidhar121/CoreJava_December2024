package day12;

public class RemoveJunkSpecialCharactersStrings {

	public static void main(String[] args) {
		String str = "#@@%@#3578$%Java String P@$ro@$gra#ram";
//Regular Expression
		//[]
		//It has removed alphabets and numbers
		String str1 = str.replaceAll("[a-zA-Z0-9]", "");	
		System.out.println(str1);
		
		String str2 = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str2);
		
		//Retain only numbers
		String str3 = str.replaceAll("[^0-9]", "");
		System.out.println(str3);
		
		//Remove alphabets 
		String str5 = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str5);
		
		// Remove all other characters except alphabets
		String str6 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str6);
	}
	

}
