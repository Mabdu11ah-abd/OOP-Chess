public class Knight extends Pieces {
   public Knight(boolean side)
   {
    Color= side;
   }
   public boolean checkLegalmoves(Board checkboard,int StartRow, int StartCol, int Destrow, int Destcol)
   {
    // move needs to be in l shape, and not a piece of the same color
    if(checkboard.getChessboard()[StartCol][StartRow].getColor()==false)
      {
         return false;
      }
   int RowDiff=Destrow-StartRow;
   int ColDiff=StartCol-Destcol;
   return (RowDiff==1 && ColDiff==2) || (RowDiff==2 && ColDiff==1);
   }
}
