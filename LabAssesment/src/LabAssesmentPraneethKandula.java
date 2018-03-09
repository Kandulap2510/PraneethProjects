

public class LabAssesmentPraneethKandula {

	public static boolean isGoofy(int num){
		int[] digits;
		int number = 0;
		int length;
		if (num < 1000)
		{
			length = 3;
		}
		else if (num < 100)
		{
			length = 2;
		}
		else if (num < 10)
		{
			length = 1;
		}
		for(int i = 0; i < length; i++)
		{
			digits[i] = num.charAt(i);
		}
		for (int j = 0; j < digits.length; j++)
			{
				if (num%digits[j] == 0)
				{
					number += digits[j];
				}
			}
		if ( number%2 == 0)
			{
			return false;
			}
		else
			{
			return true;
			}
		}

	
	public static int[] getSomeGoofyNumbers(int count)
	{
		int k = 0;
		int[] goofyNumbers = new int[count];
		for( int i = 0; i <count; i++)
		{
			goofyNumbers[i] = 1 + k;
			k +=2;
			
		}
		return goofyNumbers;
	}
	
	
	
	
	public static void main(String[] args){
		
		/*System.out.println(isGoofy(220));
		System.out.println(isGoofy(26));
		System.out.println(getSomeGoofyNumbers(3));
		System.out.println(getSomeGoofyNumbers(15));*/
		
		int n = 128;
		while (n > 0) {
		  int d = n / 10;
		  int k = n - d * 10;
		  n = d;
		  System.out.println(k);
		}
		
	}
}
