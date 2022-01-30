//Java Code
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a,b;
		String type_of_operation;
		System.out.println("Enter the 1st number:");
		a=sc.nextDouble();//takes input from the keyboard for 1st number
		System.out.println("Enter the 2nd number:");
		b=sc.nextDouble(); //takes input from the keyboard for 2nd number
		System.out.println("Type of Operation: Addition, Subtraction, Multiplication or Division");
		type_of_operation=sc.next(); //takes input from the keyboard for which type of operation to perform
		switch(type_of_operation)
		{
		case "Addition": 
				System.out.println("Addition of a and b is "+(a+b)); //prints the addition of a & b 
				break;
				
			case "Subtraction" : 
				System.out.println("Subtraction of a and b is "+(a-b)); //prints the subtraction of a & b
				break;
			case "Multiplication" : 
				System.out.println("Multiplication of a and b is "+(a*b));//prints the multiplication of a & b
				break;
			case "Division" : 
				System.out.println("Division of a and b is "+(a/b));//prints the division of a & b
				break;
				
				default:
					System.out.println("Invalid Input");//prints invalid input if an operation is selected which doesn't exist in the above mentioned cases
					break;
		}

	}

}