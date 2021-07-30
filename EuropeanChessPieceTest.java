package ChessPkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//This class is present to test the European Chess Piece abstract class and the other European pieces aswell
class EuropeanChessPieceTest {

	EuropeanChess chessGame = new EuropeanChess();
	EuropeanChessDisplay chessDisplay = new EuropeanChessDisplay();
	
	ChessBoard chessBoard = new ChessBoard(8, 8, chessDisplay, chessGame);
	
     ChessGame.Side player1 = ChessGame.Side.NORTH;
	
	ChessGame.Side player2 = ChessGame.Side.SOUTH;
	
	@Test
	void testIsLegalVerticalNonCaptureMove(){
		
		QueenPiece q = new QueenPiece(chessBoard);
		q.setSide(player1); 
		chessBoard.addPiece(q, 4, 3); 
		boolean expectedValue = true;
		boolean actualVaue = false;
		 //Forward move
	     // actualVaue = q.isLegalVerticalNonCaptureMove(7, 3, true, 0);
		 
		 //Backward move
		 actualVaue = q.isLegalVerticalNonCaptureMove(1, 3, true, 0);
		 
		// Failed condition
		 
		// actualVaue = p.isLegalHorizontalNonCaptureMove(2, 7, true, 0);
		 assertEquals(expectedValue, actualVaue);
		
	}

	@Test
	void testIsLegalHorizontalNonCaptureMove() { 
		
		 QueenPiece q = new QueenPiece(chessBoard); 
		 q.setSide(player1);
		 chessBoard.addPiece(q, 4, 3); 
		 boolean expectedValue = true; 
		 boolean actualVaue = false;
	
		 //Forward move for  allowed step -  1
		 //actualVaue = q.isLegalHorizontalNonCaptureMove(4, 4, true, 1);
			 
		  //Backwaed move for max allowed step - 1 (Failed condition - It's not implemented)
		 //  actualVaue = q.isLegalHorizontalNonCaptureMove(4, 2, true, 1);
		 
		//Forward move for  allowed step -  2
		// actualVaue = q.isLegalHorizontalNonCaptureMove(4, 5, true, 2);
			 
		  //Backwaed move for max allowed step - 2 (Failed condition - It's not implemented)
		 //actualVaue = q.isLegalHorizontalNonCaptureMove(4, 1, true, 2);
		 
		 //Forward move for max allowed steps
		  actualVaue = q.isLegalHorizontalNonCaptureMove(4, 7, true, 0);
		 
		 //Backwaed move for max allowed step(s)
		// actualVaue = q.isLegalHorizontalNonCaptureMove(4, 1, true, 0);
		 
		// Failed condition	 
		// actualVaue = q.isLegalHorizontalNonCaptureMove(2, 7, true, 0);
		 
		 
	     assertEquals(expectedValue, actualVaue);
	 }
	
	@Test
	void testIsLegalDiagnalNonCaptureMove() { 
		
		 QueenPiece q = new QueenPiece(chessBoard); 
		 q.setSide(player1);
		 chessBoard.addPiece(q, 3, 3); 
		 boolean expectedValue = true; 
		 boolean actualVaue = false;	
			 
			
		 //Forward Diagnal move for max allowed steps 
		actualVaue = q.isLegalDiagonalNonCaptureMove(6,6, true, 0);
					 
		 //Backwaed Diagnal move for max allowed step(s)
		 //actualVaue = q.isLegalDiagonalNonCaptureMove(0,0, true, 0);
		 
		// Failed condition	 
		// actualVaue = q.isLegalDiagonalNonCaptureMove(2, 7, true, 0);
		 
		 
	     assertEquals(expectedValue, actualVaue);
	 }
	
	@Test
	void testIsLegalNonCaptureMoveForQueen() { 
		
	 QueenPiece q = new QueenPiece(chessBoard);
	 q.setSide(player1);
	 chessBoard.addPiece(q, 4, 3); 
	 boolean expectedValue = true; 
	 boolean actualVaue = false;
	 
	 //Forward Horizontal move
    //  actualVaue = q.isLegalNonCaptureMove(4, 7);
      
    //Backward Horizontal move
     // actualVaue = q.isLegalNonCaptureMove(7, 3);	 
      
      //Forward Vertical move
       // actualVaue = q.isLegalNonCaptureMove(7, 3);
        
      //Backward Vertical move
       // actualVaue = q.isLegalNonCaptureMove(1, 3);
        
        //Forward Diagnal move
         actualVaue = q.isLegalNonCaptureMove(7, 6);
         
       //Backward Diagnal move
       // actualVaue = q.isLegalNonCaptureMove(1, 0);
 		 
		 
	 // Failed condition
	 
	 // actualVaue = p.isLegalNonCaptureMove(2, 7);
	  assertEquals(expectedValue, actualVaue);
	 }
	
