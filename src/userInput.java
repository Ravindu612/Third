import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String answer = in.nextLine();
		
		if(answer.equals(""))
		{
		System.out.println("Error");
		}
		
		else
		{
			System.out.println("Your name is " + answer + ".");
		}
	}

}
