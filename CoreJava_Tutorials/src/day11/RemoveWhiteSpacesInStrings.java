package day11;

public class RemoveWhiteSpacesInStrings {

	public static void main(String[] args) {
		
		String str = "S a si dh ar G an dik ota";
		 str = str.replaceAll("\\s", "");
       System.out.println(str);
	}

}
