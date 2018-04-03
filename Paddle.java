//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
	   speed =5;
   }
   
   public Paddle(int x,int y){
	   super(x,y);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int s){
	   super(x,y);
	   speed = s;
   }
   
   public Paddle(int x, int y, int w, int h, int s){
	   super(x,y,w,h);
	   speed = s;
   }
   
   public Paddle(int x, int y, int w, int h, Color col, int s){
	   super(x,y,w,h, col);
	   speed = s;
   }
   //add the other Paddle constructors










   public void moveUpAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
	   setY(getY()-speed);
	   draw(window, Color.BLACK);


   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
	   setY(getY()+speed);
	   draw(window, Color.BLACK);

   }
   public int getSpeed(){
	   return speed;
   }
   //add get methods
   
   
   //add a toString() method
   public String toString(){
	   return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor().toString() + " " + speed;
   }
}