public class LC1351CountNegativeNumbersInSortedMatrix {
    public static void countNegatives(int[][] grid){
        int rows = grid.length ; int cols = grid[0].length;
        int row = 0; int col = cols - 1;
        int ans = 0;
        while(row < rows && col >= 0){
            if(grid[row][col] >= 0){
                row++;
            }else{
                ans += rows - row;
                col--;
            }
        }
        System.out.println("The count is " + ans );
    }
    
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1}, {3,2,1,-1} , {1,1,-1,-2} , {-1,-1,-2,-3}};
        countNegatives(grid);
    }
}

// Time Complexity : O(n + m) Space Complexity : O(1)