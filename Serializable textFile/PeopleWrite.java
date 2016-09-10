import java.io.*;

public class PeopleWrite
{
	private Person[] people;

	public PeopleWrite()
	{
		// put some people in the array
		people = new Person[3];
		people[0] = new Person("Bob", 28, 72);
		people[1] = new Person("Big Larry1", 38, 74);
		people[2] = new Person("The Dude", 42, 68);

		System.out.println("Writing people array to disk");

		try
		{
			FileOutputStream fos = new FileOutputStream("peopleArrayFile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(people); // write the array object to disk
			oos.flush(); // force a buffer flush
			oos.close(); // release the file resource
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println("An error occured");
		}

	}

	public static void main(String[] args)
	{
		PeopleWrite pw = new PeopleWrite();
	}

}