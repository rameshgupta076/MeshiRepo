package core.java;

public class LogicalAndBitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logical  AND - &&
		// Logical OR -   ||
		// Logical NOT -   !
		// bitwise and     &
		//  bitwise or     |
		//  bitwise  compliment ~ 
		
		
		boolean a = true ;
		boolean b= false;
		
		System.out.println(a&&b);
		System.out.println(a||b);
		System.out.println(!a);
		
		// bitwise 
		
		int num1 = 10;
		int num2= 20;
		
		System.out.println(num1&num2);
		System.out.println(num1|num2);
		System.out.println(~num1);
		
					
	}

}
