// Maze Problme - Reach at the desire cell in the maze (Condition - you can travel Left, Right, Down, Up ), Return steps which you have taken to reach.
/*
INPUT - value = { {true, true, true},
                  {true, true, true},
                  {true, true, true}
                };
                
OUTPUT -

[1, 0, 0]
[2, 0, 0]
[3, 4, 5]
DDRR

[1, 0, 0]
[2, 5, 6]
[3, 4, 7]
DDRURD

[1, 6, 7]
[2, 5, 8]
[3, 4, 9]
DDRUURDD

[1, 0, 0]
[2, 3, 0]
[0, 4, 5]
DRDR

[1, 0, 0]
[2, 3, 4]
[0, 0, 5]
DRRD

[1, 4, 5]
[2, 3, 6]
[0, 0, 7]
DRURDD

[1, 2, 0]
[0, 3, 0]
[0, 4, 5]
RDDR

[1, 2, 0]
[0, 3, 4]
[0, 0, 5]
RDRD

[1, 2, 0]
[4, 3, 0]
[5, 6, 7]
RDLDRR

[1, 2, 3]
[0, 0, 4]
[0, 0, 5]
RRDD

[1, 2, 3]
[0, 5, 4]
[0, 6, 7]
RRDLDR

[1, 2, 3]
[6, 5, 4]
[7, 8, 9]
RRDLLDRR

*/

import java.util.Arrays;

public class MazeWithNoRestrictions {
    public static void main(String[] args) {
        boolean[][] value = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int [][] path = new int[value.length][value[0].length];
        AllPaths("", 0, 0, value, path, 1);
    }

    static void AllPaths(String p, int row, int col, boolean[][] maze, int[][] path, int steps) {
        if(row == maze.length-1 && col == maze[0].length-1) {
            for(int[] arr : path) {
                path[row][col] = steps;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = steps;

        if(row < maze.length-1) {
            AllPaths(p + 'D', row+1, col, maze, path, steps+1);
        }

        if(col < maze[0].length-1) {
            AllPaths(p + 'R', row, col+1, maze, path, steps+1);
        }

        if(row > 0) {
            AllPaths(p + 'U', row-1, col, maze, path, steps+1);
        }

        if(col > 0) {
            AllPaths(p + 'L', row, col-1, maze, path, steps+1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
