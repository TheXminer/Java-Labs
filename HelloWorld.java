import java.util.Scanner;

public class HelloWorld{
	static Scanner in = new Scanner(System.in);

	static void task1(){
		System.out.println("Task 1");

		System.out.print("Enter first number: ");
		int a = in.nextInt();
		System.out.print("Enter second number: ");
		int b = in.nextInt();
		System.out.print("Enter third number: ");
		int c = in.nextInt();

		float average = (float)(a + b + c) / 3;
		System.out.println("Result: " + average);
		int closeNumber = Math.round(average);
		System.out.println("The closest number: " + closeNumber);
	}

	static void task6(){
		System.out.println("Task 6");

		System.out.print("Enter first side length: ");
		int a = in.nextInt();
		System.out.print("Enter second side length: ");
		int b = in.nextInt();
		System.out.print("Enter angle between sides: ");
		int alpha = in.nextInt();

		if(a < 0 || b < 0 || alpha < 0){
			System.out.print("Input error: Entered number is negative");			
			return;
		}

		double square = Math.sin(Math.toRadians(alpha)) * a * b / 2;
		System.out.println("Result square: " + square);
	}

	static void task11(){
		System.out.println("Task 11");
		
		System.out.print("Enter number to receive factorial: ");
		int a = in.nextInt();
		
		if(a < 1){
			System.out.print("Input error: Entered number lower then 1");
			return;
		}

		int result = 1;
		while(a > 1){
			result *= a;
			a--;
		}

		System.out.print("Factorial of your number is: " + result);		
	}

	static void task16(){
		System.out.println("Task 16");
		
		System.out.print("Enter first side length: ");
		int a = in.nextInt();
		System.out.print("Enter second side length: ");
		int b = in.nextInt();
		
		if(a < 0 || b < 0) {
			System.out.print("Input error: Entered length is negative");
			return;
		}

		int figurePerimetr = (a + b) * 2;
		System.out.println("Figure perimetr: " + figurePerimetr); 
		float diagonal = (float)Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("Figure diagonal: " + diagonal);
	}

	public static void main(String[] args){
		task16();
	}
}