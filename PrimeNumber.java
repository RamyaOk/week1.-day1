package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     // Declare an int Input and assign a value 13
		int a=13;
     // Declare a boolean variable flag as false
		boolean flag =false;
	 // Iterate from 2 to half of the input
        for (int i = 2; i<=a/2; ++i) {
     // Divide the input with each for loop variable and check the remainder
		if (a%i==0) {
	 // Set the flag as true when there is no remainder	
		flag=true;	
	 // break the iterator
		break;
		}	
		}

     // Check the flag (Provide a condition)
        if (flag!=true) 
     // Print 'Prime' when the condition matches		
        	System.out.println(a+" is a prime number");
        else 
      // Print 'Not a Prime' when the condition doesn't match 
        	System.out.println(a+" is not a prime number");
    		
			
	}

}
