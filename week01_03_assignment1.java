// A program to swap two numbers 
import java.util.Scanner;
public class week01_03_assignment1
{
  public static void main(String args[])
  {
    Scanner input = new Scanner (System.in);
	System.out.println("Enter number 1:");
	int number1 = input.nextInt();
	System.out.println("Enter number 2:");
	int number2 = input.nextInt();
	int temp = number2;
	number2 = number1;
	number1= temp;
	System.out.println("The swapped numbers are " + number1 + " and " + number2);
  }
}
