import java.util.*;

public class Threading {
	public static void main(String[] args){
		ArrayList<Integer> userList = new ArrayList<Integer>();
		ArrayList<Integer> compList = new ArrayList<Integer>();
		int userWin = 0;
		int compWin = 0;
		int tie = 0;
		Roll r1 = new Roll("User",userList);
		Roll r2 = new Roll ("Computer",compList);
		r1.start();
		r2.start();
		try {
			r1.t.join();
			r2.t.join();
		}
		catch (InterruptedException e){
			System.out.println(e);
		}
		for(int i = 0; i < 1000; i++) {
			if(userList.get(i) > compList.get(i)) {
				userWin ++;
			}
			else if(userList.get(i)==compList.get(i)) {
				tie++;
			}
			else {
				compWin ++;
			}
		}
		System.out.printf("The User won %d times. The Computer wont %d times. They tied %d times.",userWin,compWin,tie);
		
	}//end main
	

}// end class

class Roll implements Runnable{

	public Thread t;
	private String threadName;
	private ArrayList<Integer> rolls;
	
	
	Roll(String name, ArrayList<Integer> rollArray){
		threadName = name;
		rolls = rollArray;
		System.out.println("Creating " + threadName);
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		if ( t == null) {
			t = new Thread (this,threadName);
			t.start();
		}
	}//end start
	@Override
	public void run() {
		int thisRoll = 0;
		int count = 0;
		Random rand = new Random();
		while(count < 1000) {	
				thisRoll = rand.nextInt(5)+1;
				System.out.printf("%s rolled %d.\n",threadName,thisRoll);
				rolls.add(thisRoll);			
				count++;
		}
		
	System.out.printf("%s rolls ended.\n", threadName);
		
	}//end run
	
}//end Roll
