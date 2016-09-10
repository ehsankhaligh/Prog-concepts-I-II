import java.io.*;

public class PeopleRead
{
	// array to hold data read from file
	// could be named anything must be type Person
	private Person[] myPeople;

	public PeopleRead()
	{
		try
		{
			FileInputStream fis = new FileInputStream( "peopleArrayFile" );
			ObjectInputStream ois = new ObjectInputStream( fis );

			// the file contains an array of type Person
			// cast the object read as this type
			myPeople = (Person[]) ois.readObject();

			ois.close();
			fis.close();
		}
		catch (Exception e)
			{System.out.println( e );}

		// print the content of the array using Person toString()
		for(int i = 0; i < myPeople.length; i++)
		{
			System.out.println( myPeople[i] );
		}
	}

	public static void main(String[] args)
	{
		PeopleRead pr = new PeopleRead();
	}
}