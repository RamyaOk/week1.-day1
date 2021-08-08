package week1.day1;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare your input as 5
		int a = 5;
		// Declare an integer variable fact as 1
		int fact =1;
		// Iterate from 1 to your input (tip: using loop concept)
		for (int i = 1; i <=a; i++) {
		// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)	
		fact=fact*i;
		//End of loop
		}
		// Print factorial (fact)	
		System.out.println(fact);
			
	}

}
