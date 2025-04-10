class Solution {
public int findmax(int[][]grid,int startrow,int startcol)
{
    int maxval=Integer.MIN_VALUE;
    for(int i=startrow;i<startrow+3;i++)
    {
        for(int j=startcol;j<startcol+3;j++)
        {
            maxval=Math.max(maxval,grid[i][j]);
        }
    }
    return maxval;
}

    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int res[][]=new int[n-2][n-2];
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<n-2;j++)
            {
                res[i][j]=findmax(grid,i,j);
            }
        }
         return res;
    }
   
}
