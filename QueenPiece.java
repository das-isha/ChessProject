package ChessPkg;

public class QueenPiece extends EuropeanChessPiece
{
	
	public QueenPiece(ChessBoard chessBoard) 
	{
		this.setLabel("Q");
		this.setChessBoard(chessBoard);
	}
	
	@Override
	public boolean isLegalNonCaptureMove(int row, int column) {
		// Boolean variable to store if the move to the new row and column is lagal
		boolean legalMove = false;
		
		//Create a ChessBoard and assign is the ChessBoard attached to the Piece
		ChessBoard cb = this.getChessBoard();
		
		if(cb.hasPiece(row, column))
		{
			legalMove = false;
		}
		else
		{
			if( this.isLegalDiagonalNonCaptureMove(row, column, true, 0)
					|| this.isLegalHorizontalNonCaptureMove(row, column, true, 0)
					|| this.isLegalVerticalNonCaptureMove(row, column, true, 0))
			{
				legalMove = true;
				this.moveDone();
			}
		}
		
		return legalMove;		
	}

	@Override
	public boolean isLegalCaptureMove(int row, int column) 
	{
		// Boolean variable to store if the move to the new row and column is lagal
		boolean legalMove = false;
		
		//Create a ChessBoard and assign is the ChessBoard attached to the Piece
		ChessBoard cb = this.getChessBoard();
		
		RookPiece rook = new RookPiece(cb);
		rook.setLocation(this.getRow(), this.getColumn());;
		rook.setSide(this.getSide());
		BishopPiece bishop = new BishopPiece(cb);
		bishop.setLocation(this.getRow(), this.getColumn());
		bishop.setSide(this.getSide());
		
		if(cb.hasPiece(row, column))
		{
			if(rook.isLegalCaptureMove(row, column) || bishop.isLegalCaptureMove(row, column))
			{
				cb.removePiece(row, column);
				this.movePiece(row, column);
				legalMove = true;
				this.moveDone();
			}
			
		}
	
		return legalMove;
	}

	@Override
	public void moveDone() 
	{
		//Do nothing

	}

	
	/*
	 * private void movePiece(ChessBoard cb, int row, int column) {
	 * cb.removePiece(this.getRow(), this.getColumn()); cb.addPiece(this, row,
	 * column); this.moveDone(); }
	 */




}
