/*Write a program to handle an exception using try, catch and throw.*/
public class Main
{
	public static void main(String[] args) 
	{
		int a=1,b=2,c=2,result;
        try {
            result=a/(b-c);
            System.out.println("result" + result);
        }
 
        catch (ArithmeticException e) 
        {
            System.out.println("Exception caught:Division by zero");
        }
 
        finally 
        {
            System.out.println("I am in final block");
        }
	}
}


