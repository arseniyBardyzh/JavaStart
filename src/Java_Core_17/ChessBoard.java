package Java_Core_17;

public class ChessBoard {
    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces){
        this.chessPieces = chessPieces;
    }

    public void print(){
        for(int i=0;i<8;i++){
            System.out.printf("|");
            for(int j=0;j<8;j++){
                System.out.printf("%s|", this.chessPieces[i][j].getPicture());
            }
            System.out.println("");
        }
    }
}
