package rectangle;

public class rect {
	private double lEdge;
	private double sEdge;
	
	public rect(double lEdge, double sEdge) //burada tan�mlayarak t�m kodda kullanabiliyoruz. Her fonk i�inde tan�mlamaya gerek yok!
	
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
