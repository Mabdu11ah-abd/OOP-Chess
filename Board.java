import java.util.Scanner;

public class Board {
  Scanner input = new Scanner(System.in);
  public Pieces chessboard[][] = new Pieces[8][8];

  public Board() {
    setboard();
  }

  public void setboard() {
    boolean color = true;
    // * setting up board for white side */
    chessboard[0][0] = new Rook(color);
    chessboard[0][1] = new Knight(color);
    chessboard[0][2] = new Bishop(color);
    chessboard[0][3] = new Queen(color);
    chessboard[0][4] = new King(color);
    chessboard[0][5] = new Rook(color);
    chessboard[0][6] = new Knight(color);
    chessboard[0][7] = new Bishop(color);
    for (int i = 0; i < 8; i++) {
      chessboard[1][i] = new Pawn(color);
    }

    // * setting up board for black pieces */
    color = false;
    for (int i = 0; i < 7; i++) {
      chessboard[1][i] = new Pawn(color);
    }
    chessboard[7][0] = new Rook(color);
    chessboard[7][1] = new Knight(color);
    chessboard[7][2] = new Bishop(color);
    chessboard[7][3] = new Queen(color);
    chessboard[7][4] = new King(color);
    chessboard[7][5] = new Bishop(color);
    chessboard[7][6] = new Knight(color);
    chessboard[7][7] = new Rook(color);

  }

  public void movepiece() {

    System.out.println(("Enter the position that you want to be able to move : "));
    int startrow = input.nextInt();
    int startcol = input.nextInt();
    System.out.println(("Enter the position that you want to move to : "));
    int destrow = input.nextInt();
    int destcol = input.nextInt();
    Pieces swappiece = chessboard[temp1][temp2];

  }

}
