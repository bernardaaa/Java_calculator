package loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		do  {
			if (number != -1) {
		System.out.println("Enter a number:");
			}
		number = scanner.nextInt();
		System.out.println("Cube is:" + (number*number*number));
		} while (number>= 0);
		
		System.out.println("thank you!");
	}
}
