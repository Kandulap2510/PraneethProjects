//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.util.ArrayList;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.dat"));
		ArrayList<Class> one = new ArrayList<Class>();
		Class test = new Class(file.nextLine(), file.nextInt());
		file.nextLine();
		int count = 0;
		one.add(test);
		while (file.hasNextLine()){
			one.get(0).addStudent(count, new Student(file.nextLine(), file.nextLine()));
			count++;
			
		}
		
		one.get(0).sortStudents();
		out.print(one.get(0));
		
		test.sortStudents();
		out.println(test);
	


		out.println("Failure List = " + test.getFailureList(70) );	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",test.getClassAverage()));











	}		
}