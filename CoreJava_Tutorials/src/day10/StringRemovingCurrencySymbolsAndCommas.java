package day10;

public class StringRemovingCurrencySymbolsAndCommas {

	public static void main(String[] args) {
		String amount = "$12,34,567";
		
		System.out.println(amount.replace("," , "").replace("$", ""));
	}

}
