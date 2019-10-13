package Week5;

import java.util.Scanner;

/**
 * A class to practice exception handling
 * @author cmacfadyen
 *
 */
public class Week5HW {

	//Note use of static here so an instance does not need to 
	//be created
	private static int[] jerseyNumbers;
	
	public static void main(String[] args) throws BadJerseyException{
	
		jerseyNumbers = new int[5];
		try {
			getJerseyNums();
		}
		catch(BadJerseyException e) {
		}
		
		
		try {
			printJerseyAtIndex(3);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Error in data");
		}
		catch(Exception e) {
			System.out.println("Error in data");
		}
		
	}
	
	public static void getJerseyNums() throws BadJerseyException{
		String answer = "yes";
		int index = 0;
		do {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a jersey number");
		
		//Get the next jersey number
		int c = input.nextInt();
		input.nextLine(); //needed to capture end-of-line
		
		if((c>100) || (c<0)) {
			throw new BadJerseyException(c);
		}

		//store entry into the array
		jerseyNumbers[index] = c;
		index++;
		
		System.out.println("Enter another? y/n");
		try {
			answer = input.nextLine();
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			input.close();
		}
		
		} while((index < jerseyNumbers.length));
	}
	public static void printJerseyAtIndex(int i) {
		System.out.println(jerseyNumbers[i]);
	}
	 
}
