package Lecture_27_Recursion_Assignment_6;
import java.util.*;
public class Chessboard_Problem_Count {
 static int ans=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int N=3;
        
//        System.out.println(countPaths(N));
        ArrayList<String> paths = new ArrayList<>();
        findPaths(N, 0, 0, "", paths);
        for (String path : paths) {
            System.out.print(path);
        }
    }
    
    static int countPaths(int N) {
        return countPathsHelper(N, 0, 0);
    }
    
    static int countPathsHelper(int N, int row, int col) {
        if (row >= N || col >= N) {
        	System.out.println(ans);
            return 0;
        }
        
        if (row == N - 1 && col == N - 1) {
            return 1;
        }
        
        // Knight moves
        int knightMoves = countPathsHelper(N, row + 2, col + 1) +
                          countPathsHelper(N, row + 1, col + 2);
        
        // Rook moves on walls
        int rookMoves = 0;
        if (row == 0 || row == N - 1 || col == 0 || col == N - 1) {
            rookMoves = countPathsHelper(N, row + 1, col) +
                        countPathsHelper(N, row, col + 1);
        }
        
        // Bishop moves on diagonals
        int bishopMoves = 0;
        if (row == col || row + col == N - 1) {
            bishopMoves = countPathsHelper(N, row + 1, col + 1);
        }
        
        return knightMoves + rookMoves + bishopMoves;
    }
    
    static void findPaths(int N, int row, int col, String path, ArrayList<String> paths) {
        if (row >= N || col >= N) {
            return;
        }
        
        if (row == N - 1 && col == N - 1) {
            paths.add(path + "{" + row + "-" + col + "}");
            return;
        }
        
        findPaths(N, row + 2, col + 1, path + "{" + row + "-" + col + "}K", paths);
        findPaths(N, row + 1, col + 2, path + "{" + row + "-" + col + "}K", paths);
        
        if (row == 0 || row == N - 1 || col == 0 || col == N - 1) {
            findPaths(N, row + 1, col, path + "{" + row + "-" + col + "}R", paths);
            findPaths(N, row, col + 1, path + "{" + row + "-" + col + "}R", paths);
        }
        
        if (row == col || row + col == N - 1) {
            findPaths(N, row + 1, col + 1, path + "{" + row + "-" + col + "}B", paths);
        }
    }
}
