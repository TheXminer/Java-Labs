import java.util.Scanner;

public class Lab_1{
	static Scanner in = new Scanner(System.in);
	
	static class Duplet<T, U> {
    		public T first;
	    	public U second;

		public Duplet(T first, U second) {
	        	this.first = first;
        		this.second = second;
		}
	}

	static Duplet<Float, Integer> task1(int a, int b, int c){
		float average = (float)(a + b + c) / 3;
		int closeNumber = Math.round(average);
		return new Duplet<Float, Integer>(average, closeNumber);
	}

	static double task6(int a, int b, int alpha){

		if(a < 0 || b < 0 || alpha < 0){
			System.out.print("Input error: Entered number is negative");			
			return -1;
		}

		double square = Math.sin(Math.toRadians(alpha)) * a * b / 2;
		return square;
	}

	static int task11(int a){		
		if(a < 1){
			System.out.print("Input error: Entered number lower then 1");
			return -1;
		}

		int result = 1;
		while(a > 1){
			result *= a;
			a--;
		}
	
		return result;	
	}

	static Duplet<Integer, Float> task16(int a, int b){				
		if(a < 0 || b < 0) {
			System.out.print("Input error: Entered length is negative");
			return null;
		}

		int figurePerimetr = (a + b) * 2;
		float diagonal = (float)Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return new Duplet<Integer, Float>(figurePerimetr, diagonal);
	}
	
	public static boolean choices(){
		System.out.print("Enter task number (1, 6, 11, 16) (0 -- break): ");
		int choice = in.nextInt();
		if(choice == 0){
			return false;
		}
		else if(choice == 1) {
			System.out.println("Task 1");

			System.out.print("Enter first number: ");
			int a = in.nextInt();
			System.out.print("Enter second number: ");
			int b = in.nextInt();
			System.out.print("Enter third number: ");
			int c = in.nextInt();

			Duplet<Float, Integer> result = task1(a, b, c);
			System.out.println("Result: " + result.first);
			System.out.println("The closest number: " + result.second);
		}
		else if(choice == 6) {
			System.out.println("Task 6");

			System.out.print("Enter first side length: ");
			int a = in.nextInt();
			System.out.print("Enter second side length: ");
			int b = in.nextInt();
			System.out.print("Enter angle between sides: ");
			int alpha = in.nextInt();

			double square = task6(a, b, alpha);

			System.out.println("Result square: " + square);
		}
		else if(choice == 11) {
			System.out.println("Task 11");
		
			System.out.print("Enter number to receive factorial: ");
			int a = in.nextInt();
			
			int result = task11(a);

			System.out.println("Factorial of your number is: " + result);
		}
		else if(choice == 16) {
			System.out.println("Task 16");

			System.out.print("Enter first side length: ");
			int a = in.nextInt();
			System.out.print("Enter second side length: ");
			int b = in.nextInt();

			Duplet<Integer, Float> result = task16(a, b);

			System.out.println("Figure perimetr: " + result.first); 
			System.out.println("Figure diagonal: " + result.second);
		}
		System.out.print("");
		return true;
	}

	public static void main(String[] args){
		while(true){
			if(!choices())
				break;
		}
	}
}