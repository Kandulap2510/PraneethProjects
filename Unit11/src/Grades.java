//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		int i = 0;
		Scanner one = new Scanner(gradeList);
		int numGrades = one.nextInt();
		grades = new double[numGrades];
		
		one.next();
		String c = one.nextLine();
		Scanner two = new Scanner(c);
		while (two.hasNextDouble())
		{
			grades[i] = two.nextDouble();
			i++;
		}
		
	

	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;


	}
	
	public double getSum()
	{
		double sum=0.0;	
		for (int i = 0; i < grades.length; i++)
		{
			sum = sum + grades[i];
		}

		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (int i = 0; i < grades.length; i++)
		{
			if (grades[i] < low)
			{
				low = grades[i];
			}
		}

		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.length; i++)
		{
			if (grades[i] > high)
			{
				high = grades[i];
			}
		}





		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output = "";
		output = Arrays.toString(grades);
		return output;

	}	
}