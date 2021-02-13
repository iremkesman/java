package Final;
import java.util.*;

public class dartContest {
	public static void main(String[] args) {
	
	DartGame player1=new DartGame();
	DartGame player2=new DartGame();
	DartGame player3=new DartGame();
	
	int p1 = 0, p2=0, p3=0;
	
	for(int j=0; j<6; j++)
	{
		for(int i=0; i<4; i++)
		{
			p1+=player1.throwDart();
		}
	
		for(int i=0; i<4; i++)
		{
			p2+=player2.throwDart();
		}
	
		for(int i=0; i<4; i++)
		{
			p3+=player3.throwDart();
		}
	}
	
	HashMap<Integer, String> hm=new HashMap<>();
	hm.put(p1, "player1");
	hm.put(p2, "player2");
	hm.put(p3, "player3");
	
	Set set=hm.entrySet();
	Iterator i = set.iterator();
	
	while(i.hasNext())
	{
		Map.Entry me = (Map.Entry) i.next();
		System.out.println(me.getKey()+" "+me.getValue());
	}
	}
}
