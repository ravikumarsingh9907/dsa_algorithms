// Maze Problem - Reach at the desire cell (Condition - you can go either right or down, left and up side travel not allowed )

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(CountPath(3,3)); // path count ---------------------------------------

        System.out.println(); // For new line-------------------------------------------------

        ShowPaths(" ", 3, 3); // path in form of string-----------------------------------------

        System.out.println(); // New line-------------------------------------------------------

        System.out.println(ShowPathsRet(" ", 3, 3)); // path string with return statement in form of ArrayList<String>---------------------------------------
    }

  // Return count of possible paths----------------------------------------------------- 
    static int CountPath (int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }

        int right = CountPath(row, col-1);
        int down = CountPath(row-1, col);

        return right + down;
    }

  // Paths Without Return Statement------------------------------------------------------
    static  void ShowPaths(String store, int row, int col) {
      // Base Condition starts.
        if(row == 1 && col == 1 ) {
            System.out.println(store);
            return;
        }
      // Base condition ends.
      
        if(row > 1) {
            ShowPaths(store + 'D', row-1, col);
        }

        if(col > 1) {
            ShowPaths(store + 'R', row, col-1);
        }
    }

  // Return Paths with return statement in form of ArrayList<String>-------------------------------------------------
    static ArrayList<String> ShowPathsRet (String store, int row, int col) {
      // Base condition starts.
        if(row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(store);
            return list;
        }
      // Base condition ends.

        ArrayList<String> result = new ArrayList<>();

        if(row > 1) {
            result.addAll(ShowPathsRet(store + 'D', row-1, col));
            }

        if(col > 1) {
            result.addAll(ShowPathsRet(store + 'R', row, col-1));
        }

        return result;
    }
}

// NOTE : D => Down, R => Right //
