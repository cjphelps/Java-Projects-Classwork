
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Trivia {

	public static void main(String[] args) throws IOException 
	{
		Scanner input = new Scanner(System.in);
		int playerVariable = 1;
		int playerPoints[] = {0,0,0};
		int correctAnswers[] = {0,0,0};
		int incorrectAnswers[] = {0,0,0};
		//create an arraylist for questions answered
		ArrayList<Integer> questionsGenerated = new ArrayList<Integer>();
		String[] questions = {"Who is the main instructor for the X-men?","What is Wolverine's first Name?","Which hero is Jean Grey's main love interest?",
				"Which X-men has the power to shoot fireworks?","Which X-men can phase through objects?","Who is Spider-Man's main love interest?",
				"What are Wolverine's claws made of?","What is Jean Grey's deadly alter ego?","Who plays Professor Xavier in the movier?",
				"Who plays Iron Man in the Marvel Movies?","Carol Danvers is also known as what super hero?","Who is Thor's half brother?", 
			    "Who is the most notable writer for Marvel Comics?","Which super hero wears red,white,and blue but also carries a shield?",
			    "Which female Avenger is known for their short red hair?","Which Avenger is known for shooting arrows?",
                "Which Marvel character is known for his whitty sense of humor and red/black costume?","Which Marvel character is known as Sorcerer Supreme?",
				"What is Thano's universe destroying weapon?","What is the name of the Marvel character that is a talking raccoon?"};
		String[] answers = {"charles xavier","logan","cyclops","jubilee","shadowcat","mary jane","adamantium","dark phoenix","patrick stewart","robert downey jr",
				"captain marvel","loki","stan lee","captain america","black widow","hawkeye","deadpool","doctor strange","infinity gauntlet","rocket raccoon"};
		//set gameOver to false so while loop will execute
		String gameOver = "False";
		System.out.println("Welcome to the Trivia Game Show!");
		System.out.println("Scores So Far:");
		System.out.printf("Player 1: %d  Player 2: %d  Player 3: %d\n", playerPoints[0],playerPoints[1],playerPoints[2]);
		
		while (!gameOver.matches("True")) 
		{  //generate random number for question number
			int questionNumber = NumberGenerator.randomNumber();
			//if this question has already been asked get another question number
			while(questionsGenerated.contains(questionNumber))
			{
				questionNumber = NumberGenerator.randomNumber();
			}
			//add question number to the list of questions asked			
			questionsGenerated.add(questionNumber);
			
			//ask question to player
			System.out.printf("Player %d, Here's your question:\n",playerVariable);
			System.out.println(questions[questionNumber]);
			//get player input
			String playerAnswer = input.nextLine();
			
			//if the playwerAnswer matches the answer
			if(playerAnswer.toLowerCase().matches(answers[questionNumber])) 
			{
				playerPoints[playerVariable-1] = playerPoints[playerVariable-1] + 50;
				//add one to the correct answers for the player
				correctAnswers[playerVariable-1] = correctAnswers[playerVariable-1] + 1;
				System.out.printf("Correct! You now have %d points!\n", playerPoints[playerVariable-1]);
				
				if (playerPoints[playerVariable-1] == 200) 
				{
					gameOver = "True";			
										
				}//end if
			}//end if
			//if it does not match the player answer
			if(!playerAnswer.toLowerCase().matches(answers[questionNumber])) 
			{
				
				gameOver = "False";
				System.out.println("Scores So Far:");
				System.out.printf("Player 1: %d  Player 2: %d  Player 3: %d\n", playerPoints[0],playerPoints[1],playerPoints[2]);
				playerVariable = playerVariable + 1;
				if (playerVariable == 4)
				{
					playerVariable = 1;
				}//end if
				//add one to the incorrect answers for the player
				incorrectAnswers[playerVariable-1] = incorrectAnswers[playerVariable-1] + 1;
				
			}//end else
			
		}//end while
		
		System.out.printf("Congratulations Player%d has won the game!\n",playerVariable);
		System.out.println("Final Scores:");
		System.out.printf("Player 1: %d  Player 2: %d  Player 3: %d\n", playerPoints[0],playerPoints[1],playerPoints[2]);
		input.close();
		// write results to results.txt
		FileWriter writeFile = Results.writeTofile(correctAnswers,incorrectAnswers);
	}// end main method

 }//end class
