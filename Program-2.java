//Java Code
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		int a,i;
		System.out.println("Enter the value of a:");
		Scanner sc= new Scanner(System.in); 
		a=sc.nextInt(); //takes input from the keyboard for the value of a
		for(i=1;i<=a;i++)
		{
			
			System.out.print((2*i-1)+" ");//prints the a number of odd numbers 
		}

	}

}