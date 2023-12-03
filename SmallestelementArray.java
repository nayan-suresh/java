import java.util.*;
class SmallestElementArray 
{
    public static void main(String args[]) 
    {   
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter the Limit:");
            int n = sr.nextInt(); 
            int a[] = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) 
            {
                a[i] = sr.nextInt(); 
            }
            int small=a[0];
            for (int i = 1; i < n; i++) 
            {
                if (a[i] < small) 
                {
                small = a[i]; 
                }
            }
            System.out.println("Smallest Number = " + small);
        }
    }
}

