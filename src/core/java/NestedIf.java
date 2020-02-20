package core.java;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Scanner is used to Scan the values from the console 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Marks of the Student");
		
		int marks = scan.nextInt();
		
		if (marks>90){
			System.out.println("Student is in A grade");
		} else if (marks>=75){
			System.out.println("Student is in B grade");
			
					} else if (marks>=60){
						System.out.println("Student is in C grade");
					} else if (marks>40){
						System.out.println("Student is in D grade");
					}
					else{
						System.out.println("Student is Fail in Exam1");
					}
		
		
	}

}
