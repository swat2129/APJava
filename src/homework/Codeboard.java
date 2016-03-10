package homework;

public class Codeboard {
	
    public int maxDistBetweenAny2(int[][] nums){
        int min = nums[0][0];
        int max = nums[0][0];
        
        for (int[] subArr: nums) {
            for (int i: subArr) {
                if (i < min) min = i;
                if (i > max) max = i;
            }
        }
        
        return max - min;
    }
	
    public String[][] twoCharsTo2D(String[][] table, String[] words){
        int count = 0;
        
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = count < words.length ? words[count].substring(0, 2) : "$$";
                count++;
            }
        }
        
        return table;
    }
	
    public String bestAverage(String[] roster, int[][] grades){
        int person = 0;
        double currentMax = Double.MIN_VALUE;
        
        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            
            for (int num: grades[i]) {
                sum += num;
            }
            
            double avg = sum / grades[i].length;
            
            if (avg > currentMax) {
                currentMax = avg;
                person = i;
            }
        }
        
        return roster[person];
    }
	
    public int[][] removeRowCol(int[][] mat, int row, int col){
        int[][] nothing = new int[mat.length - 1][mat[0].length - 1];
        
        for (int i = 0; i < nothing.length; i++) {
            for (int j = 0; j < nothing[0].length; j++) {
                if (i < row) nothing[i][j] = j < col ? mat[i][j] : mat[i][j + 1];
                else nothing[i][j] = j < col ? mat[i + 1][j] : mat[i + 1][j + 1];
            }
        }
        
        return nothing;
    }
	
    public int[] getNeighbors(int[][] grid, int row, int col) {
    	// There's a better version on Codeboard.io
    	
        int[] r;
        
        if (row == 0 || row == grid.length - 1) {
            if (col == 0 || col == grid[0].length - 1) {
                r = new int[3];
            } else {
                r = new int[5];
            }
        } else {
            if (col == 0 || col == grid[0].length - 1) {
                r = new int[5];
            } else {
                r = new int[8];
            }
        }
        
        int count = 0;
        for (int i = row - 1; i < row + 2; i++) {
            for (int j = col - 1; j < col + 2; j++) {
                if (i > -1 && i < grid.length && j > -1 && j < grid[0].length) {
                    r[count] = grid[i][j];
                }
            }
        }
        
        return r;
    }
}
