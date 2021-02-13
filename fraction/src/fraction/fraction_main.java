package fraction;
import java.util.Scanner;

public class fraction_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		fraction_operations num = new fraction_operations();
		fraction_operations num2 = new fraction_operations();
		
		System.out.println("enter first fraction\nnominator:");
		num.nom = scan.nextInt();
		System.out.println("denominator:");
		num.denom = scan.nextInt();
		
		System.out.println("enter second fraction\nnominator:");
		num.nom2 = scan.nextInt();
		System.out.println("denominator:");
		num.denom2 = scan.nextInt();
		
				
		num.add(num.nom, num.denom, num.nom2, num.denom2);
		System.out.println("addition:" + num.newnom + "/" + num.newdenom);

		
		num.substraction(num.nom, num.denom, num.nom2, num.denom2);
		System.out.println("subtraction:" + num.newnom + "/" + num.newdenom);

		
		num.devide(num.nom, num.denom, num.nom2, num.denom2);
		System.out.println("devide:" + num.newnom + "/" + num.newdenom);

		
		num.multipication(num.nom, num.denom, num.nom2, num.denom2);
		System.out.println("multipication:" + num.newnom + "/" + num.newdenom);

	}

}
