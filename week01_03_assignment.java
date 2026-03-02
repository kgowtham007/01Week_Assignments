// A program to convert celsius to Fahrenheit
import java.util.Scanner;
public class week01_03_assignment
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
	System.out.println("Enter temperature in Celcius:");
	int celsius = input.nextInt();
	double farenheitResult = (celsius * 9/5) + 32;
	System.out.println("The " + celsius + " celsius is " + farenheitResult + " fahrenheit");
  }
}