package elevator;

public class elv {
	
	public int capacity=5, people, currentFloor=0, nextFloor;
	public boolean door;
	public int maxFloor = 5, minFloor = 0;
	
	public int goUp(int nextFloor)
	{
		return currentFloor = nextFloor;
	}

	public int goDown(int nextFloor)
	{
		return currentFloor = nextFloor;
	}
	
	public void doorOpen()
	{
		System.out.println("Please wait, door is opening...");
		door = true;
		System.out.println("the door open");
	}

	public void doorClose()
	{
		System.out.println("Please wait, door is closing...");
		door = false;
		System.out.println("the door close");
	}
	
	public void setFloor()
	{
		System.out.println("you are in the " + currentFloor + ". floor");
	}
}

