package day16;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount();
		
		acc.setAccountNum(1000343);
		int num = acc.getAccountNum();
		System.out.println(num);
		
		acc.setName("Sasidhar");
		String str = acc.getName();
		System.out.println(str);
		
		acc.setBalance(1000.78);
		acc.setBalance(100.44);
		double num1 = acc.getBalance();
		System.out.println(num1);
		
	}

}
