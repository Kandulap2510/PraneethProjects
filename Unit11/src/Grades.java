import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Grades
{
	/*private double[] grades;*/
	private ArrayList<Double> grades;
	
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
		/*grades = new double[numGrades];*/
		grades = new ArrayList<Double>(numGrades);
		
		one.next();
		String c = one.nextLine();
		Scanner two = new Scanner(c);
		while (two.hasNextDouble())
		{
			grades.add(two.nextDouble());
			
		}
		
	

	}
	
	public void setGrade(int spot, double grade)
	{
		/*grades[spot] = grade;*/
		grades.set(spot, grade);


	}
	
	public double getSum()
	{
		double sum=0.0;	
		for (int i = 0; i < /*grades.length*/ grades.size(); i++)
		{
			/*sum = sum + grades[i];*/
			sum = sum + grades.get(i);
		}

		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (int i = 0; i < /*grades.length*/ grades.size(); i++)
		{
			if (grades.get(i) < low)
			{
				low = grades.get(i);
			}
		}

		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i = 0; i < /*grades.length*/ grades.size(); i++)
		{
			if (grades.get(i) > high)
			{
				high = grades.get(i);
			}
		}





		return high;
	}
	
	public int getNumGrades()
	{
		/*return grades.length;*/
		return grades.size();
	}
	
	public String toString()
	{
		String output = "";
		for(int i = 0; i < grades.size(); i++)
		{
			output = output + grades.get(i) + " ";
		}
		
		return output;

	}	
}
