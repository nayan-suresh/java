import java.util.*;
class PrimeorNot
{
    public static void main(String args[])
    {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter a Number:\n");
            int n=sr.nextInt();
            int count =0;
            if(n==0)
            {
                System.out.println("0 is neither prime or composite");
            }
            else if(n==1)
            {
                System.out.println("1 is neither prime or composite");
            }
            else
            {
                for(int i=2;i<n;i++)
                {
                    if(n%i==0)
                    {
                        count++;
                    }
                }
            }
            if(count==0)
            {
                System.out.println(+n+"is prime number");
            }
            else
            System.out.println(+n+"is not prime number");
        }
    }
}
