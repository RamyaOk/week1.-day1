package week1.day1;

public class FibanocciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.print(firstNum +" "+ secNum);   
		// Iterate from 1 to the range
	   	for (int i = 2; i<range; ++i)
		 {  
	   	// add first and second number assign to sum		
		sum=firstNum+secNum;	   
		System.out.print(" "+sum);    
		// Assign second number to the first number
		// Assign sum to the second number
		firstNum=secNum;
		secNum=sum;
		   
		 }    
		  			
				
	}

}
