package core.java;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cases;
		
		Scanner n1= new Scanner(System.in);
		cases=n1.nextInt();
		if(cases>1&& cases<10)
		{
			while(cases!=0){
		
							

		Scanner n = new Scanner(System.in);
		 int j=n.nextInt();
		 for (int i=1;i<=j;i++){
			 
			 
		 
		 if(i%15==0)
			 System.out.println("FizzBuzz");
		 
		 else if (i%5==0)
			 System.out.println("BuZZ");
		 
		 else if(i%3==0)
			 System.out.println("Fizz");
		 
		 else 
			 System.out.println(i);
		 }
	}}

		else
		System.out.println("Invalid Number of Cases");
}
}
