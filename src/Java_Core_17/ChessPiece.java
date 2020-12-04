package Java_Core_17;

public enum ChessPiece {
    KING_WHITE(100, '♔'),
    KING_BLACK(100, '♚'),
    QUEEN_WHITE(9, '♕'),
    QUEEN_BLACK(9, '♛'),
    ROCK_WHITE(5, '♖'),
    ROCK_BLACK(5, '♜'),
    BISHOP_WHITE(3.5, '♗'),
    BISHOP_BLACK(3.5, '♝'),
    KNIGHT_WHITE(3, '♘'),
    KNIGHT_BLACK(3, '♞'),
    PAWN_WHITE(1, '♙'),
    PAWN_BLACK(1, '♟'),
    EMPTY(1, '_');

    private double value;
    private char picture;

    ChessPiece(double value, char picture){
        this.value = value;
        this.picture = picture;
    }

    public char getPicture() {
        return picture;
    }
}
