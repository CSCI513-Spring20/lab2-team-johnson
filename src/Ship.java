import java.awt.Point;

public class Ship 
{
	Point currentLocation = new Point();
	
	public Ship()
	{
		
	}
	
	public Ship(int X, int Y) 
	{
		currentLocation.x = X;
		currentLocation.y = Y;
	}
	
	public Point getShipLocation() 
	{
		return currentLocation;
	}
}
