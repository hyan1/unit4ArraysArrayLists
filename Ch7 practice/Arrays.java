
public class Arrays
{
    public static void main(String[] args)
    {
        double[] x = {8,4,5,21,7,9,18,2,100};
        System.out.println("Length of x: "+ x.length);
        System.out.println("x[0]: "+ x[0]);
        System.out.println("x[8]: "+ x[8]);
        System.out.println("x[x.length -1]: "+ x[x.length -1]);
        
        for(int i = 0; i < x.length; i++)
        {
            System.out.println(x[i]);
        }
        
        for(int i = 0; i < x.length; i++)
        {
            System.out.println("x[" + i + "] : "+ x[i]);
        }
        
        for(int i = x.length - 1; i >= 0; i--)
        {
            System.out.println("x[" + i + "] : "+ x[i]);
        }
        
        for(double value: x)
        {
            System.out.println(value);
        }
    }
}
