
public class RecursionExample {
	public static void main(String[] args) {
		//initialize variables
		int[] numbers = {0,14,27,74,32,26,42,86}; 
		int numbersLength = numbers.length;
		//call method
		System.out.println("The largest element is: " + maxElement(numbers,numbersLength));		
	}//end main
	
	public static int maxElement(int[] numbers, int numbersLength) {		
		// if the entire array has been searched	
		if(numbersLength == 0) {
			return numbers[0];
		}//end if
		//get the max number
		else {
			return Math.max(numbers[numbersLength-1], maxElement(numbers,numbersLength-1));
		}//end else
			
	}//end maxElement

}//end class
