
public class Pawn extends Piece
{
	
	//moves described here are meant to be added
	// to current location [row, col]
	
	// default constructor, shouldn't be used
	public Pawn()
	{
		super();
		startLocation = new int[] {0,0};
		location = new int[] {0,0};
	}
	
	// constructor that is passed a start location of [row, col]
	public Pawn(boolean color, int [] starty)
	{
		super();
		isWhite = color;
		startLocation = starty;
		birth();
		
		
	}

	public int[] move(int option) {
		//white is on bottom of board, black is on top
		int addition;
		int [] newLocation = location;
		if (isWhite ==true)
			addition = -1;
		else
			addition = 1;
		
		//move 1 row  = option 1
		//move 2 rows = option 2
		if(option == 1)
		{
			newLocation[1] = location[1]+addition*option;
			location = newLocation;
		}
		//option 3 = move diagonally
		else if(option==3)
		{
			newLocation[1] = location[1]+addition;
			location = newLocation;
		}
		else if(option <1 || option>2)
		{
			System.out.println("Please select valid move. Options are move(1), move(2),move(3, l),move(3,r");
		}
		return location;
	}
	
	public int[] move(int option, char direction) 
	{
		int addition;
		int [] newLocation = location;
		if (isWhite ==true)
			addition = -1;
		else
			addition = 1;
		
		
		if(option ==3)
		{
			if (direction=='l')
			{
				newLocation[1] = location[1]+addition;
				newLocation[2]=location[2]+addition;
			}
			else if(direction =='r')
			{
				newLocation[1] = location[1]+addition;
				newLocation[2]=location[2]+addition*-1;
			}
			else
			{
				System.out.println("Please select valid move. Options are move(1), move(2),move(3, l),move(3,r");
			}
			location = newLocation;
		}
		return location;
	}

	public int[] move()
	{
		System.out.print("Please select valid move. Options are move(1), move(2),move(3, l),move(3,r");
		return null;
	}
}
