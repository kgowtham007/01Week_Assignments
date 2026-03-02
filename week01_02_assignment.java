// A program to create a basic calculator
import java.util.Scanner;
public class week01_02_assignment
{
  public static void main (String args[])
  {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter number 1:");
	  float number1, number2;
    number1=input.nextFloat();
    System.out.println("Enter number 1:");
    number2= input.nextFloat();
	  double addition =0.0, subraction = 0.0, multiplication = 0.0, division = 0.0;
	  addition = (double)(number1 + number2);
    subraction = (double)(number1 - number2);
    multiplication = (double)(number1 * number2);
	  division = (double)(number2/ number2);
	  System.out.println("The addition, subraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subraction + ", " + multiplication + ", and " + division);
  }
}
	