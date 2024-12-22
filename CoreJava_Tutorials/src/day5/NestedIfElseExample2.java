package day5;

public class NestedIfElseExample2 {

	public static void main(String[] args) {
		//nested if else
		int age = 15;
		boolean haslicense = true;
		if(age>=18) {
			if(haslicense) {
				System.out.println("Eligible to drive vehicle");
			}
			else {
				System.out.println("Not Eligible as no License");
			}
		}
		else {
			System.out.println("You are not Eligible to drive due to age criteria");
		}

}
}
