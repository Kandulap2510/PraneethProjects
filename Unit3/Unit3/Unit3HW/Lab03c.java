//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		Quadratic one = new Quadratic();
	   	one.setEquation(5,20,6);
	   	one.calcRoots();
	   	one.print();
		
	   	Quadratic two = new Quadratic();
	   	two.setEquation(15,25,6);
	   	two.calcRoots();
	   	two.print();
   	
	   	Quadratic three = new Quadratic();
	   	three.setEquation(20,45,10);
	   	three.calcRoots();
	   	three.print();
   	
   	
		
		
	}
}