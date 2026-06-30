import java.util.*;

class Flood{
    public int[][] ffill(int[][] grid,int m,int n,int nc){
        if(grid[m][n] == nc){
            return grid;
        }
        int i = grid.length;
        int j = grid[0].length;
        int oldcoulour = grid[m][n];
        dfs(grid,nc,oldcoulour,i,j,m,n);
        return grid;
    }
    public void dfs(int[][] grid,int nc,int oc,int i, int j,int sr,int sc){
        if(sr<0||sr>=i||sc<0||sc>=j||grid[sr][sc]!=oc){
            return;
        }
        grid[sr][sc] = nc;
        dfs(grid,nc,oc,i,j,sr-1,sc);
        dfs(grid,nc,oc,i,j,sr+1,sc);
        dfs(grid,nc,oc,i,j,sr,sc-1);
        dfs(grid,nc,oc,i,j,sr,sc+1);
    }
    public static void main(String arg[]){
        Flood ob = new Flood();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int nc = sc.nextInt();
        int sr = sc.nextInt();
        int scc = sc.nextInt();
        int[][] res = ob.ffill(grid,sr,scc,nc);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.err.println("");
        }
    }
}