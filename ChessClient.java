package ChessPkg;
//This is the main method that sets all the European chess pieces and starts the game
public class ChessClient {
	
	public static void main(String[] args) 
	{

		EuropeanChess chessGame = new EuropeanChess();
		EuropeanChessDisplay chessDisplay = new EuropeanChessDisplay();
		
		ChessBoard chessBoard = new ChessBoard(8, 8, chessDisplay, chessGame);
		
		ChessGame.Side player1 = ChessGame.Side.NORTH;
		
		ChessGame.Side player2 = ChessGame.Side.SOUTH;
		
		//sets the pawn pieces on both players sides
		for(int i = 0; i < 8; i++) 
		{ 
			PawnPiece p = new PawnPiece(chessBoard);
			p.setSide(player1); 
			chessBoard.addPiece(p, 1, i); 
		}
		
		for(int i = 0; i < 8; i++) 
		{ 
			PawnPiece p = new PawnPiece(chessBoard);
			p.setSide(player2); 
			chessBoard.addPiece(p, 6, i); 
		}
		
		//sets the pawn pieces on both players sides
		QueenPiece q1 = new QueenPiece(chessBoard); 
		q1.setSide(player1);
		chessBoard.addPiece(q1, 0, 3);
		
		QueenPiece q2 = new QueenPiece(chessBoard); 
		q2.setSide(player2); 
		chessBoard.addPiece(q2, 7, 3);
		
		//sets the king pieces on both players sides
		KingPiece k1 = new KingPiece(chessBoard); 
		k1.setSide(player1);
		chessBoard.addPiece(k1, 0, 4); 
		
		KingPiece k2 = new KingPiece(chessBoard); 
		k2.setSide(player2); 
		chessBoard.addPiece(k2, 7, 4);
		
		//sets the knight pieces on both players sides
		KnightPiece n1 = new KnightPiece(chessBoard);
		n1.setSide(player1);
		chessBoard.addPiece(n1, 0, 1); 
		
		KnightPiece n2 = new KnightPiece(chessBoard);
		n2.setSide(player1);
		chessBoard.addPiece(n2, 0, 6); 
		
		KnightPiece n3 = new KnightPiece(chessBoard);
		n3.setSide(player2);
		chessBoard.addPiece(n3, 7, 1); 
		
		
		KnightPiece n4 = new KnightPiece(chessBoard);
		n4.setSide(player2);
		chessBoard.addPiece(n4, 7, 6); 
		
		//sets the rooks pieces on both players sides
		RookPiece r1 = new RookPiece(chessBoard);
		r1.setSide(player1);
		chessBoard.addPiece(r1, 0, 0);
		
		RookPiece r2 = new RookPiece(chessBoard);
		r2.setSide(player1);
		chessBoard.addPiece(r2, 0, 7);
		
		RookPiece r3 = new RookPiece(chessBoard);
		r3.setSide(player2);
		chessBoard.addPiece(r3, 7, 0);

		RookPiece r4 = new RookPiece(chessBoard);
		r4.setSide(player2);
		chessBoard.addPiece(r4, 7, 7);
		
		//sets the bishop pieces on both players sides
		BishopPiece b1 = new BishopPiece(chessBoard); 
		b1.setSide(player1);
		chessBoard.addPiece(b1, 0, 2);
		
		BishopPiece b2 = new BishopPiece(chessBoard); 
		b2.setSide(player1);
		chessBoard.addPiece(b2, 0, 5);
		
		BishopPiece b3 = new BishopPiece(chessBoard); 
		b3.setSide(player2);
		chessBoard.addPiece(b3, 7, 2); 

		BishopPiece b4 = new BishopPiece(chessBoard); 
		b4.setSide(player2);
		chessBoard.addPiece(b4, 7, 5);
			
	}

}
