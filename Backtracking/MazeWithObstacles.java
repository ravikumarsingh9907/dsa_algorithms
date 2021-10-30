// What if maze has some kind of obstacles.

import java.util.ArrayList;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        ShowPaths("", maze, 0, 0);

        System.out.println();

        System.out.println(ShowPathsRet("", maze, 0, 0));
    }

    static void ShowPaths(String store, boolean[][] maze, int row, int col) {
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(store);
            return;
        }

        if(!maze[row][col]) {
            return;
        }

        if(row < maze.length-1) {
            ShowPaths(store + 'D', maze, row+1, col);
        }

        if(col < maze[0].length-1) {
            ShowPaths(store + 'R', maze, row, col+1);
        }
    }

    static ArrayList<String> ShowPathsRet( String store, boolean[][] maze, int row, int col) {
        if(row == maze.length -1 && col == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(store);
            return list;
        }

        ArrayList<String> result = new ArrayList<>();

        if(!maze[row][col]){
            return result;
        }

        if(row < maze.length-1) {
            result.addAll(ShowPathsRet(store + 'D', maze, row+1, col));
        }

        if(col < maze[0].length -1) {
            result.addAll(ShowPathsRet(store + 'R', maze, row, col+1));
        }

        return result;
    }
}
