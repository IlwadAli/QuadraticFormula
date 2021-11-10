////Given a quadratic equation as follows: 
//
//ax2 + bx + c = 0
//
//Write a Java program that asks the user for coefficients a, b, c and compute the roots.
//
//Output:
//
//Enter a: 2
//Enter b: -3
//Enter c: -4
//
//Root 1 is 2.350781
//Root 2 is -0.850781


//Formula to find the root:  x = [-b +/- sqrt(-b^2 - 4ac)]/2a

import java.util.Scanner;

public class FindingRoots {

	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter values for three coeffiecents. Enter a: ");
		double a = userInput.nextDouble();
		
		System.out.print("Enter b: ");
		double b = userInput.nextDouble();
		
		System.out.print("Enter c: ");
		double c = userInput.nextDouble();
		
		double result = b * b -4.0 * a * c;
		
		if (result > 0.0) {
			double root1 = (-b + Math.pow(result,0.5))/(2.0 * a);
			System.out.println("Root 1 is " + root1);
			double root2 = (-b - Math.pow(result,0.5))/(2.0 * a);
			System.out.println("Root 2 is " + root2);
		}
		else if (result ==0.0) {
			double root1 = -b/(2.0 * a);
			System.out.println("Root 1 is " + root1);		
		}
		else {
			System.out.println("There are no roots.");
		}
		

	}

}



    
 

