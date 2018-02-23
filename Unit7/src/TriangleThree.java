//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = ' ';
		letter = "";
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
	
		return letter;
	}

	public String toString()
	{
		String output = "";
		int letters = 1;
		int spaces = size - 1;
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < spaces; j++)
			{
				output = output + " ";
			}
			
			for (int k = 0; k < letters; k++)
			{
				output = output + getLetter();
			}
			letters++;
			spaces = spaces - 1;
			output = output + "\n";
		}
		return output + "\n";
		
		
		
	}
}