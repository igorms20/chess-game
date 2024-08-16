package application;

import board.Board;
import chess.ChessMatch;
import chess.UI;

public class App {

	public static void main(String[] args) {
		
		Board board = new Board(8, 8);

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		
		

	}

}
