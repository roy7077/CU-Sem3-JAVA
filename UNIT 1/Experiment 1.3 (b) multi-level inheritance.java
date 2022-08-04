/* Program to learn different types of inheritance in java. */
//(b) Multi-Level Inheritance

class one 
{
    public void print_sagar()
    {
        System.out.println("sagar");
    }
}
  
class two extends one 
{
    public void print_roy() 
    { 
        System.out.println("roy"); 
        
    }
}
  
class three extends two 
{
    public void print_coder()
    {
        System.out.println("coder");
    }
}
  

public class Main
{
	public static void main(String[] args) 
	{
		three s = new three();
        s.print_sagar();
        s.print_roy();
        s.print_coder();
	}
}

