
public abstract class Piece
{
	// superclass
	
	// locations will always be [row, col]
	public int[] startLocation;
	public int[] location;
	public boolean isAlive;
	public boolean isWhite;
	
	public abstract int[] move();
	
	// declare methods
	public void die()
	{
		isAlive = false;
	}
	public void birth()
	{
		isAlive = true;
		location = startLocation;
	}
	public int[] getLocation()
	{
		return location;
	}
}
