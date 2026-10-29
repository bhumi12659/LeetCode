class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> lla = new ArrayList<>();
        PlaceQueen(board,0,0,n,lla);
        return lla;
    }
    public static void PlaceQueen(boolean[][] board,int row,int col,int tq,List<List<String>> lla){
        if(col==board.length){
            row++;
            col=0;
        }
        if(tq==0){
            List<String> ll =new ArrayList<>();
            DisplayAnswer(board,ll,lla);
            return;
        }
        
        for(col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                PlaceQueen(board,row+1,col,tq-1,lla);
                board[row][col]=false;
            }
        }
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

    public static void DisplayAnswer(boolean[][] board,List<String> ll,List<List<String>> llans){
        for(int i=0;i<board.length;i++){
            String ans ="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]==true){
                    ans =ans+"Q";
                }
                else{
                    ans=ans+".";
                }
            }
            ll.add(ans);
        }
        llans.add(ll);
        return;
    }
}