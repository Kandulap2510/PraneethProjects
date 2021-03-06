//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightscore = 0;
	private int leftscore = 0;
	private Wall top, bottom, left, right;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(380, 265, 10, 10, Color.GRAY);
		leftPaddle = new Paddle(20, 250, 10, 50, 5);
		rightPaddle = new Paddle(760, 250, 10, 50, 5);
		keys = new boolean[4];
		
		top = new Wall(0, 0, 800, 10, Color.RED);
		bottom = new Wall(0, 551, 800, 10, Color.RED);
		left = new Wall(0, 10, 10, 541, Color.RED);
		right = new Wall(774, 10, 10, 541, Color.RED);
		
		rightscore = 0;
		leftscore = 0;
		
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);

		graphToBack.setColor(Color.GRAY);
		graphToBack.drawString("SCOREBOARD",350,80);
		graphToBack.drawString("Left: " + (leftscore), 350, 100);
		graphToBack.drawString("Right: " + (rightscore), 350, 120);
		
		if (ball.didCollideLeft(left) || ball.didCollideRight(right)){
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			
			if (ball.didCollideLeft(left)){
				rightscore += 1;
			}
			if (ball.didCollideRight(right)){
				leftscore += 1;
			}
			
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Left: " + (leftscore - 1), 350, 100);
			graphToBack.drawString("Right: " + (rightscore - 1), 350, 120);
			graphToBack.setColor(Color.GRAY);
			graphToBack.drawString("Left: " + (leftscore), 350, 100);
			graphToBack.drawString("Right: " + (rightscore), 350, 120);
		
			ball.draw(graphToBack, Color.WHITE);
			ball.setX(400);
			ball.setY(300);
			ball.setColor(Color.GRAY);
			
			ball.setXSpeed(3);
			ball.setYSpeed(1);
			
		}
		if (ball.didCollideLeft(leftPaddle) || ball.didCollideRight(rightPaddle)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		if (ball.didCollideTop(top) || ball.didCollideBottom(bottom)){
			ball.setYSpeed(-ball.getYSpeed());
			
		}
		else if (ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle)){
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
			
			
		}
		else if (ball.didCollideTop(rightPaddle) || ball.didCollideBottom(rightPaddle)){
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
			
		}
		
		if(keys[0] == true) {
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true) {
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		
		//right player
		if(keys[2] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}