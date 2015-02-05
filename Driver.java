public class Driver
{
  public static void main(String[] args)
  {
  
   GameArena mainArena = new GameArena(400, 400);
   Ball ball = new Ball(15, "RED");
   //ball.initilizeBall(2);
   ball.addTo(mainArena, ball);
   ball.randomizePosition(400, 400, ball);
   ball.randomizeSpeed(10);
   ball.move(400, 400, mainArena, ball);
  
  }
}