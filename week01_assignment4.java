// A program to check Sam's marks percent
public class week01_assignment4
{
  public static void main (String args[])
  {
    int cost_price = 121, selling_price = 191, profit =0;
	double profit_percentage = 0.0;
	profit = selling_price - cost_price;
	profit_percentage = ((double)profit/ cost_price) *100;
	System.out.println("The Cost Price is INR " + cost_price + " and the Selling price is INR " + selling_price + "\nThe Profit is INR " + profit + " and the profit percentage is " + profit_percentage );
  }
}
	