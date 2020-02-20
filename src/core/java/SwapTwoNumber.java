package core.java;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the Number");
		
		int x ,y;
		
		Scanner scan = new Scanner (System.in);
		
		x = scan.nextInt();
		y= scan.nextInt();
		
		System.out.println("Before Swapping " + x+ "" + y);
		
		System.out.println("Afetr Swapping");
		
		x= x+y;
		 y = x-y;
		 x= x-y;
		 
		 System.out.println();
	
	}

}
