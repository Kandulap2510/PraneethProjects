//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private int xOne,yOne, xTwo, yTwo, xDif, yDif;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{





	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;



	}

	public void calculateSlope( )
	{
		xDif = xTwo - xOne;
		yDif = yTwo - yOne;
		slope = yDif/xDif;
		


	}

	public void print( )
	{
		System.out.println(slope);

	}
}