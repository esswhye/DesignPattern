package Singleton.Example;

public class ChessBoard {

    private static ChessBoard chessBoardInstance = null;

    private static int i;

    private ChessBoard() {
    }

    public static ChessBoard getChessBoardInstance() {
        i++;
        if (chessBoardInstance == null) {

            return new ChessBoard();
        }
        return chessBoardInstance;
    }

    public void noCalledGetChessBordInstance() {
        System.out.println(i);
    }


}