	@Test
	void testIsLegalCaptureMoveForQueen() 
	{
		 boolean expectedValue = true; 
		 boolean actualVaue = false;
		 
		 QueenPiece q1 = new QueenPiece(chessBoard);
		 q1.setSide(player1);
		 chessBoard.addPiece(q1, 4, 4); 
		 
		 QueenPiece q2 = new QueenPiece(chessBoard);
		 q2.setSide(player2); 
		 
		 //Forward legal diagnal capture move
		// chessBoard.addPiece(q2, 6, 6); 
		 //actualVaue = q1.isLegalCaptureMove(6, 6);
		 
		 //Backward legal diagnal capture move
		// chessBoard.addPiece(q2, 1, 1); 
		// actualVaue = q1.isLegalCaptureMove(1, 1);
		 
		 //Forward legal vertical capture move
		 //chessBoard.addPiece(q2, 7, 4); 
		// actualVaue = q1.isLegalCaptureMove(7, 4);
		 
		 //Backward legal vertical capture move
	     //chessBoard.addPiece(q2, 1, 4); 
		// actualVaue = q1.isLegalCaptureMove(1, 4);
		 
		 //Forward legal horizontal capture move
		// chessBoard.addPiece(q2, 4, 7); 
		 //actualVaue = q1.isLegalCaptureMove(4, 7);
		 
		 //Backward legal horizontal capture move
	      chessBoard.addPiece(q2, 4, 1); 
		  actualVaue = q1.isLegalCaptureMove(4, 1);
		 
		 assertEquals(expectedValue, actualVaue);
		
	}
	
	@Test
	void testIsLegalNonCaptureMoveForRook() { 
		
	 RookPiece piece1 = new RookPiece(chessBoard);
	 piece1.setSide(player1);
	 chessBoard.addPiece(piece1, 4, 3); 
	 boolean expectedValue = true; 
	 boolean actualVaue = false;
	 
	 //Forward Horizontal move
     actualVaue = piece1.isLegalNonCaptureMove(4, 7);
      
     //Backward Horizontal move
     //actualVaue = piece1.isLegalNonCaptureMove(4, 0);	 
      
      //Forward Vertical move
       // actualVaue = piece1.isLegalNonCaptureMove(7, 3);
        
      //Backward Vertical move
       // actualVaue = piece1.isLegalNonCaptureMove(1, 3);
       
 		 
		 
	 // Failed condition
	 
	 // actualVaue = p.isLegalNonCaptureMove(2, 7);
	  assertEquals(expectedValue, actualVaue);
	 }
	
	@Test
	void testIsLegalCaptureMoveForRook() 
	{
		 boolean expectedValue = true; 
		 boolean actualVaue = false;
		 
		 RookPiece piece1 = new RookPiece(chessBoard);
		 piece1.setSide(player1);
		 chessBoard.addPiece(piece1, 4, 4); 
		 
		 RookPiece piece2 = new RookPiece(chessBoard);
		 piece2.setSide(player2); 		 
		
		 
		 //Forward legal vertical capture move
		 //chessBoard.addPiece(piece2, 7, 4); 
		 //actualVaue = piece1.isLegalCaptureMove(7, 4);
		 
		 //Backward legal vertical capture move
	     chessBoard.addPiece(piece2, 1, 4); 
	     actualVaue = piece1.isLegalCaptureMove(1, 4);
		 
		 //Forward legal horizontal capture move
		// chessBoard.addPiece(piece2, 4, 7); 
		 //actualVaue = piece1.isLegalCaptureMove(4, 7);
		 
		 //Backward legal horizontal capture move
	     // chessBoard.addPiece(piece2, 4, 1); 
		 // actualVaue = piece1.isLegalCaptureMove(4, 1);
		 
		 assertEquals(expectedValue, actualVaue);
		
	}
	
