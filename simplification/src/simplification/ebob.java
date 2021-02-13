package simplification;

	public class ebob {
		
		public int nominator,denominator;

		public int a, b;
		public int Ebob(int a, int b)
		{
			if(b == 0)
				return a;
			else
				return (Ebob(b, a%b));
		}
		
		
		public void simplif()
		{	
			int c = Ebob(nominator,denominator);
			nominator = nominator/c;
			denominator = denominator/c;

		}

	}



