import java.util.*;

import java.lang.*;
public class Calculator {
	Scanner scan= new Scanner(System.in);	
//	static void ask() {
//		Scanner scan= new Scanner(System.in);
//		int a,b;
//		System.out.print("\tEnter the first number : ");
//		a= scan.nextInt();
//		System.out.print("\tEnter the second number : ");
//		b= scan.nextInt();
//	}
	
	static int add() {
		Scanner scan= new Scanner(System.in);
		int a,b;
		System.out.print("\tEnter the first number : ");
		a= scan.nextInt();
		System.out.print("\tEnter the second number : ");
		b= scan.nextInt();
		int sum=a+b;
		System.out.println("\tSum of these two number is " + sum);
		return sum;		
	}
	
	static int sub() {
		Scanner scan= new Scanner(System.in);
		int a,b;
		System.out.print("\tEnter the first number : ");
		a= scan.nextInt();
		System.out.print("\tEnter the second number : ");
		b= scan.nextInt();
		int sub=a-b;
		System.out.println("\tSubtraction of these two number is " + sub);
		return sub;		
	}
	
	static int mul() {
		Scanner scan= new Scanner(System.in);
		int a,b;
		System.out.print("\tEnter the first number : ");
		a= scan.nextInt();
		System.out.print("\tEnter the second number : ");
		b= scan.nextInt();
		int mul=a*b;
		System.out.println("\tMultiplication of these two number is " + mul);
		return mul;		
	}
	
	static int div() {
		Scanner scan= new Scanner(System.in);
		int a,b;
		System.out.print("\tEnter the first number : ");
		a= scan.nextInt();
		System.out.print("\tEnter the second number : ");
		b= scan.nextInt();
		int div=a/b;
		System.out.println("\tDivision of these two number is " + div);
		return div;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("----------------------------------------");
		System.out.println("       Welcome to Java Calculator");
		System.out.println("----------------------------------------");
		System.out.println("Which operation do you want to perform ?");
		System.out.println("\t1.Addition");
		System.out.println("\t2.Subtraction");
		System.out.println("\t3.Multiplication");
		System.out.println("\t4.Division");
		System.out.println("\t5.Exit");
		
		do {
			System.out.println("\n");
			System.out.print("\tEnter your choice (1-5) : ");
			choice= sc.nextInt();
			
			switch (choice) {
				case 1:
					add();
				break;
				
				case 2:
					sub();
				break;
				
				case 3:
					mul();
				break;
				
				case 4:
					div();
				break;
				
				case 5:
					System.exit(0);
				
					
				default:
				System.out.println("Invalid Option");
				break;
			
			}
			
			
		}
		while(choice != 5);
		
	}

}
