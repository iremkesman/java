package elevator;
import java.util.Scanner;

public class elevator_main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		elv myElevator = new elv();
		
		myElevator.doorOpen();
		System.out.println("Capacity of the elevator is 5 \nIs there how many people in the elevator?");
		myElevator.people = scan.nextInt();
		
		if(myElevator.people >= myElevator.capacity)
		{
			System.out.println("Capacity of the elevator is FULL, please use the next one...");
		}
		
		else 
		{
			System.out.println("This building has 5 floors. Which floor will you going?");
		}
		
		myElevator.nextFloor = scan.nextInt();
		myElevator.doorClose();
		
		if(myElevator.nextFloor < myElevator.maxFloor && myElevator.nextFloor > myElevator.minFloor)
		{
			if(myElevator.nextFloor > myElevator.currentFloor)
			{
				myElevator.goUp(myElevator.nextFloor);
				myElevator.setFloor();
			}
			else
			{
				myElevator.goDown(myElevator.nextFloor);
				myElevator.setFloor();
			}
		}
		else
			System.out.println("there is no more floor");
		

	}

}
