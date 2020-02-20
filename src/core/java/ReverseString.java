package core.java;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Using String Builder Class
		String s = new String();
		
		s= "Ramesh";
		
	/*	StringBuilder sb = new StringBuilder();
		
		sb.append(s);
			
		System.out.println(		sb.reverse());*/
		
		
		
		// Using Char[] 
		
		char [] ch = s.toCharArray();
		
		for (int i= ch.length-1; i>=0;i--){
			
			System.out.print(ch[i]);
		}
		
	}

}

