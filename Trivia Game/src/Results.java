
import java.io.FileWriter;
import java.io.IOException;


public class Results {
	
	public static FileWriter writeTofile(int[] correctAnswers, int[] incorrectAnswers) throws IOException {
		FileWriter newFile = new FileWriter("results.txt");
		newFile.write("Player 1: correct " + correctAnswers[0]+ " incorrect "+incorrectAnswers[0]+"\r\n");
		newFile.write("Player 2: correct " + correctAnswers[1]+ " incorrect "+incorrectAnswers[1]+"\r\n");
		newFile.write("Player 3: correct " + correctAnswers[2]+ " incorrect "+incorrectAnswers[2]+"\r\n");
		newFile.close();
		return newFile;
		
		
	}
}//end Results
