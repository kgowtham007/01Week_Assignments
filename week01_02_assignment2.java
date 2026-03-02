// A program to find the side of a square
import java.util.Scanner;
public class week01_02_assignment2
{
  public static void main (String args[])
  {
    Scanner input = new Scanner (System.in);
	System.out.println("Enter Perimeter:");
	int perimeter = input.nextInt();
	int side = perimeter /4;
	System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
  }
}