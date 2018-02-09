//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String[] args )
   {
		//add test casess
		
		
		Line one = new Line(1,5,2,3);
		one.setCoordinates(1,5,2,3);
		one.calculateSlope();
		one.print();
		
		Line two = new Line(6,7,8,9);
		two.setCoordinates(6,7,8,9);
		two.calculateSlope();
		two.print();
		
		Line three = new Line(2,4,5,6);
		three.setCoordinates(2,4,5,6);
		three.calculateSlope();
		three.print();
		
		Line four = new Line(5,7,3,2);
		four.setCoordinates(5,7,3,2);
		four.calculateSlope();
		four.print();
		
	}
}