package day24;

public class TypeCastingPrimitiveDataTypes {

	public static void main(String[] args) {

		// Upcasting - smaller --> larger value
		// int --> long
		int intvalue = 1000;
		long longvalue = intvalue;// automatically //assigned
		System.out.println(longvalue);

		// float -->double
		float floatvalue = 34.6f;
		double doublevalue = floatvalue;
		System.out.println(doublevalue);
		
		//DownCasting - larger --> smaller value
		//long --> int 
		long longvalue1 = 10000;
		int intvalue1 = (int) longvalue1; //manual
		System.out.println(intvalue1);
		
		
		//double --> float
		double doublevalue2 = 100.45;
		float floatvaue5 = (float) doublevalue2;
		System.out.println(floatvaue5);
		
		int intvalue8 = (int) doublevalue2;
		//manual and decimal points are removed 
		System.out.println(intvalue8);

	}

}
