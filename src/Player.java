
public class Player {

	public boolean hasWon;
	public Piece[] Pieces;
	public boolean isWhite;
	
	public Player()
	{
		isWhite=true;
		Piece[] first_row = new Piece[8];
		for (int n=1;n<8;n++)
		{
			int [] pawnLocation = {7,n};
			first_row[n] = new Pawn(isWhite,pawnLocation);
			
		}
	}
}
