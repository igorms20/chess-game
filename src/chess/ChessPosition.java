package chess;

import board.Position;

public class ChessPosition {

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Column must be between a and h");
		}
		this.column = column;
		this.row = row;
	}

	public Position toPosition() {		

		return new Position(8 - row, column - 'a');
	}

	public static ChessPosition fromPosition(Position position) {
		char column = (char)(position.getColumn() + 'a');
		return new ChessPosition(column, 8 - position.getRow());
	}

	@Override
	public String toString() {
		return "" + column + row;
	}

	
}
