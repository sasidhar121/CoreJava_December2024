package day12;

public class ReverseAlphabetAloneInString {

	public static void main(String[] args) {
		String str = "abc12345klyh678xyz";
		System.out.println(str);
		
        int left = 0;
        int right =str.length()-1;
        
        char ch[] = str.toCharArray();
//convert String into charArray
        while(left<right) {
        	
        	if(Character.isDigit(ch[left])) {
        		left++;
        		
        	}
        	else if(Character.isDigit(ch[right])) {
        		right--;
        	}
        	else {//swapping values
        		char temp=ch[left];
        		ch[left]=ch[right];
        		ch[right] = temp;
        		left++;
        		right--;
        	}
        }
        System.out.println(new String(ch));
        
	}

}
