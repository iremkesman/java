package simplification;
import java.util.Scanner;

public class hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ebob num = new ebob();
		
		System.out.println("please enter a nominator");
		num.nominator = scan.nextInt();
		System.out.println("please enter a denominator");
		num.denominator = scan.nextInt();
				
		num.Ebob(num.nominator, num.denominator);
		num.simplif();
		
		System.out.println(" " + num.nominator + "\n----\n" + " " + num.denominator);
		
	}

}
