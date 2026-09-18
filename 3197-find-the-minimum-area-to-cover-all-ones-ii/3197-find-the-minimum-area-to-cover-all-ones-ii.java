class Solution {
    public int minimumSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = Integer.MAX_VALUE;
        //case1
        for(int i=0;i<n;i++){
            for(int j=i+1;j+1<n;j++){
                ans=Math.min(ans,res(grid,0,0,i,m-1)+res(grid,i+1,0,j,m-1)+res(grid,j+1,0,n-1,m-1));
            }
        }

        //case2
        for(int i=0;i<m;i++){
            for(int j=i+1;j+1<m;j++){
                ans=Math.min(ans,res(grid,0,0,n-1,i)+res(grid,0,i+1,n-1,j)+res(grid,0,j+1,n-1,m-1));
            }
        }

        //case3
        for(int i=0;i+1<n;i++){
            for(int j=0;j+1<m;j++){
                ans=Math.min(ans,res(grid,0,0,i,j)+res(grid,0,j+1,i,m-1)+res(grid,i+1,0,n-1,m-1));
            }
        }

        //case4
        for(int i=0;i+1<n;i++){
            for(int j=0;j+1<m;j++){
                ans=Math.min(ans,res(grid,0,0,i,m-1)+res(grid,i+1,0,n-1,j)+res(grid,i+1,j+1,n-1,m-1));
            }
        }

        //case5
        for(int i=0;i+1<n;i++){
            for(int j=0;j+1<m;j++){
                ans=Math.min(ans,res(grid,0,0,n-1,j)+res(grid,0,j+1,i,m-1)+res(grid,i+1,j+1,n-1,m-1));
            }
        }

        //case6
        for(int i=0;i+1<n;i++){
            for(int j=0;j+1<m;j++){
                ans=Math.min(ans,res(grid,0,0,i,j)+res(grid,i+1,0,n-1,j)+res(grid,0,j+1,n-1,m-1));
            }
        }
        return ans;
    }

    public int res(int[][] grid,int sr,int sc,int er,int ec){
        int minr = Integer.MAX_VALUE;
        int maxr = Integer.MIN_VALUE;
        int minc = Integer.MAX_VALUE;
        int maxc = Integer.MIN_VALUE;
        for(int i=sr;i<=er;i++){
            for(int j=sc;j<=ec;j++){
                if(grid[i][j]==1){
                    minr = Math.min(minr,i);
                    maxr = Math.max(maxr,i);
                    minc = Math.min(minc,j);
                    maxc = Math.max(maxc,j);
                }
            }
        }
        int l = maxr-minr+1;
        int b = maxc-minc+1;
        return l*b;

    }
}