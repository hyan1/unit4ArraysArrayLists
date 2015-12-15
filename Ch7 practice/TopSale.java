import java.util.ArrayList;
import java.util.Scanner;

public class TopSale
{
	public ArrayList<String> names = new ArrayList<String>();
	public ArrayList<Double> totals = new ArrayList<Double>();
    

    
	public void addSale(String customerName, double amount)
	{
    	for (int i = 0; i <= names.size(); i++)
    	{
      	names.add(customerName);
      	totals.add(amount);
    	}
	}
	public String nameofBestCustomer()
	{
    	int greatnumber = 0;
    	double total = 0;
    	for (int i = 0; i < names.size() - 1; i++)
    	{
        	if (total < totals.get(i))
        	{
            	greatnumber = i;
            	total = totals.get(i);
        	}
    	}
   	 
    	return names.get(greatnumber);
	}
    
	public static void main(String[] args)
	{
   	 
    	starter.addSale("Bob", 2.50);
    	starter.addSale("Bob", 2.50);
    	starter.addSale("George", 8.00);
    	starter.addSale("Andrew", 1.00);
    	starter.addSale("Nick", 1.50);
    	starter.addSale("Bob", 2.50);
    	starter.nameofBestCustomer();
	}
}
