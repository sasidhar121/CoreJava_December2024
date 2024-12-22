package day8;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[] = {12,23,34,556};//first array
		int rev[] = new int[arr.length];//reverse array
        int index =0;
        for(int i=arr.length-1;i>=0;i--) {
        	rev[index]=arr[i];
        	index++;
        	
        }
        for(int x=0;x<rev.length;x++) {
        	System.out.println(rev[x]);
        }
	}

}
