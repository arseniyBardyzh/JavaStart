package Java_Core_17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessPieces = new ChessPiece[8][8];

        //Заполняем массив фигур
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(i==0){
                    if((j==0)||(j==5)){
                        chessPieces[i][j] = ChessPiece.ROCK_BLACK;
                    }else if(j==6){
                        chessPieces[i][j] = ChessPiece.KNIGHT_BLACK;
                    }else{
                        chessPieces[i][j] = ChessPiece.EMPTY;
                    }
                }else if(i==1){
                    if(j==1){
                        chessPieces[i][j] = ChessPiece.ROCK_WHITE;
                    }else if((j==4)||(j==5)||(j==7)){
                        chessPieces[i][j] = ChessPiece.PAWN_BLACK;
                    }else{
                        chessPieces[i][j] = ChessPiece.EMPTY;
                    }
                }else if(i==2){
                    if ((j==0)||(j==6)){
                        chessPieces[i][j] = ChessPiece.PAWN_BLACK;
                    }else if(j==2){
                        chessPieces[i][j] = ChessPiece.KNIGHT_BLACK;
                    }else{
                        chessPieces[i][j] = ChessPiece.EMPTY;
                    }
                }else if(i==3){
                    if(j==0){
                        chessPieces[i][j] = ChessPiece.QUEEN_BLACK;
                    }else if(j==3){
                        chessPieces[i][j] = ChessPiece.BISHOP_WHITE;
                    }else{
                        chessPieces[i][j] = ChessPiece.EMPTY;
                    }
                }else if(i==4){
                    if(j==3){
                        chessPieces[i][j] = ChessPiece.BISHOP_BLACK;
                    }else if(j==4){
                        chessPieces[i][j] = ChessPiece.PAWN_WHITE;
                    }else{
                        chessPieces[i][j] = ChessPiece.EMPTY;
                    }
                }else if(i==5){
                    if(j==4){
                        chessPieces[i][j] = ChessPiece.BISHOP_WHITE;
                    }else if(j==5){
                        chessPieces[i][j] = ChessPiece.PAWN_WHITE;
                    }else{
                        chessPieces[i][j] = ChessPiece.EMPTY;
                    }
                }else if(i==6){
                    if((j==0)||(j==5)||(j==7)){
                        chessPieces[i][j] = ChessPiece.PAWN_WHITE;
                    }else if(j==3){
                        chessPieces[i][j] = ChessPiece.QUEEN_WHITE;
                    }else{
                        chessPieces[i][j] = ChessPiece.EMPTY;
                    }
                }else{
                    if(j==5){
                        chessPieces[i][j] = ChessPiece.ROCK_WHITE;
                    }else if(j==6){
                        chessPieces[i][j] = ChessPiece.KING_WHITE;
                    }else{
                        chessPieces[i][j] = ChessPiece.EMPTY;
                    }
                }
            }
        }

        ChessBoard chessBoard = new ChessBoard(chessPieces);

        chessBoard.print();
    }
}
