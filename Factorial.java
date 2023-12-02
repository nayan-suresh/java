import java.util.*;
public class Factorial 
{
    public static void main(String args[])
    {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n=sr.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorial="+fact);
        }
    }
}
