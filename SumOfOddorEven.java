import java.util.*;
public class SumOfOddorEven
{
    public static void main(String args[])
    {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter the limit:");
            int n=sr.nextInt();
            int a[]=new int[n];
            int sum1=0;
            int sum2=0;
            System.out.println("Enter the Elements:");
            for(int i=0;i<n;i++)
            {
                a[i]=sr.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]%2==0)
                {
                    sum1=sum1+a[i];
                }
                else
                {
                    sum2=sum2+a[i];
                }
            }
            System.out.println("Sum of Even Numbers="+sum1);
     
System.out.println("Sum of Odd Numbers="+sum2);
        }
    }  
}
