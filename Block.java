//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.BLACK;
		
	

	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y ){
		setX(x);
		setY(y);
		width = 10;
		height = 10;
		color = Color.BLACK;
	}
	public Block(int x, int y, Color col ){
		setX(x);
		setY(y);
		setColor(col);
	}
	
	public Block(int x, int y, int Width, int Height){
		setX(x);
		setY(y);
		setWidth(Width);
		setHeight(Height);
		color = Color.BLACK;
	}
	
	public Block(int x, int y, int Width, int Height, Color Col){
		setX(x);
		setY(y);
		setWidth(Width);
		setHeight(Height);
		setColor(Col);
	}
	
	public void setX(int x){
		xPos = x;
	}
	public void setY(int y){
		yPos = y;
	}
	
	public void setPos(int x, int y){
		xPos = x;
		yPos = y;
	}
	public void setWidth(int w){
		width = w;
	}
	public void setHeight(int h){
		height = h;
	}
	
	
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;
   }
   
   public int getX(){
	   return xPos;
   }
   public int getY(){
	   return yPos;
   }
   public int getWidth(){
	   return width;
   }
   public int getHeight(){
	   return height;
   }
   
   public Color getColor(){
	   return color;
   }
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());


   }
   
	public boolean equals(Object obj){
		Block s = (Block) obj; 
		
		if( s.getX() != xPos)
		{
			return false;
		}
		
		else if(s.getY() != yPos)
		{
			return false;
		}
		
		else if(s.getWidth() != width)
		{
			return false;
		}
		
		else if(s.getHeight() != height)
		{
			return false;
		}
		
		else if(s.getColor() != color)
		{
			return false;
		}
		
		else
		{
			return true;
		}


	}   
	
	public String toString(){
		return xPos + " "+ yPos + " "+ width + " "+ height + " "+ color;
	}
    

   //add a toString() method  - x , y , width, height, color
}