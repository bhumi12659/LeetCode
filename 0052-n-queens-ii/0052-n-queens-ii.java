class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return PlaceQueen(board,0,0,n);
        
    }
    public static int PlaceQueen(boolean[][] board,int row,int col,int tq){
        if(col==board.length){
            row++;
            col=0;
        }
        if(tq==0){
            return 1;
        }
        int count=0;
        for(col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=PlaceQueen(board,row+1,col,tq-1);
                board[row][col]=false;
            }
        }
        return count;
    }
    
    public static boolean isSafe(boolean[][] board,int row,int col){
        //up
        int r=row;
        while(r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }

        //ld
        r=row;
        int c= col;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }

        //rd
        r=row;
        c=col;
        while(r>=0 && c<board.length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}