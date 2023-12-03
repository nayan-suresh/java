import java.util.*;
class MatriceMultiply
{
    public static void main(String args[])
    {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter the size of row of first Matrice ");
            int row1=sr.nextInt();
            System.out.println("Enter the size of coloumn of First Matrice and Row of Second Matrice:");
            int col1row2=sr.nextInt();
            System.out.println("Enter the size of Coloumn of Second Matrice: ");
            int col2=sr.nextInt();
            int a[][]=new int[row1][col1row2];
            int b[][]=new int [col1row2][col2];
            System.out.println("Enter the elements of First Matrice:");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col1row2;j++)
                {
                    a[i][j]=sr.nextInt();
                }
            }
            System.out.println("First Matrice:");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col1row2;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println("Enter the Elements of Second Matrice:");
            for(int i=0;i<col1row2;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    b[i][j]=sr.nextInt();
                }
            }
            System.out.println("Second Matrice:");
            for(int i=0;i<col1row2;i++)
            {
                for(int j=0;j<col1row2;j++)
                {
                    System.out.print(b[i][j]+"\t");
                }
                System.out.println();
            }
            int result[][]=new int[row1][col2];
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    for(int k=0;k<col1row2;k++)
                    {
                        result[i][j]=result[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Resulatant Matrice:");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    System.out.print(result[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}