//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		passCount = 0;
		quickSort(list, 0, list.length-1);


	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		if (low<high){
			int partition = partition(list, low, high);
			System.out.println("pass " + passCount++ + " " + Arrays.toString(list));
			quickSort(list, low, partition);
			quickSort(list, partition+1, high);
		}
	


	}


	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable pivot = list[low];
		int back= low-1;
		int front = high + 1;
		
		while (back < front){
			while ((list[++back]).compareTo(pivot) < 0);
			while (list[--front].compareTo(pivot) > 0);
			if (back >= front){
				return front;
			}
				Comparable temp = list[back];
				list[back] = list[front];
				list[front] = temp;
		}
		
		return 0;




	}
}
