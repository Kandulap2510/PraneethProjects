//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats test = new LoopStats();
		test.setNums(1,5);
		System.out.println(test);
		
		LoopStats OneTest = new LoopStats();
		OneTest.setNums(10, 30);
		System.out.println(OneTest);
		
		LoopStats TwoTest = new LoopStats();
		TwoTest.setNums(1, 45);
		System.out.println(TwoTest);
		
		int b=5;
		String list="";
		while( b < 11)
		{
		   b = b + 2;
		   if( b % 2 == 1 )   //checks remainder of b / 2
		     list = b + " " + list;
		}
		System.out.print(list);




		
		
		
		
		
					
	}
}