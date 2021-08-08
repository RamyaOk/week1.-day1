package week1.day1;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare your input
				int a =153;
				// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		        int calculated = 0;
		        int remainder;
		        // Assign input into variable original 
		        int original=a;

				// Use loop to calculate: use while loop to set condition until the number greater than 0

				while (a > 0) {

				// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

					remainder=a%10;

				// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
					  remainder=a;
                  // Within loop: Add calculated with the cube of remainder & assign it to calculated
					  calculated+=calculated+remainder*remainder*remainder;
	                  calculated=remainder;

				// Check whether calculated and original are same

				if (calculated == original) 

			// When it matches print it as Armstrong number

					System.out.println("Armstrong number");
				else
					
					System.out.println("Not Armstrong number");
				break;
				}
	}

}