	@Test
	void testIsLegalNonCaptureMoveForBishop() { 
		
	 BishopPiece piece1 = new BishopPiece(chessBoard);
	 piece1.setSide(player1);
	 chessBoard.addPiece(piece1, 4, 3); 
	 boolean expectedValue = true; 
	 boolean actualVaue = false;
	 
	 
      
     
     //Forward Diagnal move
     //actualVaue = piece1.isLegalNonCaptureMove(7, 6);
     
     //Backward Diagnal move
      actualVaue = piece1.isLegalNonCaptureMove(1, 0);      
    		 
		 
	 // Failed condition
	 
	 // actualVaue = p.isLegalNonCaptureMove(2, 7);
	  assertEquals(expectedValue, actualVaue);
	 }
		
	@Test
	void testIsLegalCaptureMoveForBishop() 
	{
		 boolean expectedValue = true; 
		 boolean actualVaue = false;
		 
		 BishopPiece piece1 = new BishopPiece(chessBoard);
		 piece1.setSide(player1);
		 chessBoard.addPiece(piece1, 4, 4); 
		 
		 BishopPiece piece2 = new BishopPiece(chessBoard);
		 piece2.setSide(player2); 
		 
		 //Forward legal diagnal capture move
		  //chessBoard.addPiece(piece2, 6, 6); 
		  //actualVaue = piece1.isLegalCaptureMove(6, 6);
			 
		 //Backward legal diagnal capture move
		  chessBoard.addPiece(piece2, 1, 1); 
		  actualVaue = piece1.isLegalCaptureMove(1, 1);		 
		
		 
		 assertEquals(expectedValue, actualVaue);
		
	}		

	@Test
	void testIsLegalNonCaptureMoveForKing() { 
		
	 KingPiece piece1 = new KingPiece(chessBoard);
	 piece1.setSide(player1);
	 chessBoard.addPiece(piece1, 4, 3); 
	 boolean expectedValue = true; 
	 boolean actualVaue = false;
	 
	 //Forward Horizontal move
     //actualVaue = piece1.isLegalNonCaptureMove(4, 4);
      
     //Backward Horizontal move
     //actualVaue = piece1.isLegalNonCaptureMove(3, 3);	 
      
      //Forward Vertical move
      // actualVaue = piece1.isLegalNonCaptureMove(5, 3);
        
      //Backward Vertical move
       // actualVaue = piece1.isLegalNonCaptureMove(4, 2);
        
        //Forward Diagnal move
       // actualVaue = piece1.isLegalNonCaptureMove(5, 4);
        
      //Backward Diagnal move
       actualVaue = piece1.isLegalNonCaptureMove(3, 2);
       
 		 
		 
	 // Failed condition
	 
	 // actualVaue = p.isLegalNonCaptureMove(2, 7);
	  assertEquals(expectedValue, actualVaue);
	 }
	
	@Test
	void testIsLegalCaptureMoveForKing() 
	{
		 boolean expectedValue = true; 
		 boolean actualVaue = false;
		 
		 KingPiece piece1 = new KingPiece(chessBoard);
		 piece1.setSide(player1);
		 chessBoard.addPiece(piece1, 4, 4); 
		 
		 KingPiece piece2 = new KingPiece(chessBoard);
		 piece2.setSide(player2); 		 
		
		 
		 //Forward vertical legal capture move
		// chessBoard.addPiece(piece2, 5,4); 
		// actualVaue = piece1.isLegalCaptureMove(5, 4);
		 
		 //Backward vertical legal capture move
	    // chessBoard.addPiece(piece2, 3, 4); 
	     //actualVaue = piece1.isLegalCaptureMove(3, 4);
		 
		 //Forward horizontal legal capture move
		  //chessBoard.addPiece(piece2, 5, 4); 
		  //actualVaue = piece1.isLegalCaptureMove(5, 4);
		 
		 //Backward horizontal legal capture move
	      //chessBoard.addPiece(piece2, 3, 4); 
		 // actualVaue = piece1.isLegalCaptureMove(3, 4);
		 
		 //Forward diagnal legal capture move
		  //chessBoard.addPiece(piece2, 5, 5); 
		  //actualVaue = piece1.isLegalCaptureMove(5, 5);
			 
		 //Backward diagnal legal capture move
		  chessBoard.addPiece(piece2, 3, 3); 
		  actualVaue = piece1.isLegalCaptureMove(3, 3);	
		 
		 assertEquals(expectedValue, actualVaue);
		
	}
		
