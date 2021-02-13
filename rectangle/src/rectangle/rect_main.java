package rectangle;

public class rect_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rect rc = new rect(5,10);
		
		System.out.println("area "+ rc.area());
		System.out.println("circumference "+ rc.circumference());
		
		square sq =new square(10);
		
		System.out.println("area: "+ sq.area());
		System.out.println("circumference: "+ sq.circumference());

	}

}
