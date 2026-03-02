// A program to calculate area of traiangle in both inches and centimeter
import java.util.Scanner;
public class week01_02_assignment1
{
  public static void main(String args[])
  {
    Scanner input = new Scanner (System.in);
	System.out.println("Enter Base:");
	int base = input.nextInt();
	System.out.println("Enter Height:");
	int height = input.nextInt();
	double area = 0.5 * base * height;
	double inches = area * 2.54;
	System.out.println("The Area of the triangle in sq in is " + inches + " and sq cm is " + area );
  }
}