import java.util.Scanner;

/**
 * Write a description of class MagicSquares here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicSquares
{
   public static void main (String [] args)
   {
   	int[][] grid = new int[4][4];
   	Scanner s = new Scanner(System.in);
  	 
   	for (int i = 0; i < 4; i++)
   	{
       	for (int j = 0; j < 4; j++)
       	{
           	System.out.println("Enter a number.");
           	grid[i][j] = s.nextInt();
        	}
   	}
  	 
   	int[] sums = new int[10];
   	// Adds horizontally
   	for (int i = 0; i < 4; i++)
   	{
       	for (int j = 0; j < 4; j++)
       	{
           	sums[i] = sums[i] + grid[i][j];
        	}
   	}
   	//Adds vertically
   	for (int j = 0; j < 4; j++)
   	{
       	for (int i = 0; i < 4; i++)
       	{
           	sums[i+4] = sums[i+4] + grid[i][j];
        	}
   	}
   	//Adds diagonally
   	for (int k = 0; k < 4; k++)
   	{
       	sums[8] = sums[8] + grid[k][k];
   	}
   	for (int k = 3; k >= 0; k--)
   	{
       	sums[9] = sums[9] + grid[k][k];
   	}
  	 
   	boolean isMagical = true;
  	 
   	for (int a = 0; a < sums.length - 1; a++)
   	{
       	if (sums[a] != sums[a+1])
       	{
           	isMagical = false;
       	}
   	}
  	 
   	if (isMagical)
   	{
       	System.out.println("Magic Numbers!!!!!!!");
   	}
   	else
   	{
       	System.out.println("Nope.");
   	}
   }

}