	@Test
	void testIsLegalNonCaptureMoveForKnight() { 
		
	 KnightPiece piece1 = new KnightPiece(chessBoard);
	 piece1.setSide(player1);
	 chessBoard.addPiece(piece1, 4, 3); 
	 boolean expectedValue = true; 
	 boolean actualVaue = false;
	 
	 //Forward Horizontal and Vertical up move
    // actualVaue = piece1.isLegalNonCaptureMove(5, 5);
    // actualVaue = piece1.isLegalNonCaptureMove(6, 4);
     
     //Forward Horizontal and Vertical down move
      //actualVaue = piece1.isLegalNonCaptureMove(5, 1);
      //actualVaue = piece1.isLegalNonCaptureMove(6, 2);
      
     //Backward Horizontal and  Vertical up move
     // actualVaue = piece1.isLegalNonCaptureMove(3, 5);	 
     // actualVaue = piece1.isLegalNonCaptureMove(2, 4);	 
      
      ///Backward Horizontal and  Vertical down move
      //actualVaue = piece1.isLegalNonCaptureMove(3, 1);	 
      actualVaue = piece1.isLegalNonCaptureMove(2, 2);	      
      
		 
	 // Failed condition
	 
	 // actualVaue = p.isLegalNonCaptureMove(2, 7);
	  assertEquals(expectedValue, actualVaue);
	 }
	
	@Test
	void testIsLegalCaptureMoveForKnight() 
	{
		 boolean expectedValue = true; 
		 boolean actualVaue = true;
		 
		 KnightPiece piece1 = new KnightPiece(chessBoard);
		 piece1.setSide(player1);
		 chessBoard.addPiece(piece1, 4, 3); 
		 
		 PawnPiece pawnpiece = new PawnPiece(chessBoard);
		 pawnpiece.setSide(player2);
		 chessBoard.addPiece(pawnpiece, 5, 4); 
		 
		 
		 KnightPiece piece2 = new KnightPiece(chessBoard);
		 piece2.setSide(player2); 		
		 
			
		 
		 //Forward Horizontal and Vertical up capture move
		 // chessBoard.addPiece(piece2, 5,5); 
		 // actualVaue = piece1.isLegalCaptureMove(5, 5);
		  
		 // chessBoard.addPiece(piece2, 6,4); 
		  //actualVaue = piece1.isLegalCaptureMove(6, 4);
		 
		 
		  
		  //Forward Horizontal and Vertical down capture move
			//  chessBoard.addPiece(piece2, 5,1); 
			 // actualVaue = piece1.isLegalCaptureMove(5, 1);
			  
			//  chessBoard.addPiece(piece2, 6,2); 
			 // actualVaue = piece1.isLegalCaptureMove(6, 2);
			  
			  
			  //Backward Horizontal and  Vertical up move
		 	//chessBoard.addPiece(piece2, 3,5); 
		 	//actualVaue = piece1.isLegalCaptureMove(3, 5);
		 		
		 	//chessBoard.addPiece(piece2, 2,4); 
		 	//actualVaue = piece1.isLegalCaptureMove(2, 4);
			     	 
			      
			      ///Backward Horizontal and  Vertical down move
		 		
		 		chessBoard.addPiece(piece2, 3,1); 
			 	actualVaue = piece1.isLegalCaptureMove(3, 1);
			 		
			 	//chessBoard.addPiece(piece2, 2,2); 
			 	//actualVaue = piece1.isLegalCaptureMove(2, 2);
				
		 
		 assertEquals(expectedValue, actualVaue);
		
	}
	
	@Test
	void testIsLegalNonCaptureMoveForPawn() {
		
		PawnPiece p = new PawnPiece(chessBoard);
		p.setSide(player1); 
		chessBoard.addPiece(p, 1, 1); 
		boolean expectedValue = true;
		boolean actualVaue = false;
		
		//First move
		actualVaue = p.isLegalNonCaptureMove(3, 1);
		assertEquals(expectedValue, actualVaue);
		
	}

	@Test
	void testIsLegalCaptureMoveForPawn() {
		PawnPiece p1 = new PawnPiece(chessBoard);
		p1.setSide(player1); 
		chessBoard.addPiece(p1, 3, 1);
		PawnPiece p2 = new PawnPiece(chessBoard);
		p2.setSide(player2); 
		chessBoard.addPiece(p2, 4, 2);
		boolean expectedValue = true;
		boolean actualVaue = false;
		actualVaue= p1.isLegalCaptureMove(4, 2);
		assertEquals(expectedValue, actualVaue);
		
	}

	

	




}
