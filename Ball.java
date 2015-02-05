/**
 * This class represents a Ball object. When combined with the GameArena class,
 * instances of the Ball class can be displayed on the screen.
 */
public class Ball 
{
	// The following instance variables define the
	// information needed to represent a Ball
	// Feel free to more instance variables if you think it will 
	// support your work... 
	
	private double xPosition;			// The X coordinate of this Ball
	private double yPosition;			// The Y coordinate of this Ball
	private double xSpeed;				// The X speed of this Ball
	private double ySpeed;				// The Y speed of this Ball
	private double size;				// The diameter of this Ball
	private String colour = "WHITE";		// The colour of this Ball

	
	
										// Permissable colours are:
										// BLACK, BLUE, CYAN, DARKGREY, GREY,
										// GREEN, LIGHTGREY, MAGENTA, ORANGE,
										// PINK, RED, WHITE, YELLOW 

	
	/**
        Basic constructor for Ball
        */
        public Ball(int s, String c)
        {
        	size = s;
        	colour = c;
        }
        
        /*public void initilizeBall(int length)
        {
        	for(int i = 0; i < length; i++)
        	{
        		ball[i] = new Ball(15, "RED");
        	}
        }*/
        
        public void addTo(GameArena arena, Ball ball)
        {
        		arena.addBall(ball);
        }

        public void randomizePosition(int width, int height, Ball ball)
        {
        		ball.setXPosition(Math.random()*width - size);
        		ball.setYPosition(Math.random()*height - size);
        		xPosition = ball.getXPosition();
        		yPosition = ball.getYPosition();
        }

        public void randomizeSpeed(int maxSpeed)
        {
        		xSpeed = (Math.random()*maxSpeed - maxSpeed/2);
        		ySpeed = (Math.random()*maxSpeed - maxSpeed/2);
        }
        
        public void move(int width, int height, GameArena arena, Ball ball)
        {
        	while(true)
        	{
        			ball.setXPosition(ball.getXPosition() + xSpeed);
        			xPosition = ball.getXPosition();
        			ball.setYPosition(ball.getYPosition() + ySpeed);
        			yPosition = ball.getYPosition();
        		
        			if(xPosition > (400-size) || xPosition < 0)
        				xSpeed = -xSpeed;
        		
        			if(yPosition > (400-size) || yPosition < 0)
        				ySpeed = -ySpeed;
        		
        			arena.pause();        	
        	}
        }
        
	/**
	 * Obtains the current X position of this Ball.
	 * @return the X coordinate of this Ball within the GameArena.
	 */
	public double getXPosition()
	{
		return xPosition;
	}

	/**
	 * Obtains the current Y position of this Ball.
	 * @return the Y coordinate of this Ball within the GameArena.
	 */
	public double getYPosition()
	{
		return yPosition;
	}

	/**
	 * Obtains the size of this Ball.
	 * @return the diameter of this Ball,in pixels.
	 */
	public double getSize()
	{
		return size;
	}

	/**
	 * Obtains the colour of this Ball.
	 * @return a textual description of the colour of this Ball.
	 */
	public String getColour()
	{
		return colour;
	}

	/**
	 * Moves the current position of this Ball to the given X co-ordinate
	 * @param x the new x co-ordinate of this Ball
	 */
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	/**
	 * Moves the current position of this Ball to the given Y co-ordinate
	 * @param y the new y co-ordinate of this Ball
	 */
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}

}
