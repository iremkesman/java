package fraction;

public class fraction_operations {
	
	public int nom, denom, nom2, denom2, ebob, ekok, newnom, newdenom;
	
	
	public int Ebob(int denom, int denom2)
	{
	if (denom2 == 0)
		return denom;
	else
		return Ebob(denom2, denom%denom2);
	}

	public int Ekok(int denom, int denom2)
	{
		int c = Ebob(denom, denom2);
		
		return ekok = (denom*denom2)/c;
	}
	
	public void multipication(int nom, int denom, int nom2, int denom2)
	{	
		newnom = nom*nom2;
		newdenom = denom*denom2;
	}
	
	public void devide(int nom, int denom, int nom2, int denom2)
	{
		newnom = nom*denom2;
		newdenom = nom2*denom;
	}
	
	public void substraction(int nom, int denom, int nom2, int denom2)
	{
		int c = Ebob(denom, denom2);

		if (denom == denom2)
		{
			newdenom = denom;
			newnom = (denom2*nom - denom*nom2)/c;
		}
		else
		{
			Ebob(denom,denom2);
			Ekok(denom,denom2);
			
			newdenom = ekok;
			newnom = denom2*nom - denom*nom2;
		}
	}
	public void add(int nom, int denom, int nom2, int denom2)
	{
		
		int c = Ebob(denom, denom2);

		if (denom == denom2)
		{
			newdenom = denom;
			newnom = (denom2*nom + denom*nom2)/c;
		}
		else
		{
			Ebob(denom,denom2);
			Ekok(denom,denom2);
			
			newdenom = ekok;
			newnom = denom2*nom + denom*nom2;
		}
	}
}
