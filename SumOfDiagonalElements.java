import java.util.*;

class SumOfDiagonalElements {
    public static void main(String args[]) {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter the Size of Matrix (rows and columns):");
            int row = sr.nextInt();
            int col = sr.nextInt();
            int a[][] = new int[row][col];
            
            System.out.println("Enter the Elements:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    a[i][j] = sr.nextInt();
                }
            }
            
            System.out.println("Entered Matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
            
            int sum = 0;
            for (int i = 0; i < row; i++) {
           
                sum = sum + a[i][i];
            }

            System.out.println("Sum of Diagonal = " + sum);
        }
    }
}
