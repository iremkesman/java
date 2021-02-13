package fisher;

import java.util.Random;

public class fishers {
	
	public int chance=0;
	 public fishers(int chance)
	 {
		 this.chance=chance;
	 }
	
	public int oltaAlma()
	{
		Random rnd=new Random();
		int num=0;
		if(chance==0 || chance==5)
		{
			 num=rnd.nextInt(6);
		}
		else if(chance==10 || chance==15)
		{
			num=rnd.nextInt(6);
			if(num<6)
			{
				num+=1;
			}
		}
		return num;
	}

}
