
import java.util.Random;



public class NumberGenerator 
{
	public static int randomNumber() {			
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(20);		
		return randomNumber; 
	}//end method	

}//end class



