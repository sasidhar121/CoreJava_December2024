package day8;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//Approach 1 
		int a[][] = new int[3][2];
		//Approach 2 
		//int [][]a =new int[3][2];
		//Approach 3 
		//int[]a[]=new int[3][2];
	//declaration of 2D array with length rows 3 and columns 2 
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0]  = 300;
		a[1][1]  = 400;
		a[2][0] = 500;
		a[2][1] = 600;
		//Normal for loop
		/*for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();*/
		//length of Array 
	//System.out.println(a.length);
	//System.out.println(a[2].length);
      //Approach 2 
	int b[][]= {{1,2,3,4,5},{6,7,8,9,10},{23,45,67,89}}; 
    //Normal For loop
	/*for(int i=0;i<=b.length-1;i++) {
		for(int j=0;j<b[i].length;j++) {
			System.out.print(b[i][j] +" ");
		}
		System.out.println();
	
	1 2 3 4 5 
	6 7 8 9 10 
	23 45 67 89 
	
	}*/
	//Enhanced For loop
	for(int x[]:b) {//rows of the array
		for(int y:x) {//columns of the array
	System.out.print(y+" ");
		
		}
		System.out.println();
	
}
	}
}

