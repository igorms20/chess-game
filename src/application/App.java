package application;

import board.Board;
import board.Position;
import chess.ChessMatch;
import chess.ChessPosition;
import chess.UI;

public class App {

	public static void main(String[] args) {
		
		Board board = new Board(8, 8);

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		ChessPosition chessPos = ChessPosition.fromPosition(new Position(0, 5));
		System.out.println(chessPos);
		

	}

}
