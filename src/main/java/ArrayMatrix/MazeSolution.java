package ArrayMatrix;

public class MazeSolution {

    static boolean found = false;

    static String[][] solveMatrix(String[][] grid, int startX, int startY) {
        int x[] = {-1, 0, 0, 1};
        int y[] = {0, -1, 1, 0};
        //System.out.println(startX + " " + startY);
        grid[startX][startY] = "X";

            for(int i = 0; i < 4 ; i++){// check if there are 'X' around the S.
            int afterX = x[i] + startX;
            int afterY = y[i] + startY;
            //System.out.println(afterX+"---------"+afterY);
            if((afterY < grid[0].length-1) && (afterX < grid.length-1) && grid[afterX][afterY] == "E"){// if yes, return.
                //System.out.println(afterX+"---------"+afterY);
                found = true;
                return grid;
            }
        }

            for(int i = 0; i < 4 ; i++){// if no, check for 'O'
            int afterX = x[i] + startX;
            int afterY = y[i] + startY;
           // System.out.println("startx: " + afterX + ", starty: " + afterY);
            //System.out.println("starty: " + startY);

            if(found)    // path already found in earlier recursive call; no need to search anymore
                return grid;
            else{ // path not found yet, have to continue searching

                if(grid[afterX][afterY] == " "){
                    //System.out.println(afterX+" Before : "+(afterY+grid[0].length-1));
                    if(afterY == 0){
                        grid[afterX][afterY] = "X";
                        solveMatrix(grid, afterX, (afterY+grid[0].length-1));
                    }else if(afterX == 0) {
                        grid[afterX][afterY] = "X";
                        //System.out.println((afterX+grid.length-1)+"After -"+afterY);
                        solveMatrix(grid, (afterX+grid.length-1), afterY);
                    }else{
                        solveMatrix(grid, afterX, afterY);
                        System.out.println(afterX+"After -"+afterY);
                    }
                    if(!found){
                        grid[afterX][afterY] = " ";
                        //System.out.println(afterX+"not found -"+afterY);
                    }
                }
            }
        }
        grid[1][1] = "S";
        return grid;
    }
}
