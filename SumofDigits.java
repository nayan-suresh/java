import java.util.*;
public class SumofDigits 
{
    public static void main(String args[])
    {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter a Number:");
            int n=sr.nextInt();
            int sum=0;
            while(n>0)
            {
                int temp=n%10;
                sum=sum+temp;
                n=n/10;
            }
            System.out.println("Sum of Digits ="+sum);
        }
    }    
}
