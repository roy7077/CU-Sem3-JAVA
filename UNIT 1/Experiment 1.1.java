/*Write a program to study different types of constructors in java.*/

import java.util.*;
class student
{
    public String name;
    public int age;
    
    // No-Arg Constructor
    public student()
    {
        System.out.println("Enter the name of student");
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Enter the age of student");
        age=sc.nextInt();
    }
    
    // Parameterized Constructor
    public student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display()
    {
        System.out.println("Name of student is "+name);
        System.out.println("Age of student is "+age);
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    // for No-Arg Constructor
		student obj1=new student();
		obj1.display();
		
		// for Parameterized Constructor
		student obj2=new student("sagar",19);
		obj2.display();
	}
}

