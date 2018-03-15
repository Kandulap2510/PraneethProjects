import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Class
{
	private String Name;
	private ArrayList<Student> studentList;
	private Student student;
	
	public Class()
	{
		Name="";
		studentList=new ArrayList<Student>();
	}
	
	public Class(String name, int stuCount)
	{
		Name = name;
		studentList = new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum, s);

	}
	
	public String getClassName()
	{
	   return Name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double sum = 0;
		for(int i = 0; i < studentList.size(); i++)
		{
			sum = sum + studentList.get(i).getAverage();
		}
		
		classAverage = sum/studentList.size();


		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(int i = 0; i < studentList.size(); i++)
			if(studentList.get(i).getName().equals(stuName))
			{
				return studentList.get(i).getAverage();
			}
			return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		String hName ="";
		double high = Double.MIN_VALUE;
		for (int i = 0; i < studentList.size(); i++)
		{
			if (studentList.get(i).getAverage() > high)
			{
				high = studentList.get(i).getAverage();
				hName = studentList.get(i).getName();
			}
				
		}
		

		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		for (int i = 0; i < studentList.size(); i++)
		{
			if (studentList.get(i).getAverage() < low)
			{
				low = studentList.get(i).getAverage();
				hName = studentList.get(i).getName();
			}
				
		}
		

		return hName;


	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i < studentList.size(); i++)
		{
			if (studentList.get(i).getAverage() <= failingGrade)
			{
				output = output + studentList.get(i).getName();
			}
				
		}


		return output;
	}
	
	public void sortStudents()
	{
		Collections.sort(studentList);
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n" + "\n";
		
		for (int i = 0; i < studentList.size(); i++)
		{
			output = output + studentList.get(i) + " " + studentList.get(i).getAverage() + "\n";
		}


		return output;
		
	}  	
}