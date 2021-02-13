package Final;

import java.util.Random;

public class DartGame {
	
	public int throwDart()
	{
		Random rnd = new Random();
		int prb/*probability*/=rnd.nextInt(101);
		int point=0;
		int counter=0;
		
		if(prb<=55)
		{
			point+=5;
		}
		
		else if(prb<=94)
		{
			point+=10;
		}
		
		else if(prb<=99)
		{
			point+=20;
		}
		
		else
		{
			point+=50;
		}
		
		return point;
	}
}
