package hackerarnk;

import java.util.Scanner;

/**
 * Created by oracle on 3/11/16.
 */
public class Grid {

    /*public static int getBiggestRegion(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, countCells(matrix, i, j));
            }
        }
        return max;
    }

    private static int countCells(int[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) return 0;
        if (matrix[i][j] == 0) return 0;
        int count = matrix[i][j]--;
        count += countCells(matrix, i + 1, j);
        count += countCells(matrix, i - 1, j);
        count += countCells(matrix, i, j + 1);
        count += countCells(matrix, i, j - 1);
        count += countCells(matrix, i + 1, j + 1);
        count += countCells(matrix, i - 1, j - 1);
        count += countCells(matrix, i - 1, j + 1);
        count += countCells(matrix, i + 1, j - 1);
        return count;
    }*/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]grid= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[n][m]=sc.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
    public static int getBiggestRegion(int[][] grid){
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                 max=Math.max(max,countCells(grid,i,j));
            }
        }
        return max;
    }
    public static int countCells(int[][] grid, int i, int j){
        if(i>=grid.length || j>= grid[0].length || i<0 || j<0 )
            return 0;
        if(grid[i][j]==0)
            return 0;
        int count=grid[i][j]--;
        count+=countCells(grid,i-1,j-1);
        count+=countCells(grid,i-1,j);
        count+=countCells(grid,i-1,j+1);
        count+=countCells(grid,i,j-1);
        count+=countCells(grid,i,j+1);
        count+=countCells(grid,i+1,j-1);
        count+=countCells(grid,i+1,j);
        count+=countCells(grid,i+1,j+1);
        return count;

    }
}