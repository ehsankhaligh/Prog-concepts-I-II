import java.io.*;

public class Person implements Serializable
{
	private String name;
	private int age;
	private int height;


	public Person(String n, int a, int h)
	{
		name = n;
		age = a; // years
		height = h; // inches
	}

	public Person()
	{
		name = "Doe";
		age = 0;
		height = 0;
	}

	// getters, setters, general methods

	public String toString()
	{
		return name + " " + age;
	}


	//Test code for this class
	public static void main (String[] args)
	{
		Person p = new Person("Dave", 37, 74);
		System.out.println( p );
	}
}