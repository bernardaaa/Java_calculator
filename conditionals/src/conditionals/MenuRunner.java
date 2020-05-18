//UNOS S TIPKOVNICE

package conditionals;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter number1:");
		int number1 = scanner.nextInt() ;
		//System.out.println("number you entered is number - " + number1);

		System.out.print("enter number2:");
		int number2 = scanner.nextInt();
		//System.out.println("number you entered is :" + number2);
		
		System.out.println("Choices available :");
		System.out.println("1-add");
		System.out.println("2-subtract");
		System.out.println("3-divide");
		System.out.println("4-multiply");
		
		
		System.out.print("enter choice:");
		int choice = scanner.nextInt();
			
		System.out.println("your choices are:");
		System.out.println("Number1:" + number1);
		System.out.println("Number2:" + number2);
		System.out.println("Choice" + choice);
		
		performOperation(number1, number2, choice);
		
	}

	private static void performOperation(int number1, int number2, int choice) {
		switch(choice) {
		
		case 1: 
			System.out.println("result"+ (number1 + number2)); 
			break;
		case 2: 
			System.out.println("result"+ (number1 - number2)); 
			break;
		case 3: 
			System.out.println("result"+ (number1/ number2)); 
			break;
		case 4: 
			System.out.println("result"+ (number1 * number2)); 
			break;
		default : 
			System.out.println("invalid operation"); 
			break;
			
	}
	}
}
