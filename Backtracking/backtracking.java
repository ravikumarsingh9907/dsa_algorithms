// What is Backtracking - Link Doc => https://www.geeksforgeeks.org/backtracking-introduction/
//                        Link Video => https://www.youtube.com/watch?v=zg5v2rlV1tM&ab_channel=KunalKushwaha

import java.util.ArrayList;

public class backtracking {
    public static void main(String[] args) {
        boolean[][] value = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        Allpaths("", 0, 0, value); // without return statement

        System.out.println();// New Line
        System.out.println();// New Line

        System.out.println(AllpathsRet("", 0, 0, value)); // with return statement
    }

  // Without Return Statement---------------------------------------------------------------------------------
    static void Allpaths(String p, int row, int col, boolean[][] maze){

        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]) {
            return;
        }

        maze[row][col] = false;

        if(row < maze.length -1) {
            Allpaths(p + 'D', row+1, col, maze);
        }

        if(col< maze[0].length -1) {
            Allpaths(p + 'R', row, col+1, maze);
        }

        if(row > 0) {
            Allpaths(p + 'U', row-1, col, maze);
        }

        if(col > 0) {
            Allpaths(p + 'L', row, col-1, maze);
        }

        maze[row][col] = true;
    }

  // With Return Statement in form of ArrayList<String>-----------------------------------------------------------------------
    static ArrayList<String> AllpathsRet(String p, int row, int col, boolean[][] maze){

        if(row == maze.length-1 && col == maze[0].length-1){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }

        ArrayList<String> result = new ArrayList<>();
        if(!maze[row][col]) {
            return result;
        }

        maze[row][col] = false;

        if(row < maze.length -1) {
            result.addAll(AllpathsRet(p + 'D', row+1, col, maze));
        }

        if(col< maze[0].length -1) {
            result.addAll(AllpathsRet(p + 'R', row, col+1, maze));
        }

        if(row > 0) {
            result.addAll( AllpathsRet(p + 'U', row-1, col, maze));
        }

        if(col > 0) {
            result.addAll( AllpathsRet(p + 'L', row, col-1, maze));
        }

        maze[row][col] = true;
        return result;
    }
}
