import java.util.*;
class MatriceAddition
{
    public static void main(String args[])
    {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter the size of First Matrice and Second Matrice:");
            int row=sr.nextInt();
            int col=sr.nextInt();
            int a[][]=new int[row][col];
            int b[][]=new int[row][col];
            System.out.println("Enter the Elements of First Matrices:");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    a[i][j]=sr.nextInt();
                }
            }
            System.out.println("First Matrice:");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println("Enter the Elements of Second Matrice:");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    b[i][j]=sr.nextInt();
                }
            }
            System.out.println("Second Matrice:");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(b[i][j]+"\t");
                }
                System.out.println();
            }
            int result[][]=new int[row][col];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    result[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println("Resulatant Matrice:");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(result[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}
