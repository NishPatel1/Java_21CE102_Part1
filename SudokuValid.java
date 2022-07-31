import java.util.*;

import javax.sound.midi.Soundbank;

public class SudokuValid {
    static int N = 9;
 
// Function to check if all elements
// of the board[][] array store
// value in the range[1, 9]
static boolean isinRange(int[][] board)
{
     
    // Traverse board[][] array
    for(int i = 0; i < N; i++)
    {
        for(int j = 0; j < N; j++)
        {
             
            // Check if board[i][j]
            // lies in the range
            if (board[i][j] <= 0 ||
                board[i][j] > 9)
            {
                return false;
            }
        }
    }
    return true;
}
 
// Function to check if the solution
// of sudoku puzzle is valid or not
static boolean isValidSudoku(int board[][])
{
     
    // Check if all elements of board[][]
    // stores value in the range[1, 9]
    if (isinRange(board) == false)
    {
        return false;
    }
 
    // Stores unique value
    // from 1 to N
    boolean[] unique = new boolean[N + 1];
 
    // Traverse each row of
    // the given array
    for(int i = 0; i < N; i++)
    {
         
        // Initialize unique[]
        // array to false
        Arrays.fill(unique, false);
 
        // Traverse each column
        // of current row
        for(int j = 0; j < N; j++)
        {
            int Z = board[i][j];
 
            // Check if current row
            // stores duplicate value
            if (unique[Z])
            {
                return false;
            }
            unique[Z] = true;
        }
    }
 
    // Traverse each column of
    // the given array
    for(int i = 0; i < N; i++)
    {
         
        // Initialize unique[]
        // array to false
        Arrays.fill(unique, false);
 
        // Traverse each row
        // of current column
        for(int j = 0; j < N; j++)
        {
            int Z = board[j][i];
 
            // Check if current column
            // stores duplicate value
            if (unique[Z])
            {
                return false;
            }
            unique[Z] = true;
        }
    }
 
    // Traverse each block of
    // size 3 * 3 in board[][] array
    for(int i = 0; i < N - 2; i += 3)
    {
         
        // j stores first column of
        // each 3 * 3 block
        for(int j = 0; j < N - 2; j += 3)
        {
             
            // Initialize unique[]
            // array to false
            Arrays.fill(unique, false);

            for(int k = 0; k < 3; k++)
            {
                for(int l = 0; l < 3; l++)
                {
                    int X = i + k;
 
                    int Y = j + l;

                    int Z = board[X][Y];
 
                    // Check if current block
                    // stores duplicate value
                    if (unique[Z])
                    {
                        return false;
                    }
                    unique[Z] = true;
                }
            }
        }
    }

    return true;
}
 
public static void main(String[] args)
{
    int[][] sudokuans = new int[9][9];

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the solution of Sudoku: ");
    for(int i=0;i<9;i++)
    {
        for(int j=0;j<9;j++)
        {
            sudokuans[i][j] = sc.nextInt();
        }
    }
 
    if (isValidSudoku(sudokuans))
    {
        System.out.println("The Sudoku solution is Correct");
    }
    else
    {
        System.out.println("The Sudoku solution is not Correct");
    }
}
}
