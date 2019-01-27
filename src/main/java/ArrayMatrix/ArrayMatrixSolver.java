package ArrayMatrix;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayMatrixSolver {
    public static void main(String[] args){
        String fileName = "/Users/krishna/git/DemoUseOfTDD/src/main/resources/sample1.txt";
        String[][] getGrid = getGridData(fileName);
        System.out.println("Maze output format before the solution is found.");
        showMatrixGrid(getGrid);
        String[][] solveMatrix = MazeSolution.solveMatrix(getGrid,  1,  1);
        System.out.println("Maze output format once the solution is found.");
        showMatrixGrid(solveMatrix);
        if(solveMatrix[1][1] != "S"){
            System.out.println("Outcome: There is not any valid path available!!");
        }else{
            System.out.println("Outcome: There is valid path available.");
        }
    }

    private static String[][] getGridData(String fileName){
        String line;
        String[] eachLine;
        List<String[]> rowListLines = new ArrayList<>();
        String[][] matrix = null;

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            while ((line = bufferedReader.readLine()) != null){
                eachLine = line.trim().split("\\s+");
                rowListLines.add(eachLine);
            }
            bufferedReader.close();

            String[] sizeOfMatrix = rowListLines.get(0);
            String[] startPointsMatrix = rowListLines.get(1);
            String[] endPointsMatrix = rowListLines.get(2);
            int rowCount = Integer.parseInt(sizeOfMatrix[1]);
            int columnCount = Integer.parseInt(sizeOfMatrix[0]);

            System.out.println("No of rows: " + rowCount);
            System.out.println("No of columns: " + columnCount);
            System.out.println();

            matrix = new String[rowCount][columnCount];

            int rowInitial = 3;
            for(int row=0; row<rowCount; row++) {
                for (int col = 0; col < columnCount; col++) {
                    //System.out.println(rowListLines.get(rowInitial)[col]);
                    if (rowListLines.get(rowInitial)[col].equalsIgnoreCase("1")) {
                        matrix[row][col] = "#";
                    }else {
                        matrix[row][col] = " ";
                    }
                }
                rowInitial++;
            }
            int startPointX = Integer.parseInt(startPointsMatrix[1]);
            int startPointY = Integer.parseInt(startPointsMatrix[0]);
            int endPointX = Integer.parseInt(endPointsMatrix[1]);
            int endPointY = Integer.parseInt(endPointsMatrix[0]);

            if(matrix[startPointX][startPointY].equals(" ")){
                matrix[startPointX][startPointY] = "S";
            }else{
                System.out.println("There is no Start Point!!");
            }if(matrix[endPointX][endPointY].equals(" ")){
                matrix[endPointX][endPointY] = "E";
            }else {
                System.out.println("There is no End Point!!");
            }

        }catch(FileNotFoundException e){
            System.out.println("File not found: "+ e);
        }catch (Exception e){
            e.printStackTrace();
        }

        return matrix;
    }

    private static void showMatrixGrid(String[][] inputGrid){
        final int rows = inputGrid.length;
        final int columns = inputGrid[0].length;

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < columns; col++){
                System.out.print(inputGrid[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
