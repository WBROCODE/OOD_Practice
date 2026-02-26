package Board;

import Pieces.Pieces;

public class Board {
    private int wide;
    private int length;
    private Pieces[][] board;

    public Board(int wide, int length) {
        this.wide = wide;
        this.length = length;
        initBoard();
    }

    public void initBoard() {
        board = new Pieces[wide][length];
        for (int i = 0; i < wide; i++) {
            for (int j = 0; j < length; j++) {
                board[i][j] = Pieces.EMPYT;
            }
        }
    }

    public int placePiece(Pieces piece, int x) {
        if(x < 0 ||  x >= wide) throw new Error("Invalid position");
        if(piece.equals(EMPYT)) throw new Error("Invalid position");

        for(int i = )
    }


    public Pieces[][] getBoard() {
        return board;
    }
    public int getWide() {
        return wide;
    }

    public int getLength() {
        return length;
    }


}
