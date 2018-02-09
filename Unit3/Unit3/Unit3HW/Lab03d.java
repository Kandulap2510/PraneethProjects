//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		
	   	Distance one = new Distance();
	   	one.setCoordinates(5,20,6,5);
	   	one.calcDistance();
	   	one.print();
	   	
	   	Distance two = new Distance();
	   	two.setCoordinates(30,45,78,5);
	   	two.calcDistance();
	   	two.print();
		
	   	Distance three = new Distance();
	   	three.setCoordinates(0,0,10,15);
	   	three.calcDistance();
	   	three.print();
		
		
			
	}
}