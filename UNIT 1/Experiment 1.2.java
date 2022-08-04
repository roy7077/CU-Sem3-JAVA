/* Write a program to create classes and use of different types of 
methods.*/

class player
{
    public String name;
    public int age;
    public void getvalue(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public int get_age()
    {
        return age;
    }
    public static void get_team_name()
    {
        System.out.println("Team name is CSK");
    }
}
public class Main
{
	public static void main(String[] args) 
	{
		player obj1=new player();
		obj1.getvalue("dhoni",41);  // calling void type function
		System.out.println(obj1.get_age()); // calling int return type function
		player.get_team_name();          // calling static function
	}
}

