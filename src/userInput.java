import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		
		String answer1 = in.nextLine();
		
		//printing the name
		
		if(answer1.equals(""))
		{
		System.out.println("Error: First name can not be empty");
		
		}
		
		else
		{
			System.out.println("what is your last name?");
			
			String answer2 = in.nextLine();
			
			if(answer2.equals(""))
			{
			System.out.println("Error: Last name can not be empty");
			}
			
			else
			{
				System.out.println("Full Name: " + answer1 + " " + answer2);
			}
		}
	}

}
