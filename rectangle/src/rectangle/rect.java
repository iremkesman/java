package rectangle;

public class rect {
	private double lEdge;
	private double sEdge;
	
	public rect(double lEdge, double sEdge) //burada tanýmlayarak tüm kodda kullanabiliyoruz. Her fonk içinde tanýmlamaya gerek yok!
	
	{
		this.lEdge=lEdge;
		this.sEdge=sEdge;
	}
	
	public double area()
	{
		return this.lEdge*this.sEdge;
	}
	
	public double circumference()
	{
		return 2*(this.lEdge+this.sEdge);
	}
	
	
	

}
