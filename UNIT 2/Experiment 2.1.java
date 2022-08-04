/* Write program to differentiate between method overloading and 
method overriding.*/
class A
{
    public String name;
    public void print()
    {
        System.out.println("Print function inside Class A");
    }
    public void print(String name)
    {
        this.name=name;
        System.out.println("Name is "+name);
    }
}
class B extends A 
{
    public void print()
    {
        System.out.println("Print function inside Class B");
    }
}
public class Main
{
	public static void main(String[] args) 
	{
		A obj_A=new A();
		obj_A.print();
		obj_A.print("Sagar");
		
		B obj_B=new B();
		obj_B.print();
	}
}

