import java.util.*;
class RevOfNumber
{
    public static void main(String args[])
    {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter a Number:");
            int n=sr.nextInt();
            int rev=0;
            while(n>0)
            {
                int temp=n%10;
                rev=rev*10+temp;
                n=n/10;
            }
            System.out.println("Reverse of Number="+rev);
        }
    }
}