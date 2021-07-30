/**
 * 
 */
package ChessPkg;

/**
 * @author pradh
 *
 */
public class EuropeanChess implements ChessGame {
	
	// Stores previous side
	private ChessGame.Side prevSide;
	
	@Override
	public boolean legalPieceToPlay(ChessPiece piece, int row, int column) 
	{
		// Boolean variable to store if the move to the new row and column is lagal
		boolean legalMove = false;
		
		if(this.prevSide != null)
		{
			if( (this.prevSide == ChessGame.Side.NORTH || this.prevSide == ChessGame.Side.EAST) 
					&& (piece.getSide() == ChessGame.Side.SOUTH || piece.getSide() == ChessGame.Side.WEST) 
					|| (this.prevSide == ChessGame.Side.SOUTH || this.prevSide == ChessGame.Side.WEST)
					&& (piece.getSide() == ChessGame.Side.NORTH || piece.getSide() == ChessGame.Side.EAST) )
			{
				this.prevSide = piece.getSide();
				legalMove = true;
			}
		}
		else
		{
			this.prevSide = piece.getSide();
			legalMove = true;
		}
		return legalMove;
	}

	@Override
	public boolean makeMove(ChessPiece piece, int toRow, int toColumn)
	{
		// TODO Auto-generated method stub
		return piece.isLegalMove(toRow, toColumn);
	}
	
}
