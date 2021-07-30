package ChessPkg;

import javax.swing.Icon;

/*
 * This interface will allow different types of Chess Game Piece Types such as European Chess Piece Type and 
 * Standard Piece Type will be implimented. 
 */
public interface ChessPiece 
{

	
	public ChessGame.Side getSide();
	
	public String getLabel();
	
	public Icon getIcon();

	public void setLocation(int row, int col);

	
	public boolean isLegalCaptureMove(int toRow, int toColumn);

	
	public boolean isLegalMove(int toRow, int toColumn);

}
