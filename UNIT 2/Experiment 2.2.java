/* Create an interface and design a class to implement an interface. */

interface A
{
    void print();
}
class B implements A
{
    public void print()
    {
        System.out.println("Hey I am Sagar");
    }
}
public class Main
{
	public static void main(String[] args) 
	{
		B obj_b=new B();
		obj_b.print();
	}
}

