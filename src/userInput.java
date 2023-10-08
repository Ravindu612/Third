import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		//Asking the first name of the user.
		
		System.out.println("What is your first name?");
		
		String answer1 = in.nextLine();
		
		//printing an error if the first name is empty.
		
		if(answer1.equals(""))
		{
		System.out.println("Error: First name can not be empty");
		
		}
		
		//Asking the second name of the user, if the first name entered correctly.
		
		else
		{
			System.out.println("what is your last name?");
			
			String answer2 = in.nextLine();
			
			if(answer2.equals(""))
			{
			System.out.println("Error: Last name can not be empty");
			}
			
			//Printing the full name by combining both first name and last name.
			
			else
			{
				System.out.println("Full Name: " + answer1 + " " + answer2);
			}
		}
	}

}
