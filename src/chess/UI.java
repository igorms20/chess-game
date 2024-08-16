package chess;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        int rowNumber = 8;
        System.out.println();
        for (ChessPiece[] chessPieces : pieces) {
            System.out.print("\n" + rowNumber + " ");
            rowNumber--;
            for (ChessPiece piece : chessPieces) {
                printPiece(piece);
            }
        }
        System.out.println();
        System.out.println("  a b c d e f g h");

    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        } else {
            System.out.print(piece);           
        }
        System.out.print(" ");

    }
}
