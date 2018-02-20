//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		test.setRemover("ttttttts", 't');
		System.out.println(test);
		
		LetterRemover oneTest = new LetterRemover();
		oneTest.setRemover("I love the things in life that are simple and amazing", 'i');
		System.out.println(oneTest);
		
											
	}
}