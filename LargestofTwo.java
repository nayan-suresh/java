import java.util.*;
class LargestofTwo
{
    public static void main(String args[])
    {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter Two Numbers:");
            int a=sr.nextInt();
            int b=sr.nextInt();
            if(a>b)
            {
                System.out.println("Largest Number is:"+a);

            }
            else
            System.out.println("Largest number is:"+b);
        }
    }
}