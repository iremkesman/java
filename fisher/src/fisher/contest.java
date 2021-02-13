package fisher;

import java.util.ArrayList;

public class contest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fishers novice = new fishers(0);
		fishers freshmen = new fishers(5);
		fishers sophomore = new fishers(10);
		fishers senior = new fishers(15);
		
		int sumNovice = 0, sumFreshmen = 0, sumSophomore = 0, sumSenior = 0;
		
		
		

		for (int i = 0; i <= 10; i++) 
		{
			sumNovice += novice.oltaAlma();
		}

		for (int i = 0; i <= 10; i++) 
		{
			sumFreshmen += freshmen.oltaAlma();
		}

		for (int i = 0; i <= 10; i++) 
		{
			sumSophomore += sophomore.oltaAlma();
		}

		for (int i = 0; i <= 10; i++) 
		{
			sumSenior += senior.oltaAlma();
		}
		
		String[] list = new String[4];
		list[0]="novice"+sumNovice;
		list[1]="freshmen"+sumFreshmen;
		list[2]="sophomore"+sumSophomore;
		list[3]="senior"+String.valueOf(sumSenior);
		
		for(int i=0; i<4; i++)
		{
			System.out.println(list[i]);
		}
		
		
	}

}
