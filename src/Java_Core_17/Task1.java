package Java_Core_17;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chessPieces = new ChessPiece[8];
        for(int i=0;i<8;i++){
            if(i<4){
                chessPieces[i] = ChessPiece.PAWN_WHITE;
                System.out.printf("%s", chessPieces[i].getPicture());
            }else {
                chessPieces[i] = ChessPiece.ROCK_BLACK;
                System.out.printf("%s", chessPieces[i].getPicture());
            }
        }
    }
}
