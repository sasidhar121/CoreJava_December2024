package day9;

public class FindRepetitonsCountNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {12,13,14,15,15,14,78,90,14,56};
        int num = 12;
        int count = 0;
        for(int x:a) {
        	if(num == x) {//comparison
        		count++;
        		
        	}
        	
        }
        System.out.println(count);
	}

}
