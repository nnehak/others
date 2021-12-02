package com.neha.gs.two;

//optimal path - cross country road trip, grid filled with numbers, objective is to find optimal path from one place to other allows you to accumulate most rocks on way - shortest path with maximum score
//please can you explain problem more
//Input and output examples
//how to implement

public class OptimalPath {
	public static void main(String[] args) {
		System.out.println(optimalPath(new Integer[][]{
				{0,0,0,0,5},
				{0,1,1,1,0},
				{2,0,0,0,0}
		})==10);
		//path will be 2+0+1+1+1+5
	}

	public static Integer optimalPath(Integer[][] grid) {
		if (grid.length == 0 || grid[0].length == 0) {
			return 0;
		}

		for (Integer row = grid.length - 1; row >= 0; row--) {
			for (Integer col = 0; col < grid[0].length; col++) {
				if (row < grid.length - 1 && col > 0)
					grid[row][col] += Math.max(grid[row + 1][col], grid[row][col - 1]);
				else if(row<grid.length-1)
					grid[row][col]+=grid[row+1][col];
				else if(col>0)
					grid[row][col]+=grid[row][col-1];
			}
		}
		Integer res = grid[0][grid[0].length-1];
		return res;
	}
}
