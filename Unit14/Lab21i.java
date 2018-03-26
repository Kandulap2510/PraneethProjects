//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner New = new Scanner(new File("lab21i.dat"));
		Maze test;
		int value;
		while (New.hasNextLine())
		{
			value = New.nextInt();
			New.nextLine();
			test = new Maze (value, New.nextLine());
			System.out.println(test);
		}
		
	}
}
