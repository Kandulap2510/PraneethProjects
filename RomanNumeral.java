//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{


		setRoman(str);

	}

	public RomanNumeral(Integer orig)
	{

		setNumber(orig);


	}

	public void setNumber(Integer num)
	{		
		number = num;
		



	}

	public void setRoman(String rom)
	{

		roman = rom;


	}

	public Integer getNumber()
	{
		int value = 0;
		if(roman.length() == 1) {
			for(int i = 0; i < LETTERS.length; i++){
				if (roman.equals(LETTERS[i])) {
					value = NUMBERS[i];
				}
			}
		} 
		
		else {
			while (roman.length() > 0){
				for(int i = 0; i<LETTERS.length; i++){
					if(roman.length() > 1) {
						if (roman.substring(0, 2).equals(LETTERS[i])){
							roman = roman.substring(2, roman.length());
							
							value = value + NUMBERS[i];
							
							i = -1;


						}
						else if (roman.substring(0, 1).equals(LETTERS[i])){
							roman = roman.substring(1,roman.length());
							
							value = value + NUMBERS[i];
							
							i = -1;

						}
					}
					else if(roman.length() == 1) {
						for(int k = 0; k<LETTERS.length; k++){
							if (roman.equals(LETTERS[k])) {
								roman = " ";
								
								value = value + NUMBERS[k];
							}
						}
					}
				}
			}
		}	
		return value;
	}
	
	public String getRoman() {
		String roman2 = "";
		
		
		while (number != 0) { 
			for (int i = 0; i < NUMBERS.length; i++)
			{
				
				if (number >= NUMBERS[i]) {
					
					number = number - NUMBERS[i];
					roman2 = roman2 + LETTERS[i];
					
					i = -1;

				}
			}
		}
		return roman2;
	}

	public String toString()
	{
		return getRoman() + "\n";
	}
}
