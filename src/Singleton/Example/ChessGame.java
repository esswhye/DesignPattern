package Singleton.Example;

public class ChessGame {
    public static void main(String[] args) {

        ChessBoard chessBoard = ChessBoard.getChessBoardInstance();
        chessBoard.noCalledGetChessBordInstance();

    }
}
